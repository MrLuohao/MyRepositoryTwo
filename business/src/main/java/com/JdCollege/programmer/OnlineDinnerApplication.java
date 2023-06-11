package com.JdCollege.programmer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 项目启动类
 */
@SpringBootApplication
@MapperScan("com.JdCollege.programmer.dao")
public class OnlineDinnerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(OnlineDinnerApplication.class, args);
    }
}


