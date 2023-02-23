package com;

import com.config.SpringConfig;
import com.dao.BookDao;
import com.dao.impl.BookDaoimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);

        System.out.println(bookDao);
        System.out.println(bookDao.getClass());
    }
}

