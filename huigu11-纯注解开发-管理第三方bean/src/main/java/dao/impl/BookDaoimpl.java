package dao.impl;

import dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
public class BookDaoimpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }

}
