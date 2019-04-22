package com.ihrm.common.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenwu.liu.o
 */
@Slf4j
public class FastJsonUtil {
    /*==============================object to json=======================================*/

    /**
     * 将obj序列化成jsonString
     *
     * @param obj 对象
     * @return String
     */
    public static String objectToJson(Object obj) {
        try {
            return JSON.toJSONString(obj);
        } catch (Exception e) {
            log.error("obj to json failed.", e);
        }
        return null;
    }

    /*==============================json to object=======================================*/

    /**
     * 将jsonString 反序列化成object
     *
     * @param jsonString json字符串
     * @param tClass     指定类
     * @param <T>        指定泛型
     * @return T
     */
    public static <T> T jsonToObject(String jsonString, Class<T> tClass) {
        try {
            return JSON.parseObject(jsonString, tClass);
        } catch (Exception e) {
            log.info("parse json to object failed:{}", jsonString, e);
        }
        return null;
    }
}
