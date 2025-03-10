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

package com.lark.oapi.service.application.v6.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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

public class AppAbilityBot {
    /**
     * 是否开启
     * <p> 示例值：true
     */
    @SerializedName("enable")
    private Boolean enable;
    /**
     * 消息卡片的回调地址
     * <p> 示例值：https://open.feishu.cn
     */
    @SerializedName("message_card_callback_url")
    private String messageCardCallbackUrl;
    /**
     * 国际化内容
     * <p> 示例值：
     */
    @SerializedName("i18ns")
    private AppAbilityBotI18n[] i18ns;

    // builder 开始
    public AppAbilityBot() {
    }

    public AppAbilityBot(Builder builder) {
        /**
         * 是否开启
         * <p> 示例值：true
         */
        this.enable = builder.enable;
        /**
         * 消息卡片的回调地址
         * <p> 示例值：https://open.feishu.cn
         */
        this.messageCardCallbackUrl = builder.messageCardCallbackUrl;
        /**
         * 国际化内容
         * <p> 示例值：
         */
        this.i18ns = builder.i18ns;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getMessageCardCallbackUrl() {
        return this.messageCardCallbackUrl;
    }

    public void setMessageCardCallbackUrl(String messageCardCallbackUrl) {
        this.messageCardCallbackUrl = messageCardCallbackUrl;
    }

    public AppAbilityBotI18n[] getI18ns() {
        return this.i18ns;
    }

    public void setI18ns(AppAbilityBotI18n[] i18ns) {
        this.i18ns = i18ns;
    }

    public static class Builder {
        /**
         * 是否开启
         * <p> 示例值：true
         */
        private Boolean enable;
        /**
         * 消息卡片的回调地址
         * <p> 示例值：https://open.feishu.cn
         */
        private String messageCardCallbackUrl;
        /**
         * 国际化内容
         * <p> 示例值：
         */
        private AppAbilityBotI18n[] i18ns;

        /**
         * 是否开启
         * <p> 示例值：true
         *
         * @param enable
         * @return
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }


        /**
         * 消息卡片的回调地址
         * <p> 示例值：https://open.feishu.cn
         *
         * @param messageCardCallbackUrl
         * @return
         */
        public Builder messageCardCallbackUrl(String messageCardCallbackUrl) {
            this.messageCardCallbackUrl = messageCardCallbackUrl;
            return this;
        }


        /**
         * 国际化内容
         * <p> 示例值：
         *
         * @param i18ns
         * @return
         */
        public Builder i18ns(AppAbilityBotI18n[] i18ns) {
            this.i18ns = i18ns;
            return this;
        }


        public AppAbilityBot build() {
            return new AppAbilityBot(this);
        }
    }
}
