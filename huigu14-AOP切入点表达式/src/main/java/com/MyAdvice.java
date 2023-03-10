package com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect  //告诉是AOP
public class MyAdvice {
    //切入点
    @Pointcut("execution(void com.dao.impl.BookDaoimpl.update())")
    private void pt(){}

    //添加到通知前面
    @Before("pt()")
    //通知
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
