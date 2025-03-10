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

package com.lark.oapi.service.speech_to_text.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class StreamConfig {
    /**
     * 仅包含字母数字和下划线的 16 位字符串作为同一数据流的标识，用户生成
     * <p> 示例值：asd1234567890ddd
     */
    @SerializedName("stream_id")
    private String streamId;
    /**
     * 数据流分片的序号，序号从 0 开始，每次请求递增 1
     * <p> 示例值：1
     */
    @SerializedName("sequence_id")
    private Integer sequenceId;
    /**
     * 数据流标记：1 首包，2 正常结束，等待结果返回，3 中断数据流不返回最终结果
     * <p> 示例值：1
     */
    @SerializedName("action")
    private Integer action;
    /**
     * 语音格式，目前仅支持：pcm
     * <p> 示例值：pcm
     */
    @SerializedName("format")
    private String format;
    /**
     * 引擎类型，目前仅支持：16k_auto 中英混合
     * <p> 示例值：16k_auto
     */
    @SerializedName("engine_type")
    private String engineType;

    // builder 开始
    public StreamConfig() {
    }

    public StreamConfig(Builder builder) {
        /**
         * 仅包含字母数字和下划线的 16 位字符串作为同一数据流的标识，用户生成
         * <p> 示例值：asd1234567890ddd
         */
        this.streamId = builder.streamId;
        /**
         * 数据流分片的序号，序号从 0 开始，每次请求递增 1
         * <p> 示例值：1
         */
        this.sequenceId = builder.sequenceId;
        /**
         * 数据流标记：1 首包，2 正常结束，等待结果返回，3 中断数据流不返回最终结果
         * <p> 示例值：1
         */
        this.action = builder.action;
        /**
         * 语音格式，目前仅支持：pcm
         * <p> 示例值：pcm
         */
        this.format = builder.format;
        /**
         * 引擎类型，目前仅支持：16k_auto 中英混合
         * <p> 示例值：16k_auto
         */
        this.engineType = builder.engineType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStreamId() {
        return this.streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public Integer getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Integer getAction() {
        return this.action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public static class Builder {
        /**
         * 仅包含字母数字和下划线的 16 位字符串作为同一数据流的标识，用户生成
         * <p> 示例值：asd1234567890ddd
         */
        private String streamId;
        /**
         * 数据流分片的序号，序号从 0 开始，每次请求递增 1
         * <p> 示例值：1
         */
        private Integer sequenceId;
        /**
         * 数据流标记：1 首包，2 正常结束，等待结果返回，3 中断数据流不返回最终结果
         * <p> 示例值：1
         */
        private Integer action;
        /**
         * 语音格式，目前仅支持：pcm
         * <p> 示例值：pcm
         */
        private String format;
        /**
         * 引擎类型，目前仅支持：16k_auto 中英混合
         * <p> 示例值：16k_auto
         */
        private String engineType;

        /**
         * 仅包含字母数字和下划线的 16 位字符串作为同一数据流的标识，用户生成
         * <p> 示例值：asd1234567890ddd
         *
         * @param streamId
         * @return
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            return this;
        }


        /**
         * 数据流分片的序号，序号从 0 开始，每次请求递增 1
         * <p> 示例值：1
         *
         * @param sequenceId
         * @return
         */
        public Builder sequenceId(Integer sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }


        /**
         * 数据流标记：1 首包，2 正常结束，等待结果返回，3 中断数据流不返回最终结果
         * <p> 示例值：1
         *
         * @param action
         * @return
         */
        public Builder action(Integer action) {
            this.action = action;
            return this;
        }


        /**
         * 语音格式，目前仅支持：pcm
         * <p> 示例值：pcm
         *
         * @param format
         * @return
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }


        /**
         * 引擎类型，目前仅支持：16k_auto 中英混合
         * <p> 示例值：16k_auto
         *
         * @param engineType
         * @return
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }


        public StreamConfig build() {
            return new StreamConfig(this);
        }
    }
}
