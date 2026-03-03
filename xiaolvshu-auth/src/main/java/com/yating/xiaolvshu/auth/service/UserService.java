package com.yating.xiaolvshu.auth.service;

import com.yating.framework.common.response.Response;
import com.yating.xiaolvshu.auth.model.vo.user.UserLoginReqVO;

/**
 * @Author: yating
 * @Date: 2026/3/3 15:03
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface UserService {

    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);
}
