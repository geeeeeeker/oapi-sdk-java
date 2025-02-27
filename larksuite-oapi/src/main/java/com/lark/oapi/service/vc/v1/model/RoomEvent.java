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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class RoomEvent {
    /**
     * 会议室ID
     * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
     */
    @SerializedName("room_id")
    private String roomId;
    /**
     * 会议室名称
     * <p> 示例值：测试会议室
     */
    @SerializedName("name")
    private String name;
    /**
     * 会议室能容纳的人数
     * <p> 示例值：10
     */
    @SerializedName("capacity")
    private Integer capacity;
    /**
     * 会议室的相关描述
     * <p> 示例值：测试会议室描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 会议室的展示ID
     * <p> 示例值：LM134742334
     */
    @SerializedName("display_id")
    private String displayId;
    /**
     * 自定义的会议室ID
     * <p> 示例值：1234
     */
    @SerializedName("custom_room_id")
    private String customRoomId;
    /**
     * 层级ID
     * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
     */
    @SerializedName("room_level_id")
    private String roomLevelId;
    /**
     * 层级路径
     * <p> 示例值：[omb_8d020b12fe49e82847c2af3c193d5754,omb_8d020b12fe49e82847c2af3c193d5754]
     */
    @SerializedName("path")
    private String[] path;
    /**
     * 会议室状态
     * <p> 示例值：
     */
    @SerializedName("room_status")
    private RoomStatusEvent roomStatus;
    /**
     * 设施信息列表
     * <p> 示例值：
     */
    @SerializedName("device")
    private Device[] device;

    // builder 开始
    public RoomEvent() {
    }

    public RoomEvent(Builder builder) {
        /**
         * 会议室ID
         * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
         */
        this.roomId = builder.roomId;
        /**
         * 会议室名称
         * <p> 示例值：测试会议室
         */
        this.name = builder.name;
        /**
         * 会议室能容纳的人数
         * <p> 示例值：10
         */
        this.capacity = builder.capacity;
        /**
         * 会议室的相关描述
         * <p> 示例值：测试会议室描述
         */
        this.description = builder.description;
        /**
         * 会议室的展示ID
         * <p> 示例值：LM134742334
         */
        this.displayId = builder.displayId;
        /**
         * 自定义的会议室ID
         * <p> 示例值：1234
         */
        this.customRoomId = builder.customRoomId;
        /**
         * 层级ID
         * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
         */
        this.roomLevelId = builder.roomLevelId;
        /**
         * 层级路径
         * <p> 示例值：[omb_8d020b12fe49e82847c2af3c193d5754,omb_8d020b12fe49e82847c2af3c193d5754]
         */
        this.path = builder.path;
        /**
         * 会议室状态
         * <p> 示例值：
         */
        this.roomStatus = builder.roomStatus;
        /**
         * 设施信息列表
         * <p> 示例值：
         */
        this.device = builder.device;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayId() {
        return this.displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getCustomRoomId() {
        return this.customRoomId;
    }

    public void setCustomRoomId(String customRoomId) {
        this.customRoomId = customRoomId;
    }

    public String getRoomLevelId() {
        return this.roomLevelId;
    }

    public void setRoomLevelId(String roomLevelId) {
        this.roomLevelId = roomLevelId;
    }

    public String[] getPath() {
        return this.path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public RoomStatusEvent getRoomStatus() {
        return this.roomStatus;
    }

    public void setRoomStatus(RoomStatusEvent roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Device[] getDevice() {
        return this.device;
    }

    public void setDevice(Device[] device) {
        this.device = device;
    }

    public static class Builder {
        /**
         * 会议室ID
         * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
         */
        private String roomId;
        /**
         * 会议室名称
         * <p> 示例值：测试会议室
         */
        private String name;
        /**
         * 会议室能容纳的人数
         * <p> 示例值：10
         */
        private Integer capacity;
        /**
         * 会议室的相关描述
         * <p> 示例值：测试会议室描述
         */
        private String description;
        /**
         * 会议室的展示ID
         * <p> 示例值：LM134742334
         */
        private String displayId;
        /**
         * 自定义的会议室ID
         * <p> 示例值：1234
         */
        private String customRoomId;
        /**
         * 层级ID
         * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
         */
        private String roomLevelId;
        /**
         * 层级路径
         * <p> 示例值：[omb_8d020b12fe49e82847c2af3c193d5754,omb_8d020b12fe49e82847c2af3c193d5754]
         */
        private String[] path;
        /**
         * 会议室状态
         * <p> 示例值：
         */
        private RoomStatusEvent roomStatus;
        /**
         * 设施信息列表
         * <p> 示例值：
         */
        private Device[] device;

        /**
         * 会议室ID
         * <p> 示例值：omm_4de32cf10a4358788ff4e09e37ebbf9b
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }


        /**
         * 会议室名称
         * <p> 示例值：测试会议室
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 会议室能容纳的人数
         * <p> 示例值：10
         *
         * @param capacity
         * @return
         */
        public Builder capacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }


        /**
         * 会议室的相关描述
         * <p> 示例值：测试会议室描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 会议室的展示ID
         * <p> 示例值：LM134742334
         *
         * @param displayId
         * @return
         */
        public Builder displayId(String displayId) {
            this.displayId = displayId;
            return this;
        }


        /**
         * 自定义的会议室ID
         * <p> 示例值：1234
         *
         * @param customRoomId
         * @return
         */
        public Builder customRoomId(String customRoomId) {
            this.customRoomId = customRoomId;
            return this;
        }


        /**
         * 层级ID
         * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
         *
         * @param roomLevelId
         * @return
         */
        public Builder roomLevelId(String roomLevelId) {
            this.roomLevelId = roomLevelId;
            return this;
        }


        /**
         * 层级路径
         * <p> 示例值：[omb_8d020b12fe49e82847c2af3c193d5754,omb_8d020b12fe49e82847c2af3c193d5754]
         *
         * @param path
         * @return
         */
        public Builder path(String[] path) {
            this.path = path;
            return this;
        }


        /**
         * 会议室状态
         * <p> 示例值：
         *
         * @param roomStatus
         * @return
         */
        public Builder roomStatus(RoomStatusEvent roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }


        /**
         * 设施信息列表
         * <p> 示例值：
         *
         * @param device
         * @return
         */
        public Builder device(Device[] device) {
            this.device = device;
            return this;
        }


        public RoomEvent build() {
            return new RoomEvent(this);
        }
    }
}
