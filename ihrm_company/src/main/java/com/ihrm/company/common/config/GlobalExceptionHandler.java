package com.ihrm.company.common.config;

import com.ihrm.common.entity.RespCode;
import com.ihrm.common.entity.Response;
import com.ihrm.common.util.ResponseGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Set;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 7:01 PM
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ValidationException.class)
    public Response handleValidationException(ValidationException e){
        if (e instanceof ConstraintViolationException){
            ConstraintViolationException exs = (ConstraintViolationException) e;
            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            if (violations.iterator().hasNext()){
                return ResponseGenerator.fail(violations.iterator().next().getMessage());
            }
        }
        return ResponseGenerator.fail("validate error");
    }

    @ExceptionHandler(value = Exception.class)
    public Response handleGlobalException(Exception e){
        log.error(RespCode.INTERNAL_SERVER_ERROR.message(),e);
        return ResponseGenerator.fail(RespCode.INTERNAL_SERVER_ERROR);
    }
}
