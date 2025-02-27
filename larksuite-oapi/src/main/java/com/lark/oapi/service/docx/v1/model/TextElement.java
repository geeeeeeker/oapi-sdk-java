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

package com.lark.oapi.service.docx.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
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

public class TextElement {
    /**
     * 文字
     * <p> 示例值：
     */
    @SerializedName("text_run")
    private TextRun textRun;
    /**
     * @用户 <p> 示例值：
     */
    @SerializedName("mention_user")
    private MentionUser mentionUser;
    /**
     * @文档 <p> 示例值：
     */
    @SerializedName("mention_doc")
    private MentionDoc mentionDoc;
    /**
     * 日期提醒
     * <p> 示例值：
     */
    @SerializedName("reminder")
    private Reminder reminder;
    /**
     * 内联附件
     * <p> 示例值：
     */
    @SerializedName("file")
    private InlineFile file;
    /**
     * 未支持的 TextElement
     * <p> 示例值：
     */
    @SerializedName("undefined")
    private UndefinedElement undefined;
    /**
     * 内联 block
     * <p> 示例值：
     */
    @SerializedName("inline_block")
    private InlineBlock inlineBlock;
    /**
     * 公式
     * <p> 示例值：
     */
    @SerializedName("equation")
    private Equation equation;

    // builder 开始
    public TextElement() {
    }

    public TextElement(Builder builder) {
        /**
         * 文字
         * <p> 示例值：
         */
        this.textRun = builder.textRun;
        /**
         * @用户
         * <p> 示例值：
         */
        this.mentionUser = builder.mentionUser;
        /**
         * @文档
         * <p> 示例值：
         */
        this.mentionDoc = builder.mentionDoc;
        /**
         * 日期提醒
         * <p> 示例值：
         */
        this.reminder = builder.reminder;
        /**
         * 内联附件
         * <p> 示例值：
         */
        this.file = builder.file;
        /**
         * 未支持的 TextElement
         * <p> 示例值：
         */
        this.undefined = builder.undefined;
        /**
         * 内联 block
         * <p> 示例值：
         */
        this.inlineBlock = builder.inlineBlock;
        /**
         * 公式
         * <p> 示例值：
         */
        this.equation = builder.equation;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public TextRun getTextRun() {
        return this.textRun;
    }

    public void setTextRun(TextRun textRun) {
        this.textRun = textRun;
    }

    public MentionUser getMentionUser() {
        return this.mentionUser;
    }

    public void setMentionUser(MentionUser mentionUser) {
        this.mentionUser = mentionUser;
    }

    public MentionDoc getMentionDoc() {
        return this.mentionDoc;
    }

    public void setMentionDoc(MentionDoc mentionDoc) {
        this.mentionDoc = mentionDoc;
    }

    public Reminder getReminder() {
        return this.reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public InlineFile getFile() {
        return this.file;
    }

    public void setFile(InlineFile file) {
        this.file = file;
    }

    public UndefinedElement getUndefined() {
        return this.undefined;
    }

    public void setUndefined(UndefinedElement undefined) {
        this.undefined = undefined;
    }

    public InlineBlock getInlineBlock() {
        return this.inlineBlock;
    }

    public void setInlineBlock(InlineBlock inlineBlock) {
        this.inlineBlock = inlineBlock;
    }

    public Equation getEquation() {
        return this.equation;
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }

    public static class Builder {
        /**
         * 文字
         * <p> 示例值：
         */
        private TextRun textRun;
        /**
         * @用户 <p> 示例值：
         */
        private MentionUser mentionUser;
        /**
         * @文档 <p> 示例值：
         */
        private MentionDoc mentionDoc;
        /**
         * 日期提醒
         * <p> 示例值：
         */
        private Reminder reminder;
        /**
         * 内联附件
         * <p> 示例值：
         */
        private InlineFile file;
        /**
         * 未支持的 TextElement
         * <p> 示例值：
         */
        private UndefinedElement undefined;
        /**
         * 内联 block
         * <p> 示例值：
         */
        private InlineBlock inlineBlock;
        /**
         * 公式
         * <p> 示例值：
         */
        private Equation equation;

        /**
         * 文字
         * <p> 示例值：
         *
         * @param textRun
         * @return
         */
        public Builder textRun(TextRun textRun) {
            this.textRun = textRun;
            return this;
        }


        /**
         * @param mentionUser
         * @return
         * @用户 <p> 示例值：
         */
        public Builder mentionUser(MentionUser mentionUser) {
            this.mentionUser = mentionUser;
            return this;
        }


        /**
         * @param mentionDoc
         * @return
         * @文档 <p> 示例值：
         */
        public Builder mentionDoc(MentionDoc mentionDoc) {
            this.mentionDoc = mentionDoc;
            return this;
        }


        /**
         * 日期提醒
         * <p> 示例值：
         *
         * @param reminder
         * @return
         */
        public Builder reminder(Reminder reminder) {
            this.reminder = reminder;
            return this;
        }


        /**
         * 内联附件
         * <p> 示例值：
         *
         * @param file
         * @return
         */
        public Builder file(InlineFile file) {
            this.file = file;
            return this;
        }


        /**
         * 未支持的 TextElement
         * <p> 示例值：
         *
         * @param undefined
         * @return
         */
        public Builder undefined(UndefinedElement undefined) {
            this.undefined = undefined;
            return this;
        }


        /**
         * 内联 block
         * <p> 示例值：
         *
         * @param inlineBlock
         * @return
         */
        public Builder inlineBlock(InlineBlock inlineBlock) {
            this.inlineBlock = inlineBlock;
            return this;
        }


        /**
         * 公式
         * <p> 示例值：
         *
         * @param equation
         * @return
         */
        public Builder equation(Equation equation) {
            this.equation = equation;
            return this;
        }


        public TextElement build() {
            return new TextElement(this);
        }
    }
}
