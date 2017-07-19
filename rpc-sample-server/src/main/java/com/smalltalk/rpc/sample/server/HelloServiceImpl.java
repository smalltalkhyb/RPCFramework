package com.smalltalk.rpc.sample.server;

import com.smalltalk.rpc.sample.api.HelloService;
import com.smalltalk.rpc.sample.api.Person;
import com.smalltalk.rpc.server.RpcService;
/**
 * Created by hyb on 2017/7/6.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {

        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
