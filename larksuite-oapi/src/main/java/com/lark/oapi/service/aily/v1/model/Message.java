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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class Message {
    /**
     * 消息 id
     * <p> 示例值：7316801852719906836
     */
    @SerializedName("id")
    private String id;
    /**
     * 消息标题
     * <p> 示例值：正在生成中...
     */
    @SerializedName("title")
    private String title;
    /**
     * 消息内容
     * <p> 示例值：{}
     */
    @SerializedName("content")
    private String content;
    /**
     * 消息状态
     * <p> 示例值：FINISHED
     */
    @SerializedName("message_status")
    private String messageStatus;
    /**
     * 消息上可接收的 action
     * <p> 示例值：
     */
    @SerializedName("builtin_actions")
    private BuiltinAction[] builtinActions;
    /**
     * 使用的 skill 信息
     * <p> 示例值：
     */
    @SerializedName("skill_base_infos")
    private SkillBaseInfo[] skillBaseInfos;
    /**
     * 进度条消息
     * <p> 示例值：
     */
    @SerializedName("message_progress")
    private MessageProgress messageProgress;
    /**
     * 发送者信息
     * <p> 示例值：
     */
    @SerializedName("sender")
    private Sender sender;
    /**
     * 错误信息
     * <p> 示例值：
     */
    @SerializedName("error")
    private MessageError error;
    /**
     * 触发类型
     * <p> 示例值：''
     */
    @SerializedName("trigger_type")
    private String triggerType;
    /**
     * 消息的可见性
     * <p> 示例值：SELF
     */
    @SerializedName("visibility")
    private String visibility;

    // builder 开始
    public Message() {
    }

    public Message(Builder builder) {
        /**
         * 消息 id
         * <p> 示例值：7316801852719906836
         */
        this.id = builder.id;
        /**
         * 消息标题
         * <p> 示例值：正在生成中...
         */
        this.title = builder.title;
        /**
         * 消息内容
         * <p> 示例值：{}
         */
        this.content = builder.content;
        /**
         * 消息状态
         * <p> 示例值：FINISHED
         */
        this.messageStatus = builder.messageStatus;
        /**
         * 消息上可接收的 action
         * <p> 示例值：
         */
        this.builtinActions = builder.builtinActions;
        /**
         * 使用的 skill 信息
         * <p> 示例值：
         */
        this.skillBaseInfos = builder.skillBaseInfos;
        /**
         * 进度条消息
         * <p> 示例值：
         */
        this.messageProgress = builder.messageProgress;
        /**
         * 发送者信息
         * <p> 示例值：
         */
        this.sender = builder.sender;
        /**
         * 错误信息
         * <p> 示例值：
         */
        this.error = builder.error;
        /**
         * 触发类型
         * <p> 示例值：''
         */
        this.triggerType = builder.triggerType;
        /**
         * 消息的可见性
         * <p> 示例值：SELF
         */
        this.visibility = builder.visibility;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageStatus() {
        return this.messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public BuiltinAction[] getBuiltinActions() {
        return this.builtinActions;
    }

    public void setBuiltinActions(BuiltinAction[] builtinActions) {
        this.builtinActions = builtinActions;
    }

    public SkillBaseInfo[] getSkillBaseInfos() {
        return this.skillBaseInfos;
    }

    public void setSkillBaseInfos(SkillBaseInfo[] skillBaseInfos) {
        this.skillBaseInfos = skillBaseInfos;
    }

    public MessageProgress getMessageProgress() {
        return this.messageProgress;
    }

    public void setMessageProgress(MessageProgress messageProgress) {
        this.messageProgress = messageProgress;
    }

    public Sender getSender() {
        return this.sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public MessageError getError() {
        return this.error;
    }

    public void setError(MessageError error) {
        this.error = error;
    }

    public String getTriggerType() {
        return this.triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public static class Builder {
        /**
         * 消息 id
         * <p> 示例值：7316801852719906836
         */
        private String id;
        /**
         * 消息标题
         * <p> 示例值：正在生成中...
         */
        private String title;
        /**
         * 消息内容
         * <p> 示例值：{}
         */
        private String content;
        /**
         * 消息状态
         * <p> 示例值：FINISHED
         */
        private String messageStatus;
        /**
         * 消息上可接收的 action
         * <p> 示例值：
         */
        private BuiltinAction[] builtinActions;
        /**
         * 使用的 skill 信息
         * <p> 示例值：
         */
        private SkillBaseInfo[] skillBaseInfos;
        /**
         * 进度条消息
         * <p> 示例值：
         */
        private MessageProgress messageProgress;
        /**
         * 发送者信息
         * <p> 示例值：
         */
        private Sender sender;
        /**
         * 错误信息
         * <p> 示例值：
         */
        private MessageError error;
        /**
         * 触发类型
         * <p> 示例值：''
         */
        private String triggerType;
        /**
         * 消息的可见性
         * <p> 示例值：SELF
         */
        private String visibility;

        /**
         * 消息 id
         * <p> 示例值：7316801852719906836
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 消息标题
         * <p> 示例值：正在生成中...
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 消息内容
         * <p> 示例值：{}
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 消息状态
         * <p> 示例值：FINISHED
         *
         * @param messageStatus
         * @return
         */
        public Builder messageStatus(String messageStatus) {
            this.messageStatus = messageStatus;
            return this;
        }

        /**
         * 消息状态
         * <p> 示例值：FINISHED
         *
         * @param messageStatus {@link com.lark.oapi.service.aily.v1.enums.MessageMessageStatusEnum}
         * @return
         */
        public Builder messageStatus(com.lark.oapi.service.aily.v1.enums.MessageMessageStatusEnum messageStatus) {
            this.messageStatus = messageStatus.getValue();
            return this;
        }


        /**
         * 消息上可接收的 action
         * <p> 示例值：
         *
         * @param builtinActions
         * @return
         */
        public Builder builtinActions(BuiltinAction[] builtinActions) {
            this.builtinActions = builtinActions;
            return this;
        }


        /**
         * 使用的 skill 信息
         * <p> 示例值：
         *
         * @param skillBaseInfos
         * @return
         */
        public Builder skillBaseInfos(SkillBaseInfo[] skillBaseInfos) {
            this.skillBaseInfos = skillBaseInfos;
            return this;
        }


        /**
         * 进度条消息
         * <p> 示例值：
         *
         * @param messageProgress
         * @return
         */
        public Builder messageProgress(MessageProgress messageProgress) {
            this.messageProgress = messageProgress;
            return this;
        }


        /**
         * 发送者信息
         * <p> 示例值：
         *
         * @param sender
         * @return
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }


        /**
         * 错误信息
         * <p> 示例值：
         *
         * @param error
         * @return
         */
        public Builder error(MessageError error) {
            this.error = error;
            return this;
        }


        /**
         * 触发类型
         * <p> 示例值：''
         *
         * @param triggerType
         * @return
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * 触发类型
         * <p> 示例值：''
         *
         * @param triggerType {@link com.lark.oapi.service.aily.v1.enums.MessageTriggerTypeEnum}
         * @return
         */
        public Builder triggerType(com.lark.oapi.service.aily.v1.enums.MessageTriggerTypeEnum triggerType) {
            this.triggerType = triggerType.getValue();
            return this;
        }


        /**
         * 消息的可见性
         * <p> 示例值：SELF
         *
         * @param visibility
         * @return
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * 消息的可见性
         * <p> 示例值：SELF
         *
         * @param visibility {@link com.lark.oapi.service.aily.v1.enums.MessageMessageVisibilityEnum}
         * @return
         */
        public Builder visibility(com.lark.oapi.service.aily.v1.enums.MessageMessageVisibilityEnum visibility) {
            this.visibility = visibility.getValue();
            return this;
        }


        public Message build() {
            return new Message(this);
        }
    }
}
