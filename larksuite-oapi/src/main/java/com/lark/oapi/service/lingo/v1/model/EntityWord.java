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

package com.lark.oapi.service.lingo.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.lingo.v1.enums.*;
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

public class EntityWord {
    /**
     * 抽取出的词条名
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 词条可能的推荐别名
     * <p> 示例值：
     */
    @SerializedName("aliases")
    private String[] aliases;

    // builder 开始
    public EntityWord() {
    }

    public EntityWord(Builder builder) {
        /**
         * 抽取出的词条名
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 词条可能的推荐别名
         * <p> 示例值：
         */
        this.aliases = builder.aliases;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAliases() {
        return this.aliases;
    }

    public void setAliases(String[] aliases) {
        this.aliases = aliases;
    }

    public static class Builder {
        /**
         * 抽取出的词条名
         * <p> 示例值：
         */
        private String name;
        /**
         * 词条可能的推荐别名
         * <p> 示例值：
         */
        private String[] aliases;

        /**
         * 抽取出的词条名
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 词条可能的推荐别名
         * <p> 示例值：
         *
         * @param aliases
         * @return
         */
        public Builder aliases(String[] aliases) {
            this.aliases = aliases;
            return this;
        }


        public EntityWord build() {
            return new EntityWord(this);
        }
    }
}
