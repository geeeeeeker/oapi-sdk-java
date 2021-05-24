// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bot.v3;

import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.Request;
import com.larksuite.oapi.core.api.request.RequestOptFn;
import com.larksuite.oapi.core.api.response.Response;
import com.larksuite.oapi.service.bot.v3.model.BotGetResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BotService {

    private final Config config;
    private final Bots bots;

    public BotService(Config config) {
        this.config = config;
        this.bots = new Bots(this);
    }

    public Bots getBots() {
        return bots;
    }

    public static class Bots {

        private final BotService service;

        public Bots(BotService service) {
            this.service = service;
        }

        public BotGetReqCall get(RequestOptFn... optFns) {
            return new BotGetReqCall(this, optFns);
        }

    }

    public static class BotGetReqCall extends ReqCaller<Object, BotGetResult> {
        private final Bots bots;

        private final List<RequestOptFn> optFns;
        private BotGetResult result;

        private BotGetReqCall(Bots bots, RequestOptFn... optFns) {

            this.optFns = new ArrayList<>();
            this.optFns.add(Request.setNotDataField());
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new BotGetResult();
            this.bots = bots;
        }


        @Override
        public Response<BotGetResult> execute() throws Exception {
            Request<Object, BotGetResult> request = Request.newRequest("bot/v3/info", "GET",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.bots.service.config, request);
        }
    }

}