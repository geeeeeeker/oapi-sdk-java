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

package com.lark.oapi.service.document_ai.v1.model;

import com.google.gson.annotations.SerializedName;

public class ExtractCopy {
    /**
     * 盖章份数
     * <p> 示例值：2
     */
    @SerializedName("copy_num")
    private Integer copyNum;
    /**
     * 从原文中抽取的盖章份数
     * <p> 示例值：一式贰份
     */
    @SerializedName("original_copy")
    private String originalCopy;
    /**
     * 盖章文件类型
     * <p> 示例值：协议
     */
    @SerializedName("key")
    private String key;
    /**
     * 原文有关盖章份数的描述
     * <p> 示例值：此协议一式贰份，双方各执壹份，具有同等法律效力。
     */
    @SerializedName("text")
    private String text;

    // builder 开始
    public ExtractCopy() {
    }

    public ExtractCopy(Builder builder) {
        /**
         * 盖章份数
         * <p> 示例值：2
         */
        this.copyNum = builder.copyNum;
        /**
         * 从原文中抽取的盖章份数
         * <p> 示例值：一式贰份
         */
        this.originalCopy = builder.originalCopy;
        /**
         * 盖章文件类型
         * <p> 示例值：协议
         */
        this.key = builder.key;
        /**
         * 原文有关盖章份数的描述
         * <p> 示例值：此协议一式贰份，双方各执壹份，具有同等法律效力。
         */
        this.text = builder.text;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getCopyNum() {
        return this.copyNum;
    }

    public void setCopyNum(Integer copyNum) {
        this.copyNum = copyNum;
    }

    public String getOriginalCopy() {
        return this.originalCopy;
    }

    public void setOriginalCopy(String originalCopy) {
        this.originalCopy = originalCopy;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static class Builder {
        /**
         * 盖章份数
         * <p> 示例值：2
         */
        private Integer copyNum;
        /**
         * 从原文中抽取的盖章份数
         * <p> 示例值：一式贰份
         */
        private String originalCopy;
        /**
         * 盖章文件类型
         * <p> 示例值：协议
         */
        private String key;
        /**
         * 原文有关盖章份数的描述
         * <p> 示例值：此协议一式贰份，双方各执壹份，具有同等法律效力。
         */
        private String text;

        /**
         * 盖章份数
         * <p> 示例值：2
         *
         * @param copyNum
         * @return
         */
        public Builder copyNum(Integer copyNum) {
            this.copyNum = copyNum;
            return this;
        }


        /**
         * 从原文中抽取的盖章份数
         * <p> 示例值：一式贰份
         *
         * @param originalCopy
         * @return
         */
        public Builder originalCopy(String originalCopy) {
            this.originalCopy = originalCopy;
            return this;
        }


        /**
         * 盖章文件类型
         * <p> 示例值：协议
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 原文有关盖章份数的描述
         * <p> 示例值：此协议一式贰份，双方各执壹份，具有同等法律效力。
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        public ExtractCopy build() {
            return new ExtractCopy(this);
        }
    }
}