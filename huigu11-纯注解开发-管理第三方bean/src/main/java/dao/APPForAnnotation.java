package dao;

import com.alibaba.druid.pool.DruidDataSource;
import config.SpringConfig;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


public class APPForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);


        DruidDataSource druidDataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(druidDataSource);
    }
}

