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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class FieldSetting {
    /**
     * 必填属性
     * <p> 示例值：false
     */
    @SerializedName("required")
    private Boolean required;
    /**
     * 唯一性属性
     * <p> 示例值：
     */
    @SerializedName("unique")
    private Boolean unique;
    /**
     * 大小写敏感的唯一性
     * <p> 示例值：
     */
    @SerializedName("case_sensitive")
    private Boolean caseSensitive;
    /**
     * 文本最大长度
     * <p> 示例值：200
     */
    @SerializedName("text_max_length")
    private Integer textMaxLength;
    /**
     * 是否多值
     * <p> 示例值：
     */
    @SerializedName("multiple")
    private Boolean multiple;
    /**
     * 关联对象的标识
     * <p> 示例值：_user
     */
    @SerializedName("lookup_object_api_name")
    private String lookupObjectApiName;
    /**
     * 选项字段的选项值
     * <p> 示例值：
     */
    @SerializedName("options")
    private String[] options;
    /**
     * 属性扩展信息
     * <p> 示例值：[     {       "label": {         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "api_name": "optionA",       "description":{         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "color": "R",       "active": true     }   ]
     */
    @SerializedName("detail")
    private String detail;

    // builder 开始
    public FieldSetting() {
    }

    public FieldSetting(Builder builder) {
        /**
         * 必填属性
         * <p> 示例值：false
         */
        this.required = builder.required;
        /**
         * 唯一性属性
         * <p> 示例值：
         */
        this.unique = builder.unique;
        /**
         * 大小写敏感的唯一性
         * <p> 示例值：
         */
        this.caseSensitive = builder.caseSensitive;
        /**
         * 文本最大长度
         * <p> 示例值：200
         */
        this.textMaxLength = builder.textMaxLength;
        /**
         * 是否多值
         * <p> 示例值：
         */
        this.multiple = builder.multiple;
        /**
         * 关联对象的标识
         * <p> 示例值：_user
         */
        this.lookupObjectApiName = builder.lookupObjectApiName;
        /**
         * 选项字段的选项值
         * <p> 示例值：
         */
        this.options = builder.options;
        /**
         * 属性扩展信息
         * <p> 示例值：[     {       "label": {         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "api_name": "optionA",       "description":{         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "color": "R",       "active": true     }   ]
         */
        this.detail = builder.detail;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getUnique() {
        return this.unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Integer getTextMaxLength() {
        return this.textMaxLength;
    }

    public void setTextMaxLength(Integer textMaxLength) {
        this.textMaxLength = textMaxLength;
    }

    public Boolean getMultiple() {
        return this.multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public String getLookupObjectApiName() {
        return this.lookupObjectApiName;
    }

    public void setLookupObjectApiName(String lookupObjectApiName) {
        this.lookupObjectApiName = lookupObjectApiName;
    }

    public String[] getOptions() {
        return this.options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static class Builder {
        /**
         * 必填属性
         * <p> 示例值：false
         */
        private Boolean required;
        /**
         * 唯一性属性
         * <p> 示例值：
         */
        private Boolean unique;
        /**
         * 大小写敏感的唯一性
         * <p> 示例值：
         */
        private Boolean caseSensitive;
        /**
         * 文本最大长度
         * <p> 示例值：200
         */
        private Integer textMaxLength;
        /**
         * 是否多值
         * <p> 示例值：
         */
        private Boolean multiple;
        /**
         * 关联对象的标识
         * <p> 示例值：_user
         */
        private String lookupObjectApiName;
        /**
         * 选项字段的选项值
         * <p> 示例值：
         */
        private String[] options;
        /**
         * 属性扩展信息
         * <p> 示例值：[     {       "label": {         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "api_name": "optionA",       "description":{         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "color": "R",       "active": true     }   ]
         */
        private String detail;

        /**
         * 必填属性
         * <p> 示例值：false
         *
         * @param required
         * @return
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }


        /**
         * 唯一性属性
         * <p> 示例值：
         *
         * @param unique
         * @return
         */
        public Builder unique(Boolean unique) {
            this.unique = unique;
            return this;
        }


        /**
         * 大小写敏感的唯一性
         * <p> 示例值：
         *
         * @param caseSensitive
         * @return
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }


        /**
         * 文本最大长度
         * <p> 示例值：200
         *
         * @param textMaxLength
         * @return
         */
        public Builder textMaxLength(Integer textMaxLength) {
            this.textMaxLength = textMaxLength;
            return this;
        }


        /**
         * 是否多值
         * <p> 示例值：
         *
         * @param multiple
         * @return
         */
        public Builder multiple(Boolean multiple) {
            this.multiple = multiple;
            return this;
        }


        /**
         * 关联对象的标识
         * <p> 示例值：_user
         *
         * @param lookupObjectApiName
         * @return
         */
        public Builder lookupObjectApiName(String lookupObjectApiName) {
            this.lookupObjectApiName = lookupObjectApiName;
            return this;
        }


        /**
         * 选项字段的选项值
         * <p> 示例值：
         *
         * @param options
         * @return
         */
        public Builder options(String[] options) {
            this.options = options;
            return this;
        }


        /**
         * 属性扩展信息
         * <p> 示例值：[     {       "label": {         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "api_name": "optionA",       "description":{         "zh_cn": "示例文本",         "en_us": "Sample text"     },       "color": "R",       "active": true     }   ]
         *
         * @param detail
         * @return
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }


        public FieldSetting build() {
            return new FieldSetting(this);
        }
    }
}
