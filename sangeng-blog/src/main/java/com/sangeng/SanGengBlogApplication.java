package com.sangeng.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.sangeng.mapper")
public class SanGengBlogApplication {
    public static void main(String[] args) {

        SpringApplication.run(SanGengBlogApplication.class,args);
    }


}
