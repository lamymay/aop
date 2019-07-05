package com.arc.aop.config.model.exception;

import lombok.Getter;

/**
 * @author 叶超
 * @since 2019/3/15 16:45
 */

@Getter
public class BizRuntimeException extends RuntimeException implements ExceptionInterface {


    private int code;

    private String msg;


    public BizRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String msg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.msg = msg;
    }

    public BizRuntimeException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BizRuntimeException() {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }


}
