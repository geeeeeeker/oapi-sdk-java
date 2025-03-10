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

package com.lark.oapi.service.authen.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class CreateRefreshAccessTokenRespBody {
    /**
     * user_access_token，用于获取用户资源
     * <p> 示例值：
     */
    @SerializedName("access_token")
    private String accessToken;
    /**
     * token 类型
     * <p> 示例值：
     */
    @SerializedName("token_type")
    private String tokenType;
    /**
     * `access_token`的有效期，单位: 秒
     * <p> 示例值：
     */
    @SerializedName("expires_in")
    private Integer expiresIn;
    /**
     * 用户姓名
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 用户英文名称
     * <p> 示例值：
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 用户头像
     * <p> 示例值：
     */
    @SerializedName("avatar_url")
    private String avatarUrl;
    /**
     * 用户头像 72x72
     * <p> 示例值：
     */
    @SerializedName("avatar_thumb")
    private String avatarThumb;
    /**
     * 用户头像 240x240
     * <p> 示例值：
     */
    @SerializedName("avatar_middle")
    private String avatarMiddle;
    /**
     * 用户头像 640x640
     * <p> 示例值：
     */
    @SerializedName("avatar_big")
    private String avatarBig;
    /**
     * 用户在应用内的唯一标识
     * <p> 示例值：
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 用户统一ID
     * <p> 示例值：
     */
    @SerializedName("union_id")
    private String unionId;
    /**
     * 用户邮箱
     * <p> 示例值：
     */
    @SerializedName("email")
    private String email;
    /**
     * 企业邮箱，请先确保已在管理后台启用飞书邮箱服务
     * <p> 示例值：
     */
    @SerializedName("enterprise_email")
    private String enterpriseEmail;
    /**
     * 用户 user_id
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户手机号
     * <p> 示例值：
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 当前企业标识
     * <p> 示例值：
     */
    @SerializedName("tenant_key")
    private String tenantKey;
    /**
     * `refresh_token` 的有效期，单位: 秒
     * <p> 示例值：
     */
    @SerializedName("refresh_expires_in")
    private Integer refreshExpiresIn;
    /**
     * 刷新用户 `access_token` 时使用的 token
     * <p> 示例值：
     */
    @SerializedName("refresh_token")
    private String refreshToken;
    /**
     * 用户当前登录态session的唯一标识，为空则不返回
     * <p> 示例值：
     */
    @SerializedName("sid")
    private String sid;

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarThumb() {
        return this.avatarThumb;
    }

    public void setAvatarThumb(String avatarThumb) {
        this.avatarThumb = avatarThumb;
    }

    public String getAvatarMiddle() {
        return this.avatarMiddle;
    }

    public void setAvatarMiddle(String avatarMiddle) {
        this.avatarMiddle = avatarMiddle;
    }

    public String getAvatarBig() {
        return this.avatarBig;
    }

    public void setAvatarBig(String avatarBig) {
        this.avatarBig = avatarBig;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterpriseEmail() {
        return this.enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public Integer getRefreshExpiresIn() {
        return this.refreshExpiresIn;
    }

    public void setRefreshExpiresIn(Integer refreshExpiresIn) {
        this.refreshExpiresIn = refreshExpiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

}
