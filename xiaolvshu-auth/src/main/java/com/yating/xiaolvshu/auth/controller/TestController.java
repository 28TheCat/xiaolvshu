package com.yating.xiaolvshu.auth.controller;

import com.yating.framework.biz.operationlog.aspect.ApiOperationLog;
import com.yating.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Author: yating
 * @Date: 2026/3/2 15:34
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("测试成功，success");
    }

    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2() {
        return Response.success(
                User.builder()
                        .nickName("28miao")
                        .createTime(LocalDateTime.now())
                        .build()
        );
    }
}
