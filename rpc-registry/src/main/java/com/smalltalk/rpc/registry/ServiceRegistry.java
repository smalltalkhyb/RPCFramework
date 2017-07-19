package com.smalltalk.rpc.registry;

/**
 * Created by hyb on 2017/7/5.
 *
 * 服务注册接口
 */
public interface ServiceRegistry {


    /**
     * 注册服务名称与服务地址
     *      * @param serviceName    服务名称
     * @param serviceAddress 服务地址
     */

    void register(String serveName,String serviceAddress);
}
