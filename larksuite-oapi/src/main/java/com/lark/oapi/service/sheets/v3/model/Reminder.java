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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class Reminder {

  /**
   * 时间日期
   * <p> 示例值：2022/2/2 13:33
   */
  @SerializedName("notify_date_time")
  private String notifyDateTime;
  /**
   * 提醒人员
   * <p> 示例值：ou_xxxxxx
   */
  @SerializedName("notify_user_id")
  private String[] notifyUserId;
  /**
   * 提醒内容
   * <p> 示例值：hello
   */
  @SerializedName("notify_text")
  private String notifyText;
  /**
   * 提醒策略
   * <p> 示例值：AT_TIME
   */
  @SerializedName("notify_strategy")
  private String notifyStrategy;

  // builder 开始
  public Reminder() {
  }

  public Reminder(Builder builder) {
    /**
     * 时间日期
     * <p> 示例值：2022/2/2 13:33
     */
    this.notifyDateTime = builder.notifyDateTime;
    /**
     * 提醒人员
     * <p> 示例值：ou_xxxxxx
     */
    this.notifyUserId = builder.notifyUserId;
    /**
     * 提醒内容
     * <p> 示例值：hello
     */
    this.notifyText = builder.notifyText;
    /**
     * 提醒策略
     * <p> 示例值：AT_TIME
     */
    this.notifyStrategy = builder.notifyStrategy;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getNotifyDateTime() {
    return this.notifyDateTime;
  }

  public void setNotifyDateTime(String notifyDateTime) {
    this.notifyDateTime = notifyDateTime;
  }

  public String[] getNotifyUserId() {
    return this.notifyUserId;
  }

  public void setNotifyUserId(String[] notifyUserId) {
    this.notifyUserId = notifyUserId;
  }

  public String getNotifyText() {
    return this.notifyText;
  }

  public void setNotifyText(String notifyText) {
    this.notifyText = notifyText;
  }

  public String getNotifyStrategy() {
    return this.notifyStrategy;
  }

  public void setNotifyStrategy(String notifyStrategy) {
    this.notifyStrategy = notifyStrategy;
  }

  public static class Builder {

    /**
     * 时间日期
     * <p> 示例值：2022/2/2 13:33
     */
    private String notifyDateTime;
    /**
     * 提醒人员
     * <p> 示例值：ou_xxxxxx
     */
    private String[] notifyUserId;
    /**
     * 提醒内容
     * <p> 示例值：hello
     */
    private String notifyText;
    /**
     * 提醒策略
     * <p> 示例值：AT_TIME
     */
    private String notifyStrategy;

    /**
     * 时间日期
     * <p> 示例值：2022/2/2 13:33
     *
     * @param notifyDateTime
     * @return
     */
    public Builder notifyDateTime(String notifyDateTime) {
      this.notifyDateTime = notifyDateTime;
      return this;
    }


    /**
     * 提醒人员
     * <p> 示例值：ou_xxxxxx
     *
     * @param notifyUserId
     * @return
     */
    public Builder notifyUserId(String[] notifyUserId) {
      this.notifyUserId = notifyUserId;
      return this;
    }


    /**
     * 提醒内容
     * <p> 示例值：hello
     *
     * @param notifyText
     * @return
     */
    public Builder notifyText(String notifyText) {
      this.notifyText = notifyText;
      return this;
    }


    /**
     * 提醒策略
     * <p> 示例值：AT_TIME
     *
     * @param notifyStrategy
     * @return
     */
    public Builder notifyStrategy(String notifyStrategy) {
      this.notifyStrategy = notifyStrategy;
      return this;
    }

    /**
     * 提醒策略
     * <p> 示例值：AT_TIME
     *
     * @param notifyStrategy {@link com.lark.oapi.service.sheets.v3.enums.ReminderNotifyStrategyEnum}
     * @return
     */
    public Builder notifyStrategy(
        com.lark.oapi.service.sheets.v3.enums.ReminderNotifyStrategyEnum notifyStrategy) {
      this.notifyStrategy = notifyStrategy.getValue();
      return this;
    }


    public Reminder build() {
      return new Reminder(this);
    }
  }
}