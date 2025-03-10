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
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class CreateCalendarEventAttendeeReqBody {
    /**
     * 新增参与人列表；;- 单次请求会议室的数量限制为100。
     * <p> 示例值：
     */
    @SerializedName("attendees")
    private CalendarEventAttendee[] attendees;
    /**
     * 是否给参与人发送bot通知 默认为true
     * <p> 示例值：false
     */
    @SerializedName("need_notification")
    private Boolean needNotification;
    /**
     * 使用管理员身份访问时要修改的实例(仅用于重复日程修改其中的一个实例，非重复日程无需填此字段)
     * <p> 示例值：1647320400
     */
    @SerializedName("instance_start_time_admin")
    private String instanceStartTimeAdmin;
    /**
     * 是否启用管理员身份(需先在管理后台设置某人为会议室管理员)
     * <p> 示例值：false
     */
    @SerializedName("is_enable_admin")
    private Boolean isEnableAdmin;
    /**
     * 是否添加会议室operate_id标识的用户到参与人
     * <p> 示例值：false
     */
    @SerializedName("add_operator_to_attendee")
    private Boolean addOperatorToAttendee;

    // builder 开始
    public CreateCalendarEventAttendeeReqBody() {
    }

    public CreateCalendarEventAttendeeReqBody(Builder builder) {
        /**
         * 新增参与人列表；;- 单次请求会议室的数量限制为100。
         * <p> 示例值：
         */
        this.attendees = builder.attendees;
        /**
         * 是否给参与人发送bot通知 默认为true
         * <p> 示例值：false
         */
        this.needNotification = builder.needNotification;
        /**
         * 使用管理员身份访问时要修改的实例(仅用于重复日程修改其中的一个实例，非重复日程无需填此字段)
         * <p> 示例值：1647320400
         */
        this.instanceStartTimeAdmin = builder.instanceStartTimeAdmin;
        /**
         * 是否启用管理员身份(需先在管理后台设置某人为会议室管理员)
         * <p> 示例值：false
         */
        this.isEnableAdmin = builder.isEnableAdmin;
        /**
         * 是否添加会议室operate_id标识的用户到参与人
         * <p> 示例值：false
         */
        this.addOperatorToAttendee = builder.addOperatorToAttendee;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CalendarEventAttendee[] getAttendees() {
        return this.attendees;
    }

    public void setAttendees(CalendarEventAttendee[] attendees) {
        this.attendees = attendees;
    }

    public Boolean getNeedNotification() {
        return this.needNotification;
    }

    public void setNeedNotification(Boolean needNotification) {
        this.needNotification = needNotification;
    }

    public String getInstanceStartTimeAdmin() {
        return this.instanceStartTimeAdmin;
    }

    public void setInstanceStartTimeAdmin(String instanceStartTimeAdmin) {
        this.instanceStartTimeAdmin = instanceStartTimeAdmin;
    }

    public Boolean getIsEnableAdmin() {
        return this.isEnableAdmin;
    }

    public void setIsEnableAdmin(Boolean isEnableAdmin) {
        this.isEnableAdmin = isEnableAdmin;
    }

    public Boolean getAddOperatorToAttendee() {
        return this.addOperatorToAttendee;
    }

    public void setAddOperatorToAttendee(Boolean addOperatorToAttendee) {
        this.addOperatorToAttendee = addOperatorToAttendee;
    }

    public static class Builder {
        /**
         * 新增参与人列表；;- 单次请求会议室的数量限制为100。
         * <p> 示例值：
         */
        private CalendarEventAttendee[] attendees;
        /**
         * 是否给参与人发送bot通知 默认为true
         * <p> 示例值：false
         */
        private Boolean needNotification;
        /**
         * 使用管理员身份访问时要修改的实例(仅用于重复日程修改其中的一个实例，非重复日程无需填此字段)
         * <p> 示例值：1647320400
         */
        private String instanceStartTimeAdmin;
        /**
         * 是否启用管理员身份(需先在管理后台设置某人为会议室管理员)
         * <p> 示例值：false
         */
        private Boolean isEnableAdmin;
        /**
         * 是否添加会议室operate_id标识的用户到参与人
         * <p> 示例值：false
         */
        private Boolean addOperatorToAttendee;

        /**
         * 新增参与人列表；;- 单次请求会议室的数量限制为100。
         * <p> 示例值：
         *
         * @param attendees
         * @return
         */
        public Builder attendees(CalendarEventAttendee[] attendees) {
            this.attendees = attendees;
            return this;
        }


        /**
         * 是否给参与人发送bot通知 默认为true
         * <p> 示例值：false
         *
         * @param needNotification
         * @return
         */
        public Builder needNotification(Boolean needNotification) {
            this.needNotification = needNotification;
            return this;
        }


        /**
         * 使用管理员身份访问时要修改的实例(仅用于重复日程修改其中的一个实例，非重复日程无需填此字段)
         * <p> 示例值：1647320400
         *
         * @param instanceStartTimeAdmin
         * @return
         */
        public Builder instanceStartTimeAdmin(String instanceStartTimeAdmin) {
            this.instanceStartTimeAdmin = instanceStartTimeAdmin;
            return this;
        }


        /**
         * 是否启用管理员身份(需先在管理后台设置某人为会议室管理员)
         * <p> 示例值：false
         *
         * @param isEnableAdmin
         * @return
         */
        public Builder isEnableAdmin(Boolean isEnableAdmin) {
            this.isEnableAdmin = isEnableAdmin;
            return this;
        }


        /**
         * 是否添加会议室operate_id标识的用户到参与人
         * <p> 示例值：false
         *
         * @param addOperatorToAttendee
         * @return
         */
        public Builder addOperatorToAttendee(Boolean addOperatorToAttendee) {
            this.addOperatorToAttendee = addOperatorToAttendee;
            return this;
        }


        public CreateCalendarEventAttendeeReqBody build() {
            return new CreateCalendarEventAttendeeReqBody(this);
        }
    }
}
