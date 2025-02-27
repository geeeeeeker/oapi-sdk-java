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

public class SignatureTemplateContentItem {
    /**
     * 电子签模版内容的类型
     * <p> 示例值：
     */
    @SerializedName("content_type")
    private Enum contentType;
    /**
     * 显示规则左值
     * <p> 示例值：111
     */
    @SerializedName("filter_apiname")
    private String filterApiname;
    /**
     * 模版内容
     * <p> 示例值：111
     */
    @SerializedName("content")
    private String content;
    /**
     * 中英文描述
     * <p> 示例值：
     */
    @SerializedName("label")
    private I18n[] label;
    /**
     * 内容描述
     * <p> 示例值：111
     */
    @SerializedName("content_desc")
    private String contentDesc;

    // builder 开始
    public SignatureTemplateContentItem() {
    }

    public SignatureTemplateContentItem(Builder builder) {
        /**
         * 电子签模版内容的类型
         * <p> 示例值：
         */
        this.contentType = builder.contentType;
        /**
         * 显示规则左值
         * <p> 示例值：111
         */
        this.filterApiname = builder.filterApiname;
        /**
         * 模版内容
         * <p> 示例值：111
         */
        this.content = builder.content;
        /**
         * 中英文描述
         * <p> 示例值：
         */
        this.label = builder.label;
        /**
         * 内容描述
         * <p> 示例值：111
         */
        this.contentDesc = builder.contentDesc;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Enum getContentType() {
        return this.contentType;
    }

    public void setContentType(Enum contentType) {
        this.contentType = contentType;
    }

    public String getFilterApiname() {
        return this.filterApiname;
    }

    public void setFilterApiname(String filterApiname) {
        this.filterApiname = filterApiname;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public I18n[] getLabel() {
        return this.label;
    }

    public void setLabel(I18n[] label) {
        this.label = label;
    }

    public String getContentDesc() {
        return this.contentDesc;
    }

    public void setContentDesc(String contentDesc) {
        this.contentDesc = contentDesc;
    }

    public static class Builder {
        /**
         * 电子签模版内容的类型
         * <p> 示例值：
         */
        private Enum contentType;
        /**
         * 显示规则左值
         * <p> 示例值：111
         */
        private String filterApiname;
        /**
         * 模版内容
         * <p> 示例值：111
         */
        private String content;
        /**
         * 中英文描述
         * <p> 示例值：
         */
        private I18n[] label;
        /**
         * 内容描述
         * <p> 示例值：111
         */
        private String contentDesc;

        /**
         * 电子签模版内容的类型
         * <p> 示例值：
         *
         * @param contentType
         * @return
         */
        public Builder contentType(Enum contentType) {
            this.contentType = contentType;
            return this;
        }


        /**
         * 显示规则左值
         * <p> 示例值：111
         *
         * @param filterApiname
         * @return
         */
        public Builder filterApiname(String filterApiname) {
            this.filterApiname = filterApiname;
            return this;
        }


        /**
         * 模版内容
         * <p> 示例值：111
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 中英文描述
         * <p> 示例值：
         *
         * @param label
         * @return
         */
        public Builder label(I18n[] label) {
            this.label = label;
            return this;
        }


        /**
         * 内容描述
         * <p> 示例值：111
         *
         * @param contentDesc
         * @return
         */
        public Builder contentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }


        public SignatureTemplateContentItem build() {
            return new SignatureTemplateContentItem(this);
        }
    }
}
