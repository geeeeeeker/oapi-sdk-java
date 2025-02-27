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

public class WebsiteDeliveryResume {
    /**
     * 实习经历
     * <p> 示例值：
     */
    @SerializedName("internship_list")
    private WebsiteDeliveryInternship[] internshipList;
    /**
     * 基本信息
     * <p> 示例值：
     */
    @SerializedName("basic_info")
    private WebsiteDeliveryBasicInfo basicInfo;
    /**
     * 教育经历
     * <p> 示例值：
     */
    @SerializedName("education_list")
    private WebsiteDeliveryEducation[] educationList;
    /**
     * 自我评价
     * <p> 示例值：
     */
    @SerializedName("self_evaluation")
    private WebsiteDeliverySelfEvaluation selfEvaluation;
    /**
     * 工作经历
     * <p> 示例值：
     */
    @SerializedName("career_list")
    private WebsiteDeliveryCareer[] careerList;
    /**
     * 自定义模块
     * <p> 示例值：
     */
    @SerializedName("customized_data")
    private WebsiteDeliveryCustomizedDataParent[] customizedData;
    /**
     * 简历附件ID，使用「创建附件」生成
     * <p> 示例值：6960663240925956654
     */
    @SerializedName("resume_attachment_id")
    private String resumeAttachmentId;
    /**
     * 社交账号
     * <p> 示例值：
     */
    @SerializedName("sns_list")
    private WebsiteDeliverySns[] snsList;
    /**
     * 作品
     * <p> 示例值：
     */
    @SerializedName("works_list")
    private WebsiteDeliveryWorks[] worksList;
    /**
     * 获奖记录
     * <p> 示例值：
     */
    @SerializedName("award_list")
    private WebsiteDeliveryAward[] awardList;
    /**
     * 项目经历
     * <p> 示例值：
     */
    @SerializedName("project_list")
    private WebsiteDeliveryProject[] projectList;
    /**
     * 语言能力
     * <p> 示例值：
     */
    @SerializedName("language_list")
    private WebsiteDeliveryLanguage[] languageList;

    // builder 开始
    public WebsiteDeliveryResume() {
    }

    public WebsiteDeliveryResume(Builder builder) {
        /**
         * 实习经历
         * <p> 示例值：
         */
        this.internshipList = builder.internshipList;
        /**
         * 基本信息
         * <p> 示例值：
         */
        this.basicInfo = builder.basicInfo;
        /**
         * 教育经历
         * <p> 示例值：
         */
        this.educationList = builder.educationList;
        /**
         * 自我评价
         * <p> 示例值：
         */
        this.selfEvaluation = builder.selfEvaluation;
        /**
         * 工作经历
         * <p> 示例值：
         */
        this.careerList = builder.careerList;
        /**
         * 自定义模块
         * <p> 示例值：
         */
        this.customizedData = builder.customizedData;
        /**
         * 简历附件ID，使用「创建附件」生成
         * <p> 示例值：6960663240925956654
         */
        this.resumeAttachmentId = builder.resumeAttachmentId;
        /**
         * 社交账号
         * <p> 示例值：
         */
        this.snsList = builder.snsList;
        /**
         * 作品
         * <p> 示例值：
         */
        this.worksList = builder.worksList;
        /**
         * 获奖记录
         * <p> 示例值：
         */
        this.awardList = builder.awardList;
        /**
         * 项目经历
         * <p> 示例值：
         */
        this.projectList = builder.projectList;
        /**
         * 语言能力
         * <p> 示例值：
         */
        this.languageList = builder.languageList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public WebsiteDeliveryInternship[] getInternshipList() {
        return this.internshipList;
    }

    public void setInternshipList(WebsiteDeliveryInternship[] internshipList) {
        this.internshipList = internshipList;
    }

    public WebsiteDeliveryBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public void setBasicInfo(WebsiteDeliveryBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public WebsiteDeliveryEducation[] getEducationList() {
        return this.educationList;
    }

    public void setEducationList(WebsiteDeliveryEducation[] educationList) {
        this.educationList = educationList;
    }

    public WebsiteDeliverySelfEvaluation getSelfEvaluation() {
        return this.selfEvaluation;
    }

    public void setSelfEvaluation(WebsiteDeliverySelfEvaluation selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public WebsiteDeliveryCareer[] getCareerList() {
        return this.careerList;
    }

    public void setCareerList(WebsiteDeliveryCareer[] careerList) {
        this.careerList = careerList;
    }

    public WebsiteDeliveryCustomizedDataParent[] getCustomizedData() {
        return this.customizedData;
    }

    public void setCustomizedData(WebsiteDeliveryCustomizedDataParent[] customizedData) {
        this.customizedData = customizedData;
    }

    public String getResumeAttachmentId() {
        return this.resumeAttachmentId;
    }

    public void setResumeAttachmentId(String resumeAttachmentId) {
        this.resumeAttachmentId = resumeAttachmentId;
    }

    public WebsiteDeliverySns[] getSnsList() {
        return this.snsList;
    }

    public void setSnsList(WebsiteDeliverySns[] snsList) {
        this.snsList = snsList;
    }

    public WebsiteDeliveryWorks[] getWorksList() {
        return this.worksList;
    }

    public void setWorksList(WebsiteDeliveryWorks[] worksList) {
        this.worksList = worksList;
    }

    public WebsiteDeliveryAward[] getAwardList() {
        return this.awardList;
    }

    public void setAwardList(WebsiteDeliveryAward[] awardList) {
        this.awardList = awardList;
    }

    public WebsiteDeliveryProject[] getProjectList() {
        return this.projectList;
    }

    public void setProjectList(WebsiteDeliveryProject[] projectList) {
        this.projectList = projectList;
    }

    public WebsiteDeliveryLanguage[] getLanguageList() {
        return this.languageList;
    }

    public void setLanguageList(WebsiteDeliveryLanguage[] languageList) {
        this.languageList = languageList;
    }

    public static class Builder {
        /**
         * 实习经历
         * <p> 示例值：
         */
        private WebsiteDeliveryInternship[] internshipList;
        /**
         * 基本信息
         * <p> 示例值：
         */
        private WebsiteDeliveryBasicInfo basicInfo;
        /**
         * 教育经历
         * <p> 示例值：
         */
        private WebsiteDeliveryEducation[] educationList;
        /**
         * 自我评价
         * <p> 示例值：
         */
        private WebsiteDeliverySelfEvaluation selfEvaluation;
        /**
         * 工作经历
         * <p> 示例值：
         */
        private WebsiteDeliveryCareer[] careerList;
        /**
         * 自定义模块
         * <p> 示例值：
         */
        private WebsiteDeliveryCustomizedDataParent[] customizedData;
        /**
         * 简历附件ID，使用「创建附件」生成
         * <p> 示例值：6960663240925956654
         */
        private String resumeAttachmentId;
        /**
         * 社交账号
         * <p> 示例值：
         */
        private WebsiteDeliverySns[] snsList;
        /**
         * 作品
         * <p> 示例值：
         */
        private WebsiteDeliveryWorks[] worksList;
        /**
         * 获奖记录
         * <p> 示例值：
         */
        private WebsiteDeliveryAward[] awardList;
        /**
         * 项目经历
         * <p> 示例值：
         */
        private WebsiteDeliveryProject[] projectList;
        /**
         * 语言能力
         * <p> 示例值：
         */
        private WebsiteDeliveryLanguage[] languageList;

        /**
         * 实习经历
         * <p> 示例值：
         *
         * @param internshipList
         * @return
         */
        public Builder internshipList(WebsiteDeliveryInternship[] internshipList) {
            this.internshipList = internshipList;
            return this;
        }


        /**
         * 基本信息
         * <p> 示例值：
         *
         * @param basicInfo
         * @return
         */
        public Builder basicInfo(WebsiteDeliveryBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }


        /**
         * 教育经历
         * <p> 示例值：
         *
         * @param educationList
         * @return
         */
        public Builder educationList(WebsiteDeliveryEducation[] educationList) {
            this.educationList = educationList;
            return this;
        }


        /**
         * 自我评价
         * <p> 示例值：
         *
         * @param selfEvaluation
         * @return
         */
        public Builder selfEvaluation(WebsiteDeliverySelfEvaluation selfEvaluation) {
            this.selfEvaluation = selfEvaluation;
            return this;
        }


        /**
         * 工作经历
         * <p> 示例值：
         *
         * @param careerList
         * @return
         */
        public Builder careerList(WebsiteDeliveryCareer[] careerList) {
            this.careerList = careerList;
            return this;
        }


        /**
         * 自定义模块
         * <p> 示例值：
         *
         * @param customizedData
         * @return
         */
        public Builder customizedData(WebsiteDeliveryCustomizedDataParent[] customizedData) {
            this.customizedData = customizedData;
            return this;
        }


        /**
         * 简历附件ID，使用「创建附件」生成
         * <p> 示例值：6960663240925956654
         *
         * @param resumeAttachmentId
         * @return
         */
        public Builder resumeAttachmentId(String resumeAttachmentId) {
            this.resumeAttachmentId = resumeAttachmentId;
            return this;
        }


        /**
         * 社交账号
         * <p> 示例值：
         *
         * @param snsList
         * @return
         */
        public Builder snsList(WebsiteDeliverySns[] snsList) {
            this.snsList = snsList;
            return this;
        }


        /**
         * 作品
         * <p> 示例值：
         *
         * @param worksList
         * @return
         */
        public Builder worksList(WebsiteDeliveryWorks[] worksList) {
            this.worksList = worksList;
            return this;
        }


        /**
         * 获奖记录
         * <p> 示例值：
         *
         * @param awardList
         * @return
         */
        public Builder awardList(WebsiteDeliveryAward[] awardList) {
            this.awardList = awardList;
            return this;
        }


        /**
         * 项目经历
         * <p> 示例值：
         *
         * @param projectList
         * @return
         */
        public Builder projectList(WebsiteDeliveryProject[] projectList) {
            this.projectList = projectList;
            return this;
        }


        /**
         * 语言能力
         * <p> 示例值：
         *
         * @param languageList
         * @return
         */
        public Builder languageList(WebsiteDeliveryLanguage[] languageList) {
            this.languageList = languageList;
            return this;
        }


        public WebsiteDeliveryResume build() {
            return new WebsiteDeliveryResume(this);
        }
    }
}
