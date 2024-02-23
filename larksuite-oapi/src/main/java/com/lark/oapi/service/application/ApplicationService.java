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
package com.lark.oapi.service.application;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.application.v6.V6;
import com.lark.oapi.service.application.v6.model.*;
import com.lark.oapi.service.application.v6.resource.AppBadge;
import com.lark.oapi.service.application.v6.resource.AppRecommendRule;
import com.lark.oapi.service.application.v6.resource.Application;
import com.lark.oapi.service.application.v6.resource.ApplicationAppUsage;
import com.lark.oapi.service.application.v6.resource.ApplicationAppVersion;
import com.lark.oapi.service.application.v6.resource.ApplicationFeedback;
import com.lark.oapi.service.application.v6.resource.ApplicationVisibility;
import com.lark.oapi.service.application.v6.resource.Bot;
import com.lark.oapi.service.application.v6.resource.*;

public class ApplicationService {
    private final V6 v6;
    private final AppBadge appBadge; // 应用红点
    private final AppRecommendRule appRecommendRule; // 我的常用推荐规则
    private final Application application; // 应用
    private final ApplicationAppUsage applicationAppUsage; // 应用使用情况
    private final ApplicationAppVersion applicationAppVersion; // 事件
    private final ApplicationContactsRange applicationContactsRange; // application.contacts_range
    private final ApplicationFeedback applicationFeedback; // 应用反馈
    private final ApplicationManagement applicationManagement; // application.management
    private final ApplicationVisibility applicationVisibility; // 事件
    private final Bot bot; // 事件

    public ApplicationService(Config config) {
        this.v6 = new V6(config);
        this.appBadge = new AppBadge(config);
        this.appRecommendRule = new AppRecommendRule(config);
        this.application = new Application(config);
        this.applicationAppUsage = new ApplicationAppUsage(config);
        this.applicationAppVersion = new ApplicationAppVersion(config);
        this.applicationContactsRange = new ApplicationContactsRange(config);
        this.applicationFeedback = new ApplicationFeedback(config);
        this.applicationManagement = new ApplicationManagement(config);
        this.applicationVisibility = new ApplicationVisibility(config);
        this.bot = new Bot(config);
    }

    public V6 v6() {
        return v6;
    }

    public AppBadge appBadge() {
        return appBadge;
    }

    public AppRecommendRule appRecommendRule() {
        return appRecommendRule;
    }

    public Application application() {
        return application;
    }

    public ApplicationAppUsage applicationAppUsage() {
        return applicationAppUsage;
    }

    public ApplicationAppVersion applicationAppVersion() {
        return applicationAppVersion;
    }

    public ApplicationContactsRange applicationContactsRange() {
        return applicationContactsRange;
    }

    public ApplicationFeedback applicationFeedback() {
        return applicationFeedback;
    }

    public ApplicationManagement applicationManagement() {
        return applicationManagement;
    }

    public ApplicationVisibility applicationVisibility() {
        return applicationVisibility;
    }

    public Bot bot() {
        return bot;
    }

    public abstract static class P2ApplicationCreatedV6Handler implements IEventHandler<P2ApplicationCreatedV6> {
        @Override
        public P2ApplicationCreatedV6 getEvent() {
            return new P2ApplicationCreatedV6();
        }
    }

    public abstract static class P2ApplicationAppVersionAuditV6Handler implements IEventHandler<P2ApplicationAppVersionAuditV6> {
        @Override
        public P2ApplicationAppVersionAuditV6 getEvent() {
            return new P2ApplicationAppVersionAuditV6();
        }
    }

    public abstract static class P2ApplicationAppVersionPublishApplyV6Handler implements IEventHandler<P2ApplicationAppVersionPublishApplyV6> {
        @Override
        public P2ApplicationAppVersionPublishApplyV6 getEvent() {
            return new P2ApplicationAppVersionPublishApplyV6();
        }
    }

    public abstract static class P2ApplicationAppVersionPublishRevokeV6Handler implements IEventHandler<P2ApplicationAppVersionPublishRevokeV6> {
        @Override
        public P2ApplicationAppVersionPublishRevokeV6 getEvent() {
            return new P2ApplicationAppVersionPublishRevokeV6();
        }
    }

    public abstract static class P2ApplicationFeedbackCreatedV6Handler implements IEventHandler<P2ApplicationFeedbackCreatedV6> {
        @Override
        public P2ApplicationFeedbackCreatedV6 getEvent() {
            return new P2ApplicationFeedbackCreatedV6();
        }
    }

    public abstract static class P2ApplicationFeedbackUpdatedV6Handler implements IEventHandler<P2ApplicationFeedbackUpdatedV6> {
        @Override
        public P2ApplicationFeedbackUpdatedV6 getEvent() {
            return new P2ApplicationFeedbackUpdatedV6();
        }
    }

    public abstract static class P2ApplicationVisibilityAddedV6Handler implements IEventHandler<P2ApplicationVisibilityAddedV6> {
        @Override
        public P2ApplicationVisibilityAddedV6 getEvent() {
            return new P2ApplicationVisibilityAddedV6();
        }
    }

    public abstract static class P2BotMenuV6Handler implements IEventHandler<P2BotMenuV6> {
        @Override
        public P2BotMenuV6 getEvent() {
            return new P2BotMenuV6();
        }
    }

    public abstract static class P1AppOpenV6Handler implements IEventHandler<P1AppOpenV6> {
        @Override
        public P1AppOpenV6 getEvent() {
            return new P1AppOpenV6();
        }
    }

    public abstract static class P1AppStatusChangedV6Handler implements IEventHandler<P1AppStatusChangedV6> {
        @Override
        public P1AppStatusChangedV6 getEvent() {
            return new P1AppStatusChangedV6();
        }
    }

    public abstract static class P1OrderPaidV6Handler implements IEventHandler<P1OrderPaidV6> {
        @Override
        public P1OrderPaidV6 getEvent() {
            return new P1OrderPaidV6();
        }
    }

    public abstract static class P1AppUninstalledV6Handler implements IEventHandler<P1AppUninstalledV6> {
        @Override
        public P1AppUninstalledV6 getEvent() {
            return new P1AppUninstalledV6();
        }
    }
}