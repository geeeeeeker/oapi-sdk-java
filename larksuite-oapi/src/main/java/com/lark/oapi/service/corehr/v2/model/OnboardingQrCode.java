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

public class OnboardingQrCode {
    /**
     * 唯一键
     * <p> 示例值：345241
     */
    @SerializedName("id")
    private String id;
    /**
     * 二维码图片链接,文件名区分语言
     * <p> 示例值：
     */
    @SerializedName("pngs")
    private String[] pngs;
    /**
     * 二维码值链接
     * <p> 示例值：xxxxx
     */
    @SerializedName("url")
    private String url;
    /**
     * 有效性
     * <p> 示例值：xxx
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 创建人
     * <p> 示例值：xxxxx
     */
    @SerializedName("created_by")
    private String createdBy;
    /**
     * 更新人
     * <p> 示例值：xxxxx
     */
    @SerializedName("updated_by")
    private String updatedBy;
    /**
     * 创建时间
     * <p> 示例值：xxxxxx
     */
    @SerializedName("created_at")
    private Integer createdAt;
    /**
     * 更新时间
     * <p> 示例值：xxxxx
     */
    @SerializedName("updated_at")
    private Integer updatedAt;
    /**
     * 维度值列表
     * <p> 示例值：
     */
    @SerializedName("dimension_values")
    private QrCodeDimensionValue[] dimensionValues;

    // builder 开始
    public OnboardingQrCode() {
    }

    public OnboardingQrCode(Builder builder) {
        /**
         * 唯一键
         * <p> 示例值：345241
         */
        this.id = builder.id;
        /**
         * 二维码图片链接,文件名区分语言
         * <p> 示例值：
         */
        this.pngs = builder.pngs;
        /**
         * 二维码值链接
         * <p> 示例值：xxxxx
         */
        this.url = builder.url;
        /**
         * 有效性
         * <p> 示例值：xxx
         */
        this.active = builder.active;
        /**
         * 创建人
         * <p> 示例值：xxxxx
         */
        this.createdBy = builder.createdBy;
        /**
         * 更新人
         * <p> 示例值：xxxxx
         */
        this.updatedBy = builder.updatedBy;
        /**
         * 创建时间
         * <p> 示例值：xxxxxx
         */
        this.createdAt = builder.createdAt;
        /**
         * 更新时间
         * <p> 示例值：xxxxx
         */
        this.updatedAt = builder.updatedAt;
        /**
         * 维度值列表
         * <p> 示例值：
         */
        this.dimensionValues = builder.dimensionValues;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getPngs() {
        return this.pngs;
    }

    public void setPngs(String[] pngs) {
        this.pngs = pngs;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public QrCodeDimensionValue[] getDimensionValues() {
        return this.dimensionValues;
    }

    public void setDimensionValues(QrCodeDimensionValue[] dimensionValues) {
        this.dimensionValues = dimensionValues;
    }

    public static class Builder {
        /**
         * 唯一键
         * <p> 示例值：345241
         */
        private String id;
        /**
         * 二维码图片链接,文件名区分语言
         * <p> 示例值：
         */
        private String[] pngs;
        /**
         * 二维码值链接
         * <p> 示例值：xxxxx
         */
        private String url;
        /**
         * 有效性
         * <p> 示例值：xxx
         */
        private Boolean active;
        /**
         * 创建人
         * <p> 示例值：xxxxx
         */
        private String createdBy;
        /**
         * 更新人
         * <p> 示例值：xxxxx
         */
        private String updatedBy;
        /**
         * 创建时间
         * <p> 示例值：xxxxxx
         */
        private Integer createdAt;
        /**
         * 更新时间
         * <p> 示例值：xxxxx
         */
        private Integer updatedAt;
        /**
         * 维度值列表
         * <p> 示例值：
         */
        private QrCodeDimensionValue[] dimensionValues;

        /**
         * 唯一键
         * <p> 示例值：345241
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 二维码图片链接,文件名区分语言
         * <p> 示例值：
         *
         * @param pngs
         * @return
         */
        public Builder pngs(String[] pngs) {
            this.pngs = pngs;
            return this;
        }


        /**
         * 二维码值链接
         * <p> 示例值：xxxxx
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * 有效性
         * <p> 示例值：xxx
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 创建人
         * <p> 示例值：xxxxx
         *
         * @param createdBy
         * @return
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        /**
         * 更新人
         * <p> 示例值：xxxxx
         *
         * @param updatedBy
         * @return
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }


        /**
         * 创建时间
         * <p> 示例值：xxxxxx
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(Integer createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        /**
         * 更新时间
         * <p> 示例值：xxxxx
         *
         * @param updatedAt
         * @return
         */
        public Builder updatedAt(Integer updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        /**
         * 维度值列表
         * <p> 示例值：
         *
         * @param dimensionValues
         * @return
         */
        public Builder dimensionValues(QrCodeDimensionValue[] dimensionValues) {
            this.dimensionValues = dimensionValues;
            return this;
        }


        public OnboardingQrCode build() {
            return new OnboardingQrCode(this);
        }
    }
}
