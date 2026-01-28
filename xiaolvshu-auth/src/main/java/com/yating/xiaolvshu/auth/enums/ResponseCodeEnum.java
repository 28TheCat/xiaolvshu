package com.yating.xiaolvshu.auth.enums;

import com.yating.framework.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: yating
 * @Date: 2026/1/27 17:58
 * @Version: v1.0.0
 * @Description: 响应码枚举类，用于定义系统异常和业务异常的状态码及错误信息
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {
    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("AUTH-10000", "后端错误"),
    PARAM_NOT_VALID("AUTH-10001", "参数错误"),

    // ----------- 业务异常状态码 -----------
    BUSINESS_ERROR("AUTH-10002", "业务逻辑错误"),
    AUTHENTICATION_FAILED("AUTH-10003", "认证失败"),
    PERMISSION_DENIED("AUTH-10004", "权限不足"),
    DATA_NOT_FOUND("AUTH-10005", "数据未找到"),
    SERVICE_UNAVAILABLE("AUTH-10006", "服务不可用");

    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;

    /**
     * 根据错误码查找对应的响应码枚举
     *
     * @param errorCode 错误码
     * @return 对应的 ResponseCodeEnum，如果找不到则返回 null
     */
    public static ResponseCodeEnum findByErrorCode(String errorCode) {
        for (ResponseCodeEnum code : values()) {
            if (code.getErrorCode().equals(errorCode)) {
                return code;
            }
        }
        return null;
    }
}