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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class RoomDigitalSignage {
    /**
     * 是否覆盖子层级及会议室
     * <p> 示例值：true
     */
    @SerializedName("if_cover_child_scope")
    private Boolean ifCoverChildScope;
    /**
     * 是否开启数字标牌功能
     * <p> 示例值：true
     */
    @SerializedName("enable")
    private Boolean enable;
    /**
     * 是否静音播放
     * <p> 示例值：true
     */
    @SerializedName("mute")
    private Boolean mute;
    /**
     * 在会议结束n分钟后开始播放，取值1~720（仅对飞书会议室数字标牌生效）
     * <p> 示例值：3
     */
    @SerializedName("start_display")
    private Integer startDisplay;
    /**
     * 在日程会议开始前n分钟停止播放，取值1~720（仅对飞书会议室数字标牌生效）
     * <p> 示例值：3
     */
    @SerializedName("stop_display")
    private Integer stopDisplay;
    /**
     * 素材列表
     * <p> 示例值：
     */
    @SerializedName("materials")
    private RoomDigitalSignageMaterial[] materials;

    // builder 开始
    public RoomDigitalSignage() {
    }

    public RoomDigitalSignage(Builder builder) {
        /**
         * 是否覆盖子层级及会议室
         * <p> 示例值：true
         */
        this.ifCoverChildScope = builder.ifCoverChildScope;
        /**
         * 是否开启数字标牌功能
         * <p> 示例值：true
         */
        this.enable = builder.enable;
        /**
         * 是否静音播放
         * <p> 示例值：true
         */
        this.mute = builder.mute;
        /**
         * 在会议结束n分钟后开始播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         */
        this.startDisplay = builder.startDisplay;
        /**
         * 在日程会议开始前n分钟停止播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         */
        this.stopDisplay = builder.stopDisplay;
        /**
         * 素材列表
         * <p> 示例值：
         */
        this.materials = builder.materials;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIfCoverChildScope() {
        return this.ifCoverChildScope;
    }

    public void setIfCoverChildScope(Boolean ifCoverChildScope) {
        this.ifCoverChildScope = ifCoverChildScope;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getMute() {
        return this.mute;
    }

    public void setMute(Boolean mute) {
        this.mute = mute;
    }

    public Integer getStartDisplay() {
        return this.startDisplay;
    }

    public void setStartDisplay(Integer startDisplay) {
        this.startDisplay = startDisplay;
    }

    public Integer getStopDisplay() {
        return this.stopDisplay;
    }

    public void setStopDisplay(Integer stopDisplay) {
        this.stopDisplay = stopDisplay;
    }

    public RoomDigitalSignageMaterial[] getMaterials() {
        return this.materials;
    }

    public void setMaterials(RoomDigitalSignageMaterial[] materials) {
        this.materials = materials;
    }

    public static class Builder {
        /**
         * 是否覆盖子层级及会议室
         * <p> 示例值：true
         */
        private Boolean ifCoverChildScope;
        /**
         * 是否开启数字标牌功能
         * <p> 示例值：true
         */
        private Boolean enable;
        /**
         * 是否静音播放
         * <p> 示例值：true
         */
        private Boolean mute;
        /**
         * 在会议结束n分钟后开始播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         */
        private Integer startDisplay;
        /**
         * 在日程会议开始前n分钟停止播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         */
        private Integer stopDisplay;
        /**
         * 素材列表
         * <p> 示例值：
         */
        private RoomDigitalSignageMaterial[] materials;

        /**
         * 是否覆盖子层级及会议室
         * <p> 示例值：true
         *
         * @param ifCoverChildScope
         * @return
         */
        public Builder ifCoverChildScope(Boolean ifCoverChildScope) {
            this.ifCoverChildScope = ifCoverChildScope;
            return this;
        }


        /**
         * 是否开启数字标牌功能
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
         * 是否静音播放
         * <p> 示例值：true
         *
         * @param mute
         * @return
         */
        public Builder mute(Boolean mute) {
            this.mute = mute;
            return this;
        }


        /**
         * 在会议结束n分钟后开始播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         *
         * @param startDisplay
         * @return
         */
        public Builder startDisplay(Integer startDisplay) {
            this.startDisplay = startDisplay;
            return this;
        }


        /**
         * 在日程会议开始前n分钟停止播放，取值1~720（仅对飞书会议室数字标牌生效）
         * <p> 示例值：3
         *
         * @param stopDisplay
         * @return
         */
        public Builder stopDisplay(Integer stopDisplay) {
            this.stopDisplay = stopDisplay;
            return this;
        }


        /**
         * 素材列表
         * <p> 示例值：
         *
         * @param materials
         * @return
         */
        public Builder materials(RoomDigitalSignageMaterial[] materials) {
            this.materials = materials;
            return this;
        }


        public RoomDigitalSignage build() {
            return new RoomDigitalSignage(this);
        }
    }
}
