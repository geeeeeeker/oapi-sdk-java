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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class OvertimeClockCfg {
    /**
     * 是否允许在非打卡时段申请打卡（仅灰度租户可用）
     * <p> 示例值：false
     */
    @SerializedName("allow_punch_approval")
    private Boolean allowPunchApproval;
    /**
     * 加班开始和结束需打卡(需灰度)
     * <p> 示例值：false
     */
    @SerializedName("need_clock_over_time_start_and_end")
    private Boolean needClockOverTimeStartAndEnd;

    // builder 开始
    public OvertimeClockCfg() {
    }

    public OvertimeClockCfg(Builder builder) {
        /**
         * 是否允许在非打卡时段申请打卡（仅灰度租户可用）
         * <p> 示例值：false
         */
        this.allowPunchApproval = builder.allowPunchApproval;
        /**
         * 加班开始和结束需打卡(需灰度)
         * <p> 示例值：false
         */
        this.needClockOverTimeStartAndEnd = builder.needClockOverTimeStartAndEnd;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getAllowPunchApproval() {
        return this.allowPunchApproval;
    }

    public void setAllowPunchApproval(Boolean allowPunchApproval) {
        this.allowPunchApproval = allowPunchApproval;
    }

    public Boolean getNeedClockOverTimeStartAndEnd() {
        return this.needClockOverTimeStartAndEnd;
    }

    public void setNeedClockOverTimeStartAndEnd(Boolean needClockOverTimeStartAndEnd) {
        this.needClockOverTimeStartAndEnd = needClockOverTimeStartAndEnd;
    }

    public static class Builder {
        /**
         * 是否允许在非打卡时段申请打卡（仅灰度租户可用）
         * <p> 示例值：false
         */
        private Boolean allowPunchApproval;
        /**
         * 加班开始和结束需打卡(需灰度)
         * <p> 示例值：false
         */
        private Boolean needClockOverTimeStartAndEnd;

        /**
         * 是否允许在非打卡时段申请打卡（仅灰度租户可用）
         * <p> 示例值：false
         *
         * @param allowPunchApproval
         * @return
         */
        public Builder allowPunchApproval(Boolean allowPunchApproval) {
            this.allowPunchApproval = allowPunchApproval;
            return this;
        }


        /**
         * 加班开始和结束需打卡(需灰度)
         * <p> 示例值：false
         *
         * @param needClockOverTimeStartAndEnd
         * @return
         */
        public Builder needClockOverTimeStartAndEnd(Boolean needClockOverTimeStartAndEnd) {
            this.needClockOverTimeStartAndEnd = needClockOverTimeStartAndEnd;
            return this;
        }


        public OvertimeClockCfg build() {
            return new OvertimeClockCfg(this);
        }
    }
}
