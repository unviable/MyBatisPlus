package com.ali.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ali.main.mapper")
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("11");
        SpringApplication.run(MainApplication.class, args);
    }

}
