package com.smalltalk.rpc.common.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by hyb on 2017/7/5.
 *
 * 集合工具类
 */
public class CollectionUtil {


    /**
     * 判断 Collection 是否为空
     * @param collection
     * @return
     */
    public  static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }


    /**
     * 判断 Collection 是否非空
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断 Map 是否为空
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断 Map 是否非空
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }
}
