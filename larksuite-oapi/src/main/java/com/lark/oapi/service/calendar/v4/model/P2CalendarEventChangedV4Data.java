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

public class P2CalendarEventChangedV4Data {
    /**
     * 日历id
     * <p> 示例值：feishu.cn_xxxxxxxxxx@group.calendar.feishu.cn
     */
    @SerializedName("calendar_id")
    private String calendarId;
    /**
     * 需要推送事件的用户列表
     * <p> 示例值：
     */
    @SerializedName("user_id_list")
    private UserId[] userIdList;
    /**
     * 发生变更的日程ID
     * <p> 示例值：efa67a98-06a8-4df5-8559-746c8f4477ef_0
     */
    @SerializedName("calendar_event_id")
    private String calendarEventId;
    /**
     * 变更类型
     * <p> 示例值：create
     */
    @SerializedName("change_type")
    private String changeType;
    /**
     * RSVP变更详情
     * <p> 示例值：
     */
    @SerializedName("rsvp_infos")
    private OpenEventRsvpInfo[] rsvpInfos;

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public UserId[] getUserIdList() {
        return this.userIdList;
    }

    public void setUserIdList(UserId[] userIdList) {
        this.userIdList = userIdList;
    }

    public String getCalendarEventId() {
        return this.calendarEventId;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public String getChangeType() {
        return this.changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public OpenEventRsvpInfo[] getRsvpInfos() {
        return this.rsvpInfos;
    }

    public void setRsvpInfos(OpenEventRsvpInfo[] rsvpInfos) {
        this.rsvpInfos = rsvpInfos;
    }

}
