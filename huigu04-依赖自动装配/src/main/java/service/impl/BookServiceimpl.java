package service.impl;

import dao.BookDao;
import dao.User;
import dao.impl.BookDaoimpl;
import service.BookService;

public class BookServiceimpl implements BookService {
    private BookDao bookDao;
    private User user;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
        user.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
