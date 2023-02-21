package com.example.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectMybatisApplication.class, args);
        System.out.println("————————————————————项目启动成功——————————————————————");
    }
}
