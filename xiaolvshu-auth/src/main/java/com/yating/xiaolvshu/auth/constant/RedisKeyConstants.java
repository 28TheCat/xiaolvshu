package com.yating.xiaolvshu.auth.constant;

/**
 * @Author: yating
 * @Date: 2026/3/3 14:11
 * @Version: v1.0.0
 * @Description: 统一管理 Redis Key
 **/
public class RedisKeyConstants {/**
 * 验证码 KEY 前缀
 */
private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code:";

    /**
     * 构建验证码 KEY
     * @param phone
     * @return
     */
    public static String buildVerificationCodeKey(String phone) {
        return VERIFICATION_CODE_KEY_PREFIX + phone;
    }
}

