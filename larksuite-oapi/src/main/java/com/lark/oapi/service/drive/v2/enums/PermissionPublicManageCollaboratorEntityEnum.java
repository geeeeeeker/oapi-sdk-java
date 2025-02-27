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

package com.lark.oapi.service.drive.v2.enums;

/**
 * 谁可以添加和管理协作者-协作者维度
 */
public enum PermissionPublicManageCollaboratorEntityEnum {
    COLLABORATORCANVIEW("collaborator_can_view"), // 拥有可阅读权限的协作者
    COLLABORATORCANEDIT("collaborator_can_edit"), // 拥有可编辑权限的协作者
    COLLABORATORFULLACCESS("collaborator_full_access"), // 拥有可管理权限（包括我）的协作者
    ;
    private String value;

    PermissionPublicManageCollaboratorEntityEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}