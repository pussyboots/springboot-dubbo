package com.qingwu.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-dubbo
 * @description:
 * @author: yxx
 * @create: 2019-05-16-11:58
 **/
@Component
public class HelloServiceImpl {

    @Reference(interfaceClass = HelloService.class)
    HelloService helloService;

    public void sendMessage(String message){
        System.out.println(helloService.sayHello(message));
    }
}
