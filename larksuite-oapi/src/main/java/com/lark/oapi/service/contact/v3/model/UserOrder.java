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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class UserOrder {

  @SerializedName("department_id")
  private String departmentId;
  @SerializedName("user_order")
  private Integer userOrder;
  @SerializedName("department_order")
  private Integer departmentOrder;

  // builder 开始
  public UserOrder() {
  }

  public UserOrder(Builder builder) {
    this.departmentId = builder.departmentId;
    this.userOrder = builder.userOrder;
    this.departmentOrder = builder.departmentOrder;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public Integer getUserOrder() {
    return this.userOrder;
  }

  public void setUserOrder(Integer userOrder) {
    this.userOrder = userOrder;
  }

  public Integer getDepartmentOrder() {
    return this.departmentOrder;
  }

  public void setDepartmentOrder(Integer departmentOrder) {
    this.departmentOrder = departmentOrder;
  }

  public static class Builder {

    private String departmentId;
    private Integer userOrder;
    private Integer departmentOrder;

    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }

    public Builder userOrder(Integer userOrder) {
      this.userOrder = userOrder;
      return this;
    }

    public Builder departmentOrder(Integer departmentOrder) {
      this.departmentOrder = departmentOrder;
      return this;
    }


    public UserOrder build() {
      return new UserOrder(this);
    }
  }
}