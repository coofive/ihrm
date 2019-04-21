package com.ihrm.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/21/2019 10:44 PM
 */
@Data
@NoArgsConstructor
public class Response<T> {
    /**
     * 是否成功
     */
    private boolean flag;
    /**
     * 返回状态码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public Response(RespCode respCode) {
        this.flag = respCode.flag;
        this.code = respCode.code;
        this.message = respCode.message;
    }

    public Response(RespCode respCode, T data) {
        this.flag = respCode.flag;
        this.code = respCode.code;
        this.message = respCode.message;
        this.data = data;
    }

    public Response(boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Response(boolean flag, String code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
