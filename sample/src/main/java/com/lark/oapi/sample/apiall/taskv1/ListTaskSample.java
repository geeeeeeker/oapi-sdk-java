package com.lark.oapi.sample.apiall.taskv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.task.v1.model.ListTaskReq;
import com.lark.oapi.service.task.v1.model.ListTaskResp;

// HTTP PATH: /open-apis/task/v1/tasks"
public class ListTaskSample {

  public static void main(String arg[]) throws Exception {
    // 构建client
    Client client = Client.newBuilder("appId", "appSecret").build();

    // 创建请求对象
    ListTaskReq req = ListTaskReq.newBuilder()
        .pageSize(0)
        .pageToken("")
        .startCreateTime("")
        .endCreateTime("")
        .taskCompleted(false)
        .userIdType("user_id")
        .build();

    // 发起请求
    ListTaskResp resp = client.task().task().list(req);

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