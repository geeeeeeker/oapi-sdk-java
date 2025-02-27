//  code generated by oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi;

import com.lark.oapi.service.baike.BaikeService;
import com.lark.oapi.service.block.BlockService;
import com.lark.oapi.service.human_authentication.HumanAuthenticationService;
import com.lark.oapi.service.mail.MailService;
import com.lark.oapi.service.vc.VcService;
import com.lark.oapi.service.verification.VerificationService;
import com.lark.oapi.service.acs.AcsService;
import com.lark.oapi.service.attendance.AttendanceService;
import com.lark.oapi.service.calendar.CalendarService;
import com.lark.oapi.service.report.ReportService;
import com.lark.oapi.service.security_and_compliance.SecurityAndComplianceService;
import com.lark.oapi.service.task.TaskService;
import com.lark.oapi.service.application.ApplicationService;
import com.lark.oapi.service.approval.ApprovalService;
import com.lark.oapi.service.search.SearchService;
import com.lark.oapi.service.speech_to_text.SpeechToTextService;
import com.lark.oapi.service.workplace.WorkplaceService;
import com.lark.oapi.service.event.EventService;
import com.lark.oapi.service.helpdesk.HelpdeskService;
import com.lark.oapi.service.drive.DriveService;
import com.lark.oapi.service.okr.OkrService;
import com.lark.oapi.service.personal_settings.PersonalSettingsService;
import com.lark.oapi.service.tenant.TenantService;
import com.lark.oapi.service.authen.AuthenService;
import com.lark.oapi.service.compensation.CompensationService;
import com.lark.oapi.service.meeting_room.MeetingRoomService;
import com.lark.oapi.service.sheets.SheetsService;
import com.lark.oapi.service.translation.TranslationService;
import com.lark.oapi.service.auth.AuthService;
import com.lark.oapi.service.contact.ContactService;
import com.lark.oapi.service.docx.DocxService;
import com.lark.oapi.service.gray_test_open_sg.GrayTestOpenSgService;
import com.lark.oapi.service.mdm.MdmService;
import com.lark.oapi.service.optical_char_recognition.OpticalCharRecognitionService;
import com.lark.oapi.service.bitable.BitableService;
import com.lark.oapi.service.corehr.CorehrService;
import com.lark.oapi.service.hire.HireService;
import com.lark.oapi.service.im.ImService;
import com.lark.oapi.service.passport.PassportService;
import com.lark.oapi.service.document_ai.DocumentAiService;
import com.lark.oapi.service.ehr.EhrService;
import com.lark.oapi.service.board.BoardService;
import com.lark.oapi.service.lingo.LingoService;
import com.lark.oapi.service.wiki.WikiService;
import com.lark.oapi.service.admin.AdminService;
import com.lark.oapi.service.aily.AilyService;

import com.lark.oapi.service.ext.ExtService;
import com.lark.oapi.core.httpclient.IHttpTransport;
import com.lark.oapi.core.httpclient.OkHttpTransport;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.*;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.enums.AppType;
import com.lark.oapi.core.Config;
import com.lark.oapi.okhttp.OkHttpClient;
import com.lark.oapi.core.cache.ICache;
import com.lark.oapi.core.cache.LocalCache;
import com.lark.oapi.core.token.AppTicketManager;
import com.lark.oapi.core.token.TokenManager;
import com.lark.oapi.core.token.GlobalAppTicketManager;
import com.lark.oapi.core.token.GlobalTokenManager;

import java.util.concurrent.TimeUnit;

import com.lark.oapi.core.utils.OKHttps;
import com.lark.oapi.core.utils.Strings;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.enums.BaseUrlEnum;
import com.lark.oapi.core.request.MarketplaceAppAccessTokenReq;
import com.lark.oapi.core.request.MarketplaceTenantAccessTokenReq;
import com.lark.oapi.core.request.SelfBuiltAppAccessTokenReq;
import com.lark.oapi.core.request.SelfBuiltTenantAccessTokenReq;
import com.lark.oapi.core.response.AppAccessTokenResp;
import com.lark.oapi.core.response.TenantAccessTokenResp;
import com.lark.oapi.core.exception.ObtainAccessTokenException;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.Constants;


public class Client {
    private Config config;
    private BaikeService baike;
    private BlockService block;
    private HumanAuthenticationService humanAuthentication;
    private MailService mail;
    private VcService vc;
    private VerificationService verification;
    private AcsService acs;
    private AttendanceService attendance;
    private CalendarService calendar;
    private ReportService report;
    private SecurityAndComplianceService securityAndCompliance;
    private TaskService task;
    private ApplicationService application;
    private ApprovalService approval;
    private SearchService search;
    private SpeechToTextService speechToText;
    private WorkplaceService workplace;
    private EventService event;
    private HelpdeskService helpdesk;
    private DriveService drive;
    private OkrService okr;
    private PersonalSettingsService personalSettings;
    private TenantService tenant;
    private AuthenService authen;
    private CompensationService compensation;
    private MeetingRoomService meetingRoom;
    private SheetsService sheets;
    private TranslationService translation;
    private AuthService auth;
    private ContactService contact;
    private DocxService docx;
    private GrayTestOpenSgService grayTestOpenSg;
    private MdmService mdm;
    private OpticalCharRecognitionService opticalCharRecognition;
    private BitableService bitable;
    private CorehrService corehr;
    private HireService hire;
    private ImService im;
    private PassportService passport;
    private DocumentAiService documentAi;
    private EhrService ehr;
    private BoardService board;
    private LingoService lingo;
    private WikiService wiki;
    private AdminService admin;
    private AilyService aily;

    private ExtService extService;

    public static Builder newBuilder(String appId, String appSecret) {
        return new Builder(appId, appSecret);
    }

    public ExtService ext() {
        return extService;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public BaikeService baike() {
        return baike;
    }

    public BlockService block() {
        return block;
    }

    public HumanAuthenticationService humanAuthentication() {
        return humanAuthentication;
    }

    public MailService mail() {
        return mail;
    }

    public VcService vc() {
        return vc;
    }

    public VerificationService verification() {
        return verification;
    }

    public AcsService acs() {
        return acs;
    }

    public AttendanceService attendance() {
        return attendance;
    }

    public CalendarService calendar() {
        return calendar;
    }

    public ReportService report() {
        return report;
    }

    public SecurityAndComplianceService securityAndCompliance() {
        return securityAndCompliance;
    }

    public TaskService task() {
        return task;
    }

    public ApplicationService application() {
        return application;
    }

    public ApprovalService approval() {
        return approval;
    }

    public SearchService search() {
        return search;
    }

    public SpeechToTextService speechToText() {
        return speechToText;
    }

    public WorkplaceService workplace() {
        return workplace;
    }

    public EventService event() {
        return event;
    }

    public HelpdeskService helpdesk() {
        return helpdesk;
    }

    public DriveService drive() {
        return drive;
    }

    public OkrService okr() {
        return okr;
    }

    public PersonalSettingsService personalSettings() {
        return personalSettings;
    }

    public TenantService tenant() {
        return tenant;
    }

    public AuthenService authen() {
        return authen;
    }

    public CompensationService compensation() {
        return compensation;
    }

    public MeetingRoomService meetingRoom() {
        return meetingRoom;
    }

    public SheetsService sheets() {
        return sheets;
    }

    public TranslationService translation() {
        return translation;
    }

    public AuthService auth() {
        return auth;
    }

    public ContactService contact() {
        return contact;
    }

    public DocxService docx() {
        return docx;
    }

    public GrayTestOpenSgService grayTestOpenSg() {
        return grayTestOpenSg;
    }

    public MdmService mdm() {
        return mdm;
    }

    public OpticalCharRecognitionService opticalCharRecognition() {
        return opticalCharRecognition;
    }

    public BitableService bitable() {
        return bitable;
    }

    public CorehrService corehr() {
        return corehr;
    }

    public HireService hire() {
        return hire;
    }

    public ImService im() {
        return im;
    }

    public PassportService passport() {
        return passport;
    }

    public DocumentAiService documentAi() {
        return documentAi;
    }

    public EhrService ehr() {
        return ehr;
    }

    public BoardService board() {
        return board;
    }

    public LingoService lingo() {
        return lingo;
    }

    public WikiService wiki() {
        return wiki;
    }

    public AdminService admin() {
        return admin;
    }

    public AilyService aily() {
        return aily;
    }

    public RawResponse post(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "POST", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse post(String httpPath
            , Object body
            , AccessTokenType accessTokenType
    ) throws Exception {
        return Transport.send(config, null, "POST", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse get(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "GET", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse get(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "GET", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse delete(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "DELETE", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse delete(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "DELETE", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse put(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "PUT", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse put(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "PUT", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse patch(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "PATCH", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse patch(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "PATCH", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse options(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "OPTIONS", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse options(String httpPath
            , Object body, AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "OPTIONS", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public static final class Builder {
        private Config config = new Config();

        public Builder(String appId, String appSecret) {
            config.setAppId(appId);
            config.setAppSecret(appSecret);
            config.setBaseUrl(BaseUrlEnum.FeiShu.getUrl());
            config.setAppType(AppType.SELF_BUILT);
            config.setDisableTokenCache(false);
        }

        public Builder helpDeskCredential(String helpDeskId, String helpDeskToken) {
            config.setHelpDeskToken(helpDeskToken);
            config.setHelpDeskID(helpDeskId);
            if (Strings.isNotEmpty(helpDeskId) && Strings.isNotEmpty(helpDeskToken)) {
                config.setHelpDeskAuthToken(java.util.Base64.getEncoder().encodeToString(String.format("%s:%s", helpDeskId, helpDeskToken).getBytes(StandardCharsets.UTF_8)));
            }
            return this;
        }

        public Builder appType(AppType appType) {
            config.setAppType(appType);
            return this;
        }

        public Builder marketplaceApp() {
            config.setAppType(AppType.MARKETPLACE);
            return this;
        }

        public Builder disableTokenCache() {
            config.setDisableTokenCache(true);
            return this;
        }

        public Builder logReqAtDebug(boolean logReqRespInfoAtDebugLevel) {
            config.setLogReqAtDebug(logReqRespInfoAtDebugLevel);
            return this;
        }

        public Builder openBaseUrl(String baseUrl) {
            config.setBaseUrl(baseUrl);
            return this;
        }

        public Builder openBaseUrl(BaseUrlEnum baseUrl) {
            config.setBaseUrl(baseUrl.getUrl());
            return this;
        }

        public Builder tokenCache(ICache cache) {
            config.setCache(cache);
            return this;
        }

        public Builder requestTimeout(long timeout, TimeUnit timeUnit) {
            config.setRequestTimeOut(timeout);
            config.setTimeOutTimeUnit(timeUnit);
            return this;
        }

        public Builder httpTransport(IHttpTransport httpTransport) {
            config.setHttpTransport(httpTransport);
            return this;
        }

        private void initCache(Config config) {
            if (config.getCache() != null) {
                GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(config.getCache()));
                GlobalTokenManager.setTokenManager(new TokenManager(config.getCache()));
            } else {
                ICache cache = LocalCache.getInstance();
                GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(cache));
                GlobalTokenManager.setTokenManager(new TokenManager(cache));
            }
        }

        private void initHttpTransport(Config config) {
            if (config.getHttpTransport() == null) {
                if (config.getRequestTimeOut() > 0) {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.create(config.getRequestTimeOut(), config.getTimeOutTimeUnit())));
                } else {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.defaultClient));
                }
            }
        }

        public Client build() {
            Client client = new Client();
            client.setConfig(config);
            initCache(config);
            initHttpTransport(config);
            client.extService = new ExtService(config);
            client.baike = new BaikeService(config);
            client.block = new BlockService(config);
            client.humanAuthentication = new HumanAuthenticationService(config);
            client.mail = new MailService(config);
            client.vc = new VcService(config);
            client.verification = new VerificationService(config);
            client.acs = new AcsService(config);
            client.attendance = new AttendanceService(config);
            client.calendar = new CalendarService(config);
            client.report = new ReportService(config);
            client.securityAndCompliance = new SecurityAndComplianceService(config);
            client.task = new TaskService(config);
            client.application = new ApplicationService(config);
            client.approval = new ApprovalService(config);
            client.search = new SearchService(config);
            client.speechToText = new SpeechToTextService(config);
            client.workplace = new WorkplaceService(config);
            client.event = new EventService(config);
            client.helpdesk = new HelpdeskService(config);
            client.drive = new DriveService(config);
            client.okr = new OkrService(config);
            client.personalSettings = new PersonalSettingsService(config);
            client.tenant = new TenantService(config);
            client.authen = new AuthenService(config);
            client.compensation = new CompensationService(config);
            client.meetingRoom = new MeetingRoomService(config);
            client.sheets = new SheetsService(config);
            client.translation = new TranslationService(config);
            client.auth = new AuthService(config);
            client.contact = new ContactService(config);
            client.docx = new DocxService(config);
            client.grayTestOpenSg = new GrayTestOpenSgService(config);
            client.mdm = new MdmService(config);
            client.opticalCharRecognition = new OpticalCharRecognitionService(config);
            client.bitable = new BitableService(config);
            client.corehr = new CorehrService(config);
            client.hire = new HireService(config);
            client.im = new ImService(config);
            client.passport = new PassportService(config);
            client.documentAi = new DocumentAiService(config);
            client.ehr = new EhrService(config);
            client.board = new BoardService(config);
            client.lingo = new LingoService(config);
            client.wiki = new WikiService(config);
            client.admin = new AdminService(config);
            client.aily = new AilyService(config);

            return client;
        }
    }
}

