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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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

public class UpdateChatReqBody {
    /**
     * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
     * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 群名称
     * <p> 示例值：群聊
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
     * 邀请用户或机器人入群权限;;注意：;- 若值设置为`only_owner`，则share_card_permission只能设置为`not_allowed`;- 若值设置为`all_members`，则share_card_permission只能设置为`allowed`;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
     * <p> 示例值：all_members
     */
    @SerializedName("add_member_permission")
    private String addMemberPermission;
    /**
     * 群分享权限;;**可选值有**：;- `allowed`：允许;- `not_allowed`：不允许
     * <p> 示例值：allowed
     */
    @SerializedName("share_card_permission")
    private String shareCardPermission;
    /**
     * at 所有人权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
     * <p> 示例值：all_members
     */
    @SerializedName("at_all_permission")
    private String atAllPermission;
    /**
     * 群编辑权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
     * <p> 示例值：all_members
     */
    @SerializedName("edit_permission")
    private String editPermission;
    /**
     * 新群主 ID
     * <p> 示例值：4d7a3c6g
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
     * <p> 示例值：only_owner
     */
    @SerializedName("join_message_visibility")
    private String joinMessageVisibility;
    /**
     * 出群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
     * <p> 示例值：only_owner
     */
    @SerializedName("leave_message_visibility")
    private String leaveMessageVisibility;
    /**
     * 加群审批;;**可选值有**：;- `no_approval_required`：无需审批;- `approval_required`：需要审批
     * <p> 示例值：no_approval_required
     */
    @SerializedName("membership_approval")
    private String membershipApproval;
    /**
     * 防泄密模式设置
     * <p> 示例值：
     */
    @SerializedName("restricted_mode_setting")
    private RestrictedModeSetting restrictedModeSetting;
    /**
     * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
     * <p> 示例值：private
     */
    @SerializedName("chat_type")
    private String chatType;
    /**
     * 群消息模式
     * <p> 示例值：chat
     */
    @SerializedName("group_message_type")
    private String groupMessageType;
    /**
     * 谁可以加急
     * <p> 示例值：all_members
     */
    @SerializedName("urgent_setting")
    private String urgentSetting;
    /**
     * 谁可以发起视频会议
     * <p> 示例值：all_members
     */
    @SerializedName("video_conference_setting")
    private String videoConferenceSetting;
    /**
     * 隐藏群成员人数设置
     * <p> 示例值：all_members
     */
    @SerializedName("hide_member_count_setting")
    private String hideMemberCountSetting;

    // builder 开始
    public UpdateChatReqBody() {
    }

    public UpdateChatReqBody(Builder builder) {
        /**
         * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
         * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
         */
        this.avatar = builder.avatar;
        /**
         * 群名称
         * <p> 示例值：群聊
         */
        this.name = builder.name;
        /**
         * 群描述
         * <p> 示例值：测试群描述
         */
        this.description = builder.description;
        /**
         * 群国际化名称
         * <p> 示例值：
         */
        this.i18nNames = builder.i18nNames;
        /**
         * 邀请用户或机器人入群权限;;注意：;- 若值设置为`only_owner`，则share_card_permission只能设置为`not_allowed`;- 若值设置为`all_members`，则share_card_permission只能设置为`allowed`;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        this.addMemberPermission = builder.addMemberPermission;
        /**
         * 群分享权限;;**可选值有**：;- `allowed`：允许;- `not_allowed`：不允许
         * <p> 示例值：allowed
         */
        this.shareCardPermission = builder.shareCardPermission;
        /**
         * at 所有人权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        this.atAllPermission = builder.atAllPermission;
        /**
         * 群编辑权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        this.editPermission = builder.editPermission;
        /**
         * 新群主 ID
         * <p> 示例值：4d7a3c6g
         */
        this.ownerId = builder.ownerId;
        /**
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         */
        this.joinMessageVisibility = builder.joinMessageVisibility;
        /**
         * 出群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         */
        this.leaveMessageVisibility = builder.leaveMessageVisibility;
        /**
         * 加群审批;;**可选值有**：;- `no_approval_required`：无需审批;- `approval_required`：需要审批
         * <p> 示例值：no_approval_required
         */
        this.membershipApproval = builder.membershipApproval;
        /**
         * 防泄密模式设置
         * <p> 示例值：
         */
        this.restrictedModeSetting = builder.restrictedModeSetting;
        /**
         * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
         * <p> 示例值：private
         */
        this.chatType = builder.chatType;
        /**
         * 群消息模式
         * <p> 示例值：chat
         */
        this.groupMessageType = builder.groupMessageType;
        /**
         * 谁可以加急
         * <p> 示例值：all_members
         */
        this.urgentSetting = builder.urgentSetting;
        /**
         * 谁可以发起视频会议
         * <p> 示例值：all_members
         */
        this.videoConferenceSetting = builder.videoConferenceSetting;
        /**
         * 隐藏群成员人数设置
         * <p> 示例值：all_members
         */
        this.hideMemberCountSetting = builder.hideMemberCountSetting;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

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

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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

    public RestrictedModeSetting getRestrictedModeSetting() {
        return this.restrictedModeSetting;
    }

    public void setRestrictedModeSetting(RestrictedModeSetting restrictedModeSetting) {
        this.restrictedModeSetting = restrictedModeSetting;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getGroupMessageType() {
        return this.groupMessageType;
    }

    public void setGroupMessageType(String groupMessageType) {
        this.groupMessageType = groupMessageType;
    }

    public String getUrgentSetting() {
        return this.urgentSetting;
    }

    public void setUrgentSetting(String urgentSetting) {
        this.urgentSetting = urgentSetting;
    }

    public String getVideoConferenceSetting() {
        return this.videoConferenceSetting;
    }

    public void setVideoConferenceSetting(String videoConferenceSetting) {
        this.videoConferenceSetting = videoConferenceSetting;
    }

    public String getHideMemberCountSetting() {
        return this.hideMemberCountSetting;
    }

    public void setHideMemberCountSetting(String hideMemberCountSetting) {
        this.hideMemberCountSetting = hideMemberCountSetting;
    }

    public static class Builder {
        /**
         * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
         * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
         */
        private String avatar;
        /**
         * 群名称
         * <p> 示例值：群聊
         */
        private String name;
        /**
         * 群描述
         * <p> 示例值：测试群描述
         */
        private String description;
        /**
         * 群国际化名称
         * <p> 示例值：
         */
        private I18nNames i18nNames;
        /**
         * 邀请用户或机器人入群权限;;注意：;- 若值设置为`only_owner`，则share_card_permission只能设置为`not_allowed`;- 若值设置为`all_members`，则share_card_permission只能设置为`allowed`;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        private String addMemberPermission;
        /**
         * 群分享权限;;**可选值有**：;- `allowed`：允许;- `not_allowed`：不允许
         * <p> 示例值：allowed
         */
        private String shareCardPermission;
        /**
         * at 所有人权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        private String atAllPermission;
        /**
         * 群编辑权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         */
        private String editPermission;
        /**
         * 新群主 ID
         * <p> 示例值：4d7a3c6g
         */
        private String ownerId;
        /**
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         */
        private String joinMessageVisibility;
        /**
         * 出群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         */
        private String leaveMessageVisibility;
        /**
         * 加群审批;;**可选值有**：;- `no_approval_required`：无需审批;- `approval_required`：需要审批
         * <p> 示例值：no_approval_required
         */
        private String membershipApproval;
        /**
         * 防泄密模式设置
         * <p> 示例值：
         */
        private RestrictedModeSetting restrictedModeSetting;
        /**
         * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
         * <p> 示例值：private
         */
        private String chatType;
        /**
         * 群消息模式
         * <p> 示例值：chat
         */
        private String groupMessageType;
        /**
         * 谁可以加急
         * <p> 示例值：all_members
         */
        private String urgentSetting;
        /**
         * 谁可以发起视频会议
         * <p> 示例值：all_members
         */
        private String videoConferenceSetting;
        /**
         * 隐藏群成员人数设置
         * <p> 示例值：all_members
         */
        private String hideMemberCountSetting;

        /**
         * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
         * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
         *
         * @param avatar
         * @return
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }


        /**
         * 群名称
         * <p> 示例值：群聊
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 群描述
         * <p> 示例值：测试群描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 群国际化名称
         * <p> 示例值：
         *
         * @param i18nNames
         * @return
         */
        public Builder i18nNames(I18nNames i18nNames) {
            this.i18nNames = i18nNames;
            return this;
        }


        /**
         * 邀请用户或机器人入群权限;;注意：;- 若值设置为`only_owner`，则share_card_permission只能设置为`not_allowed`;- 若值设置为`all_members`，则share_card_permission只能设置为`allowed`;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         *
         * @param addMemberPermission
         * @return
         */
        public Builder addMemberPermission(String addMemberPermission) {
            this.addMemberPermission = addMemberPermission;
            return this;
        }


        /**
         * 群分享权限;;**可选值有**：;- `allowed`：允许;- `not_allowed`：不允许
         * <p> 示例值：allowed
         *
         * @param shareCardPermission
         * @return
         */
        public Builder shareCardPermission(String shareCardPermission) {
            this.shareCardPermission = shareCardPermission;
            return this;
        }


        /**
         * at 所有人权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         *
         * @param atAllPermission
         * @return
         */
        public Builder atAllPermission(String atAllPermission) {
            this.atAllPermission = atAllPermission;
            return this;
        }


        /**
         * 群编辑权限;;**可选值有**：;- `only_owner`：仅群主和管理员;- `all_members`：所有成员
         * <p> 示例值：all_members
         *
         * @param editPermission
         * @return
         */
        public Builder editPermission(String editPermission) {
            this.editPermission = editPermission;
            return this;
        }


        /**
         * 新群主 ID
         * <p> 示例值：4d7a3c6g
         *
         * @param ownerId
         * @return
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        /**
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         *
         * @param joinMessageVisibility
         * @return
         */
        public Builder joinMessageVisibility(String joinMessageVisibility) {
            this.joinMessageVisibility = joinMessageVisibility;
            return this;
        }


        /**
         * 出群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：only_owner
         *
         * @param leaveMessageVisibility
         * @return
         */
        public Builder leaveMessageVisibility(String leaveMessageVisibility) {
            this.leaveMessageVisibility = leaveMessageVisibility;
            return this;
        }


        /**
         * 加群审批;;**可选值有**：;- `no_approval_required`：无需审批;- `approval_required`：需要审批
         * <p> 示例值：no_approval_required
         *
         * @param membershipApproval
         * @return
         */
        public Builder membershipApproval(String membershipApproval) {
            this.membershipApproval = membershipApproval;
            return this;
        }


        /**
         * 防泄密模式设置
         * <p> 示例值：
         *
         * @param restrictedModeSetting
         * @return
         */
        public Builder restrictedModeSetting(RestrictedModeSetting restrictedModeSetting) {
            this.restrictedModeSetting = restrictedModeSetting;
            return this;
        }


        /**
         * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
         * <p> 示例值：private
         *
         * @param chatType
         * @return
         */
        public Builder chatType(String chatType) {
            this.chatType = chatType;
            return this;
        }


        /**
         * 群消息模式
         * <p> 示例值：chat
         *
         * @param groupMessageType
         * @return
         */
        public Builder groupMessageType(String groupMessageType) {
            this.groupMessageType = groupMessageType;
            return this;
        }

        /**
         * 群消息模式
         * <p> 示例值：chat
         *
         * @param groupMessageType {@link com.lark.oapi.service.im.v1.enums.UpdateChatGroupMessageTypeEnum}
         * @return
         */
        public Builder groupMessageType(com.lark.oapi.service.im.v1.enums.UpdateChatGroupMessageTypeEnum groupMessageType) {
            this.groupMessageType = groupMessageType.getValue();
            return this;
        }


        /**
         * 谁可以加急
         * <p> 示例值：all_members
         *
         * @param urgentSetting
         * @return
         */
        public Builder urgentSetting(String urgentSetting) {
            this.urgentSetting = urgentSetting;
            return this;
        }

        /**
         * 谁可以加急
         * <p> 示例值：all_members
         *
         * @param urgentSetting {@link com.lark.oapi.service.im.v1.enums.UpdateChatUrgentSettingTypeEnum}
         * @return
         */
        public Builder urgentSetting(com.lark.oapi.service.im.v1.enums.UpdateChatUrgentSettingTypeEnum urgentSetting) {
            this.urgentSetting = urgentSetting.getValue();
            return this;
        }


        /**
         * 谁可以发起视频会议
         * <p> 示例值：all_members
         *
         * @param videoConferenceSetting
         * @return
         */
        public Builder videoConferenceSetting(String videoConferenceSetting) {
            this.videoConferenceSetting = videoConferenceSetting;
            return this;
        }

        /**
         * 谁可以发起视频会议
         * <p> 示例值：all_members
         *
         * @param videoConferenceSetting {@link com.lark.oapi.service.im.v1.enums.UpdateChatVideoConferenceSettingTypeEnum}
         * @return
         */
        public Builder videoConferenceSetting(com.lark.oapi.service.im.v1.enums.UpdateChatVideoConferenceSettingTypeEnum videoConferenceSetting) {
            this.videoConferenceSetting = videoConferenceSetting.getValue();
            return this;
        }


        /**
         * 隐藏群成员人数设置
         * <p> 示例值：all_members
         *
         * @param hideMemberCountSetting
         * @return
         */
        public Builder hideMemberCountSetting(String hideMemberCountSetting) {
            this.hideMemberCountSetting = hideMemberCountSetting;
            return this;
        }

        /**
         * 隐藏群成员人数设置
         * <p> 示例值：all_members
         *
         * @param hideMemberCountSetting {@link com.lark.oapi.service.im.v1.enums.UpdateChatHideMemberCountSettingTypeEnum}
         * @return
         */
        public Builder hideMemberCountSetting(com.lark.oapi.service.im.v1.enums.UpdateChatHideMemberCountSettingTypeEnum hideMemberCountSetting) {
            this.hideMemberCountSetting = hideMemberCountSetting.getValue();
            return this;
        }


        public UpdateChatReqBody build() {
            return new UpdateChatReqBody(this);
        }
    }
}
