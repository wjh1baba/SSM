package service.impl;

import dao.BookDao;
import dao.impl.BookDaoimpl;
import org.springframework.stereotype.Component;
import service.BookService;



@Component("bookService")
public class BookServiceimpl implements BookService {


    public void save(){
        System.out.println("book service save");

    }

}
