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

public class InternationalAssignmentV2ForPatch {
    /**
     * 生效时间
     * <p> 示例值：2023-08-29
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 预计结束日期
     * <p> 示例值：2023-12-29
     */
    @SerializedName("international_assignment_expected_end_date")
    private String internationalAssignmentExpectedEndDate;
    /**
     * 失效时间
     * <p> 示例值：2023-12-29
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 外派国家ID
     * <p> 示例值：7046599238679447084
     */
    @SerializedName("assignment_country")
    private String assignmentCountry;
    /**
     * 外派城市ID
     * <p> 示例值：7046599238679447084
     */
    @SerializedName("assignment_city")
    private String assignmentCity;
    /**
     * 外派公司ID
     * <p> 示例值：7046599238679447084
     */
    @SerializedName("assignment_company")
    private String assignmentCompany;
    /**
     * 当前生效外派记录的外派状态 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_status - object_api_name：international_assignment
     * <p> 示例值：
     */
    @SerializedName("international_assignment_status")
    private Enum internationalAssignmentStatus;
    /**
     * 当前生效外派记录的外派类型 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_type - object_api_name：international_assignment
     * <p> 示例值：
     */
    @SerializedName("international_assignment_type")
    private Enum internationalAssignmentType;
    /**
     * 是否享有派驻津贴
     * <p> 示例值：true
     */
    @SerializedName("international_assignment_allowance")
    private Boolean internationalAssignmentAllowance;
    /**
     * 是否提供住宿
     * <p> 示例值：true
     */
    @SerializedName("accommodation")
    private Boolean accommodation;
    /**
     * 描述
     * <p> 示例值：外派信息的描述
     */
    @SerializedName("description")
    private String description;

    // builder 开始
    public InternationalAssignmentV2ForPatch() {
    }

    public InternationalAssignmentV2ForPatch(Builder builder) {
        /**
         * 生效时间
         * <p> 示例值：2023-08-29
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 预计结束日期
         * <p> 示例值：2023-12-29
         */
        this.internationalAssignmentExpectedEndDate = builder.internationalAssignmentExpectedEndDate;
        /**
         * 失效时间
         * <p> 示例值：2023-12-29
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 外派国家ID
         * <p> 示例值：7046599238679447084
         */
        this.assignmentCountry = builder.assignmentCountry;
        /**
         * 外派城市ID
         * <p> 示例值：7046599238679447084
         */
        this.assignmentCity = builder.assignmentCity;
        /**
         * 外派公司ID
         * <p> 示例值：7046599238679447084
         */
        this.assignmentCompany = builder.assignmentCompany;
        /**
         * 当前生效外派记录的外派状态 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_status - object_api_name：international_assignment
         * <p> 示例值：
         */
        this.internationalAssignmentStatus = builder.internationalAssignmentStatus;
        /**
         * 当前生效外派记录的外派类型 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_type - object_api_name：international_assignment
         * <p> 示例值：
         */
        this.internationalAssignmentType = builder.internationalAssignmentType;
        /**
         * 是否享有派驻津贴
         * <p> 示例值：true
         */
        this.internationalAssignmentAllowance = builder.internationalAssignmentAllowance;
        /**
         * 是否提供住宿
         * <p> 示例值：true
         */
        this.accommodation = builder.accommodation;
        /**
         * 描述
         * <p> 示例值：外派信息的描述
         */
        this.description = builder.description;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getInternationalAssignmentExpectedEndDate() {
        return this.internationalAssignmentExpectedEndDate;
    }

    public void setInternationalAssignmentExpectedEndDate(String internationalAssignmentExpectedEndDate) {
        this.internationalAssignmentExpectedEndDate = internationalAssignmentExpectedEndDate;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getAssignmentCountry() {
        return this.assignmentCountry;
    }

    public void setAssignmentCountry(String assignmentCountry) {
        this.assignmentCountry = assignmentCountry;
    }

    public String getAssignmentCity() {
        return this.assignmentCity;
    }

    public void setAssignmentCity(String assignmentCity) {
        this.assignmentCity = assignmentCity;
    }

    public String getAssignmentCompany() {
        return this.assignmentCompany;
    }

    public void setAssignmentCompany(String assignmentCompany) {
        this.assignmentCompany = assignmentCompany;
    }

    public Enum getInternationalAssignmentStatus() {
        return this.internationalAssignmentStatus;
    }

    public void setInternationalAssignmentStatus(Enum internationalAssignmentStatus) {
        this.internationalAssignmentStatus = internationalAssignmentStatus;
    }

    public Enum getInternationalAssignmentType() {
        return this.internationalAssignmentType;
    }

    public void setInternationalAssignmentType(Enum internationalAssignmentType) {
        this.internationalAssignmentType = internationalAssignmentType;
    }

    public Boolean getInternationalAssignmentAllowance() {
        return this.internationalAssignmentAllowance;
    }

    public void setInternationalAssignmentAllowance(Boolean internationalAssignmentAllowance) {
        this.internationalAssignmentAllowance = internationalAssignmentAllowance;
    }

    public Boolean getAccommodation() {
        return this.accommodation;
    }

    public void setAccommodation(Boolean accommodation) {
        this.accommodation = accommodation;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        /**
         * 生效时间
         * <p> 示例值：2023-08-29
         */
        private String effectiveTime;
        /**
         * 预计结束日期
         * <p> 示例值：2023-12-29
         */
        private String internationalAssignmentExpectedEndDate;
        /**
         * 失效时间
         * <p> 示例值：2023-12-29
         */
        private String expirationTime;
        /**
         * 外派国家ID
         * <p> 示例值：7046599238679447084
         */
        private String assignmentCountry;
        /**
         * 外派城市ID
         * <p> 示例值：7046599238679447084
         */
        private String assignmentCity;
        /**
         * 外派公司ID
         * <p> 示例值：7046599238679447084
         */
        private String assignmentCompany;
        /**
         * 当前生效外派记录的外派状态 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_status - object_api_name：international_assignment
         * <p> 示例值：
         */
        private Enum internationalAssignmentStatus;
        /**
         * 当前生效外派记录的外派类型 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_type - object_api_name：international_assignment
         * <p> 示例值：
         */
        private Enum internationalAssignmentType;
        /**
         * 是否享有派驻津贴
         * <p> 示例值：true
         */
        private Boolean internationalAssignmentAllowance;
        /**
         * 是否提供住宿
         * <p> 示例值：true
         */
        private Boolean accommodation;
        /**
         * 描述
         * <p> 示例值：外派信息的描述
         */
        private String description;

        /**
         * 生效时间
         * <p> 示例值：2023-08-29
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 预计结束日期
         * <p> 示例值：2023-12-29
         *
         * @param internationalAssignmentExpectedEndDate
         * @return
         */
        public Builder internationalAssignmentExpectedEndDate(String internationalAssignmentExpectedEndDate) {
            this.internationalAssignmentExpectedEndDate = internationalAssignmentExpectedEndDate;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2023-12-29
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }


        /**
         * 外派国家ID
         * <p> 示例值：7046599238679447084
         *
         * @param assignmentCountry
         * @return
         */
        public Builder assignmentCountry(String assignmentCountry) {
            this.assignmentCountry = assignmentCountry;
            return this;
        }


        /**
         * 外派城市ID
         * <p> 示例值：7046599238679447084
         *
         * @param assignmentCity
         * @return
         */
        public Builder assignmentCity(String assignmentCity) {
            this.assignmentCity = assignmentCity;
            return this;
        }


        /**
         * 外派公司ID
         * <p> 示例值：7046599238679447084
         *
         * @param assignmentCompany
         * @return
         */
        public Builder assignmentCompany(String assignmentCompany) {
            this.assignmentCompany = assignmentCompany;
            return this;
        }


        /**
         * 当前生效外派记录的外派状态 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_status - object_api_name：international_assignment
         * <p> 示例值：
         *
         * @param internationalAssignmentStatus
         * @return
         */
        public Builder internationalAssignmentStatus(Enum internationalAssignmentStatus) {
            this.internationalAssignmentStatus = internationalAssignmentStatus;
            return this;
        }


        /**
         * 当前生效外派记录的外派类型 - 枚举值可查询【获取字段详情】接口获取，按如下参数查询即可： - custom_api_name：international_assignment_type - object_api_name：international_assignment
         * <p> 示例值：
         *
         * @param internationalAssignmentType
         * @return
         */
        public Builder internationalAssignmentType(Enum internationalAssignmentType) {
            this.internationalAssignmentType = internationalAssignmentType;
            return this;
        }


        /**
         * 是否享有派驻津贴
         * <p> 示例值：true
         *
         * @param internationalAssignmentAllowance
         * @return
         */
        public Builder internationalAssignmentAllowance(Boolean internationalAssignmentAllowance) {
            this.internationalAssignmentAllowance = internationalAssignmentAllowance;
            return this;
        }


        /**
         * 是否提供住宿
         * <p> 示例值：true
         *
         * @param accommodation
         * @return
         */
        public Builder accommodation(Boolean accommodation) {
            this.accommodation = accommodation;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：外派信息的描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        public InternationalAssignmentV2ForPatch build() {
            return new InternationalAssignmentV2ForPatch(this);
        }
    }
}
