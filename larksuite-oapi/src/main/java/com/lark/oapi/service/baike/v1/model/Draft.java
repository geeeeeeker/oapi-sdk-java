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

package com.lark.oapi.service.baike.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.baike.v1.enums.*;
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

public class Draft {
    /**
     * 草稿 ID
     * <p> 示例值：42322
     */
    @SerializedName("draft_id")
    private String draftId;
    /**
     * 词条信息
     * <p> 示例值：
     */
    @SerializedName("entity")
    private Entity entity;

    // builder 开始
    public Draft() {
    }

    public Draft(Builder builder) {
        /**
         * 草稿 ID
         * <p> 示例值：42322
         */
        this.draftId = builder.draftId;
        /**
         * 词条信息
         * <p> 示例值：
         */
        this.entity = builder.entity;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDraftId() {
        return this.draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }

    public Entity getEntity() {
        return this.entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public static class Builder {
        /**
         * 草稿 ID
         * <p> 示例值：42322
         */
        private String draftId;
        /**
         * 词条信息
         * <p> 示例值：
         */
        private Entity entity;

        /**
         * 草稿 ID
         * <p> 示例值：42322
         *
         * @param draftId
         * @return
         */
        public Builder draftId(String draftId) {
            this.draftId = draftId;
            return this;
        }


        /**
         * 词条信息
         * <p> 示例值：
         *
         * @param entity
         * @return
         */
        public Builder entity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public Draft build() {
            return new Draft(this);
        }
    }
}
