package com.chen.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ChenRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChenRegisterApplication.class, args);
    }

}
