package com.yating.xiaolvshu.auth;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yating.xiaolvshu.auth.domain.mapper")
public class XiaolvshuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaolvshuAuthApplication.class, args);
    }

}
