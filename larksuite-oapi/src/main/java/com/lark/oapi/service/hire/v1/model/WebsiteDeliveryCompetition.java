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

public class WebsiteDeliveryCompetition {
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data")
    private WebsiteDeliveryCustomizedData[] customizedData;
    /**
     * 竞赛描述
     * <p> 示例值：唱歌比赛
     */
    @SerializedName("desc")
    private String desc;
    /**
     * 竞赛名称
     * <p> 示例值：青年歌手大赛
     */
    @SerializedName("name")
    private String name;

    // builder 开始
    public WebsiteDeliveryCompetition() {
    }

    public WebsiteDeliveryCompetition(Builder builder) {
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedData = builder.customizedData;
        /**
         * 竞赛描述
         * <p> 示例值：唱歌比赛
         */
        this.desc = builder.desc;
        /**
         * 竞赛名称
         * <p> 示例值：青年歌手大赛
         */
        this.name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public WebsiteDeliveryCustomizedData[] getCustomizedData() {
        return this.customizedData;
    }

    public void setCustomizedData(WebsiteDeliveryCustomizedData[] customizedData) {
        this.customizedData = customizedData;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private WebsiteDeliveryCustomizedData[] customizedData;
        /**
         * 竞赛描述
         * <p> 示例值：唱歌比赛
         */
        private String desc;
        /**
         * 竞赛名称
         * <p> 示例值：青年歌手大赛
         */
        private String name;

        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedData
         * @return
         */
        public Builder customizedData(WebsiteDeliveryCustomizedData[] customizedData) {
            this.customizedData = customizedData;
            return this;
        }


        /**
         * 竞赛描述
         * <p> 示例值：唱歌比赛
         *
         * @param desc
         * @return
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }


        /**
         * 竞赛名称
         * <p> 示例值：青年歌手大赛
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public WebsiteDeliveryCompetition build() {
            return new WebsiteDeliveryCompetition(this);
        }
    }
}
