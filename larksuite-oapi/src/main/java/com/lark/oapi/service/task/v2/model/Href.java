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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
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

public class Href {
    /**
     * 链接对应的地址
     * <p> 示例值：https://www.example.com
     */
    @SerializedName("url")
    private String url;
    /**
     * 链接对应的标题
     * <p> 示例值：反馈一个问题，需要协助排查
     */
    @SerializedName("title")
    private String title;

    // builder 开始
    public Href() {
    }

    public Href(Builder builder) {
        /**
         * 链接对应的地址
         * <p> 示例值：https://www.example.com
         */
        this.url = builder.url;
        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         */
        this.title = builder.title;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class Builder {
        /**
         * 链接对应的地址
         * <p> 示例值：https://www.example.com
         */
        private String url;
        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         */
        private String title;

        /**
         * 链接对应的地址
         * <p> 示例值：https://www.example.com
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 链接对应的标题
         * <p> 示例值：反馈一个问题，需要协助排查
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        public Href build() {
            return new Href(this);
        }
    }
}
