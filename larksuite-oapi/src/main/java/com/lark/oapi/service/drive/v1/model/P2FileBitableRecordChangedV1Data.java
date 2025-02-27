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

public class P2FileBitableRecordChangedV1Data {
    /**
     * 文档类型
     * <p> 示例值：
     */
    @SerializedName("file_type")
    private String fileType;
    /**
     * 文档token
     * <p> 示例值：
     */
    @SerializedName("file_token")
    private String fileToken;
    /**
     * 多维表格数据表ID
     * <p> 示例值：
     */
    @SerializedName("table_id")
    private String tableId;
    /**
     * 多维表格数据表的版本号
     * <p> 示例值：
     */
    @SerializedName("revision")
    private Integer revision;
    /**
     * 操作者ID
     * <p> 示例值：
     */
    @SerializedName("operator_id")
    private UserId operatorId;
    /**
     * 行变更操作列表
     * <p> 示例值：
     */
    @SerializedName("action_list")
    private BitableTableRecordAction[] actionList;
    /**
     * 订阅用户id列表
     * <p> 示例值：
     */
    @SerializedName("subscriber_id_list")
    private UserId[] subscriberIdList;
    /**
     * 编辑时间（格式：时间戳；单位：秒）
     * <p> 示例值：
     */
    @SerializedName("update_time")
    private Integer updateTime;

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Integer getRevision() {
        return this.revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public UserId getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(UserId operatorId) {
        this.operatorId = operatorId;
    }

    public BitableTableRecordAction[] getActionList() {
        return this.actionList;
    }

    public void setActionList(BitableTableRecordAction[] actionList) {
        this.actionList = actionList;
    }

    public UserId[] getSubscriberIdList() {
        return this.subscriberIdList;
    }

    public void setSubscriberIdList(UserId[] subscriberIdList) {
        this.subscriberIdList = subscriberIdList;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

}
