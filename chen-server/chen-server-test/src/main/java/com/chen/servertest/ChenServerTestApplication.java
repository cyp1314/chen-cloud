package com.chen.servertest;

import com.chen.common.annotation.AllApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@AllApplication
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableGlobalMethodSecurity(prePostEnabled = true)
class ChenServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenServerTestApplication.class, args);
    }

}
