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

import com.google.gson.annotations.SerializedName;

public class Operator {

  @SerializedName("operator_id")
  private String operatorId;
  @SerializedName("operator_type")
  private String operatorType;

  // builder 开始
  public Operator() {
  }

  public Operator(Builder builder) {
    this.operatorId = builder.operatorId;
    this.operatorType = builder.operatorType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }

  public String getOperatorType() {
    return this.operatorType;
  }

  public void setOperatorType(String operatorType) {
    this.operatorType = operatorType;
  }

  public static class Builder {

    private String operatorId;
    private String operatorType;

    public Builder operatorId(String operatorId) {
      this.operatorId = operatorId;
      return this;
    }

    public Builder operatorType(String operatorType) {
      this.operatorType = operatorType;
      return this;
    }

    public Builder operatorType(com.lark.oapi.service.im.v1.enums.OperatorTypeEnum operatorType) {
      this.operatorType = operatorType.getValue();
      return this;
    }


    public Operator build() {
      return new Operator(this);
    }
  }
}