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

package com.lark.oapi.service.drive.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.drive.v1.enums.*;
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

public class UploadPartMediaReqBody {
    /**
     * 分片上传事务ID。
     * <p> 示例值：7111211691345512356
     */
    @SerializedName("upload_id")
    private String uploadId;
    /**
     * 块号，从0开始计数。
     * <p> 示例值：0
     */
    @SerializedName("seq")
    private Integer seq;
    /**
     * 块大小（以字节为单位）。
     * <p> 示例值：4194304
     */
    @SerializedName("size")
    private Integer size;
    /**
     * 文件分块adler32校验和(可选)。
     * <p> 示例值：12345678
     */
    @SerializedName("checksum")
    private String checksum;
    /**
     * 文件分片二进制内容。
     * <p> 示例值：file binary
     */
    @SerializedName("file")
    private java.io.File file;

    // builder 开始
    public UploadPartMediaReqBody() {
    }

    public UploadPartMediaReqBody(Builder builder) {
        /**
         * 分片上传事务ID。
         * <p> 示例值：7111211691345512356
         */
        this.uploadId = builder.uploadId;
        /**
         * 块号，从0开始计数。
         * <p> 示例值：0
         */
        this.seq = builder.seq;
        /**
         * 块大小（以字节为单位）。
         * <p> 示例值：4194304
         */
        this.size = builder.size;
        /**
         * 文件分块adler32校验和(可选)。
         * <p> 示例值：12345678
         */
        this.checksum = builder.checksum;
        /**
         * 文件分片二进制内容。
         * <p> 示例值：file binary
         */
        this.file = builder.file;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public java.io.File getFile() {
        return this.file;
    }

    public void setFile(java.io.File file) {
        this.file = file;
    }

    public static class Builder {
        /**
         * 分片上传事务ID。
         * <p> 示例值：7111211691345512356
         */
        private String uploadId;
        /**
         * 块号，从0开始计数。
         * <p> 示例值：0
         */
        private Integer seq;
        /**
         * 块大小（以字节为单位）。
         * <p> 示例值：4194304
         */
        private Integer size;
        /**
         * 文件分块adler32校验和(可选)。
         * <p> 示例值：12345678
         */
        private String checksum;
        /**
         * 文件分片二进制内容。
         * <p> 示例值：file binary
         */
        private java.io.File file;

        /**
         * 分片上传事务ID。
         * <p> 示例值：7111211691345512356
         *
         * @param uploadId
         * @return
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }


        /**
         * 块号，从0开始计数。
         * <p> 示例值：0
         *
         * @param seq
         * @return
         */
        public Builder seq(Integer seq) {
            this.seq = seq;
            return this;
        }


        /**
         * 块大小（以字节为单位）。
         * <p> 示例值：4194304
         *
         * @param size
         * @return
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }


        /**
         * 文件分块adler32校验和(可选)。
         * <p> 示例值：12345678
         *
         * @param checksum
         * @return
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }


        /**
         * 文件分片二进制内容。
         * <p> 示例值：file binary
         *
         * @param file
         * @return
         */
        public Builder file(java.io.File file) {
            this.file = file;
            return this;
        }


        public UploadPartMediaReqBody build() {
            return new UploadPartMediaReqBody(this);
        }
    }
}
