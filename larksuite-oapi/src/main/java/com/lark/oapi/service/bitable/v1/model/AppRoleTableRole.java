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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppRoleTableRole {

  @SerializedName("table_name")
  private String tableName;
  @SerializedName("table_perm")
  private Integer tablePerm;
  @SerializedName("rec_rule")
  private AppRoleTableRoleRecRule recRule;
  @SerializedName("field_perm")
  private AppRoleTableRoleFieldPerm fieldPerm;

  // builder 开始
  public AppRoleTableRole() {
  }

  public AppRoleTableRole(Builder builder) {
    this.tableName = builder.tableName;
    this.tablePerm = builder.tablePerm;
    this.recRule = builder.recRule;
    this.fieldPerm = builder.fieldPerm;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public Integer getTablePerm() {
    return this.tablePerm;
  }

  public void setTablePerm(Integer tablePerm) {
    this.tablePerm = tablePerm;
  }

  public AppRoleTableRoleRecRule getRecRule() {
    return this.recRule;
  }

  public void setRecRule(AppRoleTableRoleRecRule recRule) {
    this.recRule = recRule;
  }

  public AppRoleTableRoleFieldPerm getFieldPerm() {
    return this.fieldPerm;
  }

  public void setFieldPerm(AppRoleTableRoleFieldPerm fieldPerm) {
    this.fieldPerm = fieldPerm;
  }

  public static class Builder {

    private String tableName;
    private Integer tablePerm;
    private AppRoleTableRoleRecRule recRule;
    private AppRoleTableRoleFieldPerm fieldPerm;

    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    public Builder tablePerm(Integer tablePerm) {
      this.tablePerm = tablePerm;
      return this;
    }

    public Builder tablePerm(com.lark.oapi.service.bitable.v1.enums.TablePermEnum tablePerm) {
      this.tablePerm = tablePerm.getValue();
      return this;
    }

    public Builder recRule(AppRoleTableRoleRecRule recRule) {
      this.recRule = recRule;
      return this;
    }

    public Builder fieldPerm(AppRoleTableRoleFieldPerm fieldPerm) {
      this.fieldPerm = fieldPerm;
      return this;
    }


    public AppRoleTableRole build() {
      return new AppRoleTableRole(this);
    }
  }
}