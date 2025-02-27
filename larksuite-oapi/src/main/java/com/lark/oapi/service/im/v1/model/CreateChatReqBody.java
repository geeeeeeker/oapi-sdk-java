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

public class CreateChatReqBody {
    /**
     * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
     * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
     */
    @SerializedName("avatar")
    private String avatar;
    /**
     * 群名称;; **注意：** ;- 公开群名称的长度不得少于2个字符;- 私有群若未填写群名称，群名称默认设置为 ”`(无主题)`“
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
     * 创建群时指定的群主，不填时指定建群的机器人为群主。群主 ID值应与查询参数中的 ==user_id_type== 对应；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID
     * <p> 示例值：4d7a3c6g
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 创建群时邀请的群成员，ID 类型在查询参数 ==user_id_type== 中指定；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID;;**注意**：;- 最多同时邀请 50 个用户;- 为便于在客户端查看效果，建议调试接口时加入开发者自身ID
     * <p> 示例值：["4d7a3c6g"]
     */
    @SerializedName("user_id_list")
    private String[] userIdList;
    /**
     * 创建群时邀请的群机器人；可参考[如何获取应用的 App ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-app-id)来获取应用的App ID; ;**注意：** ;- 拉机器人入群请使用`app_id`;- 最多同时邀请5个机器人，并且群组最多容纳 15 个机器人
     * <p> 示例值：["cli_a10fbf7e94b8d01d"]
     */
    @SerializedName("bot_id_list")
    private String[] botIdList;
    /**
     * 群消息模式
     * <p> 示例值：chat
     */
    @SerializedName("group_message_type")
    private String groupMessageType;
    /**
     * 群模式;;**可选值有**：;- `group`：群组
     * <p> 示例值：group
     */
    @SerializedName("chat_mode")
    private String chatMode;
    /**
     * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
     * <p> 示例值：private
     */
    @SerializedName("chat_type")
    private String chatType;
    /**
     * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
     * <p> 示例值：all_members
     */
    @SerializedName("join_message_visibility")
    private String joinMessageVisibility;
    /**
     * 退群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
     * <p> 示例值：all_members
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
     * 谁可以编辑群信息
     * <p> 示例值：all_members
     */
    @SerializedName("edit_permission")
    private String editPermission;
    /**
     * 隐藏群成员人数设置
     * <p> 示例值：all_members
     */
    @SerializedName("hide_member_count_setting")
    private String hideMemberCountSetting;

    // builder 开始
    public CreateChatReqBody() {
    }

    public CreateChatReqBody(Builder builder) {
        /**
         * 群头像对应的 Image Key，可通过[上传图片](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/image/create)获取（注意：上传图片的 ==image_type== 需要指定为 ==avatar==）
         * <p> 示例值：default-avatar_44ae0ca3-e140-494b-956f-78091e348435
         */
        this.avatar = builder.avatar;
        /**
         * 群名称;; **注意：** ;- 公开群名称的长度不得少于2个字符;- 私有群若未填写群名称，群名称默认设置为 ”`(无主题)`“
         * <p> 示例值：测试群名称
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
         * 创建群时指定的群主，不填时指定建群的机器人为群主。群主 ID值应与查询参数中的 ==user_id_type== 对应；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID
         * <p> 示例值：4d7a3c6g
         */
        this.ownerId = builder.ownerId;
        /**
         * 创建群时邀请的群成员，ID 类型在查询参数 ==user_id_type== 中指定；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID;;**注意**：;- 最多同时邀请 50 个用户;- 为便于在客户端查看效果，建议调试接口时加入开发者自身ID
         * <p> 示例值：["4d7a3c6g"]
         */
        this.userIdList = builder.userIdList;
        /**
         * 创建群时邀请的群机器人；可参考[如何获取应用的 App ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-app-id)来获取应用的App ID; ;**注意：** ;- 拉机器人入群请使用`app_id`;- 最多同时邀请5个机器人，并且群组最多容纳 15 个机器人
         * <p> 示例值：["cli_a10fbf7e94b8d01d"]
         */
        this.botIdList = builder.botIdList;
        /**
         * 群消息模式
         * <p> 示例值：chat
         */
        this.groupMessageType = builder.groupMessageType;
        /**
         * 群模式;;**可选值有**：;- `group`：群组
         * <p> 示例值：group
         */
        this.chatMode = builder.chatMode;
        /**
         * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
         * <p> 示例值：private
         */
        this.chatType = builder.chatType;
        /**
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
         */
        this.joinMessageVisibility = builder.joinMessageVisibility;
        /**
         * 退群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
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
         * 谁可以编辑群信息
         * <p> 示例值：all_members
         */
        this.editPermission = builder.editPermission;
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

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String[] getUserIdList() {
        return this.userIdList;
    }

    public void setUserIdList(String[] userIdList) {
        this.userIdList = userIdList;
    }

    public String[] getBotIdList() {
        return this.botIdList;
    }

    public void setBotIdList(String[] botIdList) {
        this.botIdList = botIdList;
    }

    public String getGroupMessageType() {
        return this.groupMessageType;
    }

    public void setGroupMessageType(String groupMessageType) {
        this.groupMessageType = groupMessageType;
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

    public String getEditPermission() {
        return this.editPermission;
    }

    public void setEditPermission(String editPermission) {
        this.editPermission = editPermission;
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
         * 群名称;; **注意：** ;- 公开群名称的长度不得少于2个字符;- 私有群若未填写群名称，群名称默认设置为 ”`(无主题)`“
         * <p> 示例值：测试群名称
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
         * 创建群时指定的群主，不填时指定建群的机器人为群主。群主 ID值应与查询参数中的 ==user_id_type== 对应；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID
         * <p> 示例值：4d7a3c6g
         */
        private String ownerId;
        /**
         * 创建群时邀请的群成员，ID 类型在查询参数 ==user_id_type== 中指定；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID;;**注意**：;- 最多同时邀请 50 个用户;- 为便于在客户端查看效果，建议调试接口时加入开发者自身ID
         * <p> 示例值：["4d7a3c6g"]
         */
        private String[] userIdList;
        /**
         * 创建群时邀请的群机器人；可参考[如何获取应用的 App ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-app-id)来获取应用的App ID; ;**注意：** ;- 拉机器人入群请使用`app_id`;- 最多同时邀请5个机器人，并且群组最多容纳 15 个机器人
         * <p> 示例值：["cli_a10fbf7e94b8d01d"]
         */
        private String[] botIdList;
        /**
         * 群消息模式
         * <p> 示例值：chat
         */
        private String groupMessageType;
        /**
         * 群模式;;**可选值有**：;- `group`：群组
         * <p> 示例值：group
         */
        private String chatMode;
        /**
         * 群类型;;**可选值有**：;- `private`：私有群;- `public`：公开群
         * <p> 示例值：private
         */
        private String chatType;
        /**
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
         */
        private String joinMessageVisibility;
        /**
         * 退群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
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
         * 谁可以编辑群信息
         * <p> 示例值：all_members
         */
        private String editPermission;
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
         * 群名称;; **注意：** ;- 公开群名称的长度不得少于2个字符;- 私有群若未填写群名称，群名称默认设置为 ”`(无主题)`“
         * <p> 示例值：测试群名称
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
         * 创建群时指定的群主，不填时指定建群的机器人为群主。群主 ID值应与查询参数中的 ==user_id_type== 对应；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID
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
         * 创建群时邀请的群成员，ID 类型在查询参数 ==user_id_type== 中指定；当ID类型为`open_id`时，可参考[如何获取 Open ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-openid)来获取用户的Open ID;;**注意**：;- 最多同时邀请 50 个用户;- 为便于在客户端查看效果，建议调试接口时加入开发者自身ID
         * <p> 示例值：["4d7a3c6g"]
         *
         * @param userIdList
         * @return
         */
        public Builder userIdList(String[] userIdList) {
            this.userIdList = userIdList;
            return this;
        }


        /**
         * 创建群时邀请的群机器人；可参考[如何获取应用的 App ID？](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-obtain-app-id)来获取应用的App ID; ;**注意：** ;- 拉机器人入群请使用`app_id`;- 最多同时邀请5个机器人，并且群组最多容纳 15 个机器人
         * <p> 示例值：["cli_a10fbf7e94b8d01d"]
         *
         * @param botIdList
         * @return
         */
        public Builder botIdList(String[] botIdList) {
            this.botIdList = botIdList;
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
         * @param groupMessageType {@link com.lark.oapi.service.im.v1.enums.CreateChatGroupMessageTypeEnum}
         * @return
         */
        public Builder groupMessageType(com.lark.oapi.service.im.v1.enums.CreateChatGroupMessageTypeEnum groupMessageType) {
            this.groupMessageType = groupMessageType.getValue();
            return this;
        }


        /**
         * 群模式;;**可选值有**：;- `group`：群组
         * <p> 示例值：group
         *
         * @param chatMode
         * @return
         */
        public Builder chatMode(String chatMode) {
            this.chatMode = chatMode;
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
         * 入群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
         *
         * @param joinMessageVisibility
         * @return
         */
        public Builder joinMessageVisibility(String joinMessageVisibility) {
            this.joinMessageVisibility = joinMessageVisibility;
            return this;
        }


        /**
         * 退群消息可见性;;**可选值有**：;- `only_owner`：仅群主和管理员可见;- `all_members`：所有成员可见;- `not_anyone`：任何人均不可见
         * <p> 示例值：all_members
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
         * @param urgentSetting {@link com.lark.oapi.service.im.v1.enums.CreateChatUrgentSettingTypeEnum}
         * @return
         */
        public Builder urgentSetting(com.lark.oapi.service.im.v1.enums.CreateChatUrgentSettingTypeEnum urgentSetting) {
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
         * @param videoConferenceSetting {@link com.lark.oapi.service.im.v1.enums.CreateChatVideoConferenceSettingTypeEnum}
         * @return
         */
        public Builder videoConferenceSetting(com.lark.oapi.service.im.v1.enums.CreateChatVideoConferenceSettingTypeEnum videoConferenceSetting) {
            this.videoConferenceSetting = videoConferenceSetting.getValue();
            return this;
        }


        /**
         * 谁可以编辑群信息
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
         * 谁可以编辑群信息
         * <p> 示例值：all_members
         *
         * @param editPermission {@link com.lark.oapi.service.im.v1.enums.CreateChatEditPermissiontypeEnum}
         * @return
         */
        public Builder editPermission(com.lark.oapi.service.im.v1.enums.CreateChatEditPermissiontypeEnum editPermission) {
            this.editPermission = editPermission.getValue();
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
         * @param hideMemberCountSetting {@link com.lark.oapi.service.im.v1.enums.CreateChatHideMemberCountSettingTypeEnum}
         * @return
         */
        public Builder hideMemberCountSetting(com.lark.oapi.service.im.v1.enums.CreateChatHideMemberCountSettingTypeEnum hideMemberCountSetting) {
            this.hideMemberCountSetting = hideMemberCountSetting.getValue();
            return this;
        }


        public CreateChatReqBody build() {
            return new CreateChatReqBody(this);
        }
    }
}
