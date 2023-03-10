package com.dao;

import com.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class APPForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        ctx.close();
    }
}

