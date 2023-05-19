package com.service;

import com.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookSelect {

    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delect(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
