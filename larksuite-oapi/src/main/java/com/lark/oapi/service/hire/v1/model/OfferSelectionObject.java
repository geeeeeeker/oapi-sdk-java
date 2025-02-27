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

public class OfferSelectionObject {
    /**
     * 自定义字段所在的审批表版本
     * <p> 示例值：
     */
    @SerializedName("schema_version")
    private Integer schemaVersion;
    /**
     * 选项
     * <p> 示例值：
     */
    @SerializedName("option_list")
    private OfferSchemaDetailOption[] optionList;

    // builder 开始
    public OfferSelectionObject() {
    }

    public OfferSelectionObject(Builder builder) {
        /**
         * 自定义字段所在的审批表版本
         * <p> 示例值：
         */
        this.schemaVersion = builder.schemaVersion;
        /**
         * 选项
         * <p> 示例值：
         */
        this.optionList = builder.optionList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public OfferSchemaDetailOption[] getOptionList() {
        return this.optionList;
    }

    public void setOptionList(OfferSchemaDetailOption[] optionList) {
        this.optionList = optionList;
    }

    public static class Builder {
        /**
         * 自定义字段所在的审批表版本
         * <p> 示例值：
         */
        private Integer schemaVersion;
        /**
         * 选项
         * <p> 示例值：
         */
        private OfferSchemaDetailOption[] optionList;

        /**
         * 自定义字段所在的审批表版本
         * <p> 示例值：
         *
         * @param schemaVersion
         * @return
         */
        public Builder schemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }


        /**
         * 选项
         * <p> 示例值：
         *
         * @param optionList
         * @return
         */
        public Builder optionList(OfferSchemaDetailOption[] optionList) {
            this.optionList = optionList;
            return this;
        }


        public OfferSelectionObject build() {
            return new OfferSelectionObject(this);
        }
    }
}
