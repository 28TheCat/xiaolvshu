package com.yating.xiaolvshu.auth.alarm.impl;

import com.yating.xiaolvshu.auth.alarm.AlarmInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yating
 * @Date: 2026/3/9 21:46
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Slf4j
public class MailAlarmHelper implements AlarmInterface {
    /**
     * 发送警告信息
     *
     * @param message
     * @return
     */
    @Override
    public boolean send(String message) {
        log.info("==> 【邮件告警】：{}", message);
        return true;
    }
}
