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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class EmailAlias {

  @SerializedName("primary_email")
  private String primaryEmail;
  @SerializedName("email_alias")
  private String emailAlias;

  // builder 开始
  public EmailAlias() {
  }

  public EmailAlias(Builder builder) {
    this.primaryEmail = builder.primaryEmail;
    this.emailAlias = builder.emailAlias;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getPrimaryEmail() {
    return this.primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public String getEmailAlias() {
    return this.emailAlias;
  }

  public void setEmailAlias(String emailAlias) {
    this.emailAlias = emailAlias;
  }

  public static class Builder {

    private String primaryEmail;
    private String emailAlias;

    public Builder primaryEmail(String primaryEmail) {
      this.primaryEmail = primaryEmail;
      return this;
    }

    public Builder emailAlias(String emailAlias) {
      this.emailAlias = emailAlias;
      return this;
    }


    public EmailAlias build() {
      return new EmailAlias(this);
    }
  }
}