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

package com.lark.oapi.service.task.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.task.v2.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListCommentReq {
    /**
     * 分页大小
     * <p> 示例值：50
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 要获取评论列表的资源类型
     * <p> 示例值：task
     */
    @Query
    @SerializedName("resource_type")
    private String resourceType;
    /**
     * 要获取评论的资源ID。例如要获取任务的评论列表，此处应该填写任务全局唯一ID
     * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
     */
    @Query
    @SerializedName("resource_id")
    private String resourceId;
    /**
     * 返回数据的排序方式
     * <p> 示例值：asc
     */
    @Query
    @SerializedName("direction")
    private String direction;
    /**
     * 表示user的ID的类型，支持open_id, user_id, union_id
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;

    // builder 开始
    public ListCommentReq() {
    }

    public ListCommentReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：50
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         */
        this.pageToken = builder.pageToken;
        /**
         * 要获取评论列表的资源类型
         * <p> 示例值：task
         */
        this.resourceType = builder.resourceType;
        /**
         * 要获取评论的资源ID。例如要获取任务的评论列表，此处应该填写任务全局唯一ID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         */
        this.resourceId = builder.resourceId;
        /**
         * 返回数据的排序方式
         * <p> 示例值：asc
         */
        this.direction = builder.direction;
        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String resourceType; // 要获取评论列表的资源类型
        private String resourceId; // 要获取评论的资源ID。例如要获取任务的评论列表，此处应该填写任务全局唯一ID
        private String direction; // 返回数据的排序方式
        private String userIdType; // 表示user的ID的类型，支持open_id, user_id, union_id


        /**
         * 分页大小
         * <p> 示例值：50
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：aWQ9NzEwMjMzMjMxMDE=
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 要获取评论列表的资源类型
         * <p> 示例值：task
         *
         * @param resourceType
         * @return
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }


        /**
         * 要获取评论的资源ID。例如要获取任务的评论列表，此处应该填写任务全局唯一ID
         * <p> 示例值：d300a75f-c56a-4be9-80d1-e47653028ceb
         *
         * @param resourceId
         * @return
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }


        /**
         * 返回数据的排序方式
         * <p> 示例值：asc
         *
         * @param direction
         * @return
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * 返回数据的排序方式
         * <p> 示例值：asc
         *
         * @param direction {@link com.lark.oapi.service.task.v2.enums.ListCommentDirectionEnum}
         * @return
         */
        public Builder direction(com.lark.oapi.service.task.v2.enums.ListCommentDirectionEnum direction) {
            this.direction = direction.getValue();
            return this;
        }


        /**
         * 表示user的ID的类型，支持open_id, user_id, union_id
         * <p> 示例值：open_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        public ListCommentReq build() {
            return new ListCommentReq(this);
        }
    }
}
