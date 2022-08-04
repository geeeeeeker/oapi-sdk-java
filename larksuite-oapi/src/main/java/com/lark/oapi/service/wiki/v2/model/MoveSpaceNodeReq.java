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

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class MoveSpaceNodeReq {

  @Path
  @SerializedName("space_id")
  private String spaceId;
  @Path
  @SerializedName("node_token")
  private String nodeToken;
  @Body
  private MoveSpaceNodeReqBody body;

  // builder 开始
  public MoveSpaceNodeReq() {
  }

  public MoveSpaceNodeReq(Builder builder) {
    this.spaceId = builder.spaceId;
    this.nodeToken = builder.nodeToken;
    this.body = builder.body;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getSpaceId() {
    return this.spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public String getNodeToken() {
    return this.nodeToken;
  }

  public void setNodeToken(String nodeToken) {
    this.nodeToken = nodeToken;
  }

  public MoveSpaceNodeReqBody getMoveSpaceNodeReqBody() {
    return this.body;
  }

  public void setMoveSpaceNodeReqBody(MoveSpaceNodeReqBody body) {
    this.body = body;
  }

  public static class Builder {

    private String spaceId;
    private String nodeToken;
    private MoveSpaceNodeReqBody body;

    public Builder spaceId(String spaceId) {
      this.spaceId = spaceId;
      return this;
    }

    public Builder nodeToken(String nodeToken) {
      this.nodeToken = nodeToken;
      return this;
    }

    public MoveSpaceNodeReqBody getMoveSpaceNodeReqBody() {
      return this.body;
    }

    public Builder moveSpaceNodeReqBody(MoveSpaceNodeReqBody body) {
      this.body = body;
      return this;
    }

    public MoveSpaceNodeReq build() {
      return new MoveSpaceNodeReq(this);
    }
  }
}