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

public class NumberSetting {
    /**
     * 数字展示的格式
     * <p> 示例值：normal
     */
    @SerializedName("format")
    private String format;
    /**
     * 自定义符号。只有`format`设为custom时才会生效。
     * <p> 示例值：自定义符号
     */
    @SerializedName("custom_symbol")
    private String customSymbol;
    /**
     * 自定义符号显示的位置。
     * <p> 示例值：left
     */
    @SerializedName("custom_symbol_position")
    private String customSymbolPosition;
    /**
     * 分隔符样式
     * <p> 示例值：thousand
     */
    @SerializedName("separator")
    private String separator;
    /**
     * 保留小数位数。输入的数字值的小数位数如果比该设置多，多余的位数将被四舍五入后舍弃。如果`format`为"percentage"，表示变为百分数之后的小数位数。
     * <p> 示例值：2
     */
    @SerializedName("decimal_count")
    private Integer decimalCount;

    // builder 开始
    public NumberSetting() {
    }

    public NumberSetting(Builder builder) {
        /**
         * 数字展示的格式
         * <p> 示例值：normal
         */
        this.format = builder.format;
        /**
         * 自定义符号。只有`format`设为custom时才会生效。
         * <p> 示例值：自定义符号
         */
        this.customSymbol = builder.customSymbol;
        /**
         * 自定义符号显示的位置。
         * <p> 示例值：left
         */
        this.customSymbolPosition = builder.customSymbolPosition;
        /**
         * 分隔符样式
         * <p> 示例值：thousand
         */
        this.separator = builder.separator;
        /**
         * 保留小数位数。输入的数字值的小数位数如果比该设置多，多余的位数将被四舍五入后舍弃。如果`format`为"percentage"，表示变为百分数之后的小数位数。
         * <p> 示例值：2
         */
        this.decimalCount = builder.decimalCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCustomSymbol() {
        return this.customSymbol;
    }

    public void setCustomSymbol(String customSymbol) {
        this.customSymbol = customSymbol;
    }

    public String getCustomSymbolPosition() {
        return this.customSymbolPosition;
    }

    public void setCustomSymbolPosition(String customSymbolPosition) {
        this.customSymbolPosition = customSymbolPosition;
    }

    public String getSeparator() {
        return this.separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public Integer getDecimalCount() {
        return this.decimalCount;
    }

    public void setDecimalCount(Integer decimalCount) {
        this.decimalCount = decimalCount;
    }

    public static class Builder {
        /**
         * 数字展示的格式
         * <p> 示例值：normal
         */
        private String format;
        /**
         * 自定义符号。只有`format`设为custom时才会生效。
         * <p> 示例值：自定义符号
         */
        private String customSymbol;
        /**
         * 自定义符号显示的位置。
         * <p> 示例值：left
         */
        private String customSymbolPosition;
        /**
         * 分隔符样式
         * <p> 示例值：thousand
         */
        private String separator;
        /**
         * 保留小数位数。输入的数字值的小数位数如果比该设置多，多余的位数将被四舍五入后舍弃。如果`format`为"percentage"，表示变为百分数之后的小数位数。
         * <p> 示例值：2
         */
        private Integer decimalCount;

        /**
         * 数字展示的格式
         * <p> 示例值：normal
         *
         * @param format
         * @return
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * 数字展示的格式
         * <p> 示例值：normal
         *
         * @param format {@link com.lark.oapi.service.task.v2.enums.NumberSettingFormatEnum}
         * @return
         */
        public Builder format(com.lark.oapi.service.task.v2.enums.NumberSettingFormatEnum format) {
            this.format = format.getValue();
            return this;
        }


        /**
         * 自定义符号。只有`format`设为custom时才会生效。
         * <p> 示例值：自定义符号
         *
         * @param customSymbol
         * @return
         */
        public Builder customSymbol(String customSymbol) {
            this.customSymbol = customSymbol;
            return this;
        }


        /**
         * 自定义符号显示的位置。
         * <p> 示例值：left
         *
         * @param customSymbolPosition
         * @return
         */
        public Builder customSymbolPosition(String customSymbolPosition) {
            this.customSymbolPosition = customSymbolPosition;
            return this;
        }

        /**
         * 自定义符号显示的位置。
         * <p> 示例值：left
         *
         * @param customSymbolPosition {@link com.lark.oapi.service.task.v2.enums.NumberSettingCustomSymbolPositionEnum}
         * @return
         */
        public Builder customSymbolPosition(com.lark.oapi.service.task.v2.enums.NumberSettingCustomSymbolPositionEnum customSymbolPosition) {
            this.customSymbolPosition = customSymbolPosition.getValue();
            return this;
        }


        /**
         * 分隔符样式
         * <p> 示例值：thousand
         *
         * @param separator
         * @return
         */
        public Builder separator(String separator) {
            this.separator = separator;
            return this;
        }

        /**
         * 分隔符样式
         * <p> 示例值：thousand
         *
         * @param separator {@link com.lark.oapi.service.task.v2.enums.NumberSettingSeparatorEnum}
         * @return
         */
        public Builder separator(com.lark.oapi.service.task.v2.enums.NumberSettingSeparatorEnum separator) {
            this.separator = separator.getValue();
            return this;
        }


        /**
         * 保留小数位数。输入的数字值的小数位数如果比该设置多，多余的位数将被四舍五入后舍弃。如果`format`为"percentage"，表示变为百分数之后的小数位数。
         * <p> 示例值：2
         *
         * @param decimalCount
         * @return
         */
        public Builder decimalCount(Integer decimalCount) {
            this.decimalCount = decimalCount;
            return this;
        }


        public NumberSetting build() {
            return new NumberSetting(this);
        }
    }
}
