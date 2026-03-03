package com.yating.xiaolvshu.auth.constant;

/**
 * @Author: yating
 * @Date: 2026/3/3 14:11
 * @Version: v1.0.0
 * @Description: 统一管理 Redis Key
 **/
public class RedisKeyConstants {

    /**
     * 验证码 KEY 前缀
     */
    private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code:";

    /**
     * 小绿书全局 ID 生成器 KEY
     */
    public static final String XIAOLVSHU_ID_GENERATOR_KEY = "xiaolvshu_id_generator";

    /**
     * 用户角色数据 KEY 前缀
     */
    private static final String USER_ROLES_KEY_PREFIX = "user:roles:";

    /**
     * 构建验证码 KEY
     * @param phone
     * @return
     */
    public static String buildVerificationCodeKey(String phone) {
        return VERIFICATION_CODE_KEY_PREFIX + phone;
    }

    /**
     * 构建验证码 KEY
     * @param phone
     * @return
     */
    public static String buildUserRoleKey(String phone) {
        return USER_ROLES_KEY_PREFIX + phone;
    }
}
