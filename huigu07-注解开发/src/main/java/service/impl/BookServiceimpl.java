package service.impl;

import org.springframework.stereotype.Component;
import service.BookService;



@Component("bookService")
public class BookServiceimpl implements BookService {


    public void save(){
        System.out.println("book service save");

    }

}
