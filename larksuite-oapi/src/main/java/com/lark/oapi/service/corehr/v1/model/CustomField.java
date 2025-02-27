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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class CustomField {
    /**
     * 自定义字段 apiname，即自定义字段的唯一标识
     * <p> 示例值：custom_field_33
     */
    @SerializedName("custom_api_name")
    private String customApiName;
    /**
     * 自定义字段名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private Name name;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private Name description;
    /**
     * 是否启用
     * <p> 示例值：true
     */
    @SerializedName("is_open")
    private Boolean isOpen;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("is_required")
    private Boolean isRequired;
    /**
     * 是否唯一
     * <p> 示例值：true
     */
    @SerializedName("is_unique")
    private Boolean isUnique;
    /**
     * 所属对象 apiname
     * <p> 示例值：offboarding_info
     */
    @SerializedName("object_api_name")
    private String objectApiName;
    /**
     * 自定义字段类型;;可选值有：;- 1：文本 Text;- 2：布尔 Boolean;- 3：数字 Number;- 4：枚举 Option;- 5：查找 Lookup;- 6：反向查找 BackLookup;- 7：自动编号 AutoNumber;- 8：日期时间 Date time;- 9：附件 Attachment;- 10：图片 Image;- 11：计算字段 Calculated
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;
    /**
     * 配置信息，当前仅字段类型为「文本」、「布尔」、「数字」、「枚举」、「日期时间」、「附件」、「图片」时返回具体的配置信息，其余类型的自定义字段暂不返回
     * <p> 示例值：
     */
    @SerializedName("common_schema_config")
    private CommonSchemaConfig commonSchemaConfig;
    /**
     * 创建时间，秒级时间戳
     * <p> 示例值：1625542287
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间，秒级时间戳
     * <p> 示例值：1625542639
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public CustomField() {
    }

    public CustomField(Builder builder) {
        /**
         * 自定义字段 apiname，即自定义字段的唯一标识
         * <p> 示例值：custom_field_33
         */
        this.customApiName = builder.customApiName;
        /**
         * 自定义字段名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        this.isOpen = builder.isOpen;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.isRequired = builder.isRequired;
        /**
         * 是否唯一
         * <p> 示例值：true
         */
        this.isUnique = builder.isUnique;
        /**
         * 所属对象 apiname
         * <p> 示例值：offboarding_info
         */
        this.objectApiName = builder.objectApiName;
        /**
         * 自定义字段类型;;可选值有：;- 1：文本 Text;- 2：布尔 Boolean;- 3：数字 Number;- 4：枚举 Option;- 5：查找 Lookup;- 6：反向查找 BackLookup;- 7：自动编号 AutoNumber;- 8：日期时间 Date time;- 9：附件 Attachment;- 10：图片 Image;- 11：计算字段 Calculated
         * <p> 示例值：1
         */
        this.type = builder.type;
        /**
         * 配置信息，当前仅字段类型为「文本」、「布尔」、「数字」、「枚举」、「日期时间」、「附件」、「图片」时返回具体的配置信息，其余类型的自定义字段暂不返回
         * <p> 示例值：
         */
        this.commonSchemaConfig = builder.commonSchemaConfig;
        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1625542287
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1625542639
         */
        this.updateTime = builder.updateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCustomApiName() {
        return this.customApiName;
    }

    public void setCustomApiName(String customApiName) {
        this.customApiName = customApiName;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getDescription() {
        return this.description;
    }

    public void setDescription(Name description) {
        this.description = description;
    }

    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Boolean getIsUnique() {
        return this.isUnique;
    }

    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CommonSchemaConfig getCommonSchemaConfig() {
        return this.commonSchemaConfig;
    }

    public void setCommonSchemaConfig(CommonSchemaConfig commonSchemaConfig) {
        this.commonSchemaConfig = commonSchemaConfig;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 自定义字段 apiname，即自定义字段的唯一标识
         * <p> 示例值：custom_field_33
         */
        private String customApiName;
        /**
         * 自定义字段名称
         * <p> 示例值：
         */
        private Name name;
        /**
         * 描述
         * <p> 示例值：
         */
        private Name description;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        private Boolean isOpen;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean isRequired;
        /**
         * 是否唯一
         * <p> 示例值：true
         */
        private Boolean isUnique;
        /**
         * 所属对象 apiname
         * <p> 示例值：offboarding_info
         */
        private String objectApiName;
        /**
         * 自定义字段类型;;可选值有：;- 1：文本 Text;- 2：布尔 Boolean;- 3：数字 Number;- 4：枚举 Option;- 5：查找 Lookup;- 6：反向查找 BackLookup;- 7：自动编号 AutoNumber;- 8：日期时间 Date time;- 9：附件 Attachment;- 10：图片 Image;- 11：计算字段 Calculated
         * <p> 示例值：1
         */
        private Integer type;
        /**
         * 配置信息，当前仅字段类型为「文本」、「布尔」、「数字」、「枚举」、「日期时间」、「附件」、「图片」时返回具体的配置信息，其余类型的自定义字段暂不返回
         * <p> 示例值：
         */
        private CommonSchemaConfig commonSchemaConfig;
        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1625542287
         */
        private String createTime;
        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1625542639
         */
        private String updateTime;

        /**
         * 自定义字段 apiname，即自定义字段的唯一标识
         * <p> 示例值：custom_field_33
         *
         * @param customApiName
         * @return
         */
        public Builder customApiName(String customApiName) {
            this.customApiName = customApiName;
            return this;
        }


        /**
         * 自定义字段名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(Name description) {
            this.description = description;
            return this;
        }


        /**
         * 是否启用
         * <p> 示例值：true
         *
         * @param isOpen
         * @return
         */
        public Builder isOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：true
         *
         * @param isRequired
         * @return
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }


        /**
         * 是否唯一
         * <p> 示例值：true
         *
         * @param isUnique
         * @return
         */
        public Builder isUnique(Boolean isUnique) {
            this.isUnique = isUnique;
            return this;
        }


        /**
         * 所属对象 apiname
         * <p> 示例值：offboarding_info
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        /**
         * 自定义字段类型;;可选值有：;- 1：文本 Text;- 2：布尔 Boolean;- 3：数字 Number;- 4：枚举 Option;- 5：查找 Lookup;- 6：反向查找 BackLookup;- 7：自动编号 AutoNumber;- 8：日期时间 Date time;- 9：附件 Attachment;- 10：图片 Image;- 11：计算字段 Calculated
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }


        /**
         * 配置信息，当前仅字段类型为「文本」、「布尔」、「数字」、「枚举」、「日期时间」、「附件」、「图片」时返回具体的配置信息，其余类型的自定义字段暂不返回
         * <p> 示例值：
         *
         * @param commonSchemaConfig
         * @return
         */
        public Builder commonSchemaConfig(CommonSchemaConfig commonSchemaConfig) {
            this.commonSchemaConfig = commonSchemaConfig;
            return this;
        }


        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1625542287
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1625542639
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public CustomField build() {
            return new CustomField(this);
        }
    }
}
