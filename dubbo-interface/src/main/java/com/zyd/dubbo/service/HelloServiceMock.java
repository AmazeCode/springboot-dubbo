package com.zyd.dubbo.service;

/**
 * 命名需要规范
 */
public class HelloServiceMock implements HelloService {

    @Override
    public String sayHello() {
        System.out.println("服务调用失败.....");
        return null;
    }
}
