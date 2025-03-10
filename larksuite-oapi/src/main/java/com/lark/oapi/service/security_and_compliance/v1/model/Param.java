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

package com.lark.oapi.service.security_and_compliance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.security_and_compliance.v1.enums.*;
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

public class Param {
    /**
     * key
     * <p> 示例值：token
     */
    @SerializedName("key")
    private String key;
    /**
     * value
     * <p> 示例值：12345
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public Param() {
    }

    public Param(Builder builder) {
        /**
         * key
         * <p> 示例值：token
         */
        this.key = builder.key;
        /**
         * value
         * <p> 示例值：12345
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * key
         * <p> 示例值：token
         */
        private String key;
        /**
         * value
         * <p> 示例值：12345
         */
        private String value;

        /**
         * key
         * <p> 示例值：token
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * value
         * <p> 示例值：12345
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public Param build() {
            return new Param(this);
        }
    }
}
