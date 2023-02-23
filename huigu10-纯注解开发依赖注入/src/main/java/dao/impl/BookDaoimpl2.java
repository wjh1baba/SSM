package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoimpl2 implements BookDao {
    @Value("${name}")
    private String name;
    public void save(){
        System.out.println("book dao save...2"+name);
    }
}
