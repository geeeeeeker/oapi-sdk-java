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

package com.lark.oapi.service.hire.v1.model;

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

public class InterviewAppointmentConfig {
    /**
     * 是否开启面试官自助约面
     * <p> 示例值：true
     */
    @SerializedName("enable_interview_appointment_by_interviewer")
    private Boolean enableInterviewAppointmentByInterviewer;
    /**
     * 配置详情
     * <p> 示例值：
     */
    @SerializedName("config")
    private InterviewAppointmentConfigContent config;

    // builder 开始
    public InterviewAppointmentConfig() {
    }

    public InterviewAppointmentConfig(Builder builder) {
        /**
         * 是否开启面试官自助约面
         * <p> 示例值：true
         */
        this.enableInterviewAppointmentByInterviewer = builder.enableInterviewAppointmentByInterviewer;
        /**
         * 配置详情
         * <p> 示例值：
         */
        this.config = builder.config;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getEnableInterviewAppointmentByInterviewer() {
        return this.enableInterviewAppointmentByInterviewer;
    }

    public void setEnableInterviewAppointmentByInterviewer(Boolean enableInterviewAppointmentByInterviewer) {
        this.enableInterviewAppointmentByInterviewer = enableInterviewAppointmentByInterviewer;
    }

    public InterviewAppointmentConfigContent getConfig() {
        return this.config;
    }

    public void setConfig(InterviewAppointmentConfigContent config) {
        this.config = config;
    }

    public static class Builder {
        /**
         * 是否开启面试官自助约面
         * <p> 示例值：true
         */
        private Boolean enableInterviewAppointmentByInterviewer;
        /**
         * 配置详情
         * <p> 示例值：
         */
        private InterviewAppointmentConfigContent config;

        /**
         * 是否开启面试官自助约面
         * <p> 示例值：true
         *
         * @param enableInterviewAppointmentByInterviewer
         * @return
         */
        public Builder enableInterviewAppointmentByInterviewer(Boolean enableInterviewAppointmentByInterviewer) {
            this.enableInterviewAppointmentByInterviewer = enableInterviewAppointmentByInterviewer;
            return this;
        }


        /**
         * 配置详情
         * <p> 示例值：
         *
         * @param config
         * @return
         */
        public Builder config(InterviewAppointmentConfigContent config) {
            this.config = config;
            return this;
        }


        public InterviewAppointmentConfig build() {
            return new InterviewAppointmentConfig(this);
        }
    }
}
