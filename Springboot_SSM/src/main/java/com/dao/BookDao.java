package com.dao;

import com.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


// TODO 代理对象
@Mapper
public interface BookDao {
    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update tbl_book set type =#{type},name=#{name},description =#{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    public void delect(Integer id);

    @Select("select * from tbl_book where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
