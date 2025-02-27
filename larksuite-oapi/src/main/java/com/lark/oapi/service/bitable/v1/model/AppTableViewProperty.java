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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class AppTableViewProperty {
    /**
     * 过滤条件
     * <p> 示例值：
     */
    @SerializedName("filter_info")
    private AppTableViewPropertyFilterInfo filterInfo;
    /**
     * 隐藏字段ID列表
     * <p> 示例值：["fldCGzANXx", "fldCGzANXx"]
     */
    @SerializedName("hidden_fields")
    private String[] hiddenFields;
    /**
     * 表格视图层级结构设置
     * <p> 示例值：
     */
    @SerializedName("hierarchy_config")
    private AppTableViewPropertyHierarchyConfig hierarchyConfig;

    // builder 开始
    public AppTableViewProperty() {
    }

    public AppTableViewProperty(Builder builder) {
        /**
         * 过滤条件
         * <p> 示例值：
         */
        this.filterInfo = builder.filterInfo;
        /**
         * 隐藏字段ID列表
         * <p> 示例值：["fldCGzANXx", "fldCGzANXx"]
         */
        this.hiddenFields = builder.hiddenFields;
        /**
         * 表格视图层级结构设置
         * <p> 示例值：
         */
        this.hierarchyConfig = builder.hierarchyConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public AppTableViewPropertyFilterInfo getFilterInfo() {
        return this.filterInfo;
    }

    public void setFilterInfo(AppTableViewPropertyFilterInfo filterInfo) {
        this.filterInfo = filterInfo;
    }

    public String[] getHiddenFields() {
        return this.hiddenFields;
    }

    public void setHiddenFields(String[] hiddenFields) {
        this.hiddenFields = hiddenFields;
    }

    public AppTableViewPropertyHierarchyConfig getHierarchyConfig() {
        return this.hierarchyConfig;
    }

    public void setHierarchyConfig(AppTableViewPropertyHierarchyConfig hierarchyConfig) {
        this.hierarchyConfig = hierarchyConfig;
    }

    public static class Builder {
        /**
         * 过滤条件
         * <p> 示例值：
         */
        private AppTableViewPropertyFilterInfo filterInfo;
        /**
         * 隐藏字段ID列表
         * <p> 示例值：["fldCGzANXx", "fldCGzANXx"]
         */
        private String[] hiddenFields;
        /**
         * 表格视图层级结构设置
         * <p> 示例值：
         */
        private AppTableViewPropertyHierarchyConfig hierarchyConfig;

        /**
         * 过滤条件
         * <p> 示例值：
         *
         * @param filterInfo
         * @return
         */
        public Builder filterInfo(AppTableViewPropertyFilterInfo filterInfo) {
            this.filterInfo = filterInfo;
            return this;
        }


        /**
         * 隐藏字段ID列表
         * <p> 示例值：["fldCGzANXx", "fldCGzANXx"]
         *
         * @param hiddenFields
         * @return
         */
        public Builder hiddenFields(String[] hiddenFields) {
            this.hiddenFields = hiddenFields;
            return this;
        }


        /**
         * 表格视图层级结构设置
         * <p> 示例值：
         *
         * @param hierarchyConfig
         * @return
         */
        public Builder hierarchyConfig(AppTableViewPropertyHierarchyConfig hierarchyConfig) {
            this.hierarchyConfig = hierarchyConfig;
            return this;
        }


        public AppTableViewProperty build() {
            return new AppTableViewProperty(this);
        }
    }
}
