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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class ShiftGroupUser {
    /**
     * 班组ID
     * <p> 示例值：7275180303583281171
     */
    @SerializedName("shift_group_id")
    private String shiftGroupId;
    /**
     * 用户ID，根据传参user_id_type确定
     * <p> 示例值：52aa1fa1
     */
    @SerializedName("user_id")
    private String userId;

    // builder 开始
    public ShiftGroupUser() {
    }

    public ShiftGroupUser(Builder builder) {
        /**
         * 班组ID
         * <p> 示例值：7275180303583281171
         */
        this.shiftGroupId = builder.shiftGroupId;
        /**
         * 用户ID，根据传参user_id_type确定
         * <p> 示例值：52aa1fa1
         */
        this.userId = builder.userId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getShiftGroupId() {
        return this.shiftGroupId;
    }

    public void setShiftGroupId(String shiftGroupId) {
        this.shiftGroupId = shiftGroupId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class Builder {
        /**
         * 班组ID
         * <p> 示例值：7275180303583281171
         */
        private String shiftGroupId;
        /**
         * 用户ID，根据传参user_id_type确定
         * <p> 示例值：52aa1fa1
         */
        private String userId;

        /**
         * 班组ID
         * <p> 示例值：7275180303583281171
         *
         * @param shiftGroupId
         * @return
         */
        public Builder shiftGroupId(String shiftGroupId) {
            this.shiftGroupId = shiftGroupId;
            return this;
        }


        /**
         * 用户ID，根据传参user_id_type确定
         * <p> 示例值：52aa1fa1
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        public ShiftGroupUser build() {
            return new ShiftGroupUser(this);
        }
    }
}
