package com.yating.xiaolvshu.auth.controller;

import com.yating.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yating
 * @Date: 2026/3/2 15:34
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("测试成功，success");
    }
}
