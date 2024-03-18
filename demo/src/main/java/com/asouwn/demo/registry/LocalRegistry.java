package com.asouwn.demo.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalRegistry {
    private static Map<String, Class<?>> localMap = new ConcurrentHashMap<>();

    public static void register(String serviceName, Class<?> implClass) {
        localMap.put(serviceName, implClass);
    }
    public static <T> T getServer(String name){
        return (T) localMap.get(name);
    }
}
