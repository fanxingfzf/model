package com.fzf.msp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fzf.msp.mapper")
public class MiaoShaProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiaoShaProjectApplication.class,args);
    }
}
