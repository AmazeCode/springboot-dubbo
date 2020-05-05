package com.zyd.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyd.dubbo.service.HelloService;

/**
 *  实现暴漏的接口
 */
@Service//注意这里面导入的包是需要导入dubbo的包
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        return "服务被成功调用了..........";
    }
}
