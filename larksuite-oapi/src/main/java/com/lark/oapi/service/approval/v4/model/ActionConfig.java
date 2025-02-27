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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class ActionConfig {
    /**
     * 操作类型，每个任务都可以配置2个操作，会展示审批列表中，当用户操作时，回调请求会带上该字段，表示用户进行了同意操作还是拒绝操作
     * <p> 示例值：APPROVE
     */
    @SerializedName("action_type")
    private String actionType;
    /**
     * 操作名称，i18n key 用于前台展示，如果 action_type 不是 APPROVAL和REJECT，则必须提供该字段，用于展示特定的操作名称
     * <p> 示例值：@i18n@5
     */
    @SerializedName("action_name")
    private String actionName;
    /**
     * 是否需要意见, 如果为true,则用户操作时，会跳转到 意见填写页面
     * <p> 示例值：false
     */
    @SerializedName("is_need_reason")
    private Boolean isNeedReason;
    /**
     * 审批意见是否必填
     * <p> 示例值：false
     */
    @SerializedName("is_reason_required")
    private Boolean isReasonRequired;
    /**
     * 意见是否支持上传附件
     * <p> 示例值：false
     */
    @SerializedName("is_need_attachment")
    private Boolean isNeedAttachment;

    // builder 开始
    public ActionConfig() {
    }

    public ActionConfig(Builder builder) {
        /**
         * 操作类型，每个任务都可以配置2个操作，会展示审批列表中，当用户操作时，回调请求会带上该字段，表示用户进行了同意操作还是拒绝操作
         * <p> 示例值：APPROVE
         */
        this.actionType = builder.actionType;
        /**
         * 操作名称，i18n key 用于前台展示，如果 action_type 不是 APPROVAL和REJECT，则必须提供该字段，用于展示特定的操作名称
         * <p> 示例值：@i18n@5
         */
        this.actionName = builder.actionName;
        /**
         * 是否需要意见, 如果为true,则用户操作时，会跳转到 意见填写页面
         * <p> 示例值：false
         */
        this.isNeedReason = builder.isNeedReason;
        /**
         * 审批意见是否必填
         * <p> 示例值：false
         */
        this.isReasonRequired = builder.isReasonRequired;
        /**
         * 意见是否支持上传附件
         * <p> 示例值：false
         */
        this.isNeedAttachment = builder.isNeedAttachment;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionName() {
        return this.actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Boolean getIsNeedReason() {
        return this.isNeedReason;
    }

    public void setIsNeedReason(Boolean isNeedReason) {
        this.isNeedReason = isNeedReason;
    }

    public Boolean getIsReasonRequired() {
        return this.isReasonRequired;
    }

    public void setIsReasonRequired(Boolean isReasonRequired) {
        this.isReasonRequired = isReasonRequired;
    }

    public Boolean getIsNeedAttachment() {
        return this.isNeedAttachment;
    }

    public void setIsNeedAttachment(Boolean isNeedAttachment) {
        this.isNeedAttachment = isNeedAttachment;
    }

    public static class Builder {
        /**
         * 操作类型，每个任务都可以配置2个操作，会展示审批列表中，当用户操作时，回调请求会带上该字段，表示用户进行了同意操作还是拒绝操作
         * <p> 示例值：APPROVE
         */
        private String actionType;
        /**
         * 操作名称，i18n key 用于前台展示，如果 action_type 不是 APPROVAL和REJECT，则必须提供该字段，用于展示特定的操作名称
         * <p> 示例值：@i18n@5
         */
        private String actionName;
        /**
         * 是否需要意见, 如果为true,则用户操作时，会跳转到 意见填写页面
         * <p> 示例值：false
         */
        private Boolean isNeedReason;
        /**
         * 审批意见是否必填
         * <p> 示例值：false
         */
        private Boolean isReasonRequired;
        /**
         * 意见是否支持上传附件
         * <p> 示例值：false
         */
        private Boolean isNeedAttachment;

        /**
         * 操作类型，每个任务都可以配置2个操作，会展示审批列表中，当用户操作时，回调请求会带上该字段，表示用户进行了同意操作还是拒绝操作
         * <p> 示例值：APPROVE
         *
         * @param actionType
         * @return
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }


        /**
         * 操作名称，i18n key 用于前台展示，如果 action_type 不是 APPROVAL和REJECT，则必须提供该字段，用于展示特定的操作名称
         * <p> 示例值：@i18n@5
         *
         * @param actionName
         * @return
         */
        public Builder actionName(String actionName) {
            this.actionName = actionName;
            return this;
        }


        /**
         * 是否需要意见, 如果为true,则用户操作时，会跳转到 意见填写页面
         * <p> 示例值：false
         *
         * @param isNeedReason
         * @return
         */
        public Builder isNeedReason(Boolean isNeedReason) {
            this.isNeedReason = isNeedReason;
            return this;
        }


        /**
         * 审批意见是否必填
         * <p> 示例值：false
         *
         * @param isReasonRequired
         * @return
         */
        public Builder isReasonRequired(Boolean isReasonRequired) {
            this.isReasonRequired = isReasonRequired;
            return this;
        }


        /**
         * 意见是否支持上传附件
         * <p> 示例值：false
         *
         * @param isNeedAttachment
         * @return
         */
        public Builder isNeedAttachment(Boolean isNeedAttachment) {
            this.isNeedAttachment = isNeedAttachment;
            return this;
        }


        public ActionConfig build() {
            return new ActionConfig(this);
        }
    }
}
