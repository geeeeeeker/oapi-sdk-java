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

package com.lark.oapi.service.wiki.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.wiki.v2.enums.*;
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

public class NodeSearch {
    /**
     * node的唯一标识
     * <p> 示例值：wikbcIbccBl4Mik9GQ2KskO6hsf
     */
    @SerializedName("node_id")
    private String nodeId;
    /**
     * 所属空间id
     * <p> 示例值：7067522558521770004
     */
    @SerializedName("space_id")
    private String spaceId;
    /**
     * 父节点id
     * <p> 示例值：
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * wiki类型
     * <p> 示例值：1
     */
    @SerializedName("obj_type")
    private Integer objType;
    /**
     * wiki标题
     * <p> 示例值：文档标题
     */
    @SerializedName("title")
    private String title;
    /**
     * wiki的访问url
     * <p> 示例值：https://single-container.feishu.cn/wiki/wikbcPkzIoLp52Dh2Pj3nQaYPFO
     */
    @SerializedName("url")
    private String url;
    /**
     * wiki对应图标的url
     * <p> 示例值：
     */
    @SerializedName("icon")
    private String icon;
    /**
     * 所属权限范围id
     * <p> 示例值：
     */
    @SerializedName("area_id")
    private String areaId;
    /**
     * 序号
     * <p> 示例值：1
     */
    @SerializedName("sort_id")
    private Double sortId;
    /**
     * 所在域名
     * <p> 示例值：
     */
    @SerializedName("domain")
    private String domain;
    /**
     * objToken
     * <p> 示例值：doxbcBBOM3vQxO5NztUhKpTBNQd
     */
    @SerializedName("obj_token")
    private String objToken;

    // builder 开始
    public NodeSearch() {
    }

    public NodeSearch(Builder builder) {
        /**
         * node的唯一标识
         * <p> 示例值：wikbcIbccBl4Mik9GQ2KskO6hsf
         */
        this.nodeId = builder.nodeId;
        /**
         * 所属空间id
         * <p> 示例值：7067522558521770004
         */
        this.spaceId = builder.spaceId;
        /**
         * 父节点id
         * <p> 示例值：
         */
        this.parentId = builder.parentId;
        /**
         * wiki类型
         * <p> 示例值：1
         */
        this.objType = builder.objType;
        /**
         * wiki标题
         * <p> 示例值：文档标题
         */
        this.title = builder.title;
        /**
         * wiki的访问url
         * <p> 示例值：https://single-container.feishu.cn/wiki/wikbcPkzIoLp52Dh2Pj3nQaYPFO
         */
        this.url = builder.url;
        /**
         * wiki对应图标的url
         * <p> 示例值：
         */
        this.icon = builder.icon;
        /**
         * 所属权限范围id
         * <p> 示例值：
         */
        this.areaId = builder.areaId;
        /**
         * 序号
         * <p> 示例值：1
         */
        this.sortId = builder.sortId;
        /**
         * 所在域名
         * <p> 示例值：
         */
        this.domain = builder.domain;
        /**
         * objToken
         * <p> 示例值：doxbcBBOM3vQxO5NztUhKpTBNQd
         */
        this.objToken = builder.objToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getSpaceId() {
        return this.spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getObjType() {
        return this.objType;
    }

    public void setObjType(Integer objType) {
        this.objType = objType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAreaId() {
        return this.areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Double getSortId() {
        return this.sortId;
    }

    public void setSortId(Double sortId) {
        this.sortId = sortId;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public void setObjToken(String objToken) {
        this.objToken = objToken;
    }

    public static class Builder {
        /**
         * node的唯一标识
         * <p> 示例值：wikbcIbccBl4Mik9GQ2KskO6hsf
         */
        private String nodeId;
        /**
         * 所属空间id
         * <p> 示例值：7067522558521770004
         */
        private String spaceId;
        /**
         * 父节点id
         * <p> 示例值：
         */
        private String parentId;
        /**
         * wiki类型
         * <p> 示例值：1
         */
        private Integer objType;
        /**
         * wiki标题
         * <p> 示例值：文档标题
         */
        private String title;
        /**
         * wiki的访问url
         * <p> 示例值：https://single-container.feishu.cn/wiki/wikbcPkzIoLp52Dh2Pj3nQaYPFO
         */
        private String url;
        /**
         * wiki对应图标的url
         * <p> 示例值：
         */
        private String icon;
        /**
         * 所属权限范围id
         * <p> 示例值：
         */
        private String areaId;
        /**
         * 序号
         * <p> 示例值：1
         */
        private Double sortId;
        /**
         * 所在域名
         * <p> 示例值：
         */
        private String domain;
        /**
         * objToken
         * <p> 示例值：doxbcBBOM3vQxO5NztUhKpTBNQd
         */
        private String objToken;

        /**
         * node的唯一标识
         * <p> 示例值：wikbcIbccBl4Mik9GQ2KskO6hsf
         *
         * @param nodeId
         * @return
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }


        /**
         * 所属空间id
         * <p> 示例值：7067522558521770004
         *
         * @param spaceId
         * @return
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }


        /**
         * 父节点id
         * <p> 示例值：
         *
         * @param parentId
         * @return
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        /**
         * wiki类型
         * <p> 示例值：1
         *
         * @param objType
         * @return
         */
        public Builder objType(Integer objType) {
            this.objType = objType;
            return this;
        }

        /**
         * wiki类型
         * <p> 示例值：1
         *
         * @param objType {@link com.lark.oapi.service.wiki.v2.enums.NodeSearchObjTypeEnum}
         * @return
         */
        public Builder objType(com.lark.oapi.service.wiki.v2.enums.NodeSearchObjTypeEnum objType) {
            this.objType = objType.getValue();
            return this;
        }


        /**
         * wiki标题
         * <p> 示例值：文档标题
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * wiki的访问url
         * <p> 示例值：https://single-container.feishu.cn/wiki/wikbcPkzIoLp52Dh2Pj3nQaYPFO
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * wiki对应图标的url
         * <p> 示例值：
         *
         * @param icon
         * @return
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }


        /**
         * 所属权限范围id
         * <p> 示例值：
         *
         * @param areaId
         * @return
         */
        public Builder areaId(String areaId) {
            this.areaId = areaId;
            return this;
        }


        /**
         * 序号
         * <p> 示例值：1
         *
         * @param sortId
         * @return
         */
        public Builder sortId(Double sortId) {
            this.sortId = sortId;
            return this;
        }


        /**
         * 所在域名
         * <p> 示例值：
         *
         * @param domain
         * @return
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }


        /**
         * objToken
         * <p> 示例值：doxbcBBOM3vQxO5NztUhKpTBNQd
         *
         * @param objToken
         * @return
         */
        public Builder objToken(String objToken) {
            this.objToken = objToken;
            return this;
        }


        public NodeSearch build() {
            return new NodeSearch(this);
        }
    }
}
