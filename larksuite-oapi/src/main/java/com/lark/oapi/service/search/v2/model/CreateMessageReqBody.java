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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
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

public class CreateMessageReqBody {
    /**
     * 搜索关键词
     * <p> 示例值：测试消息
     */
    @SerializedName("query")
    private String query;
    /**
     * 消息来自user_id列表
     * <p> 示例值：
     */
    @SerializedName("from_ids")
    private String[] fromIds;
    /**
     * 消息所在chat_id列表
     * <p> 示例值：
     */
    @SerializedName("chat_ids")
    private String[] chatIds;
    /**
     * 消息类型(file/image/media)
     * <p> 示例值：
     */
    @SerializedName("message_type")
    private String messageType;
    /**
     * at用户user_id列表
     * <p> 示例值：
     */
    @SerializedName("at_chatter_ids")
    private String[] atChatterIds;
    /**
     * 消息来自类型(bot/user)
     * <p> 示例值：
     */
    @SerializedName("from_type")
    private String fromType;
    /**
     * 会话类型(group_chat/p2p_chat)
     * <p> 示例值：
     */
    @SerializedName("chat_type")
    private String chatType;
    /**
     * 消息发送起始时间
     * <p> 示例值：1609296809
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 消息发送结束时间
     * <p> 示例值：1609296809
     */
    @SerializedName("end_time")
    private String endTime;

    // builder 开始
    public CreateMessageReqBody() {
    }

    public CreateMessageReqBody(Builder builder) {
        /**
         * 搜索关键词
         * <p> 示例值：测试消息
         */
        this.query = builder.query;
        /**
         * 消息来自user_id列表
         * <p> 示例值：
         */
        this.fromIds = builder.fromIds;
        /**
         * 消息所在chat_id列表
         * <p> 示例值：
         */
        this.chatIds = builder.chatIds;
        /**
         * 消息类型(file/image/media)
         * <p> 示例值：
         */
        this.messageType = builder.messageType;
        /**
         * at用户user_id列表
         * <p> 示例值：
         */
        this.atChatterIds = builder.atChatterIds;
        /**
         * 消息来自类型(bot/user)
         * <p> 示例值：
         */
        this.fromType = builder.fromType;
        /**
         * 会话类型(group_chat/p2p_chat)
         * <p> 示例值：
         */
        this.chatType = builder.chatType;
        /**
         * 消息发送起始时间
         * <p> 示例值：1609296809
         */
        this.startTime = builder.startTime;
        /**
         * 消息发送结束时间
         * <p> 示例值：1609296809
         */
        this.endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String[] getFromIds() {
        return this.fromIds;
    }

    public void setFromIds(String[] fromIds) {
        this.fromIds = fromIds;
    }

    public String[] getChatIds() {
        return this.chatIds;
    }

    public void setChatIds(String[] chatIds) {
        this.chatIds = chatIds;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String[] getAtChatterIds() {
        return this.atChatterIds;
    }

    public void setAtChatterIds(String[] atChatterIds) {
        this.atChatterIds = atChatterIds;
    }

    public String getFromType() {
        return this.fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        /**
         * 搜索关键词
         * <p> 示例值：测试消息
         */
        private String query;
        /**
         * 消息来自user_id列表
         * <p> 示例值：
         */
        private String[] fromIds;
        /**
         * 消息所在chat_id列表
         * <p> 示例值：
         */
        private String[] chatIds;
        /**
         * 消息类型(file/image/media)
         * <p> 示例值：
         */
        private String messageType;
        /**
         * at用户user_id列表
         * <p> 示例值：
         */
        private String[] atChatterIds;
        /**
         * 消息来自类型(bot/user)
         * <p> 示例值：
         */
        private String fromType;
        /**
         * 会话类型(group_chat/p2p_chat)
         * <p> 示例值：
         */
        private String chatType;
        /**
         * 消息发送起始时间
         * <p> 示例值：1609296809
         */
        private String startTime;
        /**
         * 消息发送结束时间
         * <p> 示例值：1609296809
         */
        private String endTime;

        /**
         * 搜索关键词
         * <p> 示例值：测试消息
         *
         * @param query
         * @return
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }


        /**
         * 消息来自user_id列表
         * <p> 示例值：
         *
         * @param fromIds
         * @return
         */
        public Builder fromIds(String[] fromIds) {
            this.fromIds = fromIds;
            return this;
        }


        /**
         * 消息所在chat_id列表
         * <p> 示例值：
         *
         * @param chatIds
         * @return
         */
        public Builder chatIds(String[] chatIds) {
            this.chatIds = chatIds;
            return this;
        }


        /**
         * 消息类型(file/image/media)
         * <p> 示例值：
         *
         * @param messageType
         * @return
         */
        public Builder messageType(String messageType) {
            this.messageType = messageType;
            return this;
        }

        /**
         * 消息类型(file/image/media)
         * <p> 示例值：
         *
         * @param messageType {@link com.lark.oapi.service.search.v2.enums.CreateMessageMessageTypeEnum}
         * @return
         */
        public Builder messageType(com.lark.oapi.service.search.v2.enums.CreateMessageMessageTypeEnum messageType) {
            this.messageType = messageType.getValue();
            return this;
        }


        /**
         * at用户user_id列表
         * <p> 示例值：
         *
         * @param atChatterIds
         * @return
         */
        public Builder atChatterIds(String[] atChatterIds) {
            this.atChatterIds = atChatterIds;
            return this;
        }


        /**
         * 消息来自类型(bot/user)
         * <p> 示例值：
         *
         * @param fromType
         * @return
         */
        public Builder fromType(String fromType) {
            this.fromType = fromType;
            return this;
        }

        /**
         * 消息来自类型(bot/user)
         * <p> 示例值：
         *
         * @param fromType {@link com.lark.oapi.service.search.v2.enums.CreateMessageFromTypeEnum}
         * @return
         */
        public Builder fromType(com.lark.oapi.service.search.v2.enums.CreateMessageFromTypeEnum fromType) {
            this.fromType = fromType.getValue();
            return this;
        }


        /**
         * 会话类型(group_chat/p2p_chat)
         * <p> 示例值：
         *
         * @param chatType
         * @return
         */
        public Builder chatType(String chatType) {
            this.chatType = chatType;
            return this;
        }

        /**
         * 会话类型(group_chat/p2p_chat)
         * <p> 示例值：
         *
         * @param chatType {@link com.lark.oapi.service.search.v2.enums.CreateMessageChatTypeEnum}
         * @return
         */
        public Builder chatType(com.lark.oapi.service.search.v2.enums.CreateMessageChatTypeEnum chatType) {
            this.chatType = chatType.getValue();
            return this;
        }


        /**
         * 消息发送起始时间
         * <p> 示例值：1609296809
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 消息发送结束时间
         * <p> 示例值：1609296809
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        public CreateMessageReqBody build() {
            return new CreateMessageReqBody(this);
        }
    }
}
