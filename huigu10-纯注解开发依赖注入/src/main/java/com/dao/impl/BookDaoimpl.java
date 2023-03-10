package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoimpl implements BookDao {
    public void save(){
        System.out.println("book com.dao save...");
    }
}
