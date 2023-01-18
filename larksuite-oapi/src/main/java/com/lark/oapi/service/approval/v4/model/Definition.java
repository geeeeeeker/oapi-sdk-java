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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class Definition {
    /**
     * 审批定义 code  示例值："7C468A54-8745-2245-9675-08B7C63E7A85"
     * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
     */
    @SerializedName("approval_code")
    private String approvalCode;
    /**
     * 审批名称，根据传入的local字段返回对应的国际化文案，未设置该国际化文案时返回默认语言对应文案
     * <p> 示例值：请假
     */
    @SerializedName("approval_name")
    private String approvalName;

    // builder 开始
    public Definition() {
    }

    public Definition(Builder builder) {
        /**
         * 审批定义 code  示例值："7C468A54-8745-2245-9675-08B7C63E7A85"
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        this.approvalCode = builder.approvalCode;
        /**
         * 审批名称，根据传入的local字段返回对应的国际化文案，未设置该国际化文案时返回默认语言对应文案
         * <p> 示例值：请假
         */
        this.approvalName = builder.approvalName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getApprovalName() {
        return this.approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public static class Builder {
        /**
         * 审批定义 code  示例值："7C468A54-8745-2245-9675-08B7C63E7A85"
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         */
        private String approvalCode;
        /**
         * 审批名称，根据传入的local字段返回对应的国际化文案，未设置该国际化文案时返回默认语言对应文案
         * <p> 示例值：请假
         */
        private String approvalName;

        /**
         * 审批定义 code  示例值："7C468A54-8745-2245-9675-08B7C63E7A85"
         * <p> 示例值：7C468A54-8745-2245-9675-08B7C63E7A85
         *
         * @param approvalCode
         * @return
         */
        public Builder approvalCode(String approvalCode) {
            this.approvalCode = approvalCode;
            return this;
        }


        /**
         * 审批名称，根据传入的local字段返回对应的国际化文案，未设置该国际化文案时返回默认语言对应文案
         * <p> 示例值：请假
         *
         * @param approvalName
         * @return
         */
        public Builder approvalName(String approvalName) {
            this.approvalName = approvalName;
            return this;
        }


        public Definition build() {
            return new Definition(this);
        }
    }
}