package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class BookDaoimpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book com.dao save");
    }

    @Override
    public void update() {
        System.out.println("book com.dao update");
    }
}
