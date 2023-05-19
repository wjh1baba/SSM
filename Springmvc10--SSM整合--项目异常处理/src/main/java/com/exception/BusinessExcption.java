package com.exception;


//自定义项目异常
public class BusinessExcption extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessExcption(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessExcption(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
