package service.impl;

import com.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
