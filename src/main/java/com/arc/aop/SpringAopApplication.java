package com.arc.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//表示开启AOP代理自动配置，如果配@EnableAspectJAutoProxy表示使用cglib进行代理对象的生成；设置 表示通过aop框架暴露该代理对象，aopContext能够访问.
@EnableAspectJAutoProxy(exposeProxy=true)
@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

}

