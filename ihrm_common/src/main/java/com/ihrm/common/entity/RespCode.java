package com.ihrm.common.entity;

import java.util.HashMap;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/21/2019 10:29 PM
 */
public enum RespCode {
    /**
     * 返回成功
     */
    SUCCESS(true, "0000", "成功"),
    /**
     * 返回失败
     */
    FAILED(false, "0001", "失败"),
    /**
     * 未登录
     */
    UN_LOGGED_IN(false, "0002", "未登录"),
    /**
     * 未授权，权限不足
     */
    UNAUTHORIZED(false, "0003", "未授权"),
    /**
     * 参数错误
     */
    PARAM_ERROR(false, "0004", "参数错误"),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(false, "0004", "服务器内部错误");


    boolean flag;

    String code;

    String message;

    private static HashMap<String, RespCode> codeValueMap = new HashMap<>(10);

    static {
        for (RespCode type : RespCode.values()) {
            codeValueMap.put(type.code, type);
        }
    }

    RespCode(boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public static RespCode getInstanceFromCode(String code) {
        return codeValueMap.get(code);
    }

    public boolean flag() {
        return flag;
    }

    public String code() {
        return code;
    }

    public String message() {
        return message;
    }
}
