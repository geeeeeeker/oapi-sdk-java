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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class BitableTableRecordAction {

  @SerializedName("record_id")
  private String recordId;
  @SerializedName("action")
  private String action;
  @SerializedName("before_value")
  private BitableTableRecordActionField[] beforeValue;
  @SerializedName("after_value")
  private BitableTableRecordActionField[] afterValue;

  // builder 开始
  public BitableTableRecordAction() {
  }

  public BitableTableRecordAction(Builder builder) {
    this.recordId = builder.recordId;
    this.action = builder.action;
    this.beforeValue = builder.beforeValue;
    this.afterValue = builder.afterValue;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getRecordId() {
    return this.recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public BitableTableRecordActionField[] getBeforeValue() {
    return this.beforeValue;
  }

  public void setBeforeValue(BitableTableRecordActionField[] beforeValue) {
    this.beforeValue = beforeValue;
  }

  public BitableTableRecordActionField[] getAfterValue() {
    return this.afterValue;
  }

  public void setAfterValue(BitableTableRecordActionField[] afterValue) {
    this.afterValue = afterValue;
  }

  public static class Builder {

    private String recordId;
    private String action;
    private BitableTableRecordActionField[] beforeValue;
    private BitableTableRecordActionField[] afterValue;

    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    public Builder action(String action) {
      this.action = action;
      return this;
    }

    public Builder beforeValue(BitableTableRecordActionField[] beforeValue) {
      this.beforeValue = beforeValue;
      return this;
    }

    public Builder afterValue(BitableTableRecordActionField[] afterValue) {
      this.afterValue = afterValue;
      return this;
    }


    public BitableTableRecordAction build() {
      return new BitableTableRecordAction(this);
    }
  }
}