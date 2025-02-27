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

public class BatchGetTmpDownloadUrlMediaReq {
    /**
     * 文件标识符列表
     * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
     */
    @Query
    @SerializedName("file_tokens")
    private String[] fileTokens;
    /**
     * 拓展信息(可选)
     * <p> 示例值：[请参考-上传点类型及对应Extra说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/drive-v1/media/introduction)
     */
    @Query
    @SerializedName("extra")
    private String extra;

    // builder 开始
    public BatchGetTmpDownloadUrlMediaReq() {
    }

    public BatchGetTmpDownloadUrlMediaReq(Builder builder) {
        /**
         * 文件标识符列表
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         */
        this.fileTokens = builder.fileTokens;
        /**
         * 拓展信息(可选)
         * <p> 示例值：[请参考-上传点类型及对应Extra说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/drive-v1/media/introduction)
         */
        this.extra = builder.extra;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getFileTokens() {
        return this.fileTokens;
    }

    public void setFileTokens(String[] fileTokens) {
        this.fileTokens = fileTokens;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static class Builder {
        private String[] fileTokens; // 文件标识符列表
        private String extra; // 拓展信息(可选)


        /**
         * 文件标识符列表
         * <p> 示例值：boxcnrHpsg1QDqXAAAyachabcef
         *
         * @param fileTokens
         * @return
         */
        public Builder fileTokens(String[] fileTokens) {
            this.fileTokens = fileTokens;
            return this;
        }


        /**
         * 拓展信息(可选)
         * <p> 示例值：[请参考-上传点类型及对应Extra说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/drive-v1/media/introduction)
         *
         * @param extra
         * @return
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        public BatchGetTmpDownloadUrlMediaReq build() {
            return new BatchGetTmpDownloadUrlMediaReq(this);
        }
    }
}
