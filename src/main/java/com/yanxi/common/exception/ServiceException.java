package com.yanxi.common.exception;

import org.springframework.http.HttpStatus;

public final class ServiceException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private HttpStatus code;

    /**
     * 错误提示
     */
    private String message;


    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException()
    {
    }

    public ServiceException(String message)
    {
        this.message = message;
    }

    public ServiceException(String message, HttpStatus status)
    {
        this.message = message;
        this.code = status;
    }


    @Override
    public String getMessage()
    {
        return message;
    }

    public HttpStatus getCode()
    {
        return code;
    }

    public ServiceException setMessage(String message) {
        this.message = message;
        return this;
    }

}
