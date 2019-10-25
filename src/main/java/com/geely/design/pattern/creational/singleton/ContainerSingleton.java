package com.geely.design.pattern.creational.singleton;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dahai.li
 * @Description: 容器类型的单例模式
 * @Date: Create in 17:37 2019/10/25
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance){
        if (StringUtils.isNotBlank(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
