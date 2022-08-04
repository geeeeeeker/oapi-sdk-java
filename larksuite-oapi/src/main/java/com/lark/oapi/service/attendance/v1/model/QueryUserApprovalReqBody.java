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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class QueryUserApprovalReqBody {

  @SerializedName("user_ids")
  private String[] userIds;
  @SerializedName("check_date_from")
  private Integer checkDateFrom;
  @SerializedName("check_date_to")
  private Integer checkDateTo;

  // builder 开始
  public QueryUserApprovalReqBody() {
  }

  public QueryUserApprovalReqBody(Builder builder) {
    this.userIds = builder.userIds;
    this.checkDateFrom = builder.checkDateFrom;
    this.checkDateTo = builder.checkDateTo;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String[] getUserIds() {
    return this.userIds;
  }

  public void setUserIds(String[] userIds) {
    this.userIds = userIds;
  }

  public Integer getCheckDateFrom() {
    return this.checkDateFrom;
  }

  public void setCheckDateFrom(Integer checkDateFrom) {
    this.checkDateFrom = checkDateFrom;
  }

  public Integer getCheckDateTo() {
    return this.checkDateTo;
  }

  public void setCheckDateTo(Integer checkDateTo) {
    this.checkDateTo = checkDateTo;
  }

  public static class Builder {

    private String[] userIds;
    private Integer checkDateFrom;
    private Integer checkDateTo;

    public Builder userIds(String[] userIds) {
      this.userIds = userIds;
      return this;
    }

    public Builder checkDateFrom(Integer checkDateFrom) {
      this.checkDateFrom = checkDateFrom;
      return this;
    }

    public Builder checkDateTo(Integer checkDateTo) {
      this.checkDateTo = checkDateTo;
      return this;
    }


    public QueryUserApprovalReqBody build() {
      return new QueryUserApprovalReqBody(this);
    }
  }
}