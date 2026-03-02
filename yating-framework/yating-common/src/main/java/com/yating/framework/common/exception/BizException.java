package com.yating.framework.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
  *@Author: yating
  *@Date: 2026/3/2 15:10
  *@Version: v1.0.0
  *@Description: TODO
 **/
@Getter
@Setter
public class BizException extends RuntimeException {
  //异常码
    private String errorCode;
    //错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface){
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
