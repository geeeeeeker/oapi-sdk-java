/*
 *
 *  * Copyright (C) 2015 Square, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.lark.oapi.okhttp.internal.platform;

import android.os.Build;
import android.util.Log;
import com.lark.oapi.okhttp.Protocol;
import com.lark.oapi.okhttp.internal.Util;
import com.lark.oapi.okhttp.internal.tls.BasicTrustRootIndex;
import com.lark.oapi.okhttp.internal.tls.CertificateChainCleaner;
import com.lark.oapi.okhttp.internal.tls.TrustRootIndex;

import javax.annotation.Nullable;
import javax.net.ssl.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Android 5+.
 */
class AndroidPlatform extends Platform {

    private static final int MAX_LOG_LENGTH = 4000;

    private final Class<?> sslParametersClass;
    private final Class<?> sslSocketClass;
    private final Method setUseSessionTickets;
    private final Method setHostname;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;

    private final CloseGuard closeGuard = CloseGuard.get();

    AndroidPlatform(Class<?> sslParametersClass, Class<?> sslSocketClass, Method setUseSessionTickets,
                    Method setHostname, Method getAlpnSelectedProtocol, Method setAlpnProtocols) {
        this.sslParametersClass = sslParametersClass;
        this.sslSocketClass = sslSocketClass;
        this.setUseSessionTickets = setUseSessionTickets;
        this.setHostname = setHostname;
        this.getAlpnSelectedProtocol = getAlpnSelectedProtocol;
        this.setAlpnProtocols = setAlpnProtocols;
    }

    public static @Nullable
    Platform buildIfSupported() {
        if (!isAndroid()) {
            return null;
        }

        // Attempt to find Android 5+ APIs.
        Class<?> sslParametersClass;
        Class<?> sslSocketClass;

        try {
            sslParametersClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException ignored) {
            return null; // Not an Android runtime.
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Method setUseSessionTickets = sslSocketClass.getDeclaredMethod(
                        "setUseSessionTickets", boolean.class);
                Method setHostname = sslSocketClass.getMethod("setHostname", String.class);
                Method getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol");
                Method setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
                return new AndroidPlatform(sslParametersClass, sslSocketClass, setUseSessionTickets,
                        setHostname, getAlpnSelectedProtocol, setAlpnProtocols);
            } catch (NoSuchMethodException ignored) {
            }
        }
        throw new IllegalStateException(
                "Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    static int getSdkInt() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError ignored) {
            // fails fatally against robolectric classes
            return 0;
        }
    }

    @Override
    public void connectSocket(Socket socket, InetSocketAddress address,
                              int connectTimeout) throws IOException {
        try {
            socket.connect(address, connectTimeout);
        } catch (AssertionError e) {
            if (Util.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e) {
            // On android 8.0, socket.connect throws a ClassCastException due to a bug
            // see https://issuetracker.google.com/issues/63649622
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            } else {
                throw e;
            }
        }
    }

    @Override
    protected @Nullable
    X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Object context = readFieldOrNull(sslSocketFactory, sslParametersClass, "sslParameters");
        if (context == null) {
            // If that didn't work, try the Google Play Services SSL provider before giving up. This
            // must be loaded by the SSLSocketFactory's class loader.
            try {
                Class<?> gmsSslParametersClass = Class.forName(
                        "com.google.android.gms.org.conscrypt.SSLParametersImpl", false,
                        sslSocketFactory.getClass().getClassLoader());
                context = readFieldOrNull(sslSocketFactory, gmsSslParametersClass, "sslParameters");
            } catch (ClassNotFoundException e) {
                return super.trustManager(sslSocketFactory);
            }
        }

        X509TrustManager x509TrustManager = readFieldOrNull(
                context, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }

        return readFieldOrNull(context, X509TrustManager.class, "trustManager");
    }

    @Override
    public void configureTlsExtensions(
            SSLSocket sslSocket, String hostname, List<Protocol> protocols) throws IOException {
        if (!sslSocketClass.isInstance(sslSocket)) {
            return; // No TLS extensions if the socket class is custom.
        }
        try {
            // Enable SNI and session tickets.
            if (hostname != null) {
                setUseSessionTickets.invoke(sslSocket, true);
                // This is SSLParameters.setServerNames() in API 24+.
                setHostname.invoke(sslSocket, hostname);
            }

            // Enable ALPN.
            setAlpnProtocols.invoke(sslSocket, concatLengthPrefixed(protocols));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public @Nullable
    String getSelectedProtocol(SSLSocket socket) {
        if (!sslSocketClass.isInstance(socket)) {
            return null; // No TLS extensions if the socket class is custom.
        }
        try {
            byte[] alpnResult = (byte[]) getAlpnSelectedProtocol.invoke(socket);
            return alpnResult != null ? new String(alpnResult, UTF_8) : null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public void log(int level, String message, @Nullable Throwable t) {
        int logLevel = level == WARN ? Log.WARN : Log.DEBUG;
        if (t != null) {
            message = message + '\n' + Log.getStackTraceString(t);
        }

        // Split by line, then ensure each line can fit into Log's maximum length.
        for (int i = 0, length = message.length(); i < length; i++) {
            int newline = message.indexOf('\n', i);
            newline = newline != -1 ? newline : length;
            do {
                int end = Math.min(newline, i + MAX_LOG_LENGTH);
                Log.println(logLevel, "OkHttp", message.substring(i, end));
                i = end;
            } while (i < newline);
        }
    }

    @Override
    public @Nullable
    Object getStackTraceForCloseable(String closer) {
        return closeGuard.createAndOpen(closer);
    }

    @Override
    public void logCloseableLeak(String message, Object stackTrace) {
        boolean reported = closeGuard.warnIfOpen(stackTrace);
        if (!reported) {
            // Unable to report via CloseGuard. As a last-ditch effort, send it to the logger.
            log(WARN, message, null);
        }
    }

    @Override
    public boolean isCleartextTrafficPermitted(String hostname) {
        try {
            Class<?> networkPolicyClass = Class.forName("android.security.NetworkSecurityPolicy");
            Method getInstanceMethod = networkPolicyClass.getMethod("getInstance");
            Object networkSecurityPolicy = getInstanceMethod.invoke(null);
            return api24IsCleartextTrafficPermitted(hostname, networkPolicyClass, networkSecurityPolicy);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            return super.isCleartextTrafficPermitted(hostname);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    private boolean api24IsCleartextTrafficPermitted(String hostname, Class<?> networkPolicyClass,
                                                     Object networkSecurityPolicy) throws InvocationTargetException, IllegalAccessException {
        try {
            Method isCleartextTrafficPermittedMethod = networkPolicyClass
                    .getMethod("isCleartextTrafficPermitted", String.class);
            return (boolean) isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy, hostname);
        } catch (NoSuchMethodException e) {
            return api23IsCleartextTrafficPermitted(hostname, networkPolicyClass, networkSecurityPolicy);
        }
    }

    private boolean api23IsCleartextTrafficPermitted(String hostname, Class<?> networkPolicyClass,
                                                     Object networkSecurityPolicy) throws InvocationTargetException, IllegalAccessException {
        try {
            Method isCleartextTrafficPermittedMethod = networkPolicyClass
                    .getMethod("isCleartextTrafficPermitted");
            return (boolean) isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy);
        } catch (NoSuchMethodException e) {
            return super.isCleartextTrafficPermitted(hostname);
        }
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
        try {
            Class<?> extensionsClass = Class.forName("android.net.http.X509TrustManagerExtensions");
            Constructor<?> constructor = extensionsClass.getConstructor(X509TrustManager.class);
            Object extensions = constructor.newInstance(trustManager);
            Method checkServerTrusted = extensionsClass.getMethod(
                    "checkServerTrusted", X509Certificate[].class, String.class, String.class);
            return new AndroidCertificateChainCleaner(extensions, checkServerTrusted);
        } catch (Exception e) {
            return super.buildCertificateChainCleaner(trustManager);
        }
    }

    @Override
    public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
        try {
            // From org.conscrypt.TrustManagerImpl, we want the method with this signature:
            // private TrustAnchor findTrustAnchorByIssuerAndSignature(X509Certificate lastCert);
            Method method = trustManager.getClass().getDeclaredMethod(
                    "findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException e) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override
    public SSLContext getSSLContext() {
        boolean tryTls12;
        try {
            tryTls12 = (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22);
        } catch (NoClassDefFoundError e) {
            // Not a real Android runtime; probably RoboVM or MoE
            // Try to load TLS 1.2 explicitly.
            tryTls12 = true;
        }

        if (tryTls12) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException e) {
                // fallback to TLS
            }
        }

        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /**
     * X509TrustManagerExtensions was added to Android in API 17 (Android 4.2, released in late 2012).
     * This is the best way to get a clean chain on Android because it uses the same code as the TLS
     * handshake.
     */
    static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

        private final Object x509TrustManagerExtensions;
        private final Method checkServerTrusted;

        AndroidCertificateChainCleaner(Object x509TrustManagerExtensions, Method checkServerTrusted) {
            this.x509TrustManagerExtensions = x509TrustManagerExtensions;
            this.checkServerTrusted = checkServerTrusted;
        }

        @SuppressWarnings({"unchecked", "SuspiciousToArrayCall"}) // Reflection on List<Certificate>.
        @Override
        public List<Certificate> clean(List<Certificate> chain, String hostname)
                throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] certificates = chain.toArray(new X509Certificate[chain.size()]);
                return (List<Certificate>) checkServerTrusted.invoke(
                        x509TrustManagerExtensions, certificates, "RSA", hostname);
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException exception = new SSLPeerUnverifiedException(e.getMessage());
                exception.initCause(e);
                throw exception;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override
        public boolean equals(Object other) {
            return other instanceof AndroidCertificateChainCleaner; // All instances are equivalent.
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    /**
     * Provides access to the internal dalvik.system.CloseGuard class. Android uses this in
     * combination with android.os.StrictMode to report on leaked java.io.Closeable's. Available since
     * Android API 11.
     */
    static final class CloseGuard {

        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        CloseGuard(Method getMethod, Method openMethod, Method warnIfOpenMethod) {
            this.getMethod = getMethod;
            this.openMethod = openMethod;
            this.warnIfOpenMethod = warnIfOpenMethod;
        }

        static CloseGuard get() {
            Method getMethod;
            Method openMethod;
            Method warnIfOpenMethod;

            try {
                Class<?> closeGuardClass = Class.forName("dalvik.system.CloseGuard");
                getMethod = closeGuardClass.getMethod("get");
                openMethod = closeGuardClass.getMethod("open", String.class);
                warnIfOpenMethod = closeGuardClass.getMethod("warnIfOpen");
            } catch (Exception ignored) {
                getMethod = null;
                openMethod = null;
                warnIfOpenMethod = null;
            }
            return new CloseGuard(getMethod, openMethod, warnIfOpenMethod);
        }

        Object createAndOpen(String closer) {
            if (getMethod != null) {
                try {
                    Object closeGuardInstance = getMethod.invoke(null);
                    openMethod.invoke(closeGuardInstance, closer);
                    return closeGuardInstance;
                } catch (Exception ignored) {
                }
            }
            return null;
        }

        boolean warnIfOpen(Object closeGuardInstance) {
            boolean reported = false;
            if (closeGuardInstance != null) {
                try {
                    warnIfOpenMethod.invoke(closeGuardInstance);
                    reported = true;
                } catch (Exception ignored) {
                }
            }
            return reported;
        }
    }

    /**
     * A trust manager for Android applications that customize the trust manager.
     *
     * <p>This class exploits knowledge of Android implementation details. This class is potentially
     * much faster to initialize than {@link BasicTrustRootIndex} because it doesn't need to load and
     * index trusted CA certificates.
     */
    static final class CustomTrustRootIndex implements TrustRootIndex {

        private final X509TrustManager trustManager;
        private final Method findByIssuerAndSignatureMethod;

        CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
            this.trustManager = trustManager;
        }

        @Override
        public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) findByIssuerAndSignatureMethod.invoke(
                        trustManager, cert);
                return trustAnchor != null
                        ? trustAnchor.getTrustedCert()
                        : null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException e) {
                return null;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex that = (CustomTrustRootIndex) obj;
            return trustManager.equals(that.trustManager)
                    && findByIssuerAndSignatureMethod.equals(that.findByIssuerAndSignatureMethod);
        }

        @Override
        public int hashCode() {
            return trustManager.hashCode() + 31 * findByIssuerAndSignatureMethod.hashCode();
        }
    }
}
