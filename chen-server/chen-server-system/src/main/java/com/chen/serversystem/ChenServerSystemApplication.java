package com.chen.serversystem;

import com.chen.common.annotation.AllApplication;
import com.chen.common.annotation.EnableServerProtect;
import com.chen.common.annotation.EnableSystemAuthExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSystemAuthExceptionHandler
@EnableServerProtect
@AllApplication
@MapperScan("com.chen.serversystem.mapper")
@EnableTransactionManagement
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ChenServerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenServerSystemApplication.class, args);
    }

}
