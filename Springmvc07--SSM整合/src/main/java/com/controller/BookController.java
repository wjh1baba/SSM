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
    public boolean save(@RequestBody Book book) {
        return  bookSelect.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookSelect.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delect(@PathVariable Integer id) {
        return bookSelect.delect(id);
    }

    @GetMapping("/{id}  ")
    public Book getById(@PathVariable Integer id) {
        return bookSelect.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookSelect.getAll();
    }
}
