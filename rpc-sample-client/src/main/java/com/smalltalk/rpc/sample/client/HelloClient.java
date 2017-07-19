package com.smalltalk.rpc.sample.client;

import com.smalltalk.rpc.client.RpcProxy;
import com.smalltalk.rpc.sample.api.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hyb on 2017/7/6.
 */
public class HelloClient {


    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy=context.getBean(RpcProxy.class);

        HelloService helloService=rpcProxy.create(HelloService.class);
        String result=helloService.hello("World");
        System.out.println(result);

        HelloService helloService12=rpcProxy.create(HelloService.class,"sample.hello2");
        String result2 = helloService12.hello("世界");
        System.out.println(result2);

        System.exit(0);

    }
}
