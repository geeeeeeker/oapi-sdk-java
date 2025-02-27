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

import com.lark.oapi.core.response.EmptyData;
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

public class JobRequirement {
    /**
     * 招聘需求编号
     * <p> 示例值：xx1
     */
    @SerializedName("short_code")
    private String shortCode;
    /**
     * 需求名称
     * <p> 示例值：test
     */
    @SerializedName("name")
    private String name;
    /**
     * 需求状态
     * <p> 示例值：1
     */
    @SerializedName("display_progress")
    private Integer displayProgress;
    /**
     * 需求人数
     * <p> 示例值：11
     */
    @SerializedName("head_count")
    private Integer headCount;
    /**
     * 职位性质 ID，可在「招聘枚举常量」文档中查看枚举值
     * <p> 示例值：101
     */
    @SerializedName("recruitment_type_id")
    private String recruitmentTypeId;
    /**
     * 人员类型
     * <p> 示例值：6807409776231254285
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 最高职级 ID
     * <p> 示例值：6807409776231254285
     */
    @SerializedName("max_level_id")
    private String maxLevelId;
    /**
     * 最低职级 ID
     * <p> 示例值：6911957338526091534
     */
    @SerializedName("min_level_id")
    private String minLevelId;
    /**
     * 职位序列 ID
     * <p> 示例值：6911957338526091536
     */
    @SerializedName("sequence_id")
    private String sequenceId;
    /**
     * 需求类型
     * <p> 示例值：1
     */
    @SerializedName("category")
    private Integer category;
    /**
     * 需求部门的 open department id
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 需求负责人 ID 列表
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("recruiter_id_list")
    private String[] recruiterIdList;
    /**
     * 需求用人经理 ID 列表
     * <p> 示例值：
     */
    @SerializedName("jr_hiring_manager_id_list")
    private String[] jrHiringManagerIdList;
    /**
     * 直属上级 ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("direct_leader_id_list")
    private String[] directLeaderIdList;
    /**
     * 开始日期，毫秒级时间戳
     * <p> 示例值：1625729379000
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 预计完成日期，毫秒级时间戳
     * <p> 示例值：1625729379000
     */
    @SerializedName("deadline")
    private String deadline;
    /**
     * 招聘优先级
     * <p> 示例值：1
     */
    @SerializedName("priority")
    private Integer priority;
    /**
     * 学历要求
     * <p> 示例值：1
     */
    @SerializedName("required_degree")
    private Integer requiredDegree;
    /**
     * 最高薪资，单位：千
     * <p> 示例值：10
     */
    @SerializedName("max_salary")
    private String maxSalary;
    /**
     * 最低薪资，单位：千
     * <p> 示例值：15
     */
    @SerializedName("min_salary")
    private String minSalary;
    /**
     * 工作地点 ID，枚举值可通过「获取地址列表」接口查询获得
     * <p> 示例值：11
     */
    @SerializedName("address_id")
    private String addressId;
    /**
     * 需求描述
     * <p> 示例值：11
     */
    @SerializedName("description")
    private String description;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("customized_data_list")
    private JobRequirementCustomizedData[] customizedDataList;
    /**
     * 支持的招聘类型列表
     * <p> 示例值：1
     */
    @SerializedName("process_type")
    private Integer processType;
    /**
     * 招聘需求中的职位类别
     * <p> 示例值：6930815272790114324
     */
    @SerializedName("job_type_id")
    private String jobTypeId;

    // builder 开始
    public JobRequirement() {
    }

    public JobRequirement(Builder builder) {
        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         */
        this.shortCode = builder.shortCode;
        /**
         * 需求名称
         * <p> 示例值：test
         */
        this.name = builder.name;
        /**
         * 需求状态
         * <p> 示例值：1
         */
        this.displayProgress = builder.displayProgress;
        /**
         * 需求人数
         * <p> 示例值：11
         */
        this.headCount = builder.headCount;
        /**
         * 职位性质 ID，可在「招聘枚举常量」文档中查看枚举值
         * <p> 示例值：101
         */
        this.recruitmentTypeId = builder.recruitmentTypeId;
        /**
         * 人员类型
         * <p> 示例值：6807409776231254285
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 最高职级 ID
         * <p> 示例值：6807409776231254285
         */
        this.maxLevelId = builder.maxLevelId;
        /**
         * 最低职级 ID
         * <p> 示例值：6911957338526091534
         */
        this.minLevelId = builder.minLevelId;
        /**
         * 职位序列 ID
         * <p> 示例值：6911957338526091536
         */
        this.sequenceId = builder.sequenceId;
        /**
         * 需求类型
         * <p> 示例值：1
         */
        this.category = builder.category;
        /**
         * 需求部门的 open department id
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        this.departmentId = builder.departmentId;
        /**
         * 需求负责人 ID 列表
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.recruiterIdList = builder.recruiterIdList;
        /**
         * 需求用人经理 ID 列表
         * <p> 示例值：
         */
        this.jrHiringManagerIdList = builder.jrHiringManagerIdList;
        /**
         * 直属上级 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.directLeaderIdList = builder.directLeaderIdList;
        /**
         * 开始日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         */
        this.startTime = builder.startTime;
        /**
         * 预计完成日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         */
        this.deadline = builder.deadline;
        /**
         * 招聘优先级
         * <p> 示例值：1
         */
        this.priority = builder.priority;
        /**
         * 学历要求
         * <p> 示例值：1
         */
        this.requiredDegree = builder.requiredDegree;
        /**
         * 最高薪资，单位：千
         * <p> 示例值：10
         */
        this.maxSalary = builder.maxSalary;
        /**
         * 最低薪资，单位：千
         * <p> 示例值：15
         */
        this.minSalary = builder.minSalary;
        /**
         * 工作地点 ID，枚举值可通过「获取地址列表」接口查询获得
         * <p> 示例值：11
         */
        this.addressId = builder.addressId;
        /**
         * 需求描述
         * <p> 示例值：11
         */
        this.description = builder.description;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customizedDataList = builder.customizedDataList;
        /**
         * 支持的招聘类型列表
         * <p> 示例值：1
         */
        this.processType = builder.processType;
        /**
         * 招聘需求中的职位类别
         * <p> 示例值：6930815272790114324
         */
        this.jobTypeId = builder.jobTypeId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDisplayProgress() {
        return this.displayProgress;
    }

    public void setDisplayProgress(Integer displayProgress) {
        this.displayProgress = displayProgress;
    }

    public Integer getHeadCount() {
        return this.headCount;
    }

    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
    }

    public String getRecruitmentTypeId() {
        return this.recruitmentTypeId;
    }

    public void setRecruitmentTypeId(String recruitmentTypeId) {
        this.recruitmentTypeId = recruitmentTypeId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getMaxLevelId() {
        return this.maxLevelId;
    }

    public void setMaxLevelId(String maxLevelId) {
        this.maxLevelId = maxLevelId;
    }

    public String getMinLevelId() {
        return this.minLevelId;
    }

    public void setMinLevelId(String minLevelId) {
        this.minLevelId = minLevelId;
    }

    public String getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String[] getRecruiterIdList() {
        return this.recruiterIdList;
    }

    public void setRecruiterIdList(String[] recruiterIdList) {
        this.recruiterIdList = recruiterIdList;
    }

    public String[] getJrHiringManagerIdList() {
        return this.jrHiringManagerIdList;
    }

    public void setJrHiringManagerIdList(String[] jrHiringManagerIdList) {
        this.jrHiringManagerIdList = jrHiringManagerIdList;
    }

    public String[] getDirectLeaderIdList() {
        return this.directLeaderIdList;
    }

    public void setDirectLeaderIdList(String[] directLeaderIdList) {
        this.directLeaderIdList = directLeaderIdList;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRequiredDegree() {
        return this.requiredDegree;
    }

    public void setRequiredDegree(Integer requiredDegree) {
        this.requiredDegree = requiredDegree;
    }

    public String getMaxSalary() {
        return this.maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return this.minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobRequirementCustomizedData[] getCustomizedDataList() {
        return this.customizedDataList;
    }

    public void setCustomizedDataList(JobRequirementCustomizedData[] customizedDataList) {
        this.customizedDataList = customizedDataList;
    }

    public Integer getProcessType() {
        return this.processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public String getJobTypeId() {
        return this.jobTypeId;
    }

    public void setJobTypeId(String jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    public static class Builder {
        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         */
        private String shortCode;
        /**
         * 需求名称
         * <p> 示例值：test
         */
        private String name;
        /**
         * 需求状态
         * <p> 示例值：1
         */
        private Integer displayProgress;
        /**
         * 需求人数
         * <p> 示例值：11
         */
        private Integer headCount;
        /**
         * 职位性质 ID，可在「招聘枚举常量」文档中查看枚举值
         * <p> 示例值：101
         */
        private String recruitmentTypeId;
        /**
         * 人员类型
         * <p> 示例值：6807409776231254285
         */
        private String employeeTypeId;
        /**
         * 最高职级 ID
         * <p> 示例值：6807409776231254285
         */
        private String maxLevelId;
        /**
         * 最低职级 ID
         * <p> 示例值：6911957338526091534
         */
        private String minLevelId;
        /**
         * 职位序列 ID
         * <p> 示例值：6911957338526091536
         */
        private String sequenceId;
        /**
         * 需求类型
         * <p> 示例值：1
         */
        private Integer category;
        /**
         * 需求部门的 open department id
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        private String departmentId;
        /**
         * 需求负责人 ID 列表
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String[] recruiterIdList;
        /**
         * 需求用人经理 ID 列表
         * <p> 示例值：
         */
        private String[] jrHiringManagerIdList;
        /**
         * 直属上级 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String[] directLeaderIdList;
        /**
         * 开始日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         */
        private String startTime;
        /**
         * 预计完成日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         */
        private String deadline;
        /**
         * 招聘优先级
         * <p> 示例值：1
         */
        private Integer priority;
        /**
         * 学历要求
         * <p> 示例值：1
         */
        private Integer requiredDegree;
        /**
         * 最高薪资，单位：千
         * <p> 示例值：10
         */
        private String maxSalary;
        /**
         * 最低薪资，单位：千
         * <p> 示例值：15
         */
        private String minSalary;
        /**
         * 工作地点 ID，枚举值可通过「获取地址列表」接口查询获得
         * <p> 示例值：11
         */
        private String addressId;
        /**
         * 需求描述
         * <p> 示例值：11
         */
        private String description;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private JobRequirementCustomizedData[] customizedDataList;
        /**
         * 支持的招聘类型列表
         * <p> 示例值：1
         */
        private Integer processType;
        /**
         * 招聘需求中的职位类别
         * <p> 示例值：6930815272790114324
         */
        private String jobTypeId;

        /**
         * 招聘需求编号
         * <p> 示例值：xx1
         *
         * @param shortCode
         * @return
         */
        public Builder shortCode(String shortCode) {
            this.shortCode = shortCode;
            return this;
        }


        /**
         * 需求名称
         * <p> 示例值：test
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 需求状态
         * <p> 示例值：1
         *
         * @param displayProgress
         * @return
         */
        public Builder displayProgress(Integer displayProgress) {
            this.displayProgress = displayProgress;
            return this;
        }


        /**
         * 需求人数
         * <p> 示例值：11
         *
         * @param headCount
         * @return
         */
        public Builder headCount(Integer headCount) {
            this.headCount = headCount;
            return this;
        }


        /**
         * 职位性质 ID，可在「招聘枚举常量」文档中查看枚举值
         * <p> 示例值：101
         *
         * @param recruitmentTypeId
         * @return
         */
        public Builder recruitmentTypeId(String recruitmentTypeId) {
            this.recruitmentTypeId = recruitmentTypeId;
            return this;
        }


        /**
         * 人员类型
         * <p> 示例值：6807409776231254285
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 最高职级 ID
         * <p> 示例值：6807409776231254285
         *
         * @param maxLevelId
         * @return
         */
        public Builder maxLevelId(String maxLevelId) {
            this.maxLevelId = maxLevelId;
            return this;
        }


        /**
         * 最低职级 ID
         * <p> 示例值：6911957338526091534
         *
         * @param minLevelId
         * @return
         */
        public Builder minLevelId(String minLevelId) {
            this.minLevelId = minLevelId;
            return this;
        }


        /**
         * 职位序列 ID
         * <p> 示例值：6911957338526091536
         *
         * @param sequenceId
         * @return
         */
        public Builder sequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }


        /**
         * 需求类型
         * <p> 示例值：1
         *
         * @param category
         * @return
         */
        public Builder category(Integer category) {
            this.category = category;
            return this;
        }


        /**
         * 需求部门的 open department id
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 需求负责人 ID 列表
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param recruiterIdList
         * @return
         */
        public Builder recruiterIdList(String[] recruiterIdList) {
            this.recruiterIdList = recruiterIdList;
            return this;
        }


        /**
         * 需求用人经理 ID 列表
         * <p> 示例值：
         *
         * @param jrHiringManagerIdList
         * @return
         */
        public Builder jrHiringManagerIdList(String[] jrHiringManagerIdList) {
            this.jrHiringManagerIdList = jrHiringManagerIdList;
            return this;
        }


        /**
         * 直属上级 ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param directLeaderIdList
         * @return
         */
        public Builder directLeaderIdList(String[] directLeaderIdList) {
            this.directLeaderIdList = directLeaderIdList;
            return this;
        }


        /**
         * 开始日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 预计完成日期，毫秒级时间戳
         * <p> 示例值：1625729379000
         *
         * @param deadline
         * @return
         */
        public Builder deadline(String deadline) {
            this.deadline = deadline;
            return this;
        }


        /**
         * 招聘优先级
         * <p> 示例值：1
         *
         * @param priority
         * @return
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }


        /**
         * 学历要求
         * <p> 示例值：1
         *
         * @param requiredDegree
         * @return
         */
        public Builder requiredDegree(Integer requiredDegree) {
            this.requiredDegree = requiredDegree;
            return this;
        }


        /**
         * 最高薪资，单位：千
         * <p> 示例值：10
         *
         * @param maxSalary
         * @return
         */
        public Builder maxSalary(String maxSalary) {
            this.maxSalary = maxSalary;
            return this;
        }


        /**
         * 最低薪资，单位：千
         * <p> 示例值：15
         *
         * @param minSalary
         * @return
         */
        public Builder minSalary(String minSalary) {
            this.minSalary = minSalary;
            return this;
        }


        /**
         * 工作地点 ID，枚举值可通过「获取地址列表」接口查询获得
         * <p> 示例值：11
         *
         * @param addressId
         * @return
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
            return this;
        }


        /**
         * 需求描述
         * <p> 示例值：11
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customizedDataList
         * @return
         */
        public Builder customizedDataList(JobRequirementCustomizedData[] customizedDataList) {
            this.customizedDataList = customizedDataList;
            return this;
        }


        /**
         * 支持的招聘类型列表
         * <p> 示例值：1
         *
         * @param processType
         * @return
         */
        public Builder processType(Integer processType) {
            this.processType = processType;
            return this;
        }


        /**
         * 招聘需求中的职位类别
         * <p> 示例值：6930815272790114324
         *
         * @param jobTypeId
         * @return
         */
        public Builder jobTypeId(String jobTypeId) {
            this.jobTypeId = jobTypeId;
            return this;
        }


        public JobRequirement build() {
            return new JobRequirement(this);
        }
    }
}
