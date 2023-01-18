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

public class CreateAppTableRespBody {
    /**
     * table id
     * <p> 示例值：tblKz5D60T4JlfcT
     */
    @SerializedName("table_id")
    private String tableId;
    /**
     * 默认表格视图的id，该字段仅在请求参数中填写了default_view_name或fields才会返回
     * <p> 示例值：vew3y6oFgo
     */
    @SerializedName("default_view_id")
    private String defaultViewId;
    /**
     * 数据表初始字段的id列表，该字段仅在请求参数中填写了fields才会返回
     * <p> 示例值：["fldO1Q5uD2"]
     */
    @SerializedName("field_id_list")
    private String[] fieldIdList;

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getDefaultViewId() {
        return this.defaultViewId;
    }

    public void setDefaultViewId(String defaultViewId) {
        this.defaultViewId = defaultViewId;
    }

    public String[] getFieldIdList() {
        return this.fieldIdList;
    }

    public void setFieldIdList(String[] fieldIdList) {
        this.fieldIdList = fieldIdList;
    }

}