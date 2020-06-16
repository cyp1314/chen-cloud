package com.chen.auth;

import com.chen.common.annotation.AllApplication;
import com.chen.common.annotation.EnableLettuceRedis;
import com.chen.common.annotation.EnableServerProtect;
import com.chen.common.annotation.EnableSystemAuthExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableServerProtect
@AllApplication
@MapperScan("com.chen.auth.mapper")
@EnableSystemAuthExceptionHandler
@EnableLettuceRedis
public class ChenAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenAuthApplication.class, args);
    }

}
