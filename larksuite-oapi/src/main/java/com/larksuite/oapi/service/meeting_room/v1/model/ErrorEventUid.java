// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
import com.google.gson.annotations.SerializedName;

public class ErrorEventUid {
    @SerializedName("uid")
    private String uid;
    @SerializedName("original_time")
    private Integer originalTime;
    @SerializedName("error_msg")
    private String errorMsg;

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getOriginalTime() {
        return this.originalTime;
    }

    public void setOriginalTime(Integer originalTime) {
        this.originalTime = originalTime;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}