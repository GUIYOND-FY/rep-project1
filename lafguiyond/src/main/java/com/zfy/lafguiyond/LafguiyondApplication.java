package com.zfy.lafguiyond;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zfy.lafguiyond.mapper")
public class LafguiyondApplication {

    public static void main(String[] args) {
        SpringApplication.run(LafguiyondApplication.class, args);
    }

}
