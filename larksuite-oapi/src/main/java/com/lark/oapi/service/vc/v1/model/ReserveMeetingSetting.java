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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ReserveMeetingSetting {

  @SerializedName("topic")
  private String topic;
  @SerializedName("action_permissions")
  private ReserveActionPermission[] actionPermissions;
  @SerializedName("meeting_initial_type")
  private Integer meetingInitialType;
  @SerializedName("call_setting")
  private ReserveCallSetting callSetting;

  // builder 开始
  public ReserveMeetingSetting() {
  }

  public ReserveMeetingSetting(Builder builder) {
    this.topic = builder.topic;
    this.actionPermissions = builder.actionPermissions;
    this.meetingInitialType = builder.meetingInitialType;
    this.callSetting = builder.callSetting;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTopic() {
    return this.topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public ReserveActionPermission[] getActionPermissions() {
    return this.actionPermissions;
  }

  public void setActionPermissions(ReserveActionPermission[] actionPermissions) {
    this.actionPermissions = actionPermissions;
  }

  public Integer getMeetingInitialType() {
    return this.meetingInitialType;
  }

  public void setMeetingInitialType(Integer meetingInitialType) {
    this.meetingInitialType = meetingInitialType;
  }

  public ReserveCallSetting getCallSetting() {
    return this.callSetting;
  }

  public void setCallSetting(ReserveCallSetting callSetting) {
    this.callSetting = callSetting;
  }

  public static class Builder {

    private String topic;
    private ReserveActionPermission[] actionPermissions;
    private Integer meetingInitialType;
    private ReserveCallSetting callSetting;

    public Builder topic(String topic) {
      this.topic = topic;
      return this;
    }

    public Builder actionPermissions(ReserveActionPermission[] actionPermissions) {
      this.actionPermissions = actionPermissions;
      return this;
    }

    public Builder meetingInitialType(Integer meetingInitialType) {
      this.meetingInitialType = meetingInitialType;
      return this;
    }

    public Builder meetingInitialType(
        com.lark.oapi.service.vc.v1.enums.MeetingInitialTypeEnum meetingInitialType) {
      this.meetingInitialType = meetingInitialType.getValue();
      return this;
    }

    public Builder callSetting(ReserveCallSetting callSetting) {
      this.callSetting = callSetting;
      return this;
    }


    public ReserveMeetingSetting build() {
      return new ReserveMeetingSetting(this);
    }
  }
}