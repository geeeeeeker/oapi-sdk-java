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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetChat {

    /**
     * 群头像 URL
     * <p> 示例值：https://p3-lark-file.byteimg.com/img/lark-avatar-staging/default-avatar_44ae0ca3-e140-494b-956f-78091e348435~100x100.jpg
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 群名称
     * <p> 示例值：测试群名称
     */
    @SerializedName("name")
    private String name;
    /**
     * 群描述
     * <p> 示例值：测试群描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 群国际化名称
     * <p> 示例值：
     */
    @SerializedName("i18n_names")
    private I18nNames i18nNames;
    /**
     * 群成员添加权限(all_members/only_owner)
     * <p> 示例值：all_members
     */
    @SerializedName("add_member_permission")
    private String addMemberPermission;
    /**
     * 群分享权限(allowed/not_allowed)
     * <p> 示例值：allowed
     */
    @SerializedName("share_card_permission")
    private String shareCardPermission;
    /**
     * at 所有人权限(all_members/only_owner)
     * <p> 示例值：all_members
     */
    @SerializedName("at_all_permission")
    private String atAllPermission;
    /**
     * 群编辑权限(all_members/only_owner)
     * <p> 示例值：all_members
     */
    @SerializedName("edit_permission")
    private String editPermission;
    /**
     * 群主 ID 的类型(open_id/user_id/union_id)，群主是机器人时，不返回该字段。
     * <p> 示例值：user_id
     */
    @SerializedName("owner_id_type")
    private String ownerIdType;
    /**
     * 群主 ID，群主是机器人时，不返回该字段。
     * <p> 示例值：4d7a3c6g
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 群模式(group/topic/p2p)
     * <p> 示例值：group
     */
    @SerializedName("chat_mode")
    private String chatMode;
    /**
     * 群类型(private/public)
     * <p> 示例值：private
     */
    @SerializedName("chat_type")
    private String chatType;
    /**
     * 优先级最高的一个群tag(inner/tenant/department/edu/meeting/customer_service)
     * <p> 示例值：inner
     */
    @SerializedName("chat_tag")
    private String chatTag;
    /**
     * 入群消息可见性(only_owner/all_members/not_anyone)
     * <p> 示例值：only_owner
     */
    @SerializedName("join_message_visibility")
    private String joinMessageVisibility;
    /**
     * 出群消息可见性(only_owner/all_members/not_anyone)
     * <p> 示例值：only_owner
     */
    @SerializedName("leave_message_visibility")
    private String leaveMessageVisibility;
    /**
     * 加群审批(no_approval_required/approval_required)
     * <p> 示例值：no_approval_required
     */
    @SerializedName("membership_approval")
    private String membershipApproval;
    /**
     * 发言权限(all_members/only_owner/moderator_list)
     * <p> 示例值：all_members
     */
    @SerializedName("moderation_permission")
    private String moderationPermission;
    /**
     * 是否是外部群
     * <p> 示例值：false
     */
    @SerializedName("external")
    private Boolean external;
    /**
     * tenant key
     * <p> 示例值：736588c9260f175e
     */
    @SerializedName("tenant_key")
    private String tenantKey;
    /**
     * 群成员人数
     * <p> 示例值：1
     */
    @SerializedName("user_count")
    private String userCount;
    /**
     * 群机器人数
     * <p> 示例值：3
     */
    @SerializedName("bot_count")
    private String botCount;

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public I18nNames getI18nNames() {
        return this.i18nNames;
    }

    public void setI18nNames(I18nNames i18nNames) {
        this.i18nNames = i18nNames;
    }

    public String getAddMemberPermission() {
        return this.addMemberPermission;
    }

    public void setAddMemberPermission(String addMemberPermission) {
        this.addMemberPermission = addMemberPermission;
    }

    public String getShareCardPermission() {
        return this.shareCardPermission;
    }

    public void setShareCardPermission(String shareCardPermission) {
        this.shareCardPermission = shareCardPermission;
    }

    public String getAtAllPermission() {
        return this.atAllPermission;
    }

    public void setAtAllPermission(String atAllPermission) {
        this.atAllPermission = atAllPermission;
    }

    public String getEditPermission() {
        return this.editPermission;
    }

    public void setEditPermission(String editPermission) {
        this.editPermission = editPermission;
    }

    public String getOwnerIdType() {
        return this.ownerIdType;
    }

    public void setOwnerIdType(String ownerIdType) {
        this.ownerIdType = ownerIdType;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getChatMode() {
        return this.chatMode;
    }

    public void setChatMode(String chatMode) {
        this.chatMode = chatMode;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getChatTag() {
        return this.chatTag;
    }

    public void setChatTag(String chatTag) {
        this.chatTag = chatTag;
    }

    public String getJoinMessageVisibility() {
        return this.joinMessageVisibility;
    }

    public void setJoinMessageVisibility(String joinMessageVisibility) {
        this.joinMessageVisibility = joinMessageVisibility;
    }

    public String getLeaveMessageVisibility() {
        return this.leaveMessageVisibility;
    }

    public void setLeaveMessageVisibility(String leaveMessageVisibility) {
        this.leaveMessageVisibility = leaveMessageVisibility;
    }

    public String getMembershipApproval() {
        return this.membershipApproval;
    }

    public void setMembershipApproval(String membershipApproval) {
        this.membershipApproval = membershipApproval;
    }

    public String getModerationPermission() {
        return this.moderationPermission;
    }

    public void setModerationPermission(String moderationPermission) {
        this.moderationPermission = moderationPermission;
    }

    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public String getUserCount() {
        return this.userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public String getBotCount() {
        return this.botCount;
    }

    public void setBotCount(String botCount) {
        this.botCount = botCount;
    }


}
