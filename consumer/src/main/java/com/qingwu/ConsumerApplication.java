package com.qingwu;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.qingwu.service.HelloServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        HelloServiceImpl helloService = (HelloServiceImpl) run.getBean("helloServiceImpl");
        helloService.sendMessage("i`m consumer");
    }

}
