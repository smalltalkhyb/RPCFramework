package com.smalltalk.rpc.sample.api;

/**
 * Created by hyb on 2017/7/6.
 */
public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
