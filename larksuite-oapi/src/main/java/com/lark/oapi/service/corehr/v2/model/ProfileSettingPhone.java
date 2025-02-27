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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class ProfileSettingPhone {
    /**
     * 国际电话区号，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "phone" custom_api_name = "international_area_code"
     * <p> 示例值：86_china
     */
    @SerializedName("international_area_code")
    private String internationalAreaCode;
    /**
     * 电话号码
     * <p> 示例值：13000000000
     */
    @SerializedName("phone_number")
    private String phoneNumber;

    // builder 开始
    public ProfileSettingPhone() {
    }

    public ProfileSettingPhone(Builder builder) {
        /**
         * 国际电话区号，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "phone" custom_api_name = "international_area_code"
         * <p> 示例值：86_china
         */
        this.internationalAreaCode = builder.internationalAreaCode;
        /**
         * 电话号码
         * <p> 示例值：13000000000
         */
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getInternationalAreaCode() {
        return this.internationalAreaCode;
    }

    public void setInternationalAreaCode(String internationalAreaCode) {
        this.internationalAreaCode = internationalAreaCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static class Builder {
        /**
         * 国际电话区号，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "phone" custom_api_name = "international_area_code"
         * <p> 示例值：86_china
         */
        private String internationalAreaCode;
        /**
         * 电话号码
         * <p> 示例值：13000000000
         */
        private String phoneNumber;

        /**
         * 国际电话区号，枚举值。 可选项可通过【获取字段详情】接口查询，查询参数如下： object_api_name = "phone" custom_api_name = "international_area_code"
         * <p> 示例值：86_china
         *
         * @param internationalAreaCode
         * @return
         */
        public Builder internationalAreaCode(String internationalAreaCode) {
            this.internationalAreaCode = internationalAreaCode;
            return this;
        }


        /**
         * 电话号码
         * <p> 示例值：13000000000
         *
         * @param phoneNumber
         * @return
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public ProfileSettingPhone build() {
            return new ProfileSettingPhone(this);
        }
    }
}
