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

public class QualityAudio {
    /**
     * 时间
     * <p> 示例值：2022.12.23 11:16:00 (GMT+08:00)
     */
    @SerializedName("time")
    private String time;
    /**
     * 麦克风采集音量
     * <p> 示例值：6dB
     */
    @SerializedName("mic_input_volume")
    private String micInputVolume;
    /**
     * 扬声器播放音量
     * <p> 示例值：8dB
     */
    @SerializedName("speaker_volume")
    private String speakerVolume;
    /**
     * 码率（接收）
     * <p> 示例值：3kbps
     */
    @SerializedName("bitrate_received")
    private String bitrateReceived;
    /**
     * 延迟（接收）
     * <p> 示例值：100ms
     */
    @SerializedName("latency_received")
    private String latencyReceived;
    /**
     * 抖动（接收）
     * <p> 示例值：100ms
     */
    @SerializedName("jitter_received")
    private String jitterReceived;
    /**
     * 码率（发送）
     * <p> 示例值：9kbps
     */
    @SerializedName("bitrate_sent")
    private String bitrateSent;
    /**
     * 延迟（发送）
     * <p> 示例值：100ms
     */
    @SerializedName("latency_sent")
    private String latencySent;
    /**
     * 抖动（发送）
     * <p> 示例值：100ms
     */
    @SerializedName("jitter_sent")
    private String jitterSent;

    // builder 开始
    public QualityAudio() {
    }

    public QualityAudio(Builder builder) {
        /**
         * 时间
         * <p> 示例值：2022.12.23 11:16:00 (GMT+08:00)
         */
        this.time = builder.time;
        /**
         * 麦克风采集音量
         * <p> 示例值：6dB
         */
        this.micInputVolume = builder.micInputVolume;
        /**
         * 扬声器播放音量
         * <p> 示例值：8dB
         */
        this.speakerVolume = builder.speakerVolume;
        /**
         * 码率（接收）
         * <p> 示例值：3kbps
         */
        this.bitrateReceived = builder.bitrateReceived;
        /**
         * 延迟（接收）
         * <p> 示例值：100ms
         */
        this.latencyReceived = builder.latencyReceived;
        /**
         * 抖动（接收）
         * <p> 示例值：100ms
         */
        this.jitterReceived = builder.jitterReceived;
        /**
         * 码率（发送）
         * <p> 示例值：9kbps
         */
        this.bitrateSent = builder.bitrateSent;
        /**
         * 延迟（发送）
         * <p> 示例值：100ms
         */
        this.latencySent = builder.latencySent;
        /**
         * 抖动（发送）
         * <p> 示例值：100ms
         */
        this.jitterSent = builder.jitterSent;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMicInputVolume() {
        return this.micInputVolume;
    }

    public void setMicInputVolume(String micInputVolume) {
        this.micInputVolume = micInputVolume;
    }

    public String getSpeakerVolume() {
        return this.speakerVolume;
    }

    public void setSpeakerVolume(String speakerVolume) {
        this.speakerVolume = speakerVolume;
    }

    public String getBitrateReceived() {
        return this.bitrateReceived;
    }

    public void setBitrateReceived(String bitrateReceived) {
        this.bitrateReceived = bitrateReceived;
    }

    public String getLatencyReceived() {
        return this.latencyReceived;
    }

    public void setLatencyReceived(String latencyReceived) {
        this.latencyReceived = latencyReceived;
    }

    public String getJitterReceived() {
        return this.jitterReceived;
    }

    public void setJitterReceived(String jitterReceived) {
        this.jitterReceived = jitterReceived;
    }

    public String getBitrateSent() {
        return this.bitrateSent;
    }

    public void setBitrateSent(String bitrateSent) {
        this.bitrateSent = bitrateSent;
    }

    public String getLatencySent() {
        return this.latencySent;
    }

    public void setLatencySent(String latencySent) {
        this.latencySent = latencySent;
    }

    public String getJitterSent() {
        return this.jitterSent;
    }

    public void setJitterSent(String jitterSent) {
        this.jitterSent = jitterSent;
    }

    public static class Builder {
        /**
         * 时间
         * <p> 示例值：2022.12.23 11:16:00 (GMT+08:00)
         */
        private String time;
        /**
         * 麦克风采集音量
         * <p> 示例值：6dB
         */
        private String micInputVolume;
        /**
         * 扬声器播放音量
         * <p> 示例值：8dB
         */
        private String speakerVolume;
        /**
         * 码率（接收）
         * <p> 示例值：3kbps
         */
        private String bitrateReceived;
        /**
         * 延迟（接收）
         * <p> 示例值：100ms
         */
        private String latencyReceived;
        /**
         * 抖动（接收）
         * <p> 示例值：100ms
         */
        private String jitterReceived;
        /**
         * 码率（发送）
         * <p> 示例值：9kbps
         */
        private String bitrateSent;
        /**
         * 延迟（发送）
         * <p> 示例值：100ms
         */
        private String latencySent;
        /**
         * 抖动（发送）
         * <p> 示例值：100ms
         */
        private String jitterSent;

        /**
         * 时间
         * <p> 示例值：2022.12.23 11:16:00 (GMT+08:00)
         *
         * @param time
         * @return
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }


        /**
         * 麦克风采集音量
         * <p> 示例值：6dB
         *
         * @param micInputVolume
         * @return
         */
        public Builder micInputVolume(String micInputVolume) {
            this.micInputVolume = micInputVolume;
            return this;
        }


        /**
         * 扬声器播放音量
         * <p> 示例值：8dB
         *
         * @param speakerVolume
         * @return
         */
        public Builder speakerVolume(String speakerVolume) {
            this.speakerVolume = speakerVolume;
            return this;
        }


        /**
         * 码率（接收）
         * <p> 示例值：3kbps
         *
         * @param bitrateReceived
         * @return
         */
        public Builder bitrateReceived(String bitrateReceived) {
            this.bitrateReceived = bitrateReceived;
            return this;
        }


        /**
         * 延迟（接收）
         * <p> 示例值：100ms
         *
         * @param latencyReceived
         * @return
         */
        public Builder latencyReceived(String latencyReceived) {
            this.latencyReceived = latencyReceived;
            return this;
        }


        /**
         * 抖动（接收）
         * <p> 示例值：100ms
         *
         * @param jitterReceived
         * @return
         */
        public Builder jitterReceived(String jitterReceived) {
            this.jitterReceived = jitterReceived;
            return this;
        }


        /**
         * 码率（发送）
         * <p> 示例值：9kbps
         *
         * @param bitrateSent
         * @return
         */
        public Builder bitrateSent(String bitrateSent) {
            this.bitrateSent = bitrateSent;
            return this;
        }


        /**
         * 延迟（发送）
         * <p> 示例值：100ms
         *
         * @param latencySent
         * @return
         */
        public Builder latencySent(String latencySent) {
            this.latencySent = latencySent;
            return this;
        }


        /**
         * 抖动（发送）
         * <p> 示例值：100ms
         *
         * @param jitterSent
         * @return
         */
        public Builder jitterSent(String jitterSent) {
            this.jitterSent = jitterSent;
            return this;
        }


        public QualityAudio build() {
            return new QualityAudio(this);
        }
    }
}
