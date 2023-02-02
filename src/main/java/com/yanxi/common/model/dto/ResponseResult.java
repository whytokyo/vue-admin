package com.yanxi.common.model.dto;

import com.yanxi.common.model.enums.HttpCodeEnum;
import com.yanxi.common.utils.DateUtils;

import java.io.Serializable;


public class ResponseResult<T> implements Serializable {

    private boolean success = true;

    private Integer code;

    private String message = "操作成功!";


    private String time;

    private T data;

    public ResponseResult() {
        this.success = true;
        this.code = 200;
        this.time = DateUtils.parseTime();
    }

    public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public ResponseResult<T> ok(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.message = msg;
        this.success = true;
        this.time = DateUtils.parseTime();
        return this;
    }

    public static ResponseResult okResult(int code, String msg) {
        ResponseResult result = new ResponseResult();
        result.success = true;
        return result.ok(code, null, msg);
    }

    public static ResponseResult okResult(Object data) {
        ResponseResult result = setHttpCodeEnum(HttpCodeEnum.SUCCESS, HttpCodeEnum.SUCCESS.getMessage());
        result.setTime(DateUtils.parseTime());
        if (data != null) {
            result.setData(data);
        }
        result.success = true;
        return result;
    }

    public static ResponseResult okResult() {
        ResponseResult result = setHttpCodeEnum(HttpCodeEnum.SUCCESS, HttpCodeEnum.SUCCESS.getMessage());
        result.success = true;
        return result;
    }

    private static ResponseResult setHttpCodeEnum(HttpCodeEnum enums, String message) {
        return okResult(enums.getCode(), message);
    }

    private static ResponseResult setHttpCodeEnum(HttpCodeEnum enums, String message, boolean success) {
        return okResult(enums.getCode(), message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
