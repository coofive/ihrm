package com.ihrm.company.common.config;

import com.ihrm.common.entity.RespCode;
import com.ihrm.common.entity.Response;
import com.ihrm.common.util.ResponseGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 7:01 PM
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Response handleGlobalException(Exception e){
        log.error(RespCode.INTERNAL_SERVER_ERROR.message(),e);
        return ResponseGenerator.fail(RespCode.INTERNAL_SERVER_ERROR);
    }
}
