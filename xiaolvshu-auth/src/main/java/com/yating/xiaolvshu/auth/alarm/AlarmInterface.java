package com.yating.xiaolvshu.auth.alarm;

/**
 * @Author: yating
 * @Date: 2026/3/9 21:46
 * @Version: v1.0.0
 * @Description: TODO
 **/
public interface AlarmInterface {
    /**
     * 发送警告信息
     *
     * @param message
     * @return
     */
    boolean send(String message);
}
