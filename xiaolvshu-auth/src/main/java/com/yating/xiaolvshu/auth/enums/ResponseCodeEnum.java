package com.yating.xiaolvshu.auth.enums;

import com.yating.framework.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yating
 * @Date: 2026/3/3 13:11
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {
    //通用异常状态码
    SYSTEM_ERROR("AUTH-10000","后台出错"),
    PARAM_NOT_VALID("AUTH-10001","参数错误");

    //业务异常状态码
    private final String errorCode;
    private final String errorMessage;
}
