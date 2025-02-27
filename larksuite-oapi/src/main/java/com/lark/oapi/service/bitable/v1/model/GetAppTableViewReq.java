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

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetAppTableViewReq {
    /**
     * bitable app token
     * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * table id
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    @Path
    @SerializedName("table_id")
    private String tableId;
    /**
     * 视图 ID
     * <p> 示例值：vewTpR1urY
     */
    @Path
    @SerializedName("view_id")
    private String viewId;

    // builder 开始
    public GetAppTableViewReq() {
    }

    public GetAppTableViewReq(Builder builder) {
        /**
         * bitable app token
         * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
         */
        this.appToken = builder.appToken;
        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         */
        this.tableId = builder.tableId;
        /**
         * 视图 ID
         * <p> 示例值：vewTpR1urY
         */
        this.viewId = builder.viewId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public static class Builder {

        private String appToken; // bitable app token
        private String tableId; // table id
        private String viewId; // 视图 ID

        /**
         * bitable app token
         * <p> 示例值：bascnCMII2ORej2RItqpZZUNMIe
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }


        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }


        /**
         * 视图 ID
         * <p> 示例值：vewTpR1urY
         *
         * @param viewId
         * @return
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        public GetAppTableViewReq build() {
            return new GetAppTableViewReq(this);
        }
    }
}
