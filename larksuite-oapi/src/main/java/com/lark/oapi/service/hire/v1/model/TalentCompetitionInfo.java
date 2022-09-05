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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class TalentCompetitionInfo {

  /**
   * ID
   * <p> 示例值：6891560630172518670
   */
  @SerializedName("id")
  private String id;
  /**
   * 竞赛名称
   * <p> 示例值：计算机技能竞赛
   */
  @SerializedName("name")
  private String name;
  /**
   * 竞赛描述
   * <p> 示例值：C++竞赛
   */
  @SerializedName("desc")
  private String desc;
  /**
   * 自定义字段
   * <p> 示例值：
   */
  @SerializedName("customized_data_list")
  private TalentCustomizedDataChild[] customizedDataList;

  // builder 开始
  public TalentCompetitionInfo() {
  }

  public TalentCompetitionInfo(Builder builder) {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    this.id = builder.id;
    /**
     * 竞赛名称
     * <p> 示例值：计算机技能竞赛
     */
    this.name = builder.name;
    /**
     * 竞赛描述
     * <p> 示例值：C++竞赛
     */
    this.desc = builder.desc;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    this.customizedDataList = builder.customizedDataList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public TalentCustomizedDataChild[] getCustomizedDataList() {
    return this.customizedDataList;
  }

  public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
    this.customizedDataList = customizedDataList;
  }

  public static class Builder {

    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    private String id;
    /**
     * 竞赛名称
     * <p> 示例值：计算机技能竞赛
     */
    private String name;
    /**
     * 竞赛描述
     * <p> 示例值：C++竞赛
     */
    private String desc;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    private TalentCustomizedDataChild[] customizedDataList;

    /**
     * ID
     * <p> 示例值：6891560630172518670
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 竞赛名称
     * <p> 示例值：计算机技能竞赛
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 竞赛描述
     * <p> 示例值：C++竞赛
     *
     * @param desc
     * @return
     */
    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }


    /**
     * 自定义字段
     * <p> 示例值：
     *
     * @param customizedDataList
     * @return
     */
    public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
      this.customizedDataList = customizedDataList;
      return this;
    }


    public TalentCompetitionInfo build() {
      return new TalentCompetitionInfo(this);
    }
  }
}