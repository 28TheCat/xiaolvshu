package com.yating.framework.common.exception;

/**
 * @Author: yating
 * @Date: 2026/3/2 15:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface BaseExceptionInterface {

    //获取异常码
    String getErrorCode();

    //获取异常信息
    String getErrorMessage();
}
