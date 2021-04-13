// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.im.v1.model;
import com.google.gson.annotations.SerializedName;

public class AppUsage {
    @SerializedName("creator_id")
    private Long creatorId;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("usage_bot_id")
    private Long usageBotId;
    @SerializedName("activate_status")
    private Long activateStatus;
    @SerializedName("admin_uids")
    private Long[] adminUids;

    public Long getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUsageBotId() {
        return this.usageBotId;
    }

    public void setUsageBotId(Long usageBotId) {
        this.usageBotId = usageBotId;
    }

    public Long getActivateStatus() {
        return this.activateStatus;
    }

    public void setActivateStatus(Long activateStatus) {
        this.activateStatus = activateStatus;
    }

    public Long[] getAdminUids() {
        return this.adminUids;
    }

    public void setAdminUids(Long[] adminUids) {
        this.adminUids = adminUids;
    }

}