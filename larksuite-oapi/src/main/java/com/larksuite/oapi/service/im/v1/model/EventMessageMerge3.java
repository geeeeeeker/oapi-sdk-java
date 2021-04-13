// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class EventMessageMerge3 {
    @SerializedName("message_id")
    private String messageId;
    @SerializedName("root_id")
    private String rootId;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("chat_id")
    private String chatId;
    @SerializedName("chat_type")
    private String chatType;
    @SerializedName("message_type")
    private String messageType;
    @SerializedName("content")
    private String content;
    @SerializedName("mentions")
    private MentionEvent[] mentions;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRootId() {
        return this.rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MentionEvent[] getMentions() {
        return this.mentions;
    }

    public void setMentions(MentionEvent[] mentions) {
        this.mentions = mentions;
    }

}