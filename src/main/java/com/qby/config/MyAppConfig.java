package com.qby.config;

import com.qby.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qby
 * @Configuration 指明是一个配置类，替代spring配置文件
 * @Bean 使用注解注册组件
 * @date 2020/8/2 17:05
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     *
     * @return
     */
    @Bean
    public HelloService helloService() {
        System.out.println("配置类给容器中添加组件");
        return new HelloService();
    }
}
