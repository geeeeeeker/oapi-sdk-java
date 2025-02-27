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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetTasklistActivitySubscriptionReq {
    /**
     * 用户ID类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 清单GUID
     * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
     */
    @Path
    @SerializedName("tasklist_guid")
    private String tasklistGuid;
    /**
     * 订阅GUID
     * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
     */
    @Path
    @SerializedName("activity_subscription_guid")
    private String activitySubscriptionGuid;

    // builder 开始
    public GetTasklistActivitySubscriptionReq() {
    }
    public GetTasklistActivitySubscriptionReq(Builder builder) {
        /**
         * 用户ID类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 清单GUID
         * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
         */
        this.tasklistGuid = builder.tasklistGuid;
        /**
         * 订阅GUID
         * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
         */
        this.activitySubscriptionGuid = builder.activitySubscriptionGuid;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getTasklistGuid() {
        return this.tasklistGuid;
    }

    public void setTasklistGuid(String tasklistGuid) {
        this.tasklistGuid = tasklistGuid;
    }

    public String getActivitySubscriptionGuid() {
        return this.activitySubscriptionGuid;
    }

    public void setActivitySubscriptionGuid(String activitySubscriptionGuid) {
        this.activitySubscriptionGuid = activitySubscriptionGuid;
    }

    public static class Builder {
        private String userIdType; // 用户ID类型
        private String tasklistGuid; // 清单GUID
        private String activitySubscriptionGuid; // 订阅GUID

        /**
         * 用户ID类型
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户ID类型
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.task.v2.enums.GetTasklistActivitySubscriptionUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.task.v2.enums.GetTasklistActivitySubscriptionUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 清单GUID
         * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
         *
         * @param tasklistGuid
         * @return
         */
        public Builder tasklistGuid(String tasklistGuid) {
            this.tasklistGuid = tasklistGuid;
            return this;
        }


        /**
         * 订阅GUID
         * <p> 示例值：33991879-704f-444f-81d7-55a6aa7be80c
         *
         * @param activitySubscriptionGuid
         * @return
         */
        public Builder activitySubscriptionGuid(String activitySubscriptionGuid) {
            this.activitySubscriptionGuid = activitySubscriptionGuid;
            return this;
        }

        public GetTasklistActivitySubscriptionReq build() {
            return new GetTasklistActivitySubscriptionReq(this);
        }
    }
}
