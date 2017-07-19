package com.smalltalk.rpc.sample.server;

import com.smalltalk.rpc.sample.api.HelloService;
import com.smalltalk.rpc.sample.api.Person;
import com.smalltalk.rpc.server.RpcService;

/**
 * Created by hyb on 2017/7/6.
 */
@RpcService(value = HelloService.class,version = "sample.hello2")
public class HelloServiceImpl2 implements HelloService{

    @Override
    public String hello(String name) {
        return "你好! " + name;
    }

    @Override
    public String hello(Person person) {
        return "你好! " + person.getFirstName() + " " + person.getLastName();
    }
}
