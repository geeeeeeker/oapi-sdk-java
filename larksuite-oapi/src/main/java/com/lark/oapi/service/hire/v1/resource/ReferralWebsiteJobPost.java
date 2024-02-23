// Code generated by lark suite oapi sdk gen
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

package com.lark.oapi.service.hire.v1.resource;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.hire.v1.model.GetReferralWebsiteJobPostReq;
import com.lark.oapi.service.hire.v1.model.GetReferralWebsiteJobPostResp;
import com.lark.oapi.service.hire.v1.model.ListReferralWebsiteJobPostReq;
import com.lark.oapi.service.hire.v1.model.ListReferralWebsiteJobPostResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class ReferralWebsiteJobPost {
    private static final Logger log = LoggerFactory.getLogger(ReferralWebsiteJobPost.class);
    private final Config config;

    public ReferralWebsiteJobPost(Config config) {
        this.config = config;
    }


    /**
     * ，获取内推官网下职位广告详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=hire&resource=referral_website.job_post&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=hire&resource=referral_website.job_post&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/GetReferralWebsiteJobPostSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/GetReferralWebsiteJobPostSample.java</a> ;
     */
    public GetReferralWebsiteJobPostResp get(GetReferralWebsiteJobPostReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/hire/v1/referral_websites/job_posts/:job_post_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetReferralWebsiteJobPostResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReferralWebsiteJobPostResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/hire/v1/referral_websites/job_posts/:job_post_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * ，获取内推官网下职位广告详情
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=hire&resource=referral_website.job_post&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=hire&resource=referral_website.job_post&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/GetReferralWebsiteJobPostSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/GetReferralWebsiteJobPostSample.java</a> ;
     */
    public GetReferralWebsiteJobPostResp get(GetReferralWebsiteJobPostReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/hire/v1/referral_websites/job_posts/:job_post_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetReferralWebsiteJobPostResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetReferralWebsiteJobPostResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/hire/v1/referral_websites/job_posts/:job_post_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * ，获取内推官网下的职位列表。自定义数据暂不支持列表获取，请从「获取内推官网下职位广告详情」接口获取
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=hire&resource=referral_website.job_post&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=hire&resource=referral_website.job_post&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/ListReferralWebsiteJobPostSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/ListReferralWebsiteJobPostSample.java</a> ;
     */
    public ListReferralWebsiteJobPostResp list(ListReferralWebsiteJobPostReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/hire/v1/referral_websites/job_posts"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListReferralWebsiteJobPostResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListReferralWebsiteJobPostResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/hire/v1/referral_websites/job_posts"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * ，获取内推官网下的职位列表。自定义数据暂不支持列表获取，请从「获取内推官网下职位广告详情」接口获取
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=hire&resource=referral_website.job_post&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=list&project=hire&resource=referral_website.job_post&version=v1</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/ListReferralWebsiteJobPostSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/hirev1/ListReferralWebsiteJobPostSample.java</a> ;
     */
    public ListReferralWebsiteJobPostResp list(ListReferralWebsiteJobPostReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/hire/v1/referral_websites/job_posts"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ListReferralWebsiteJobPostResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListReferralWebsiteJobPostResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/hire/v1/referral_websites/job_posts"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}