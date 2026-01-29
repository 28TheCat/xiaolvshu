package com.yating.xiaolvshu.auth.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.yating.framework.biz.operationlog.aspect.ApiOperationLog;
import com.yating.framework.common.response.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class TestController {

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("success");
    }

    /**
     * 测试接口2
     * @param user
     * @return
     */
    @PostMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2(@RequestBody @Validated User user) {
        int i = 1 / 0;
        return Response.success(user);
    }

    /**
     * 测试登录
     * @param username
     * @param password
     * @return
     */

    @RequestMapping("/user/doLogin")
    public String doLogin(String  username, String password) {
        if ("admin".equals(username) && "admin".equals(password)){
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    //http://localhost:8080/user/getInfo
    @RequestMapping("/user/getInfo")
    public String getInfo() {
        return "当前会话是否登录："+StpUtil.isLogin()+" 当前登录用户：" + StpUtil.getLoginId();
    }
}
