package dao.impl;

import dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
@Scope("singleton")
//prototype 非单例 singleton 单例
public class BookDaoimpl implements BookDao {
    public void save(){
        System.out.println("book dao save...");
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
