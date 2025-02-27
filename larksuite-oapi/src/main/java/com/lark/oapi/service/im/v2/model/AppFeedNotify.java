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

public class AppFeedNotify {
    /**
     * 是否关闭通知
     * <p> 示例值：true
     */
    @SerializedName("close_notify")
    private Boolean closeNotify;
    /**
     * 自定义语音播报文本内容
     * <p> 示例值：您有新的订单
     */
    @SerializedName("custom_sound_text")
    private String customSoundText;
    /**
     * 是否播报自定义语音
     * <p> 示例值：true
     */
    @SerializedName("with_custom_sound")
    private Boolean withCustomSound;

    // builder 开始
    public AppFeedNotify() {
    }

    public AppFeedNotify(Builder builder) {
        /**
         * 是否关闭通知
         * <p> 示例值：true
         */
        this.closeNotify = builder.closeNotify;
        /**
         * 自定义语音播报文本内容
         * <p> 示例值：您有新的订单
         */
        this.customSoundText = builder.customSoundText;
        /**
         * 是否播报自定义语音
         * <p> 示例值：true
         */
        this.withCustomSound = builder.withCustomSound;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getCloseNotify() {
        return this.closeNotify;
    }

    public void setCloseNotify(Boolean closeNotify) {
        this.closeNotify = closeNotify;
    }

    public String getCustomSoundText() {
        return this.customSoundText;
    }

    public void setCustomSoundText(String customSoundText) {
        this.customSoundText = customSoundText;
    }

    public Boolean getWithCustomSound() {
        return this.withCustomSound;
    }

    public void setWithCustomSound(Boolean withCustomSound) {
        this.withCustomSound = withCustomSound;
    }

    public static class Builder {
        /**
         * 是否关闭通知
         * <p> 示例值：true
         */
        private Boolean closeNotify;
        /**
         * 自定义语音播报文本内容
         * <p> 示例值：您有新的订单
         */
        private String customSoundText;
        /**
         * 是否播报自定义语音
         * <p> 示例值：true
         */
        private Boolean withCustomSound;

        /**
         * 是否关闭通知
         * <p> 示例值：true
         *
         * @param closeNotify
         * @return
         */
        public Builder closeNotify(Boolean closeNotify) {
            this.closeNotify = closeNotify;
            return this;
        }


        /**
         * 自定义语音播报文本内容
         * <p> 示例值：您有新的订单
         *
         * @param customSoundText
         * @return
         */
        public Builder customSoundText(String customSoundText) {
            this.customSoundText = customSoundText;
            return this;
        }


        /**
         * 是否播报自定义语音
         * <p> 示例值：true
         *
         * @param withCustomSound
         * @return
         */
        public Builder withCustomSound(Boolean withCustomSound) {
            this.withCustomSound = withCustomSound;
            return this;
        }


        public AppFeedNotify build() {
            return new AppFeedNotify(this);
        }
    }
}
