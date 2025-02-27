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

public class DiData {
    /**
     * 字段值 1. 单选： "1" 2. 多选："["1", "2"]" 3. 月份选择："{"date":"2022-01"}" 4. 年份选择："{"date":"2022"}" 5. 数字："123" 6. 单行文本："xxx " 7. 多行文本："xxx xxxx" 8. 日期范围 "[1688140800000,1688140800000]"
     * <p> 示例值："1"
     */
    @SerializedName("value")
    private String value;
    /**
     * 字段属性
     * <p> 示例值：
     */
    @SerializedName("object_attribute")
    private ObjectAttribute objectAttribute;

    // builder 开始
    public DiData() {
    }

    public DiData(Builder builder) {
        /**
         * 字段值 1. 单选： "1" 2. 多选："["1", "2"]" 3. 月份选择："{"date":"2022-01"}" 4. 年份选择："{"date":"2022"}" 5. 数字："123" 6. 单行文本："xxx " 7. 多行文本："xxx xxxx" 8. 日期范围 "[1688140800000,1688140800000]"
         * <p> 示例值："1"
         */
        this.value = builder.value;
        /**
         * 字段属性
         * <p> 示例值：
         */
        this.objectAttribute = builder.objectAttribute;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ObjectAttribute getObjectAttribute() {
        return this.objectAttribute;
    }

    public void setObjectAttribute(ObjectAttribute objectAttribute) {
        this.objectAttribute = objectAttribute;
    }

    public static class Builder {
        /**
         * 字段值 1. 单选： "1" 2. 多选："["1", "2"]" 3. 月份选择："{"date":"2022-01"}" 4. 年份选择："{"date":"2022"}" 5. 数字："123" 6. 单行文本："xxx " 7. 多行文本："xxx xxxx" 8. 日期范围 "[1688140800000,1688140800000]"
         * <p> 示例值："1"
         */
        private String value;
        /**
         * 字段属性
         * <p> 示例值：
         */
        private ObjectAttribute objectAttribute;

        /**
         * 字段值 1. 单选： "1" 2. 多选："["1", "2"]" 3. 月份选择："{"date":"2022-01"}" 4. 年份选择："{"date":"2022"}" 5. 数字："123" 6. 单行文本："xxx " 7. 多行文本："xxx xxxx" 8. 日期范围 "[1688140800000,1688140800000]"
         * <p> 示例值："1"
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        /**
         * 字段属性
         * <p> 示例值：
         *
         * @param objectAttribute
         * @return
         */
        public Builder objectAttribute(ObjectAttribute objectAttribute) {
            this.objectAttribute = objectAttribute;
            return this;
        }


        public DiData build() {
            return new DiData(this);
        }
    }
}
