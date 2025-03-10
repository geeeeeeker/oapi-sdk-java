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

package com.lark.oapi.service.search.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.search.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class BatchItemResult {
    /**
     * 数据项ID，对应一条索引数据的ID
     * <p> 示例值：
     */
    @SerializedName("item_id")
    private String itemId;
    /**
     * 判断单条数据是否成功
     * <p> 示例值：
     */
    @SerializedName("is_success")
    private Boolean isSuccess;
    /**
     * 如果单条数据失败，表示单条数据的错误信息；如果单条数据成功被索引，则err是空字符串
     * <p> 示例值：
     */
    @SerializedName("err")
    private String err;

    // builder 开始
    public BatchItemResult() {
    }

    public BatchItemResult(Builder builder) {
        /**
         * 数据项ID，对应一条索引数据的ID
         * <p> 示例值：
         */
        this.itemId = builder.itemId;
        /**
         * 判断单条数据是否成功
         * <p> 示例值：
         */
        this.isSuccess = builder.isSuccess;
        /**
         * 如果单条数据失败，表示单条数据的错误信息；如果单条数据成功被索引，则err是空字符串
         * <p> 示例值：
         */
        this.err = builder.err;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getErr() {
        return this.err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public static class Builder {
        /**
         * 数据项ID，对应一条索引数据的ID
         * <p> 示例值：
         */
        private String itemId;
        /**
         * 判断单条数据是否成功
         * <p> 示例值：
         */
        private Boolean isSuccess;
        /**
         * 如果单条数据失败，表示单条数据的错误信息；如果单条数据成功被索引，则err是空字符串
         * <p> 示例值：
         */
        private String err;

        /**
         * 数据项ID，对应一条索引数据的ID
         * <p> 示例值：
         *
         * @param itemId
         * @return
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }


        /**
         * 判断单条数据是否成功
         * <p> 示例值：
         *
         * @param isSuccess
         * @return
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }


        /**
         * 如果单条数据失败，表示单条数据的错误信息；如果单条数据成功被索引，则err是空字符串
         * <p> 示例值：
         *
         * @param err
         * @return
         */
        public Builder err(String err) {
            this.err = err;
            return this;
        }


        public BatchItemResult build() {
            return new BatchItemResult(this);
        }
    }
}
