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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class SearchContractReqBody {
    /**
     * 雇佣 ID 列表
     * <p> 示例值：
     */
    @SerializedName("employment_id_list")
    private String[] employmentIdList;
    /**
     * 合同ID列表
     * <p> 示例值：
     */
    @SerializedName("contract_id_list")
    private String[] contractIdList;

    // builder 开始
    public SearchContractReqBody() {
    }

    public SearchContractReqBody(Builder builder) {
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        this.employmentIdList = builder.employmentIdList;
        /**
         * 合同ID列表
         * <p> 示例值：
         */
        this.contractIdList = builder.contractIdList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getEmploymentIdList() {
        return this.employmentIdList;
    }

    public void setEmploymentIdList(String[] employmentIdList) {
        this.employmentIdList = employmentIdList;
    }

    public String[] getContractIdList() {
        return this.contractIdList;
    }

    public void setContractIdList(String[] contractIdList) {
        this.contractIdList = contractIdList;
    }

    public static class Builder {
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        private String[] employmentIdList;
        /**
         * 合同ID列表
         * <p> 示例值：
         */
        private String[] contractIdList;

        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         *
         * @param employmentIdList
         * @return
         */
        public Builder employmentIdList(String[] employmentIdList) {
            this.employmentIdList = employmentIdList;
            return this;
        }


        /**
         * 合同ID列表
         * <p> 示例值：
         *
         * @param contractIdList
         * @return
         */
        public Builder contractIdList(String[] contractIdList) {
            this.contractIdList = contractIdList;
            return this;
        }


        public SearchContractReqBody build() {
            return new SearchContractReqBody(this);
        }
    }
}
