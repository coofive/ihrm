package com.ihrm.common.util;

import com.ihrm.common.entity.RespCode;
import com.ihrm.common.entity.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 返回生成
 *
 * @author wenwu.liu.o
 */
public class ResponseGenerator {
    private final static Logger log = LoggerFactory.getLogger(ResponseGenerator.class);

    /**
     * 返回成功
     *
     * @param <T> 指定泛型
     * @return <T>
     */
    public static <T> Response<T> success() {
        Response<T> response = new Response<>(RespCode.SUCCESS);
        saveLog(response);
        return response;
    }

    /**
     * 返回成功以及数据
     *
     * @param data 返回数据
     * @param <T>  指定泛型
     * @return <T>
     */
    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<>(RespCode.SUCCESS,data);
        saveLog(response);
        return response;
    }

    /**
     * 返回失败
     *
     * @param <T> 指定泛型
     * @return <T>
     */
    public static <T> Response<T> fail() {
        Response<T> response = new Response<>(RespCode.FAIL);
        saveLog(response);
        return response;
    }

    /**
     * 返回失败和描述
     *
     * @param message 描述
     * @param <T>指定泛型
     * @return <T>
     */
    public static <T> Response<T> fail(String message) {
        Response<T> response = new Response<T>()
                .setCode(RespCode.FAIL.code())
                .setMessage(message);
        saveLog(response);
        return response;
    }

    /**
     * 返回失败状态码和描述
     *
     * @param respCode 状态码
     * @param <T>      指定泛型
     * @return <T>
     */
    public static <T> Response<T> fail(RespCode respCode) {
        Response<T> response = new Response<>(respCode);
        saveLog(response);
        return response;
    }

    /**
     * 返回成功和描述
     *
     * @param respCode 状态码
     * @param <T>      指定泛型
     * @return <T>
     */
    public static <T> Response<T> success(RespCode respCode) {
        Response<T> response = new Response<>(respCode);
        saveLog(response);
        return response;
    }

    private static <T> void saveLog(Response<T> response) {
        log.info("RESPONSE:{}", response);
    }
}
