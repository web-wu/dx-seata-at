package com.tabwu.dx.bank1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @PROJECT_NAME: dx-seate-test
 * @USER: tabwu
 * @DATE: 2022/4/12 15:24
 * @DESCRIPTION:
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.tabwu.dx.bank1.mapper")
@EnableFeignClients
public class Bank1Application {
    public static void main(String[] args) {
        SpringApplication.run(Bank1Application.class,args);
    }
}
