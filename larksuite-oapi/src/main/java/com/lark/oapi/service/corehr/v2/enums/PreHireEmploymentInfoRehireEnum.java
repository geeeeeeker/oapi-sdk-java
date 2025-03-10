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

package com.lark.oapi.service.corehr.v2.enums;

/**
 * 是否离职重聘
 */
public enum PreHireEmploymentInfoRehireEnum {
    TOBECONFIRMED("to_be_confirmed"), // 待确认，系统会判断该员工是否存在历史雇佣记录，如果存在且需要二次确认时会调用失败，并返回历史雇佣记录
    NO("no"), // 否，系统直接标为非离职重聘人员，不再做重复判断
    YES("yes"), // 是，要求历史雇佣信息 ID 必填
    ;
    private String value;

    PreHireEmploymentInfoRehireEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}