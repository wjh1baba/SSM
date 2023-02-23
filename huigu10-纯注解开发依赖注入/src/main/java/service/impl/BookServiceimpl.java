package service.impl;

import dao.BookDao;
import dao.impl.BookDaoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.BookService;



@Service("bookService")
public class BookServiceimpl implements BookService {
    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

}
