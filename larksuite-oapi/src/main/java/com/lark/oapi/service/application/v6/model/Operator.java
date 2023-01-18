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

package com.lark.oapi.service.application.v6.model;

import com.google.gson.annotations.SerializedName;

public class Operator {
    /**
     * 用户名称
     * <p> 示例值：张三
     */
    @SerializedName("operator_name")
    private String operatorName;
    /**
     * 用户 ID
     * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
     */
    @SerializedName("operator_id")
    private UserId operatorId;

    // builder 开始
    public Operator() {
    }

    public Operator(Builder builder) {
        /**
         * 用户名称
         * <p> 示例值：张三
         */
        this.operatorName = builder.operatorName;
        /**
         * 用户 ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         */
        this.operatorId = builder.operatorId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public static class Builder {
        /**
         * 用户名称
         * <p> 示例值：张三
         */
        private String operatorName;
        /**
         * 用户 ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         */
        private UserId operatorId;

        /**
         * 用户名称
         * <p> 示例值：张三
         *
         * @param operatorName
         * @return
         */
        public Builder operatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }


        /**
         * 用户 ID
         * <p> 示例值：ou_ff0b7ba35fb********67dfc8b885136
         *
         * @param operatorId
         * @return
         */
        public Builder operatorId(UserId operatorId) {
            this.operatorId = operatorId;
            return this;
        }


        public Operator build() {
            return new Operator(this);
        }
    }
}