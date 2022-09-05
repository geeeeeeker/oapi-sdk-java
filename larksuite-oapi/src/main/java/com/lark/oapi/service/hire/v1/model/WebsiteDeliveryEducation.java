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

public class WebsiteDeliveryEducation {

  /**
   * 学历类型
   * <p> 示例值：1
   */
  @SerializedName("education_type")
  private Integer educationType;
  /**
   * 结束时间 ,如果是至今传值 -1
   * <p> 示例值：1618500278663
   */
  @SerializedName("end_time")
  private Integer endTime;
  /**
   * 专业
   * <p> 示例值：汉语言文学
   */
  @SerializedName("field_of_study")
  private String fieldOfStudy;
  /**
   * 学校
   * <p> 示例值：香港中文大学
   */
  @SerializedName("school")
  private String school;
  /**
   * 开始时间
   * <p> 示例值：1609430400
   */
  @SerializedName("start_time")
  private Integer startTime;
  /**
   * 专业排名
   * <p> 示例值：5
   */
  @SerializedName("academic_ranking")
  private Integer academicRanking;
  /**
   * 自定义字段
   * <p> 示例值：
   */
  @SerializedName("customized_data")
  private WebsiteDeliveryCustomizedData[] customizedData;
  /**
   * 学位
   * <p> 示例值：1
   */
  @SerializedName("degree")
  private Integer degree;

  // builder 开始
  public WebsiteDeliveryEducation() {
  }

  public WebsiteDeliveryEducation(Builder builder) {
    /**
     * 学历类型
     * <p> 示例值：1
     */
    this.educationType = builder.educationType;
    /**
     * 结束时间 ,如果是至今传值 -1
     * <p> 示例值：1618500278663
     */
    this.endTime = builder.endTime;
    /**
     * 专业
     * <p> 示例值：汉语言文学
     */
    this.fieldOfStudy = builder.fieldOfStudy;
    /**
     * 学校
     * <p> 示例值：香港中文大学
     */
    this.school = builder.school;
    /**
     * 开始时间
     * <p> 示例值：1609430400
     */
    this.startTime = builder.startTime;
    /**
     * 专业排名
     * <p> 示例值：5
     */
    this.academicRanking = builder.academicRanking;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    this.customizedData = builder.customizedData;
    /**
     * 学位
     * <p> 示例值：1
     */
    this.degree = builder.degree;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getEducationType() {
    return this.educationType;
  }

  public void setEducationType(Integer educationType) {
    this.educationType = educationType;
  }

  public Integer getEndTime() {
    return this.endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public String getFieldOfStudy() {
    return this.fieldOfStudy;
  }

  public void setFieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  public String getSchool() {
    return this.school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Integer getStartTime() {
    return this.startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public Integer getAcademicRanking() {
    return this.academicRanking;
  }

  public void setAcademicRanking(Integer academicRanking) {
    this.academicRanking = academicRanking;
  }

  public WebsiteDeliveryCustomizedData[] getCustomizedData() {
    return this.customizedData;
  }

  public void setCustomizedData(WebsiteDeliveryCustomizedData[] customizedData) {
    this.customizedData = customizedData;
  }

  public Integer getDegree() {
    return this.degree;
  }

  public void setDegree(Integer degree) {
    this.degree = degree;
  }

  public static class Builder {

    /**
     * 学历类型
     * <p> 示例值：1
     */
    private Integer educationType;
    /**
     * 结束时间 ,如果是至今传值 -1
     * <p> 示例值：1618500278663
     */
    private Integer endTime;
    /**
     * 专业
     * <p> 示例值：汉语言文学
     */
    private String fieldOfStudy;
    /**
     * 学校
     * <p> 示例值：香港中文大学
     */
    private String school;
    /**
     * 开始时间
     * <p> 示例值：1609430400
     */
    private Integer startTime;
    /**
     * 专业排名
     * <p> 示例值：5
     */
    private Integer academicRanking;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    private WebsiteDeliveryCustomizedData[] customizedData;
    /**
     * 学位
     * <p> 示例值：1
     */
    private Integer degree;

    /**
     * 学历类型
     * <p> 示例值：1
     *
     * @param educationType
     * @return
     */
    public Builder educationType(Integer educationType) {
      this.educationType = educationType;
      return this;
    }


    /**
     * 结束时间 ,如果是至今传值 -1
     * <p> 示例值：1618500278663
     *
     * @param endTime
     * @return
     */
    public Builder endTime(Integer endTime) {
      this.endTime = endTime;
      return this;
    }


    /**
     * 专业
     * <p> 示例值：汉语言文学
     *
     * @param fieldOfStudy
     * @return
     */
    public Builder fieldOfStudy(String fieldOfStudy) {
      this.fieldOfStudy = fieldOfStudy;
      return this;
    }


    /**
     * 学校
     * <p> 示例值：香港中文大学
     *
     * @param school
     * @return
     */
    public Builder school(String school) {
      this.school = school;
      return this;
    }


    /**
     * 开始时间
     * <p> 示例值：1609430400
     *
     * @param startTime
     * @return
     */
    public Builder startTime(Integer startTime) {
      this.startTime = startTime;
      return this;
    }


    /**
     * 专业排名
     * <p> 示例值：5
     *
     * @param academicRanking
     * @return
     */
    public Builder academicRanking(Integer academicRanking) {
      this.academicRanking = academicRanking;
      return this;
    }


    /**
     * 自定义字段
     * <p> 示例值：
     *
     * @param customizedData
     * @return
     */
    public Builder customizedData(WebsiteDeliveryCustomizedData[] customizedData) {
      this.customizedData = customizedData;
      return this;
    }


    /**
     * 学位
     * <p> 示例值：1
     *
     * @param degree
     * @return
     */
    public Builder degree(Integer degree) {
      this.degree = degree;
      return this;
    }


    public WebsiteDeliveryEducation build() {
      return new WebsiteDeliveryEducation(this);
    }
  }
}