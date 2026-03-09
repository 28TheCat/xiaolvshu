package com.yating.xiaolvshu.auth.alarm;

import com.yating.xiaolvshu.auth.alarm.impl.MailAlarmHelper;
import com.yating.xiaolvshu.auth.alarm.impl.SmsAlarmHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: yating
 * @Date: 2026/3/9 21:46
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Configuration
@RefreshScope
public class AlarmConfig {

    @Value("${alarm.type}")
    private String alarmType;

    @Bean
    public AlarmInterface alarmHelper(){
        if(StringUtils.equals("sms",alarmType)){
            return new SmsAlarmHelper();
        } else if (StringUtils.equals("mail",alarmType)) {
            return new MailAlarmHelper();
        }else {
            throw new IllegalArgumentException("错误的警告类型");
        }
    }
}
