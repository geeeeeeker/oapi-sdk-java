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

package com.lark.oapi.service.im.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class FailedReason {
    /**
     * 错误码
     * <p> 示例值：0
     */
    @SerializedName("error_code")
    private Integer errorCode;
    /**
     * 错误信息
     * <p> 示例值：The user is not in the chat
     */
    @SerializedName("error_message")
    private String errorMessage;
    /**
     * 用户id
     * <p> 示例值：ou_679eaeb583654bff73fefcc6e6371301
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public FailedReason() {
    }

    public FailedReason(Builder builder) {
        /**
         * 错误码
         * <p> 示例值：0
         */
        this.errorCode = builder.errorCode;
        /**
         * 错误信息
         * <p> 示例值：The user is not in the chat
         */
        this.errorMessage = builder.errorMessage;
        /**
         * 用户id
         * <p> 示例值：ou_679eaeb583654bff73fefcc6e6371301
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 错误码
         * <p> 示例值：0
         */
        private Integer errorCode;
        /**
         * 错误信息
         * <p> 示例值：The user is not in the chat
         */
        private String errorMessage;
        /**
         * 用户id
         * <p> 示例值：ou_679eaeb583654bff73fefcc6e6371301
         */
        private String userId;

        /**
         * 错误码
         * <p> 示例值：0
         *
         * @param errorCode
         * @return
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }


        /**
         * 错误信息
         * <p> 示例值：The user is not in the chat
         *
         * @param errorMessage
         * @return
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }


        /**
         * 用户id
         * <p> 示例值：ou_679eaeb583654bff73fefcc6e6371301
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public FailedReason build() {
            return new FailedReason(this);
        }
    }
}
