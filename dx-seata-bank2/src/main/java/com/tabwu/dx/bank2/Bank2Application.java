package com.tabwu.dx.bank2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @PROJECT_NAME: dx-seate-test
 * @USER: tabwu
 * @DATE: 2022/4/12 15:35
 * @DESCRIPTION:
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.tabwu.dx.bank2.mapper")
public class Bank2Application {
    public static void main(String[] args) {
        SpringApplication.run(Bank2Application.class,args);
    }
}
