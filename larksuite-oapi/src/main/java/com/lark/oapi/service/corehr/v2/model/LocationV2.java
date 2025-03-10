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

public class LocationV2 {
    /**
     * 地点 ID
     * <p> 示例值：4718803945687580505
     */
    @SerializedName("location_id")
    private String locationId;
    /**
     * 上级地点ID
     * <p> 示例值：4719168654814483759
     */
    @SerializedName("parent_location_id")
    private String parentLocationId;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("names")
    private I18n[] names;
    /**
     * 编码
     * <p> 示例值：LO_CountryRegion_CHN
     */
    @SerializedName("code")
    private String code;
    /**
     * 启用状态
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 地点用途
     * <p> 示例值：
     */
    @SerializedName("location_usages")
    private Enum[] locationUsages;
    /**
     * 地址
     * <p> 示例值：
     */
    @SerializedName("addresses")
    private Address[] addresses;
    /**
     * 工时制度
     * <p> 示例值：4690238309151997779
     */
    @SerializedName("working_hours_type_id")
    private String workingHoursTypeId;
    /**
     * 生效时间
     * <p> 示例值：2020-05-01 00:00:00
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 失效时间
     * <p> 示例值：2020-05-02 00:00:00
     */
    @SerializedName("expiration_time")
    private String expirationTime;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private CustomFieldData[] customFields;
    /**
     * 区域设置
     * <p> 示例值：zh_cn
     */
    @SerializedName("locale")
    private Enum locale;
    /**
     * 时区
     * <p> 示例值：123456789
     */
    @SerializedName("time_zone_id")
    private String timeZoneId;
    /**
     * 默认显示语言
     * <p> 示例值：123456789
     */
    @SerializedName("display_language_id")
    private String displayLanguageId;

    // builder 开始
    public LocationV2() {
    }

    public LocationV2(Builder builder) {
        /**
         * 地点 ID
         * <p> 示例值：4718803945687580505
         */
        this.locationId = builder.locationId;
        /**
         * 上级地点ID
         * <p> 示例值：4719168654814483759
         */
        this.parentLocationId = builder.parentLocationId;
        /**
         * 名称
         * <p> 示例值：
         */
        this.names = builder.names;
        /**
         * 编码
         * <p> 示例值：LO_CountryRegion_CHN
         */
        this.code = builder.code;
        /**
         * 启用状态
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 地点用途
         * <p> 示例值：
         */
        this.locationUsages = builder.locationUsages;
        /**
         * 地址
         * <p> 示例值：
         */
        this.addresses = builder.addresses;
        /**
         * 工时制度
         * <p> 示例值：4690238309151997779
         */
        this.workingHoursTypeId = builder.workingHoursTypeId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        this.expirationTime = builder.expirationTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
        /**
         * 区域设置
         * <p> 示例值：zh_cn
         */
        this.locale = builder.locale;
        /**
         * 时区
         * <p> 示例值：123456789
         */
        this.timeZoneId = builder.timeZoneId;
        /**
         * 默认显示语言
         * <p> 示例值：123456789
         */
        this.displayLanguageId = builder.displayLanguageId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getParentLocationId() {
        return this.parentLocationId;
    }

    public void setParentLocationId(String parentLocationId) {
        this.parentLocationId = parentLocationId;
    }

    public I18n[] getNames() {
        return this.names;
    }

    public void setNames(I18n[] names) {
        this.names = names;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Enum[] getLocationUsages() {
        return this.locationUsages;
    }

    public void setLocationUsages(Enum[] locationUsages) {
        this.locationUsages = locationUsages;
    }

    public Address[] getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public String getWorkingHoursTypeId() {
        return this.workingHoursTypeId;
    }

    public void setWorkingHoursTypeId(String workingHoursTypeId) {
        this.workingHoursTypeId = workingHoursTypeId;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CustomFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(CustomFieldData[] customFields) {
        this.customFields = customFields;
    }

    public Enum getLocale() {
        return this.locale;
    }

    public void setLocale(Enum locale) {
        this.locale = locale;
    }

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public String getDisplayLanguageId() {
        return this.displayLanguageId;
    }

    public void setDisplayLanguageId(String displayLanguageId) {
        this.displayLanguageId = displayLanguageId;
    }

    public static class Builder {
        /**
         * 地点 ID
         * <p> 示例值：4718803945687580505
         */
        private String locationId;
        /**
         * 上级地点ID
         * <p> 示例值：4719168654814483759
         */
        private String parentLocationId;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] names;
        /**
         * 编码
         * <p> 示例值：LO_CountryRegion_CHN
         */
        private String code;
        /**
         * 启用状态
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 地点用途
         * <p> 示例值：
         */
        private Enum[] locationUsages;
        /**
         * 地址
         * <p> 示例值：
         */
        private Address[] addresses;
        /**
         * 工时制度
         * <p> 示例值：4690238309151997779
         */
        private String workingHoursTypeId;
        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         */
        private String effectiveTime;
        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         */
        private String expirationTime;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private CustomFieldData[] customFields;
        /**
         * 区域设置
         * <p> 示例值：zh_cn
         */
        private Enum locale;
        /**
         * 时区
         * <p> 示例值：123456789
         */
        private String timeZoneId;
        /**
         * 默认显示语言
         * <p> 示例值：123456789
         */
        private String displayLanguageId;

        /**
         * 地点 ID
         * <p> 示例值：4718803945687580505
         *
         * @param locationId
         * @return
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }


        /**
         * 上级地点ID
         * <p> 示例值：4719168654814483759
         *
         * @param parentLocationId
         * @return
         */
        public Builder parentLocationId(String parentLocationId) {
            this.parentLocationId = parentLocationId;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param names
         * @return
         */
        public Builder names(I18n[] names) {
            this.names = names;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：LO_CountryRegion_CHN
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 地点用途
         * <p> 示例值：
         *
         * @param locationUsages
         * @return
         */
        public Builder locationUsages(Enum[] locationUsages) {
            this.locationUsages = locationUsages;
            return this;
        }


        /**
         * 地址
         * <p> 示例值：
         *
         * @param addresses
         * @return
         */
        public Builder addresses(Address[] addresses) {
            this.addresses = addresses;
            return this;
        }


        /**
         * 工时制度
         * <p> 示例值：4690238309151997779
         *
         * @param workingHoursTypeId
         * @return
         */
        public Builder workingHoursTypeId(String workingHoursTypeId) {
            this.workingHoursTypeId = workingHoursTypeId;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2020-05-01 00:00:00
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2020-05-02 00:00:00
         *
         * @param expirationTime
         * @return
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
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
         * 区域设置
         * <p> 示例值：zh_cn
         *
         * @param locale
         * @return
         */
        public Builder locale(Enum locale) {
            this.locale = locale;
            return this;
        }


        /**
         * 时区
         * <p> 示例值：123456789
         *
         * @param timeZoneId
         * @return
         */
        public Builder timeZoneId(String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }


        /**
         * 默认显示语言
         * <p> 示例值：123456789
         *
         * @param displayLanguageId
         * @return
         */
        public Builder displayLanguageId(String displayLanguageId) {
            this.displayLanguageId = displayLanguageId;
            return this;
        }


        public LocationV2 build() {
            return new LocationV2(this);
        }
    }
}
