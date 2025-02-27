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

package com.lark.oapi.service.application.v6.resource;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;

import java.io.ByteArrayOutputStream;

import com.lark.oapi.service.application.v6.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ApplicationAppUsage {
    private static final Logger log = LoggerFactory.getLogger(ApplicationAppUsage.class);
    private final Config config;

    public ApplicationAppUsage(Config config) {
        this.config = config;
    }


    /**
     * 获取多部门应用使用概览（灰度租户可见），查看应用在某一天/某一周/某一个月的使用数据，可以根据部门做多层子部门的筛选
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4. 按照部门查看数据时，可以分别展示当前部门以及其子部门的使用情况;5. 如果查询的部门在查询日期没有使用过应用，只返回指标：应用的活跃用户数指标;6. 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;7. 调用频控为100次/分 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/department_overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/department_overview</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/DepartmentOverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/DepartmentOverviewApplicationAppUsageSample.java</a> ;
     */
    public DepartmentOverviewApplicationAppUsageResp departmentOverview(DepartmentOverviewApplicationAppUsageReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/application/v6/applications/:app_id/app_usage/department_overview"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        DepartmentOverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DepartmentOverviewApplicationAppUsageResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/app_usage/department_overview"
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
     * 获取多部门应用使用概览（灰度租户可见），查看应用在某一天/某一周/某一个月的使用数据，可以根据部门做多层子部门的筛选
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4. 按照部门查看数据时，可以分别展示当前部门以及其子部门的使用情况;5. 如果查询的部门在查询日期没有使用过应用，只返回指标：应用的活跃用户数指标;6. 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;7. 调用频控为100次/分 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/department_overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/department_overview</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/DepartmentOverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/DepartmentOverviewApplicationAppUsageSample.java</a> ;
     */
    public DepartmentOverviewApplicationAppUsageResp departmentOverview(DepartmentOverviewApplicationAppUsageReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/application/v6/applications/:app_id/app_usage/department_overview"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        DepartmentOverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DepartmentOverviewApplicationAppUsageResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/app_usage/department_overview"
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
     * 获取应用使用概览，查看应用在某一天/某一周/某一个月的使用数据，可以查看租户整体对应用的使用情况，也可以分部门查看。
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4. 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;5. 按照部门查看数据时，会展示当前部门以及其子部门的整体使用情况;6. 调用频控为100次/分 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/OverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/OverviewApplicationAppUsageSample.java</a> ;
     */
    public OverviewApplicationAppUsageResp overview(OverviewApplicationAppUsageReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/application/v6/applications/:app_id/app_usage/overview"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        OverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, OverviewApplicationAppUsageResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/app_usage/overview"
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
     * 获取应用使用概览，查看应用在某一天/某一周/某一个月的使用数据，可以查看租户整体对应用的使用情况，也可以分部门查看。
     * <p> 1. 仅支持企业版/旗舰版租户使用;2. 一般每天早上10点产出前一天的数据;3. 已经支持的指标包括：应用的活跃用户数、累计用户数、新增用户数、访问页面数、打开次数;4. 数据从飞书4.10版本开始统计，使用飞书版本4.10及以下版本的用户数据不会被统计到;5. 按照部门查看数据时，会展示当前部门以及其子部门的整体使用情况;6. 调用频控为100次/分 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application-app_usage/overview</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/OverviewApplicationAppUsageSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/OverviewApplicationAppUsageSample.java</a> ;
     */
    public OverviewApplicationAppUsageResp overview(OverviewApplicationAppUsageReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/application/v6/applications/:app_id/app_usage/overview"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        OverviewApplicationAppUsageResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, OverviewApplicationAppUsageResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/app_usage/overview"
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
