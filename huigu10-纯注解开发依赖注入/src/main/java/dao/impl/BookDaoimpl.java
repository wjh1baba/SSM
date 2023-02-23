package dao.impl;

import dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("bookDao")
public class BookDaoimpl implements BookDao {
    public void save(){
        System.out.println("book dao save...");
    }
}
