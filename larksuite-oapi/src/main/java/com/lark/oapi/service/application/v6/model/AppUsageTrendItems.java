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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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

public class AppUsageTrendItems {
    /**
     * 部门号
     * <p> 示例值：
     */
    @SerializedName("id")
    private String id;
    /**
     * 趋势统计
     * <p> 示例值：
     */
    @SerializedName("trend")
    private UsageTrendItem[] trend;

    // builder 开始
    public AppUsageTrendItems() {
    }

    public AppUsageTrendItems(Builder builder) {
        /**
         * 部门号
         * <p> 示例值：
         */
        this.id = builder.id;
        /**
         * 趋势统计
         * <p> 示例值：
         */
        this.trend = builder.trend;
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

    public UsageTrendItem[] getTrend() {
        return this.trend;
    }

    public void setTrend(UsageTrendItem[] trend) {
        this.trend = trend;
    }

    public static class Builder {
        /**
         * 部门号
         * <p> 示例值：
         */
        private String id;
        /**
         * 趋势统计
         * <p> 示例值：
         */
        private UsageTrendItem[] trend;

        /**
         * 部门号
         * <p> 示例值：
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 趋势统计
         * <p> 示例值：
         *
         * @param trend
         * @return
         */
        public Builder trend(UsageTrendItem[] trend) {
            this.trend = trend;
            return this;
        }


        public AppUsageTrendItems build() {
            return new AppUsageTrendItems(this);
        }
    }
}
