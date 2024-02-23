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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class EventOrganizer {
    /**
     * 日程组织者user ID
     * <p> 示例值：ou_xxxxxx
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 日程组织者姓名
     * <p> 示例值：孙二二
     */
    @SerializedName("display_name")
    private String displayName;

    // builder 开始
    public EventOrganizer() {
    }

    public EventOrganizer(Builder builder) {
        /**
         * 日程组织者user ID
         * <p> 示例值：ou_xxxxxx
         */
        this.userId = builder.userId;
        /**
         * 日程组织者姓名
         * <p> 示例值：孙二二
         */
        this.displayName = builder.displayName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public static class Builder {
        /**
         * 日程组织者user ID
         * <p> 示例值：ou_xxxxxx
         */
        private String userId;
        /**
         * 日程组织者姓名
         * <p> 示例值：孙二二
         */
        private String displayName;

        /**
         * 日程组织者user ID
         * <p> 示例值：ou_xxxxxx
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 日程组织者姓名
         * <p> 示例值：孙二二
         *
         * @param displayName
         * @return
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        public EventOrganizer build() {
            return new EventOrganizer(this);
        }
    }
}