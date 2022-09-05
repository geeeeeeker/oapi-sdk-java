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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class OkrObjectiveProgressRate {

  /**
   * Objective 进度百分比 >= 0
   * <p> 示例值：50
   */
  @SerializedName("percent")
  private Integer percent;
  /**
   * Objective 进度状态
   * <p> 示例值：1
   */
  @SerializedName("status")
  private String status;

  // builder 开始
  public OkrObjectiveProgressRate() {
  }

  public OkrObjectiveProgressRate(Builder builder) {
    /**
     * Objective 进度百分比 >= 0
     * <p> 示例值：50
     */
    this.percent = builder.percent;
    /**
     * Objective 进度状态
     * <p> 示例值：1
     */
    this.status = builder.status;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getPercent() {
    return this.percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public static class Builder {

    /**
     * Objective 进度百分比 >= 0
     * <p> 示例值：50
     */
    private Integer percent;
    /**
     * Objective 进度状态
     * <p> 示例值：1
     */
    private String status;

    /**
     * Objective 进度百分比 >= 0
     * <p> 示例值：50
     *
     * @param percent
     * @return
     */
    public Builder percent(Integer percent) {
      this.percent = percent;
      return this;
    }


    /**
     * Objective 进度状态
     * <p> 示例值：1
     *
     * @param status
     * @return
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Objective 进度状态
     * <p> 示例值：1
     *
     * @param status {@link com.lark.oapi.service.okr.v1.enums.OkrObjectiveProgressRateStatusEnum}
     * @return
     */
    public Builder status(
        com.lark.oapi.service.okr.v1.enums.OkrObjectiveProgressRateStatusEnum status) {
      this.status = status.getValue();
      return this;
    }


    public OkrObjectiveProgressRate build() {
      return new OkrObjectiveProgressRate(this);
    }
  }
}