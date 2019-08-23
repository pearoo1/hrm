package com.zl.hrm;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//定义扫描包
@SpringBootApplication(scanBasePackages = "com.zl.hrm")
//定义Mybatis接口
@MapperScan(annotationClass = Mapper.class,basePackages = "com.zl,hrm")
public class HrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmApplication.class, args);
    }

}
