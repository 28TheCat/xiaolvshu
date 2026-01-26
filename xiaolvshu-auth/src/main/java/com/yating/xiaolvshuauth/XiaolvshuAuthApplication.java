package com.yating.xiaolvshuauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.yating.xiaolvshuauth.mapper")
@SpringBootApplication
public class XiaolvshuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaolvshuAuthApplication.class, args);
    }

}
