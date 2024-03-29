package com.service;

import com.config.SpringConfig;
import com.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class bookserviceimpl {
    @Autowired
    private BookSelect bookSelect;

    @Test
    public void testGetById(){
        Book book1 = bookSelect.getById(1);
        System.out.println(book1);
    }

    @Test
    public void testGetAll(){
        List<Book> book2 = bookSelect.getAll();
        System.out.println(book2);
    }
}
