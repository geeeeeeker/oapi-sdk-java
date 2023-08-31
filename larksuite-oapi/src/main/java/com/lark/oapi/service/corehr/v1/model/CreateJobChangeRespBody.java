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

import com.google.gson.annotations.SerializedName;

public class CreateJobChangeRespBody {
    /**
     * 异动记录 id
     * <p> 示例值：6991776076699549697
     */
    @SerializedName("job_change_id")
    private String jobChangeId;
    /**
     * 雇员 id
     * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 异动状态
     * <p> 示例值：4
     */
    @SerializedName("status")
    private String status;
    /**
     * 异动类型
     * <p> 示例值：direct_leader_change
     */
    @SerializedName("transfer_type_unique_identifier")
    private String transferTypeUniqueIdentifier;
    /**
     * 异动原因
     * <p> 示例值：involuntary_transfer
     */
    @SerializedName("transfer_reason_unique_identifier")
    private String transferReasonUniqueIdentifier;
    /**
     * 异动流程 id
     * <p> 示例值：6991776078461142564
     */
    @SerializedName("process_id")
    private String processId;
    /**
     * 生效时间
     * <p> 示例值：2022-03-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 创建时间
     * <p> 示例值：1627899724000
     */
    @SerializedName("created_time")
    private String createdTime;
    /**
     * 异动详细信息
     * <p> 示例值：
     */
    @SerializedName("transfer_info")
    private TransferInfo transferInfo;

    public String getJobChangeId() {
        return this.jobChangeId;
    }

    public void setJobChangeId(String jobChangeId) {
        this.jobChangeId = jobChangeId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransferTypeUniqueIdentifier() {
        return this.transferTypeUniqueIdentifier;
    }

    public void setTransferTypeUniqueIdentifier(String transferTypeUniqueIdentifier) {
        this.transferTypeUniqueIdentifier = transferTypeUniqueIdentifier;
    }

    public String getTransferReasonUniqueIdentifier() {
        return this.transferReasonUniqueIdentifier;
    }

    public void setTransferReasonUniqueIdentifier(String transferReasonUniqueIdentifier) {
        this.transferReasonUniqueIdentifier = transferReasonUniqueIdentifier;
    }

    public String getProcessId() {
        return this.processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public TransferInfo getTransferInfo() {
        return this.transferInfo;
    }

    public void setTransferInfo(TransferInfo transferInfo) {
        this.transferInfo = transferInfo;
    }

}