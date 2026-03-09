package com.yating.xiaolvshu.auth.controller;

/**
 * @Author: yating
 * @Date: 2026/3/8 22:16
 * @Version: v1.0.0
 * @Description: TODO
 **/
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @NacosValue(value = "${rate-limit.api.limit}", autoRefreshed = true)

    private Integer limit;

    @Resource
    private AlarmInterface alarm;

    @GetMapping("/test")
    public String test() {
        return "当前限流阈值为: " + limit;
    }


    @GetMapping("/alarm")
    public String sendAlarm() {
        alarm.send("系统出错啦，速度上线解决问题！");
        return "alarm success";
    }

}