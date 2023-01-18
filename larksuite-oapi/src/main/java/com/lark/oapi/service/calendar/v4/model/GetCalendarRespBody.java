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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class GetCalendarRespBody {
    /**
     * 日历OpenId
     * <p> 示例值：
     */
    @SerializedName("calendar_id")
    private String calendarId;
    /**
     * 日历标题
     * <p> 示例值：
     */
    @SerializedName("summary")
    private String summary;
    /**
     * 日历描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private String description;
    /**
     * <p> 示例值：
     */
    @SerializedName("permissions")
    private String permissions;
    /**
     * 日历颜色，颜色RGB值的int32表示。客户端展示时会映射到色板上最接近的一种颜色。仅对当前身份生效
     * <p> 示例值：
     */
    @SerializedName("color")
    private Integer color;
    /**
     * 日历类型
     * <p> 示例值：
     */
    @SerializedName("type")
    private String type;
    /**
     * 日历备注名，修改或添加后仅对当前身份生效
     * <p> 示例值：
     */
    @SerializedName("summary_alias")
    private String summaryAlias;
    /**
     * 对于当前身份，日历是否已经被标记为删除
     * <p> 示例值：
     */
    @SerializedName("is_deleted")
    private Boolean isDeleted;
    /**
     * 当前日历是否是第三方数据；三方日历及日程只支持读，不支持写入
     * <p> 示例值：
     */
    @SerializedName("is_third_party")
    private Boolean isThirdParty;
    /**
     * 当前身份对于该日历的访问权限
     * <p> 示例值：
     */
    @SerializedName("role")
    private String role;

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Integer getColor() {
        return this.color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummaryAlias() {
        return this.summaryAlias;
    }

    public void setSummaryAlias(String summaryAlias) {
        this.summaryAlias = summaryAlias;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsThirdParty() {
        return this.isThirdParty;
    }

    public void setIsThirdParty(Boolean isThirdParty) {
        this.isThirdParty = isThirdParty;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}