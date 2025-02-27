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

package com.lark.oapi.service.contact.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.contact.v3.enums.*;
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

public class UserStatus {
    /**
     * 是否暂停
     * <p> 示例值：false
     */
    @SerializedName("is_frozen")
    private Boolean isFrozen;
    /**
     * 是否离职
     * <p> 示例值：false
     */
    @SerializedName("is_resigned")
    private Boolean isResigned;
    /**
     * 是否激活
     * <p> 示例值：true
     */
    @SerializedName("is_activated")
    private Boolean isActivated;
    /**
     * 是否主动退出，主动退出一段时间后用户会自动转为已离职
     * <p> 示例值：false
     */
    @SerializedName("is_exited")
    private Boolean isExited;
    /**
     * 是否未加入，需要用户自主确认才能加入团队
     * <p> 示例值：false
     */
    @SerializedName("is_unjoin")
    private Boolean isUnjoin;

    // builder 开始
    public UserStatus() {
    }

    public UserStatus(Builder builder) {
        /**
         * 是否暂停
         * <p> 示例值：false
         */
        this.isFrozen = builder.isFrozen;
        /**
         * 是否离职
         * <p> 示例值：false
         */
        this.isResigned = builder.isResigned;
        /**
         * 是否激活
         * <p> 示例值：true
         */
        this.isActivated = builder.isActivated;
        /**
         * 是否主动退出，主动退出一段时间后用户会自动转为已离职
         * <p> 示例值：false
         */
        this.isExited = builder.isExited;
        /**
         * 是否未加入，需要用户自主确认才能加入团队
         * <p> 示例值：false
         */
        this.isUnjoin = builder.isUnjoin;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIsFrozen() {
        return this.isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Boolean getIsResigned() {
        return this.isResigned;
    }

    public void setIsResigned(Boolean isResigned) {
        this.isResigned = isResigned;
    }

    public Boolean getIsActivated() {
        return this.isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public Boolean getIsExited() {
        return this.isExited;
    }

    public void setIsExited(Boolean isExited) {
        this.isExited = isExited;
    }

    public Boolean getIsUnjoin() {
        return this.isUnjoin;
    }

    public void setIsUnjoin(Boolean isUnjoin) {
        this.isUnjoin = isUnjoin;
    }

    public static class Builder {
        /**
         * 是否暂停
         * <p> 示例值：false
         */
        private Boolean isFrozen;
        /**
         * 是否离职
         * <p> 示例值：false
         */
        private Boolean isResigned;
        /**
         * 是否激活
         * <p> 示例值：true
         */
        private Boolean isActivated;
        /**
         * 是否主动退出，主动退出一段时间后用户会自动转为已离职
         * <p> 示例值：false
         */
        private Boolean isExited;
        /**
         * 是否未加入，需要用户自主确认才能加入团队
         * <p> 示例值：false
         */
        private Boolean isUnjoin;

        /**
         * 是否暂停
         * <p> 示例值：false
         *
         * @param isFrozen
         * @return
         */
        public Builder isFrozen(Boolean isFrozen) {
            this.isFrozen = isFrozen;
            return this;
        }


        /**
         * 是否离职
         * <p> 示例值：false
         *
         * @param isResigned
         * @return
         */
        public Builder isResigned(Boolean isResigned) {
            this.isResigned = isResigned;
            return this;
        }


        /**
         * 是否激活
         * <p> 示例值：true
         *
         * @param isActivated
         * @return
         */
        public Builder isActivated(Boolean isActivated) {
            this.isActivated = isActivated;
            return this;
        }


        /**
         * 是否主动退出，主动退出一段时间后用户会自动转为已离职
         * <p> 示例值：false
         *
         * @param isExited
         * @return
         */
        public Builder isExited(Boolean isExited) {
            this.isExited = isExited;
            return this;
        }


        /**
         * 是否未加入，需要用户自主确认才能加入团队
         * <p> 示例值：false
         *
         * @param isUnjoin
         * @return
         */
        public Builder isUnjoin(Boolean isUnjoin) {
            this.isUnjoin = isUnjoin;
            return this;
        }


        public UserStatus build() {
            return new UserStatus(this);
        }
    }
}
