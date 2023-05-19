package com.service.impl;

import com.controller.Code;
import com.dao.BookDao;
import com.domain.Book;
import com.exception.BusinessExcption;
import com.exception.SystemExcption;
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
        if(id == 1){
            throw new BusinessExcption(Code.BUSINSS_ERR,"请不要使用你的技术挑战我");
        }
        try{
            int i = 1/0;
        }catch (Exception e){
            throw new SystemExcption(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时,请重试!",e);
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
