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

package com.lark.oapi.service.document_ai.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.document_ai.v1.enums.*;
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

public class Resume {
    /**
     * 文件标识ID，依据文件内容自动生成
     * <p> 示例值：825c59042dxxxxx3ff90b45xxxxx88
     */
    @SerializedName("file_md5")
    private String fileMd5;
    /**
     * 文本内容，当接口返回成功时，该字段才存在
     * <p> 示例值：XX负责行政人事管理和日常事务...
     */
    @SerializedName("content")
    private String content;
    /**
     * 经过排序后的文本内容，当接口返回成功时，该字段才存在
     * <p> 示例值：XX负责行政人事管理和日常事务...
     */
    @SerializedName("new_content")
    private String newContent;
    /**
     * 名称
     * <p> 示例值：张三
     */
    @SerializedName("name")
    private String name;
    /**
     * 邮箱
     * <p> 示例值：zhangsan.1111@bytedance.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 手机号码
     * <p> 示例值：13600000000
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 手机号码是否虚拟号码
     * <p> 示例值：false
     */
    @SerializedName("mobile_is_virtual")
    private Boolean mobileIsVirtual;
    /**
     * 手机号码国家编码
     * <p> 示例值：86
     */
    @SerializedName("country_code")
    private String countryCode;
    /**
     * 教育经历
     * <p> 示例值：
     */
    @SerializedName("educations")
    private ResumeEducation[] educations;
    /**
     * 职业经历
     * <p> 示例值：
     */
    @SerializedName("careers")
    private ResumeCareer[] careers;
    /**
     * 项目经历
     * <p> 示例值：
     */
    @SerializedName("projects")
    private ResumeProject[] projects;
    /**
     * 工作年限，为空表示工作年限未知，数字单位为年，整数
     * <p> 示例值：5
     */
    @SerializedName("work_year")
    private Integer workYear;
    /**
     * 生日，格式YYYY-MM-DD
     * <p> 示例值：1995-01-01
     */
    @SerializedName("date_of_birth")
    private String dateOfBirth;
    /**
     * 性别
     * <p> 示例值：1
     */
    @SerializedName("gender")
    private Integer gender;
    /**
     * 希望获得的职位列表
     * <p> 示例值：xxx岗位
     */
    @SerializedName("willing_positions")
    private String[] willingPositions;
    /**
     * 当前工作地点(城市)
     * <p> 示例值：上海
     */
    @SerializedName("current_location")
    private String currentLocation;
    /**
     * 希望工作地点列表
     * <p> 示例值：
     */
    @SerializedName("willing_locations")
    private String[] willingLocations;
    /**
     * 家乡(城市)
     * <p> 示例值：上海
     */
    @SerializedName("home_location")
    private String homeLocation;
    /**
     * 语言
     * <p> 示例值：
     */
    @SerializedName("languages")
    private ResumeLanguage[] languages;
    /**
     * 获奖
     * <p> 示例值：
     */
    @SerializedName("awards")
    private ResumeAward[] awards;
    /**
     * 证书
     * <p> 示例值：
     */
    @SerializedName("certificates")
    private ResumeCertificate[] certificates;
    /**
     * 竞赛
     * <p> 示例值：
     */
    @SerializedName("competitions")
    private ResumeCompetition[] competitions;
    /**
     * 自我评价
     * <p> 示例值：我是一个...
     */
    @SerializedName("self_evaluation")
    private String selfEvaluation;
    /**
     * 链接列表
     * <p> 示例值：
     */
    @SerializedName("urls")
    private String[] urls;
    /**
     * 社交链接
     * <p> 示例值：
     */
    @SerializedName("social_links")
    private String[] socialLinks;

    // builder 开始
    public Resume() {
    }

    public Resume(Builder builder) {
        /**
         * 文件标识ID，依据文件内容自动生成
         * <p> 示例值：825c59042dxxxxx3ff90b45xxxxx88
         */
        this.fileMd5 = builder.fileMd5;
        /**
         * 文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         */
        this.content = builder.content;
        /**
         * 经过排序后的文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         */
        this.newContent = builder.newContent;
        /**
         * 名称
         * <p> 示例值：张三
         */
        this.name = builder.name;
        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         */
        this.email = builder.email;
        /**
         * 手机号码
         * <p> 示例值：13600000000
         */
        this.mobile = builder.mobile;
        /**
         * 手机号码是否虚拟号码
         * <p> 示例值：false
         */
        this.mobileIsVirtual = builder.mobileIsVirtual;
        /**
         * 手机号码国家编码
         * <p> 示例值：86
         */
        this.countryCode = builder.countryCode;
        /**
         * 教育经历
         * <p> 示例值：
         */
        this.educations = builder.educations;
        /**
         * 职业经历
         * <p> 示例值：
         */
        this.careers = builder.careers;
        /**
         * 项目经历
         * <p> 示例值：
         */
        this.projects = builder.projects;
        /**
         * 工作年限，为空表示工作年限未知，数字单位为年，整数
         * <p> 示例值：5
         */
        this.workYear = builder.workYear;
        /**
         * 生日，格式YYYY-MM-DD
         * <p> 示例值：1995-01-01
         */
        this.dateOfBirth = builder.dateOfBirth;
        /**
         * 性别
         * <p> 示例值：1
         */
        this.gender = builder.gender;
        /**
         * 希望获得的职位列表
         * <p> 示例值：xxx岗位
         */
        this.willingPositions = builder.willingPositions;
        /**
         * 当前工作地点(城市)
         * <p> 示例值：上海
         */
        this.currentLocation = builder.currentLocation;
        /**
         * 希望工作地点列表
         * <p> 示例值：
         */
        this.willingLocations = builder.willingLocations;
        /**
         * 家乡(城市)
         * <p> 示例值：上海
         */
        this.homeLocation = builder.homeLocation;
        /**
         * 语言
         * <p> 示例值：
         */
        this.languages = builder.languages;
        /**
         * 获奖
         * <p> 示例值：
         */
        this.awards = builder.awards;
        /**
         * 证书
         * <p> 示例值：
         */
        this.certificates = builder.certificates;
        /**
         * 竞赛
         * <p> 示例值：
         */
        this.competitions = builder.competitions;
        /**
         * 自我评价
         * <p> 示例值：我是一个...
         */
        this.selfEvaluation = builder.selfEvaluation;
        /**
         * 链接列表
         * <p> 示例值：
         */
        this.urls = builder.urls;
        /**
         * 社交链接
         * <p> 示例值：
         */
        this.socialLinks = builder.socialLinks;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileMd5() {
        return this.fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewContent() {
        return this.newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getMobileIsVirtual() {
        return this.mobileIsVirtual;
    }

    public void setMobileIsVirtual(Boolean mobileIsVirtual) {
        this.mobileIsVirtual = mobileIsVirtual;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ResumeEducation[] getEducations() {
        return this.educations;
    }

    public void setEducations(ResumeEducation[] educations) {
        this.educations = educations;
    }

    public ResumeCareer[] getCareers() {
        return this.careers;
    }

    public void setCareers(ResumeCareer[] careers) {
        this.careers = careers;
    }

    public ResumeProject[] getProjects() {
        return this.projects;
    }

    public void setProjects(ResumeProject[] projects) {
        this.projects = projects;
    }

    public Integer getWorkYear() {
        return this.workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String[] getWillingPositions() {
        return this.willingPositions;
    }

    public void setWillingPositions(String[] willingPositions) {
        this.willingPositions = willingPositions;
    }

    public String getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String[] getWillingLocations() {
        return this.willingLocations;
    }

    public void setWillingLocations(String[] willingLocations) {
        this.willingLocations = willingLocations;
    }

    public String getHomeLocation() {
        return this.homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    public ResumeLanguage[] getLanguages() {
        return this.languages;
    }

    public void setLanguages(ResumeLanguage[] languages) {
        this.languages = languages;
    }

    public ResumeAward[] getAwards() {
        return this.awards;
    }

    public void setAwards(ResumeAward[] awards) {
        this.awards = awards;
    }

    public ResumeCertificate[] getCertificates() {
        return this.certificates;
    }

    public void setCertificates(ResumeCertificate[] certificates) {
        this.certificates = certificates;
    }

    public ResumeCompetition[] getCompetitions() {
        return this.competitions;
    }

    public void setCompetitions(ResumeCompetition[] competitions) {
        this.competitions = competitions;
    }

    public String getSelfEvaluation() {
        return this.selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public String[] getUrls() {
        return this.urls;
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public String[] getSocialLinks() {
        return this.socialLinks;
    }

    public void setSocialLinks(String[] socialLinks) {
        this.socialLinks = socialLinks;
    }

    public static class Builder {
        /**
         * 文件标识ID，依据文件内容自动生成
         * <p> 示例值：825c59042dxxxxx3ff90b45xxxxx88
         */
        private String fileMd5;
        /**
         * 文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         */
        private String content;
        /**
         * 经过排序后的文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         */
        private String newContent;
        /**
         * 名称
         * <p> 示例值：张三
         */
        private String name;
        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         */
        private String email;
        /**
         * 手机号码
         * <p> 示例值：13600000000
         */
        private String mobile;
        /**
         * 手机号码是否虚拟号码
         * <p> 示例值：false
         */
        private Boolean mobileIsVirtual;
        /**
         * 手机号码国家编码
         * <p> 示例值：86
         */
        private String countryCode;
        /**
         * 教育经历
         * <p> 示例值：
         */
        private ResumeEducation[] educations;
        /**
         * 职业经历
         * <p> 示例值：
         */
        private ResumeCareer[] careers;
        /**
         * 项目经历
         * <p> 示例值：
         */
        private ResumeProject[] projects;
        /**
         * 工作年限，为空表示工作年限未知，数字单位为年，整数
         * <p> 示例值：5
         */
        private Integer workYear;
        /**
         * 生日，格式YYYY-MM-DD
         * <p> 示例值：1995-01-01
         */
        private String dateOfBirth;
        /**
         * 性别
         * <p> 示例值：1
         */
        private Integer gender;
        /**
         * 希望获得的职位列表
         * <p> 示例值：xxx岗位
         */
        private String[] willingPositions;
        /**
         * 当前工作地点(城市)
         * <p> 示例值：上海
         */
        private String currentLocation;
        /**
         * 希望工作地点列表
         * <p> 示例值：
         */
        private String[] willingLocations;
        /**
         * 家乡(城市)
         * <p> 示例值：上海
         */
        private String homeLocation;
        /**
         * 语言
         * <p> 示例值：
         */
        private ResumeLanguage[] languages;
        /**
         * 获奖
         * <p> 示例值：
         */
        private ResumeAward[] awards;
        /**
         * 证书
         * <p> 示例值：
         */
        private ResumeCertificate[] certificates;
        /**
         * 竞赛
         * <p> 示例值：
         */
        private ResumeCompetition[] competitions;
        /**
         * 自我评价
         * <p> 示例值：我是一个...
         */
        private String selfEvaluation;
        /**
         * 链接列表
         * <p> 示例值：
         */
        private String[] urls;
        /**
         * 社交链接
         * <p> 示例值：
         */
        private String[] socialLinks;

        /**
         * 文件标识ID，依据文件内容自动生成
         * <p> 示例值：825c59042dxxxxx3ff90b45xxxxx88
         *
         * @param fileMd5
         * @return
         */
        public Builder fileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }


        /**
         * 文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 经过排序后的文本内容，当接口返回成功时，该字段才存在
         * <p> 示例值：XX负责行政人事管理和日常事务...
         *
         * @param newContent
         * @return
         */
        public Builder newContent(String newContent) {
            this.newContent = newContent;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：张三
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：zhangsan.1111@bytedance.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 手机号码
         * <p> 示例值：13600000000
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 手机号码是否虚拟号码
         * <p> 示例值：false
         *
         * @param mobileIsVirtual
         * @return
         */
        public Builder mobileIsVirtual(Boolean mobileIsVirtual) {
            this.mobileIsVirtual = mobileIsVirtual;
            return this;
        }


        /**
         * 手机号码国家编码
         * <p> 示例值：86
         *
         * @param countryCode
         * @return
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }


        /**
         * 教育经历
         * <p> 示例值：
         *
         * @param educations
         * @return
         */
        public Builder educations(ResumeEducation[] educations) {
            this.educations = educations;
            return this;
        }


        /**
         * 职业经历
         * <p> 示例值：
         *
         * @param careers
         * @return
         */
        public Builder careers(ResumeCareer[] careers) {
            this.careers = careers;
            return this;
        }


        /**
         * 项目经历
         * <p> 示例值：
         *
         * @param projects
         * @return
         */
        public Builder projects(ResumeProject[] projects) {
            this.projects = projects;
            return this;
        }


        /**
         * 工作年限，为空表示工作年限未知，数字单位为年，整数
         * <p> 示例值：5
         *
         * @param workYear
         * @return
         */
        public Builder workYear(Integer workYear) {
            this.workYear = workYear;
            return this;
        }


        /**
         * 生日，格式YYYY-MM-DD
         * <p> 示例值：1995-01-01
         *
         * @param dateOfBirth
         * @return
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }


        /**
         * 性别
         * <p> 示例值：1
         *
         * @param gender
         * @return
         */
        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        /**
         * 性别
         * <p> 示例值：1
         *
         * @param gender {@link com.lark.oapi.service.document_ai.v1.enums.ResumeResumeGenderTypeEnum}
         * @return
         */
        public Builder gender(com.lark.oapi.service.document_ai.v1.enums.ResumeResumeGenderTypeEnum gender) {
            this.gender = gender.getValue();
            return this;
        }


        /**
         * 希望获得的职位列表
         * <p> 示例值：xxx岗位
         *
         * @param willingPositions
         * @return
         */
        public Builder willingPositions(String[] willingPositions) {
            this.willingPositions = willingPositions;
            return this;
        }


        /**
         * 当前工作地点(城市)
         * <p> 示例值：上海
         *
         * @param currentLocation
         * @return
         */
        public Builder currentLocation(String currentLocation) {
            this.currentLocation = currentLocation;
            return this;
        }


        /**
         * 希望工作地点列表
         * <p> 示例值：
         *
         * @param willingLocations
         * @return
         */
        public Builder willingLocations(String[] willingLocations) {
            this.willingLocations = willingLocations;
            return this;
        }


        /**
         * 家乡(城市)
         * <p> 示例值：上海
         *
         * @param homeLocation
         * @return
         */
        public Builder homeLocation(String homeLocation) {
            this.homeLocation = homeLocation;
            return this;
        }


        /**
         * 语言
         * <p> 示例值：
         *
         * @param languages
         * @return
         */
        public Builder languages(ResumeLanguage[] languages) {
            this.languages = languages;
            return this;
        }


        /**
         * 获奖
         * <p> 示例值：
         *
         * @param awards
         * @return
         */
        public Builder awards(ResumeAward[] awards) {
            this.awards = awards;
            return this;
        }


        /**
         * 证书
         * <p> 示例值：
         *
         * @param certificates
         * @return
         */
        public Builder certificates(ResumeCertificate[] certificates) {
            this.certificates = certificates;
            return this;
        }


        /**
         * 竞赛
         * <p> 示例值：
         *
         * @param competitions
         * @return
         */
        public Builder competitions(ResumeCompetition[] competitions) {
            this.competitions = competitions;
            return this;
        }


        /**
         * 自我评价
         * <p> 示例值：我是一个...
         *
         * @param selfEvaluation
         * @return
         */
        public Builder selfEvaluation(String selfEvaluation) {
            this.selfEvaluation = selfEvaluation;
            return this;
        }


        /**
         * 链接列表
         * <p> 示例值：
         *
         * @param urls
         * @return
         */
        public Builder urls(String[] urls) {
            this.urls = urls;
            return this;
        }


        /**
         * 社交链接
         * <p> 示例值：
         *
         * @param socialLinks
         * @return
         */
        public Builder socialLinks(String[] socialLinks) {
            this.socialLinks = socialLinks;
            return this;
        }


        public Resume build() {
            return new Resume(this);
        }
    }
}