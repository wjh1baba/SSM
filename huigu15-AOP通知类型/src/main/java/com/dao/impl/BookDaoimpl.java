package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class BookDaoimpl implements BookDao {

    @Override
    public void update() {
        System.out.println("book com.dao update");
    }

    @Override
    public int select() {
        System.out.println("book com.dao select");
        return 100;
    }
}
