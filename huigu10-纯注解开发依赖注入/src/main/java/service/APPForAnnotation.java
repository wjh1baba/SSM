package service;

import config.SpringConfig;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.BookServiceimpl;

public class APPForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}

