package com.service.impl;

import com.controller.Code;
import com.dao.BookDao;
import com.domain.Book;
import com.exception.BusinessExcption;
import com.service.BookSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        if(id == 1){
            throw new BusinessExcption(Code.BUSINSS_ERR,"请不要使用你的技术挑战我");
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
