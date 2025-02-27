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

package com.lark.oapi.service.helpdesk.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.helpdesk.v1.enums.*;
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

public class CustomizedFieldDisplayItem {
    /**
     * 自定义字段ID
     * <p> 示例值：123
     */
    @SerializedName("id")
    private String id;
    /**
     * 自定义字段值
     * <p> 示例值：value
     */
    @SerializedName("value")
    private String value;
    /**
     * 键名
     * <p> 示例值：key
     */
    @SerializedName("key_name")
    private String keyName;
    /**
     * 展示名称
     * <p> 示例值：display name
     */
    @SerializedName("display_name")
    private String displayName;
    /**
     * 展示位置
     * <p> 示例值：1
     */
    @SerializedName("position")
    private Integer position;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("required")
    private Boolean required;
    /**
     * 是否可修改
     * <p> 示例值：true
     */
    @SerializedName("editable")
    private Boolean editable;

    // builder 开始
    public CustomizedFieldDisplayItem() {
    }

    public CustomizedFieldDisplayItem(Builder builder) {
        /**
         * 自定义字段ID
         * <p> 示例值：123
         */
        this.id = builder.id;
        /**
         * 自定义字段值
         * <p> 示例值：value
         */
        this.value = builder.value;
        /**
         * 键名
         * <p> 示例值：key
         */
        this.keyName = builder.keyName;
        /**
         * 展示名称
         * <p> 示例值：display name
         */
        this.displayName = builder.displayName;
        /**
         * 展示位置
         * <p> 示例值：1
         */
        this.position = builder.position;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.required = builder.required;
        /**
         * 是否可修改
         * <p> 示例值：true
         */
        this.editable = builder.editable;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getEditable() {
        return this.editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public static class Builder {
        /**
         * 自定义字段ID
         * <p> 示例值：123
         */
        private String id;
        /**
         * 自定义字段值
         * <p> 示例值：value
         */
        private String value;
        /**
         * 键名
         * <p> 示例值：key
         */
        private String keyName;
        /**
         * 展示名称
         * <p> 示例值：display name
         */
        private String displayName;
        /**
         * 展示位置
         * <p> 示例值：1
         */
        private Integer position;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean required;
        /**
         * 是否可修改
         * <p> 示例值：true
         */
        private Boolean editable;

        /**
         * 自定义字段ID
         * <p> 示例值：123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 自定义字段值
         * <p> 示例值：value
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        /**
         * 键名
         * <p> 示例值：key
         *
         * @param keyName
         * @return
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }


        /**
         * 展示名称
         * <p> 示例值：display name
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        /**
         * 展示位置
         * <p> 示例值：1
         *
         * @param position
         * @return
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：true
         *
         * @param required
         * @return
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }


        /**
         * 是否可修改
         * <p> 示例值：true
         *
         * @param editable
         * @return
         */
        public Builder editable(Boolean editable) {
            this.editable = editable;
            return this;
        }


        public CustomizedFieldDisplayItem build() {
            return new CustomizedFieldDisplayItem(this);
        }
    }
}
