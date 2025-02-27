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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class PatchProbationAssessmentReq {
    /**
     * 根据 client_token 是否一致来判断是否为同一请求
     * <p> 示例值：6822122262122064111
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 考核结果 ID
     * <p> 示例值：7140964208476371331
     */
    @Path
    @SerializedName("assessment_id")
    private String assessmentId;
    @Body
    private AssessmentForCreate body;

    // builder 开始
    public PatchProbationAssessmentReq() {
    }

    public PatchProbationAssessmentReq(Builder builder) {
        /**
         * 根据 client_token 是否一致来判断是否为同一请求
         * <p> 示例值：6822122262122064111
         */
        this.clientToken = builder.clientToken;
        /**
         * 考核结果 ID
         * <p> 示例值：7140964208476371331
         */
        this.assessmentId = builder.assessmentId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getAssessmentId() {
        return this.assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public AssessmentForCreate getAssessmentForCreate() {
        return this.body;
    }

    public void setAssessmentForCreate(AssessmentForCreate body) {
        this.body = body;
    }

    public static class Builder {
        private String clientToken; // 根据 client_token 是否一致来判断是否为同一请求
        private String assessmentId; // 考核结果 ID
        private AssessmentForCreate body;

        /**
         * 根据 client_token 是否一致来判断是否为同一请求
         * <p> 示例值：6822122262122064111
         *
         * @param clientToken
         * @return
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 考核结果 ID
         * <p> 示例值：7140964208476371331
         *
         * @param assessmentId
         * @return
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            return this;
        }

        public AssessmentForCreate getAssessmentForCreate() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder assessmentForCreate(AssessmentForCreate body) {
            this.body = body;
            return this;
        }

        public PatchProbationAssessmentReq build() {
            return new PatchProbationAssessmentReq(this);
        }
    }
}
