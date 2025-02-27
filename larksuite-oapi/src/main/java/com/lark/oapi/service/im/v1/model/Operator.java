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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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

public class Operator {
    /**
     * 操作人ID
     * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
     */
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 操作人身份，用户或应用
     * <p> 示例值：app/user
     */
    @SerializedName("operator_type")
    private String operatorType;

    // builder 开始
    public Operator() {
    }

    public Operator(Builder builder) {
        /**
         * 操作人ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         */
        this.operatorId = builder.operatorId;
        /**
         * 操作人身份，用户或应用
         * <p> 示例值：app/user
         */
        this.operatorType = builder.operatorType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public static class Builder {
        /**
         * 操作人ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         */
        private String operatorId;
        /**
         * 操作人身份，用户或应用
         * <p> 示例值：app/user
         */
        private String operatorType;

        /**
         * 操作人ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        /**
         * 操作人身份，用户或应用
         * <p> 示例值：app/user
         *
         * @param operatorType
         * @return
         */
        public Builder operatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }

        /**
         * 操作人身份，用户或应用
         * <p> 示例值：app/user
         *
         * @param operatorType {@link com.lark.oapi.service.im.v1.enums.OperatorOperatorTypeEnum}
         * @return
         */
        public Builder operatorType(com.lark.oapi.service.im.v1.enums.OperatorOperatorTypeEnum operatorType) {
            this.operatorType = operatorType.getValue();
            return this;
        }


        public Operator build() {
            return new Operator(this);
        }
    }
}
