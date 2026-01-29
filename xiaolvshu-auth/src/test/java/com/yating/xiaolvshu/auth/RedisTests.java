package com.yating.xiaolvshu.auth;

import com.yating.xiaolvshu.auth.config.RedisTemplateConfig;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: yating
 * @Date: 2026/1/29 09:11
 * @Version: v1.0.0
 * @Description: TODO
 **/
@SpringBootTest
@Slf4j
public class RedisTests {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 测试设置 key-value
     */
    @Test
    void testSetKeyValue(){
        redisTemplate.opsForValue().set("name", "yating");
    }

    /**
     * 测试获取 key-value
     */
    @Test
    void testGetKeyValue(){
        log.info("{}", redisTemplate.opsForValue().get("name"));
    }

    /**
     * 测试删除 key-value
     */
    @Test
    void testDeleteKeyValue(){
        redisTemplate.delete("name");
        log.info("{}", redisTemplate.opsForValue().get("name"));
    }

}
