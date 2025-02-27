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

public class ProfileSettingCareer {
    /**
     * 教育经历
     * <p> 示例值：
     */
    @SerializedName("educations")
    private ProfileSettingEducation[] educations;
    /**
     * 工作经历
     * <p> 示例值：
     */
    @SerializedName("work_experiences")
    private ProfileSettingWorkExperience[] workExperiences;
    /**
     * 自定义分组
     * <p> 示例值：
     */
    @SerializedName("custom_groups")
    private ProfileSettingCustomGroup[] customGroups;

    // builder 开始
    public ProfileSettingCareer() {
    }

    public ProfileSettingCareer(Builder builder) {
        /**
         * 教育经历
         * <p> 示例值：
         */
        this.educations = builder.educations;
        /**
         * 工作经历
         * <p> 示例值：
         */
        this.workExperiences = builder.workExperiences;
        /**
         * 自定义分组
         * <p> 示例值：
         */
        this.customGroups = builder.customGroups;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ProfileSettingEducation[] getEducations() {
        return this.educations;
    }

    public void setEducations(ProfileSettingEducation[] educations) {
        this.educations = educations;
    }

    public ProfileSettingWorkExperience[] getWorkExperiences() {
        return this.workExperiences;
    }

    public void setWorkExperiences(ProfileSettingWorkExperience[] workExperiences) {
        this.workExperiences = workExperiences;
    }

    public ProfileSettingCustomGroup[] getCustomGroups() {
        return this.customGroups;
    }

    public void setCustomGroups(ProfileSettingCustomGroup[] customGroups) {
        this.customGroups = customGroups;
    }

    public static class Builder {
        /**
         * 教育经历
         * <p> 示例值：
         */
        private ProfileSettingEducation[] educations;
        /**
         * 工作经历
         * <p> 示例值：
         */
        private ProfileSettingWorkExperience[] workExperiences;
        /**
         * 自定义分组
         * <p> 示例值：
         */
        private ProfileSettingCustomGroup[] customGroups;

        /**
         * 教育经历
         * <p> 示例值：
         *
         * @param educations
         * @return
         */
        public Builder educations(ProfileSettingEducation[] educations) {
            this.educations = educations;
            return this;
        }


        /**
         * 工作经历
         * <p> 示例值：
         *
         * @param workExperiences
         * @return
         */
        public Builder workExperiences(ProfileSettingWorkExperience[] workExperiences) {
            this.workExperiences = workExperiences;
            return this;
        }


        /**
         * 自定义分组
         * <p> 示例值：
         *
         * @param customGroups
         * @return
         */
        public Builder customGroups(ProfileSettingCustomGroup[] customGroups) {
            this.customGroups = customGroups;
            return this;
        }


        public ProfileSettingCareer build() {
            return new ProfileSettingCareer(this);
        }
    }
}
