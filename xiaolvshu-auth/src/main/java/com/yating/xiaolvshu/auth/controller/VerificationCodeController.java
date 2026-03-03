package com.yating.xiaolvshu.auth.controller;

import com.yating.framework.biz.operationlog.aspect.ApiOperationLog;
import com.yating.framework.common.response.Response;
import com.yating.xiaolvshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;
import com.yating.xiaolvshu.auth.service.VerificationCodeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yating
 * @Date: 2026/3/3 14:19
 * @Version: v1.0.0
 * @Description: TODO
 **/
@RestController
@Slf4j
public class VerificationCodeController {

    @Resource
    private VerificationCodeService verificationCodeService;

    @PostMapping("/verification/code/send")
    @ApiOperationLog(description = "发送短信验证码")
    public Response<?> send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return verificationCodeService.send(sendVerificationCodeReqVO);
    }

}
