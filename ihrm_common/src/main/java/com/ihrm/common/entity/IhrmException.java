package com.ihrm.common.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 6:53 PM
 */
@Slf4j
public class IhrmException extends RuntimeException {
    public IhrmException() {
    }

    public IhrmException(String message) {
        super(message);
    }
}
