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

public class SignatureTemplateFilter {
    /**
     * 双语描述
     * <p> 示例值：
     */
    @SerializedName("label")
    private I18n[] label;
    /**
     * 主数据apiname
     * <p> 示例值：status
     */
    @SerializedName("apiname")
    private String apiname;
    /**
     * 过滤条件列表
     * <p> 示例值：
     */
    @SerializedName("filters")
    private SignatureTemplateFilterItem[] filters;
    /**
     * 多个生效条件的logic
     * <p> 示例值：
     */
    @SerializedName("logic")
    private Enum logic;
    /**
     * 是否被校验
     * <p> 示例值：
     */
    @SerializedName("is_checked")
    private Boolean isChecked;
    /**
     * 过滤条件描述
     * <p> 示例值：desc
     */
    @SerializedName("filter_desc")
    private String filterDesc;
    /**
     * 过滤条件列表，使用string类型描述list的原因是为了避免循环引用问题，因为该list的item类型就是这个数据类型
     * <p> 示例值：[]
     */
    @SerializedName("criterion_list")
    private String criterionList;

    // builder 开始
    public SignatureTemplateFilter() {
    }

    public SignatureTemplateFilter(Builder builder) {
        /**
         * 双语描述
         * <p> 示例值：
         */
        this.label = builder.label;
        /**
         * 主数据apiname
         * <p> 示例值：status
         */
        this.apiname = builder.apiname;
        /**
         * 过滤条件列表
         * <p> 示例值：
         */
        this.filters = builder.filters;
        /**
         * 多个生效条件的logic
         * <p> 示例值：
         */
        this.logic = builder.logic;
        /**
         * 是否被校验
         * <p> 示例值：
         */
        this.isChecked = builder.isChecked;
        /**
         * 过滤条件描述
         * <p> 示例值：desc
         */
        this.filterDesc = builder.filterDesc;
        /**
         * 过滤条件列表，使用string类型描述list的原因是为了避免循环引用问题，因为该list的item类型就是这个数据类型
         * <p> 示例值：[]
         */
        this.criterionList = builder.criterionList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public I18n[] getLabel() {
        return this.label;
    }

    public void setLabel(I18n[] label) {
        this.label = label;
    }

    public String getApiname() {
        return this.apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public SignatureTemplateFilterItem[] getFilters() {
        return this.filters;
    }

    public void setFilters(SignatureTemplateFilterItem[] filters) {
        this.filters = filters;
    }

    public Enum getLogic() {
        return this.logic;
    }

    public void setLogic(Enum logic) {
        this.logic = logic;
    }

    public Boolean getIsChecked() {
        return this.isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getFilterDesc() {
        return this.filterDesc;
    }

    public void setFilterDesc(String filterDesc) {
        this.filterDesc = filterDesc;
    }

    public String getCriterionList() {
        return this.criterionList;
    }

    public void setCriterionList(String criterionList) {
        this.criterionList = criterionList;
    }

    public static class Builder {
        /**
         * 双语描述
         * <p> 示例值：
         */
        private I18n[] label;
        /**
         * 主数据apiname
         * <p> 示例值：status
         */
        private String apiname;
        /**
         * 过滤条件列表
         * <p> 示例值：
         */
        private SignatureTemplateFilterItem[] filters;
        /**
         * 多个生效条件的logic
         * <p> 示例值：
         */
        private Enum logic;
        /**
         * 是否被校验
         * <p> 示例值：
         */
        private Boolean isChecked;
        /**
         * 过滤条件描述
         * <p> 示例值：desc
         */
        private String filterDesc;
        /**
         * 过滤条件列表，使用string类型描述list的原因是为了避免循环引用问题，因为该list的item类型就是这个数据类型
         * <p> 示例值：[]
         */
        private String criterionList;

        /**
         * 双语描述
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
         * 主数据apiname
         * <p> 示例值：status
         *
         * @param apiname
         * @return
         */
        public Builder apiname(String apiname) {
            this.apiname = apiname;
            return this;
        }


        /**
         * 过滤条件列表
         * <p> 示例值：
         *
         * @param filters
         * @return
         */
        public Builder filters(SignatureTemplateFilterItem[] filters) {
            this.filters = filters;
            return this;
        }


        /**
         * 多个生效条件的logic
         * <p> 示例值：
         *
         * @param logic
         * @return
         */
        public Builder logic(Enum logic) {
            this.logic = logic;
            return this;
        }


        /**
         * 是否被校验
         * <p> 示例值：
         *
         * @param isChecked
         * @return
         */
        public Builder isChecked(Boolean isChecked) {
            this.isChecked = isChecked;
            return this;
        }


        /**
         * 过滤条件描述
         * <p> 示例值：desc
         *
         * @param filterDesc
         * @return
         */
        public Builder filterDesc(String filterDesc) {
            this.filterDesc = filterDesc;
            return this;
        }


        /**
         * 过滤条件列表，使用string类型描述list的原因是为了避免循环引用问题，因为该list的item类型就是这个数据类型
         * <p> 示例值：[]
         *
         * @param criterionList
         * @return
         */
        public Builder criterionList(String criterionList) {
            this.criterionList = criterionList;
            return this;
        }


        public SignatureTemplateFilter build() {
            return new SignatureTemplateFilter(this);
        }
    }
}
