package com.qby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author qby
 * @date 2020/7/31 1:04
 */
//@ImportResource(locations = "classpath:beans.xml")
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // 启动springboot应用
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
