package com.huayu.feiwotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huayu.feiwotest")
public class FeiwotestApplication {

   public static void main(String[] args) {

      SpringApplication.run(FeiwotestApplication.class, args);
   }

}
