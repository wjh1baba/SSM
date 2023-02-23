package service.impl;

import dao.BookDao;
import dao.impl.BookDaoimpl;
import service.BookService;

public class BookServiceimpl implements BookService {
    private BookDao bookDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
