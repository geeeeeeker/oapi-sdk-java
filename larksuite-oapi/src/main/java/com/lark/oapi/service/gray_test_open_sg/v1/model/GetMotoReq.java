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

package com.lark.oapi.service.gray_test_open_sg.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class GetMotoReq {
    /**
     * desc
     * <p> 示例值：1234
     */
    @Query
    @SerializedName("body_level")
    private String bodyLevel;
    /**
     * desc33333
     * <p> 示例值：1234
     */
    @Path
    @SerializedName("moto_id")
    private String motoId;

    // builder 开始
    public GetMotoReq() {
    }

    public GetMotoReq(Builder builder) {
        /**
         * desc
         * <p> 示例值：1234
         */
        this.bodyLevel = builder.bodyLevel;
        /**
         * desc33333
         * <p> 示例值：1234
         */
        this.motoId = builder.motoId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBodyLevel() {
        return this.bodyLevel;
    }

    public void setBodyLevel(String bodyLevel) {
        this.bodyLevel = bodyLevel;
    }

    public String getMotoId() {
        return this.motoId;
    }

    public void setMotoId(String motoId) {
        this.motoId = motoId;
    }

    public static class Builder {
        private String bodyLevel; // desc
        private String motoId; // desc33333

        /**
         * desc
         * <p> 示例值：1234
         *
         * @param bodyLevel
         * @return
         */
        public Builder bodyLevel(String bodyLevel) {
            this.bodyLevel = bodyLevel;
            return this;
        }

        /**
         * desc33333
         * <p> 示例值：1234
         *
         * @param motoId
         * @return
         */
        public Builder motoId(String motoId) {
            this.motoId = motoId;
            return this;
        }

        public GetMotoReq build() {
            return new GetMotoReq(this);
        }
    }
}
