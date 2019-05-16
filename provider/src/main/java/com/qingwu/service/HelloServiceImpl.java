package com.qingwu.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-dubbo
 * @description:
 * @author: yxx
 * @create: 2019-05-16-11:58
 **/
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String message) {
        return "hi duubo provider" + message;
    }
}
