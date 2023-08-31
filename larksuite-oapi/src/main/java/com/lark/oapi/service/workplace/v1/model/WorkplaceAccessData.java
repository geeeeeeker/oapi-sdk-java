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

package com.lark.oapi.service.workplace.v1.model;

import com.google.gson.annotations.SerializedName;

public class WorkplaceAccessData {
    /**
     * 时间,精确到天,格式yyyy-MM-dd
     * <p> 示例值：2023-03-12
     */
    @SerializedName("date")
    private String date;
    /**
     * 全部工作台的访问数据
     * <p> 示例值：20
     */
    @SerializedName("all_workplace")
    private AccessData allWorkplace;
    /**
     * 默认工作台的访问数据
     * <p> 示例值：10
     */
    @SerializedName("default_workplace")
    private AccessData defaultWorkplace;

    // builder 开始
    public WorkplaceAccessData() {
    }

    public WorkplaceAccessData(Builder builder) {
        /**
         * 时间,精确到天,格式yyyy-MM-dd
         * <p> 示例值：2023-03-12
         */
        this.date = builder.date;
        /**
         * 全部工作台的访问数据
         * <p> 示例值：20
         */
        this.allWorkplace = builder.allWorkplace;
        /**
         * 默认工作台的访问数据
         * <p> 示例值：10
         */
        this.defaultWorkplace = builder.defaultWorkplace;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AccessData getAllWorkplace() {
        return this.allWorkplace;
    }

    public void setAllWorkplace(AccessData allWorkplace) {
        this.allWorkplace = allWorkplace;
    }

    public AccessData getDefaultWorkplace() {
        return this.defaultWorkplace;
    }

    public void setDefaultWorkplace(AccessData defaultWorkplace) {
        this.defaultWorkplace = defaultWorkplace;
    }

    public static class Builder {
        /**
         * 时间,精确到天,格式yyyy-MM-dd
         * <p> 示例值：2023-03-12
         */
        private String date;
        /**
         * 全部工作台的访问数据
         * <p> 示例值：20
         */
        private AccessData allWorkplace;
        /**
         * 默认工作台的访问数据
         * <p> 示例值：10
         */
        private AccessData defaultWorkplace;

        /**
         * 时间,精确到天,格式yyyy-MM-dd
         * <p> 示例值：2023-03-12
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 全部工作台的访问数据
         * <p> 示例值：20
         *
         * @param allWorkplace
         * @return
         */
        public Builder allWorkplace(AccessData allWorkplace) {
            this.allWorkplace = allWorkplace;
            return this;
        }


        /**
         * 默认工作台的访问数据
         * <p> 示例值：10
         *
         * @param defaultWorkplace
         * @return
         */
        public Builder defaultWorkplace(AccessData defaultWorkplace) {
            this.defaultWorkplace = defaultWorkplace;
            return this;
        }


        public WorkplaceAccessData build() {
            return new WorkplaceAccessData(this);
        }
    }
}