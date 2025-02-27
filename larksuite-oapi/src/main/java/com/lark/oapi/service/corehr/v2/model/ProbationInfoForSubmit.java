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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ProbationInfoForSubmit {
    /**
     * 雇佣 ID
     * <p> 示例值：6893014062142064135
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 试用期信息 ID
     * <p> 示例值：6893014062142064132
     */
    @SerializedName("probation_id")
    private String probationId;
    /**
     * 试用期开始日期
     * <p> 示例值：2022-05-20
     */
    @SerializedName("probation_start_date")
    private String probationStartDate;
    /**
     * 试用期预计结束日期
     * <p> 示例值：2022-05-28
     */
    @SerializedName("probation_expected_end_date")
    private String probationExpectedEndDate;
    /**
     * 试用期实际结束日期
     * <p> 示例值：2022-06-28
     */
    @SerializedName("actual_probation_end_date")
    private String actualProbationEndDate;
    /**
     * 转正发起日期
     * <p> 示例值：2022-07-28
     */
    @SerializedName("initiating_time")
    private String initiatingTime;
    /**
     * 发起方
     * <p> 示例值：hr_submission
     */
    @SerializedName("submission_type")
    private Enum submissionType;
    /**
     * 转正发起人的雇佣 ID，当系统发起转正时该字段为空
     * <p> 示例值：6893014062142061135
     */
    @SerializedName("initiator_id")
    private String initiatorId;
    /**
     * 试用期状态
     * <p> 示例值：converted
     */
    @SerializedName("probation_status")
    private Enum probationStatus;
    /**
     * 员工自评
     * <p> 示例值：符合预期
     */
    @SerializedName("self_review")
    private String selfReview;
    /**
     * 备注
     * <p> 示例值：高潜
     */
    @SerializedName("notes")
    private String notes;
    /**
     * 流程实例 ID
     * <p> 示例值：6893014062142164135
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 是否通过 BPM 转正
     * <p> 示例值：false
     */
    @SerializedName("converted_via_bpm")
    private Boolean convertedViaBpm;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;
    /**
     * 试用期考核最终状态
     * <p> 示例值：completed
     */
    @SerializedName("final_assessment_status")
    private Enum finalAssessmentStatus;
    /**
     * 试用期考核最终结果
     * <p> 示例值：approved
     */
    @SerializedName("final_assessment_result")
    private Enum finalAssessmentResult;
    /**
     * 试用期考核最终得分
     * <p> 示例值：99.9
     */
    @SerializedName("final_assessment_score")
    private Double finalAssessmentScore;
    /**
     * 试用期考核最终等级
     * <p> 示例值：grade_a
     */
    @SerializedName("final_assessment_grade")
    private Enum finalAssessmentGrade;
    /**
     * 试用期考核最终评语
     * <p> 示例值：超出预期
     */
    @SerializedName("final_assessment_comment")
    private String finalAssessmentComment;
    /**
     * 最终考核结果页面超链接
     * <p> 示例值：暂无示例
     */
    @SerializedName("final_assessment_detail")
    private String finalAssessmentDetail;

    // builder 开始
    public ProbationInfoForSubmit() {
    }

    public ProbationInfoForSubmit(Builder builder) {
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        this.employmentId = builder.employmentId;
        /**
         * 试用期信息 ID
         * <p> 示例值：6893014062142064132
         */
        this.probationId = builder.probationId;
        /**
         * 试用期开始日期
         * <p> 示例值：2022-05-20
         */
        this.probationStartDate = builder.probationStartDate;
        /**
         * 试用期预计结束日期
         * <p> 示例值：2022-05-28
         */
        this.probationExpectedEndDate = builder.probationExpectedEndDate;
        /**
         * 试用期实际结束日期
         * <p> 示例值：2022-06-28
         */
        this.actualProbationEndDate = builder.actualProbationEndDate;
        /**
         * 转正发起日期
         * <p> 示例值：2022-07-28
         */
        this.initiatingTime = builder.initiatingTime;
        /**
         * 发起方
         * <p> 示例值：hr_submission
         */
        this.submissionType = builder.submissionType;
        /**
         * 转正发起人的雇佣 ID，当系统发起转正时该字段为空
         * <p> 示例值：6893014062142061135
         */
        this.initiatorId = builder.initiatorId;
        /**
         * 试用期状态
         * <p> 示例值：converted
         */
        this.probationStatus = builder.probationStatus;
        /**
         * 员工自评
         * <p> 示例值：符合预期
         */
        this.selfReview = builder.selfReview;
        /**
         * 备注
         * <p> 示例值：高潜
         */
        this.notes = builder.notes;
        /**
         * 流程实例 ID
         * <p> 示例值：6893014062142164135
         */
        this.processId = builder.processId;
        /**
         * 是否通过 BPM 转正
         * <p> 示例值：false
         */
        this.convertedViaBpm = builder.convertedViaBpm;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 试用期考核最终状态
         * <p> 示例值：completed
         */
        this.finalAssessmentStatus = builder.finalAssessmentStatus;
        /**
         * 试用期考核最终结果
         * <p> 示例值：approved
         */
        this.finalAssessmentResult = builder.finalAssessmentResult;
        /**
         * 试用期考核最终得分
         * <p> 示例值：99.9
         */
        this.finalAssessmentScore = builder.finalAssessmentScore;
        /**
         * 试用期考核最终等级
         * <p> 示例值：grade_a
         */
        this.finalAssessmentGrade = builder.finalAssessmentGrade;
        /**
         * 试用期考核最终评语
         * <p> 示例值：超出预期
         */
        this.finalAssessmentComment = builder.finalAssessmentComment;
        /**
         * 最终考核结果页面超链接
         * <p> 示例值：暂无示例
         */
        this.finalAssessmentDetail = builder.finalAssessmentDetail;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getProbationId() {
        return this.probationId;
    }

    public void setProbationId(String probationId) {
        this.probationId = probationId;
    }

    public String getProbationStartDate() {
        return this.probationStartDate;
    }

    public void setProbationStartDate(String probationStartDate) {
        this.probationStartDate = probationStartDate;
    }

    public String getProbationExpectedEndDate() {
        return this.probationExpectedEndDate;
    }

    public void setProbationExpectedEndDate(String probationExpectedEndDate) {
        this.probationExpectedEndDate = probationExpectedEndDate;
    }

    public String getActualProbationEndDate() {
        return this.actualProbationEndDate;
    }

    public void setActualProbationEndDate(String actualProbationEndDate) {
        this.actualProbationEndDate = actualProbationEndDate;
    }

    public String getInitiatingTime() {
        return this.initiatingTime;
    }

    public void setInitiatingTime(String initiatingTime) {
        this.initiatingTime = initiatingTime;
    }

    public Enum getSubmissionType() {
        return this.submissionType;
    }

    public void setSubmissionType(Enum submissionType) {
        this.submissionType = submissionType;
    }

    public String getInitiatorId() {
        return this.initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Enum getProbationStatus() {
        return this.probationStatus;
    }

    public void setProbationStatus(Enum probationStatus) {
        this.probationStatus = probationStatus;
    }

    public String getSelfReview() {
        return this.selfReview;
    }

    public void setSelfReview(String selfReview) {
        this.selfReview = selfReview;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Boolean getConvertedViaBpm() {
        return this.convertedViaBpm;
    }

    public void setConvertedViaBpm(Boolean convertedViaBpm) {
        this.convertedViaBpm = convertedViaBpm;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public Enum getFinalAssessmentStatus() {
        return this.finalAssessmentStatus;
    }

    public void setFinalAssessmentStatus(Enum finalAssessmentStatus) {
        this.finalAssessmentStatus = finalAssessmentStatus;
    }

    public Enum getFinalAssessmentResult() {
        return this.finalAssessmentResult;
    }

    public void setFinalAssessmentResult(Enum finalAssessmentResult) {
        this.finalAssessmentResult = finalAssessmentResult;
    }

    public Double getFinalAssessmentScore() {
        return this.finalAssessmentScore;
    }

    public void setFinalAssessmentScore(Double finalAssessmentScore) {
        this.finalAssessmentScore = finalAssessmentScore;
    }

    public Enum getFinalAssessmentGrade() {
        return this.finalAssessmentGrade;
    }

    public void setFinalAssessmentGrade(Enum finalAssessmentGrade) {
        this.finalAssessmentGrade = finalAssessmentGrade;
    }

    public String getFinalAssessmentComment() {
        return this.finalAssessmentComment;
    }

    public void setFinalAssessmentComment(String finalAssessmentComment) {
        this.finalAssessmentComment = finalAssessmentComment;
    }

    public String getFinalAssessmentDetail() {
        return this.finalAssessmentDetail;
    }

    public void setFinalAssessmentDetail(String finalAssessmentDetail) {
        this.finalAssessmentDetail = finalAssessmentDetail;
    }

    public static class Builder {
        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         */
        private String employmentId;
        /**
         * 试用期信息 ID
         * <p> 示例值：6893014062142064132
         */
        private String probationId;
        /**
         * 试用期开始日期
         * <p> 示例值：2022-05-20
         */
        private String probationStartDate;
        /**
         * 试用期预计结束日期
         * <p> 示例值：2022-05-28
         */
        private String probationExpectedEndDate;
        /**
         * 试用期实际结束日期
         * <p> 示例值：2022-06-28
         */
        private String actualProbationEndDate;
        /**
         * 转正发起日期
         * <p> 示例值：2022-07-28
         */
        private String initiatingTime;
        /**
         * 发起方
         * <p> 示例值：hr_submission
         */
        private Enum submissionType;
        /**
         * 转正发起人的雇佣 ID，当系统发起转正时该字段为空
         * <p> 示例值：6893014062142061135
         */
        private String initiatorId;
        /**
         * 试用期状态
         * <p> 示例值：converted
         */
        private Enum probationStatus;
        /**
         * 员工自评
         * <p> 示例值：符合预期
         */
        private String selfReview;
        /**
         * 备注
         * <p> 示例值：高潜
         */
        private String notes;
        /**
         * 流程实例 ID
         * <p> 示例值：6893014062142164135
         */
        private String processId;
        /**
         * 是否通过 BPM 转正
         * <p> 示例值：false
         */
        private Boolean convertedViaBpm;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;
        /**
         * 试用期考核最终状态
         * <p> 示例值：completed
         */
        private Enum finalAssessmentStatus;
        /**
         * 试用期考核最终结果
         * <p> 示例值：approved
         */
        private Enum finalAssessmentResult;
        /**
         * 试用期考核最终得分
         * <p> 示例值：99.9
         */
        private Double finalAssessmentScore;
        /**
         * 试用期考核最终等级
         * <p> 示例值：grade_a
         */
        private Enum finalAssessmentGrade;
        /**
         * 试用期考核最终评语
         * <p> 示例值：超出预期
         */
        private String finalAssessmentComment;
        /**
         * 最终考核结果页面超链接
         * <p> 示例值：暂无示例
         */
        private String finalAssessmentDetail;

        /**
         * 雇佣 ID
         * <p> 示例值：6893014062142064135
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 试用期信息 ID
         * <p> 示例值：6893014062142064132
         *
         * @param probationId
         * @return
         */
        public Builder probationId(String probationId) {
            this.probationId = probationId;
            return this;
        }


        /**
         * 试用期开始日期
         * <p> 示例值：2022-05-20
         *
         * @param probationStartDate
         * @return
         */
        public Builder probationStartDate(String probationStartDate) {
            this.probationStartDate = probationStartDate;
            return this;
        }


        /**
         * 试用期预计结束日期
         * <p> 示例值：2022-05-28
         *
         * @param probationExpectedEndDate
         * @return
         */
        public Builder probationExpectedEndDate(String probationExpectedEndDate) {
            this.probationExpectedEndDate = probationExpectedEndDate;
            return this;
        }


        /**
         * 试用期实际结束日期
         * <p> 示例值：2022-06-28
         *
         * @param actualProbationEndDate
         * @return
         */
        public Builder actualProbationEndDate(String actualProbationEndDate) {
            this.actualProbationEndDate = actualProbationEndDate;
            return this;
        }


        /**
         * 转正发起日期
         * <p> 示例值：2022-07-28
         *
         * @param initiatingTime
         * @return
         */
        public Builder initiatingTime(String initiatingTime) {
            this.initiatingTime = initiatingTime;
            return this;
        }


        /**
         * 发起方
         * <p> 示例值：hr_submission
         *
         * @param submissionType
         * @return
         */
        public Builder submissionType(Enum submissionType) {
            this.submissionType = submissionType;
            return this;
        }


        /**
         * 转正发起人的雇佣 ID，当系统发起转正时该字段为空
         * <p> 示例值：6893014062142061135
         *
         * @param initiatorId
         * @return
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            return this;
        }


        /**
         * 试用期状态
         * <p> 示例值：converted
         *
         * @param probationStatus
         * @return
         */
        public Builder probationStatus(Enum probationStatus) {
            this.probationStatus = probationStatus;
            return this;
        }


        /**
         * 员工自评
         * <p> 示例值：符合预期
         *
         * @param selfReview
         * @return
         */
        public Builder selfReview(String selfReview) {
            this.selfReview = selfReview;
            return this;
        }


        /**
         * 备注
         * <p> 示例值：高潜
         *
         * @param notes
         * @return
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }


        /**
         * 流程实例 ID
         * <p> 示例值：6893014062142164135
         *
         * @param processId
         * @return
         */
        public Builder processId(String processId) {
            this.processId = processId;
            return this;
        }


        /**
         * 是否通过 BPM 转正
         * <p> 示例值：false
         *
         * @param convertedViaBpm
         * @return
         */
        public Builder convertedViaBpm(Boolean convertedViaBpm) {
            this.convertedViaBpm = convertedViaBpm;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(CustomFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        /**
         * 试用期考核最终状态
         * <p> 示例值：completed
         *
         * @param finalAssessmentStatus
         * @return
         */
        public Builder finalAssessmentStatus(Enum finalAssessmentStatus) {
            this.finalAssessmentStatus = finalAssessmentStatus;
            return this;
        }


        /**
         * 试用期考核最终结果
         * <p> 示例值：approved
         *
         * @param finalAssessmentResult
         * @return
         */
        public Builder finalAssessmentResult(Enum finalAssessmentResult) {
            this.finalAssessmentResult = finalAssessmentResult;
            return this;
        }


        /**
         * 试用期考核最终得分
         * <p> 示例值：99.9
         *
         * @param finalAssessmentScore
         * @return
         */
        public Builder finalAssessmentScore(Double finalAssessmentScore) {
            this.finalAssessmentScore = finalAssessmentScore;
            return this;
        }


        /**
         * 试用期考核最终等级
         * <p> 示例值：grade_a
         *
         * @param finalAssessmentGrade
         * @return
         */
        public Builder finalAssessmentGrade(Enum finalAssessmentGrade) {
            this.finalAssessmentGrade = finalAssessmentGrade;
            return this;
        }


        /**
         * 试用期考核最终评语
         * <p> 示例值：超出预期
         *
         * @param finalAssessmentComment
         * @return
         */
        public Builder finalAssessmentComment(String finalAssessmentComment) {
            this.finalAssessmentComment = finalAssessmentComment;
            return this;
        }


        /**
         * 最终考核结果页面超链接
         * <p> 示例值：暂无示例
         *
         * @param finalAssessmentDetail
         * @return
         */
        public Builder finalAssessmentDetail(String finalAssessmentDetail) {
            this.finalAssessmentDetail = finalAssessmentDetail;
            return this;
        }


        public ProbationInfoForSubmit build() {
            return new ProbationInfoForSubmit(this);
        }
    }
}
