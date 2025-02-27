package com.lark.oapi.sample.apiall.corehrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v1.model.*;

import java.util.HashMap;

import com.lark.oapi.service.corehr.v1.model.Enum;

// PATCH /open-apis/corehr/v1/contracts/:contract_id
public class PatchContractSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchContractReq req = PatchContractReq.newBuilder()
                .contractId("1616161616")
                .clientToken("12454646")
                .contract(Contract.newBuilder()
                        .effectiveTime("2050-01-01 00:00:00")
                        .expirationTime("9999-12-31 23:59:59")
                        .employmentId("6893013238632416776")
                        .contractType(Enum.newBuilder().build())
                        .firstPartyCompanyId("6892686614112241165")
                        .personId("151515151")
                        .customFields(new ObjectFieldData[]{})
                        .durationType(Enum.newBuilder().build())
                        .contractEndDate("2006-01-02")
                        .contractNumber("6919737965274990093")
                        .signingType(Enum.newBuilder().build())
                        .build())
                .build();

        // 发起请求
        PatchContractResp resp = client.corehr().v1().contract().patch(req);

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
