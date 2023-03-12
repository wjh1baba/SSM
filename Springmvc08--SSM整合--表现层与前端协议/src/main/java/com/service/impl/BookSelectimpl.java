package com.service.impl;

import com.dao.BookDao;
import com.domain.Book;
import com.service.BookSelect;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookSelectimpl implements BookSelect {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delect(Integer id) {
        bookDao.delect(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
