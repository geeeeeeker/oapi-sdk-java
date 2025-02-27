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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class LeaveType {
    /**
     * 假期类型ID
     * <p> 示例值：4718803945687580505
     */
    @SerializedName("leave_type_id")
    private String leaveTypeId;
    /**
     * 假期类型名称
     * <p> 示例值：
     */
    @SerializedName("leave_type_name")
    private I18n[] leaveTypeName;
    /**
     * 假期类型状态;;可选值有：;;- 1：已启用;;- 2：已停用
     * <p> 示例值：2
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 假期子类列表
     * <p> 示例值：
     */
    @SerializedName("leave_subtype_list")
    private LeaveSubtype[] leaveSubtypeList;
    /**
     * 假期类型的创建时间
     * <p> 示例值：1658730384
     */
    @SerializedName("created_at")
    private String createdAt;
    /**
     * 假期类型的创建人，值为创建人的员工 ID
     * <p> 示例值：7104164629974646786
     */
    @SerializedName("created_by")
    private String createdBy;
    /**
     * 假期类型的更新时间
     * <p> 示例值：1658996995
     */
    @SerializedName("updated_at")
    private String updatedAt;
    /**
     * 假期类型的更新人，值为更新人的员工 ID
     * <p> 示例值：7112112899636854812
     */
    @SerializedName("updated_by")
    private String updatedBy;

    // builder 开始
    public LeaveType() {
    }

    public LeaveType(Builder builder) {
        /**
         * 假期类型ID
         * <p> 示例值：4718803945687580505
         */
        this.leaveTypeId = builder.leaveTypeId;
        /**
         * 假期类型名称
         * <p> 示例值：
         */
        this.leaveTypeName = builder.leaveTypeName;
        /**
         * 假期类型状态;;可选值有：;;- 1：已启用;;- 2：已停用
         * <p> 示例值：2
         */
        this.status = builder.status;
        /**
         * 假期子类列表
         * <p> 示例值：
         */
        this.leaveSubtypeList = builder.leaveSubtypeList;
        /**
         * 假期类型的创建时间
         * <p> 示例值：1658730384
         */
        this.createdAt = builder.createdAt;
        /**
         * 假期类型的创建人，值为创建人的员工 ID
         * <p> 示例值：7104164629974646786
         */
        this.createdBy = builder.createdBy;
        /**
         * 假期类型的更新时间
         * <p> 示例值：1658996995
         */
        this.updatedAt = builder.updatedAt;
        /**
         * 假期类型的更新人，值为更新人的员工 ID
         * <p> 示例值：7112112899636854812
         */
        this.updatedBy = builder.updatedBy;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLeaveTypeId() {
        return this.leaveTypeId;
    }

    public void setLeaveTypeId(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public I18n[] getLeaveTypeName() {
        return this.leaveTypeName;
    }

    public void setLeaveTypeName(I18n[] leaveTypeName) {
        this.leaveTypeName = leaveTypeName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LeaveSubtype[] getLeaveSubtypeList() {
        return this.leaveSubtypeList;
    }

    public void setLeaveSubtypeList(LeaveSubtype[] leaveSubtypeList) {
        this.leaveSubtypeList = leaveSubtypeList;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public static class Builder {
        /**
         * 假期类型ID
         * <p> 示例值：4718803945687580505
         */
        private String leaveTypeId;
        /**
         * 假期类型名称
         * <p> 示例值：
         */
        private I18n[] leaveTypeName;
        /**
         * 假期类型状态;;可选值有：;;- 1：已启用;;- 2：已停用
         * <p> 示例值：2
         */
        private Integer status;
        /**
         * 假期子类列表
         * <p> 示例值：
         */
        private LeaveSubtype[] leaveSubtypeList;
        /**
         * 假期类型的创建时间
         * <p> 示例值：1658730384
         */
        private String createdAt;
        /**
         * 假期类型的创建人，值为创建人的员工 ID
         * <p> 示例值：7104164629974646786
         */
        private String createdBy;
        /**
         * 假期类型的更新时间
         * <p> 示例值：1658996995
         */
        private String updatedAt;
        /**
         * 假期类型的更新人，值为更新人的员工 ID
         * <p> 示例值：7112112899636854812
         */
        private String updatedBy;

        /**
         * 假期类型ID
         * <p> 示例值：4718803945687580505
         *
         * @param leaveTypeId
         * @return
         */
        public Builder leaveTypeId(String leaveTypeId) {
            this.leaveTypeId = leaveTypeId;
            return this;
        }


        /**
         * 假期类型名称
         * <p> 示例值：
         *
         * @param leaveTypeName
         * @return
         */
        public Builder leaveTypeName(I18n[] leaveTypeName) {
            this.leaveTypeName = leaveTypeName;
            return this;
        }


        /**
         * 假期类型状态;;可选值有：;;- 1：已启用;;- 2：已停用
         * <p> 示例值：2
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }


        /**
         * 假期子类列表
         * <p> 示例值：
         *
         * @param leaveSubtypeList
         * @return
         */
        public Builder leaveSubtypeList(LeaveSubtype[] leaveSubtypeList) {
            this.leaveSubtypeList = leaveSubtypeList;
            return this;
        }


        /**
         * 假期类型的创建时间
         * <p> 示例值：1658730384
         *
         * @param createdAt
         * @return
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        /**
         * 假期类型的创建人，值为创建人的员工 ID
         * <p> 示例值：7104164629974646786
         *
         * @param createdBy
         * @return
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        /**
         * 假期类型的更新时间
         * <p> 示例值：1658996995
         *
         * @param updatedAt
         * @return
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        /**
         * 假期类型的更新人，值为更新人的员工 ID
         * <p> 示例值：7112112899636854812
         *
         * @param updatedBy
         * @return
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }


        public LeaveType build() {
            return new LeaveType(this);
        }
    }
}
