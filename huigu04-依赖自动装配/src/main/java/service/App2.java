package service;

import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
//        获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
