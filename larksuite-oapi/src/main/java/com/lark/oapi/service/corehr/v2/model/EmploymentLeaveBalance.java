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

public class EmploymentLeaveBalance {
    /**
     * 雇佣信息ID
     * <p> 示例值：4718803945687580505
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 员工姓名
     * <p> 示例值：
     */
    @SerializedName("employment_name")
    private I18n[] employmentName;
    /**
     * 余额查看日期
     * <p> 示例值：0
     */
    @SerializedName("as_of_date")
    private String asOfDate;
    /**
     * 假期余额列表
     * <p> 示例值：
     */
    @SerializedName("leave_balance_list")
    private LeaveBalance[] leaveBalanceList;

    // builder 开始
    public EmploymentLeaveBalance() {
    }

    public EmploymentLeaveBalance(Builder builder) {
        /**
         * 雇佣信息ID
         * <p> 示例值：4718803945687580505
         */
        this.employmentId = builder.employmentId;
        /**
         * 员工姓名
         * <p> 示例值：
         */
        this.employmentName = builder.employmentName;
        /**
         * 余额查看日期
         * <p> 示例值：0
         */
        this.asOfDate = builder.asOfDate;
        /**
         * 假期余额列表
         * <p> 示例值：
         */
        this.leaveBalanceList = builder.leaveBalanceList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public I18n[] getEmploymentName() {
        return this.employmentName;
    }

    public void setEmploymentName(I18n[] employmentName) {
        this.employmentName = employmentName;
    }

    public String getAsOfDate() {
        return this.asOfDate;
    }

    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    public LeaveBalance[] getLeaveBalanceList() {
        return this.leaveBalanceList;
    }

    public void setLeaveBalanceList(LeaveBalance[] leaveBalanceList) {
        this.leaveBalanceList = leaveBalanceList;
    }

    public static class Builder {
        /**
         * 雇佣信息ID
         * <p> 示例值：4718803945687580505
         */
        private String employmentId;
        /**
         * 员工姓名
         * <p> 示例值：
         */
        private I18n[] employmentName;
        /**
         * 余额查看日期
         * <p> 示例值：0
         */
        private String asOfDate;
        /**
         * 假期余额列表
         * <p> 示例值：
         */
        private LeaveBalance[] leaveBalanceList;

        /**
         * 雇佣信息ID
         * <p> 示例值：4718803945687580505
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 员工姓名
         * <p> 示例值：
         *
         * @param employmentName
         * @return
         */
        public Builder employmentName(I18n[] employmentName) {
            this.employmentName = employmentName;
            return this;
        }


        /**
         * 余额查看日期
         * <p> 示例值：0
         *
         * @param asOfDate
         * @return
         */
        public Builder asOfDate(String asOfDate) {
            this.asOfDate = asOfDate;
            return this;
        }


        /**
         * 假期余额列表
         * <p> 示例值：
         *
         * @param leaveBalanceList
         * @return
         */
        public Builder leaveBalanceList(LeaveBalance[] leaveBalanceList) {
            this.leaveBalanceList = leaveBalanceList;
            return this;
        }


        public EmploymentLeaveBalance build() {
            return new EmploymentLeaveBalance(this);
        }
    }
}