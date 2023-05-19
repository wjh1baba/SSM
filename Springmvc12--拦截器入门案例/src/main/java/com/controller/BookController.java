package com.controller;

import com.domain.Book;
import com.service.BookSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookSelect bookSelect;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookSelect.save(book);
        System.out.println(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookSelect.update(book);

        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delect(@PathVariable Integer id) {
        boolean flag = bookSelect.delect(id);
        return new Result(flag ? Code.DELECT_OK:Code.DELECT_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookSelect.getById(id);
        Integer code = book != null ? Code.GET_OK:Code.GET_ERR;
        String msg = book != null ? "":"查询出错";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookSelect.getAll();
        Integer code = bookList != null ? Code.GET_OK:Code.GET_ERR;
        String msg = bookList != null ? "":"查询出错";
        return new Result(code,bookList,msg);
    }

}
