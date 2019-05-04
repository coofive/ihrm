package com.ihrm.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 3:02 PM
 */
@Slf4j
public class BeanUtil {

    /**
     * 比较两个可能为null的对象是否相等
     *
     * @param a 对象一
     * @param b 对象二
     * @return boolean
     */
    public static boolean equal(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /**
     * 复制对象属性到另一个对象
     *
     * @param source 源对象
     * @param target 目标对象class
     * @param <T>    指定类型对象
     * @return T
     */
    public static <T> T copyProperties(Object source, Class<T> target) {
        try {
            T t = target.newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        } catch (Exception e) {
            log.error("copy object properties failed", e);
        }
        return null;
    }

}

