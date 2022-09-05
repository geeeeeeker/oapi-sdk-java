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

public class InterviewDimensionAssessment {

  /**
   * 题目评价 ID
   * <p> 示例值：6949805467799537964
   */
  @SerializedName("id")
  private String id;
  /**
   * 题目名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private I18n name;
  /**
   * 当题目类型为描述题时，从此取值
   * <p> 示例值：这个候选人还不错
   */
  @SerializedName("content")
  private String content;
  /**
   * 题目 ID
   * <p> 示例值：11111111
   */
  @SerializedName("dimension_id")
  private String dimensionId;
  /**
   * 当题目类型为单选题时，从此取值
   * <p> 示例值：
   */
  @SerializedName("dimension_score")
  private InterviewDimensionScore dimensionScore;
  /**
   * 当题目类型为多选题时，从此取值
   * <p> 示例值：
   */
  @SerializedName("dimension_score_list")
  private InterviewDimensionScore[] dimensionScoreList;
  /**
   * 题目类型
   * <p> 示例值：1
   */
  @SerializedName("dimension_type")
  private Integer dimensionType;

  // builder 开始
  public InterviewDimensionAssessment() {
  }

  public InterviewDimensionAssessment(Builder builder) {
    /**
     * 题目评价 ID
     * <p> 示例值：6949805467799537964
     */
    this.id = builder.id;
    /**
     * 题目名称
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 当题目类型为描述题时，从此取值
     * <p> 示例值：这个候选人还不错
     */
    this.content = builder.content;
    /**
     * 题目 ID
     * <p> 示例值：11111111
     */
    this.dimensionId = builder.dimensionId;
    /**
     * 当题目类型为单选题时，从此取值
     * <p> 示例值：
     */
    this.dimensionScore = builder.dimensionScore;
    /**
     * 当题目类型为多选题时，从此取值
     * <p> 示例值：
     */
    this.dimensionScoreList = builder.dimensionScoreList;
    /**
     * 题目类型
     * <p> 示例值：1
     */
    this.dimensionType = builder.dimensionType;
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

  public I18n getName() {
    return this.name;
  }

  public void setName(I18n name) {
    this.name = name;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDimensionId() {
    return this.dimensionId;
  }

  public void setDimensionId(String dimensionId) {
    this.dimensionId = dimensionId;
  }

  public InterviewDimensionScore getDimensionScore() {
    return this.dimensionScore;
  }

  public void setDimensionScore(InterviewDimensionScore dimensionScore) {
    this.dimensionScore = dimensionScore;
  }

  public InterviewDimensionScore[] getDimensionScoreList() {
    return this.dimensionScoreList;
  }

  public void setDimensionScoreList(InterviewDimensionScore[] dimensionScoreList) {
    this.dimensionScoreList = dimensionScoreList;
  }

  public Integer getDimensionType() {
    return this.dimensionType;
  }

  public void setDimensionType(Integer dimensionType) {
    this.dimensionType = dimensionType;
  }

  public static class Builder {

    /**
     * 题目评价 ID
     * <p> 示例值：6949805467799537964
     */
    private String id;
    /**
     * 题目名称
     * <p> 示例值：
     */
    private I18n name;
    /**
     * 当题目类型为描述题时，从此取值
     * <p> 示例值：这个候选人还不错
     */
    private String content;
    /**
     * 题目 ID
     * <p> 示例值：11111111
     */
    private String dimensionId;
    /**
     * 当题目类型为单选题时，从此取值
     * <p> 示例值：
     */
    private InterviewDimensionScore dimensionScore;
    /**
     * 当题目类型为多选题时，从此取值
     * <p> 示例值：
     */
    private InterviewDimensionScore[] dimensionScoreList;
    /**
     * 题目类型
     * <p> 示例值：1
     */
    private Integer dimensionType;

    /**
     * 题目评价 ID
     * <p> 示例值：6949805467799537964
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 题目名称
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(I18n name) {
      this.name = name;
      return this;
    }


    /**
     * 当题目类型为描述题时，从此取值
     * <p> 示例值：这个候选人还不错
     *
     * @param content
     * @return
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }


    /**
     * 题目 ID
     * <p> 示例值：11111111
     *
     * @param dimensionId
     * @return
     */
    public Builder dimensionId(String dimensionId) {
      this.dimensionId = dimensionId;
      return this;
    }


    /**
     * 当题目类型为单选题时，从此取值
     * <p> 示例值：
     *
     * @param dimensionScore
     * @return
     */
    public Builder dimensionScore(InterviewDimensionScore dimensionScore) {
      this.dimensionScore = dimensionScore;
      return this;
    }


    /**
     * 当题目类型为多选题时，从此取值
     * <p> 示例值：
     *
     * @param dimensionScoreList
     * @return
     */
    public Builder dimensionScoreList(InterviewDimensionScore[] dimensionScoreList) {
      this.dimensionScoreList = dimensionScoreList;
      return this;
    }


    /**
     * 题目类型
     * <p> 示例值：1
     *
     * @param dimensionType
     * @return
     */
    public Builder dimensionType(Integer dimensionType) {
      this.dimensionType = dimensionType;
      return this;
    }


    public InterviewDimensionAssessment build() {
      return new InterviewDimensionAssessment(this);
    }
  }
}