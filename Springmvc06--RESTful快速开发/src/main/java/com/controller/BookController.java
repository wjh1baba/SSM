package com.controller;


import com.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//使用Controller来定义bean

//@Controller
//@ResponseBody
//上面两之和
@RestController
@RequestMapping("/books")
public class BookController {

    //设置当前操作返回值类型
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("Book save..."+book);
        return "{'module':'book save'}";
    }

    @GetMapping
    public List<Book> getbook(){
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setType("男");
        book1.setName("李冲");
        book1.setDescription("小黑子");

        Book book2 = new Book();
        book2.setType("男");
        book2.setName("龙瑾");
        book2.setDescription("原p");

        bookList.add(book1);
        bookList.add(book2);

        return bookList;
    }

}
