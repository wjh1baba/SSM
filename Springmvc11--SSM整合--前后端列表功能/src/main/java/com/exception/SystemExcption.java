package com.exception;

public class SystemExcption extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemExcption(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemExcption(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
