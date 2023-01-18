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

import com.google.gson.annotations.SerializedName;

public class EcoExamPaper {
    /**
     * 账号 ID，可在「账号绑定」事件中获取
     * <p> 示例值：7147998241542539527
     */
    @SerializedName("account_id")
    private String accountId;
    /**
     * 试卷列表
     * <p> 示例值：
     */
    @SerializedName("paper_list")
    private EcoExamPaperData[] paperList;

    // builder 开始
    public EcoExamPaper() {
    }

    public EcoExamPaper(Builder builder) {
        /**
         * 账号 ID，可在「账号绑定」事件中获取
         * <p> 示例值：7147998241542539527
         */
        this.accountId = builder.accountId;
        /**
         * 试卷列表
         * <p> 示例值：
         */
        this.paperList = builder.paperList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public EcoExamPaperData[] getPaperList() {
        return this.paperList;
    }

    public void setPaperList(EcoExamPaperData[] paperList) {
        this.paperList = paperList;
    }

    public static class Builder {
        /**
         * 账号 ID，可在「账号绑定」事件中获取
         * <p> 示例值：7147998241542539527
         */
        private String accountId;
        /**
         * 试卷列表
         * <p> 示例值：
         */
        private EcoExamPaperData[] paperList;

        /**
         * 账号 ID，可在「账号绑定」事件中获取
         * <p> 示例值：7147998241542539527
         *
         * @param accountId
         * @return
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }


        /**
         * 试卷列表
         * <p> 示例值：
         *
         * @param paperList
         * @return
         */
        public Builder paperList(EcoExamPaperData[] paperList) {
            this.paperList = paperList;
            return this;
        }


        public EcoExamPaper build() {
            return new EcoExamPaper(this);
        }
    }
}