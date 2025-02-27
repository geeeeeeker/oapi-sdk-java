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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetExportTaskReq {
    /**
     * 导出文档的 token;;[如何获取文档 otken](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnZVxxxxxxxxxxxxGiyBgYqe
     */
    @Query
    @SerializedName("token")
    private String token;
    /**
     * 导出任务ID，[创建导出任务](/ssl::ttdoc//uAjLw4CM/ukTMukTMukTM/reference/drive-v1/export_task/create) 响应中的 ticket 字段
     * <p> 示例值：6933093124755423251
     */
    @Path
    @SerializedName("ticket")
    private String ticket;

    // builder 开始
    public GetExportTaskReq() {
    }

    public GetExportTaskReq(Builder builder) {
        /**
         * 导出文档的 token;;[如何获取文档 otken](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnZVxxxxxxxxxxxxGiyBgYqe
         */
        this.token = builder.token;
        /**
         * 导出任务ID，[创建导出任务](/ssl::ttdoc//uAjLw4CM/ukTMukTMukTM/reference/drive-v1/export_task/create) 响应中的 ticket 字段
         * <p> 示例值：6933093124755423251
         */
        this.ticket = builder.ticket;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public static class Builder {
        private String token; // 导出文档的 token;;[如何获取文档 otken](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
        private String ticket; // 导出任务ID，[创建导出任务](/ssl::ttdoc//uAjLw4CM/ukTMukTMukTM/reference/drive-v1/export_task/create) 响应中的 ticket 字段

        /**
         * 导出文档的 token;;[如何获取文档 otken](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnZVxxxxxxxxxxxxGiyBgYqe
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * 导出任务ID，[创建导出任务](/ssl::ttdoc//uAjLw4CM/ukTMukTMukTM/reference/drive-v1/export_task/create) 响应中的 ticket 字段
         * <p> 示例值：6933093124755423251
         *
         * @param ticket
         * @return
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetExportTaskReq build() {
            return new GetExportTaskReq(this);
        }
    }
}
