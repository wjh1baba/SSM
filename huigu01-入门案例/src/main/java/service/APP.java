package service;

import service.impl.BookServiceimpl;

public class APP {
    public static void main(String[] args) {
        BookService bookService = new BookServiceimpl();
        bookService.save();
    }
}

