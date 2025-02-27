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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class TaskUrls {
    /**
     * 帮助服务台 URL
     * <p> 示例值：https://blabla
     */
    @SerializedName("helpdesk")
    private String helpdesk;
    /**
     * 移动端 URL
     * <p> 示例值：https://blabla
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * PC 端 URL
     * <p> 示例值：https://blabla
     */
    @SerializedName("pc")
    private String pc;

    // builder 开始
    public TaskUrls() {
    }

    public TaskUrls(Builder builder) {
        /**
         * 帮助服务台 URL
         * <p> 示例值：https://blabla
         */
        this.helpdesk = builder.helpdesk;
        /**
         * 移动端 URL
         * <p> 示例值：https://blabla
         */
        this.mobile = builder.mobile;
        /**
         * PC 端 URL
         * <p> 示例值：https://blabla
         */
        this.pc = builder.pc;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getHelpdesk() {
        return this.helpdesk;
    }

    public void setHelpdesk(String helpdesk) {
        this.helpdesk = helpdesk;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPc() {
        return this.pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public static class Builder {
        /**
         * 帮助服务台 URL
         * <p> 示例值：https://blabla
         */
        private String helpdesk;
        /**
         * 移动端 URL
         * <p> 示例值：https://blabla
         */
        private String mobile;
        /**
         * PC 端 URL
         * <p> 示例值：https://blabla
         */
        private String pc;

        /**
         * 帮助服务台 URL
         * <p> 示例值：https://blabla
         *
         * @param helpdesk
         * @return
         */
        public Builder helpdesk(String helpdesk) {
            this.helpdesk = helpdesk;
            return this;
        }


        /**
         * 移动端 URL
         * <p> 示例值：https://blabla
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * PC 端 URL
         * <p> 示例值：https://blabla
         *
         * @param pc
         * @return
         */
        public Builder pc(String pc) {
            this.pc = pc;
            return this;
        }


        public TaskUrls build() {
            return new TaskUrls(this);
        }
    }
}
