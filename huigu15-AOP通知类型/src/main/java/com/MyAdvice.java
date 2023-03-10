package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect  //告诉是AOP
public class MyAdvice {
    //切入点
    @Pointcut("execution(void com.dao.impl.BookDaoimpl.*())")
    private void pt(){}

    @Pointcut("execution(int com.dao.impl.BookDaoimpl.s*())")
    private void pt2(){}


    //添加到通知前面
//    @Before("pt()")
    //通知
    public void before(){
        System.out.println("前");
    }

//    @After("pt()")
    //通知
    public void after(){
        System.out.println("后");
    }

    @Around("pt()")
    public Object Around1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前面");
        Object ret = pjp.proceed();
        System.out.println("后面");
        return ret;
    }

    @Around("pt2()")
    public Object Around2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前面");
        Integer ret = (Integer) pjp.proceed();
        System.out.println("后面");
        return ret+566;
    }

    //报错后不运行
    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    //报错才运行
    @AfterThrowing("pt2()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing advice ...");
    }

}
