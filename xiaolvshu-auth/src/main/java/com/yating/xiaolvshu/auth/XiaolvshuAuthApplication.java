package com.yating.xiaolvshu.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.yating.xiaolvshu.auth.domain.mapper")
@SpringBootApplication
public class XiaolvshuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaolvshuAuthApplication.class, args);
    }

}
