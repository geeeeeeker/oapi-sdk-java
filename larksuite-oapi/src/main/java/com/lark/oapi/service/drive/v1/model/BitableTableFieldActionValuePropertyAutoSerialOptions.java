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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
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

public class BitableTableFieldActionValuePropertyAutoSerialOptions {
    /**
     * 自动编号的可选规则项类型
     * <p> 示例值：created_time
     */
    @SerializedName("type")
    private String type;
    /**
     * 与类型相对应的取值
     * <p> 示例值：yyyyMMdd
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public BitableTableFieldActionValuePropertyAutoSerialOptions() {
    }

    public BitableTableFieldActionValuePropertyAutoSerialOptions(Builder builder) {
        /**
         * 自动编号的可选规则项类型
         * <p> 示例值：created_time
         */
        this.type = builder.type;
        /**
         * 与类型相对应的取值
         * <p> 示例值：yyyyMMdd
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 自动编号的可选规则项类型
         * <p> 示例值：created_time
         */
        private String type;
        /**
         * 与类型相对应的取值
         * <p> 示例值：yyyyMMdd
         */
        private String value;

        /**
         * 自动编号的可选规则项类型
         * <p> 示例值：created_time
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 与类型相对应的取值
         * <p> 示例值：yyyyMMdd
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public BitableTableFieldActionValuePropertyAutoSerialOptions build() {
            return new BitableTableFieldActionValuePropertyAutoSerialOptions(this);
        }
    }
}
