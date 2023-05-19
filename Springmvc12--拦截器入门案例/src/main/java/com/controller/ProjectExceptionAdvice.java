package com.controller;

import com.exception.BusinessExcption;
import com.exception.SystemExcption;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemExcption.class)
    public Result doSystemException(SystemExcption ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessExcption.class)
    public Result doBusinessException(BusinessExcption ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"服务器繁忙,请等会重试");
    }
}
