package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.*;

import java.util.HashMap;

// POST /open-apis/hire/v1/referral_account/:referral_account_id/withdraw
public class WithdrawReferralAccountSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        WithdrawReferralAccountReq req = WithdrawReferralAccountReq.newBuilder()
                .referralAccountId("6942778198054125570")
                .withdrawReferralAccountReqBody(WithdrawReferralAccountReqBody.newBuilder()
                        .withdrawBonusType(new Integer[]{})
                        .externalOrderId("6942778198054125570")
                        .build())
                .build();

        // 发起请求
        WithdrawReferralAccountResp resp = client.hire().v1().referralAccount().withdraw(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
