package com.yating.xiaolvshu.auth.service;

import com.yating.framework.common.response.Response;
import com.yating.xiaolvshu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

/**
 * @Author: yating
 * @Date: 2026/3/3 14:14
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface VerificationCodeService {
    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}