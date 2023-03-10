package com.service;

import com.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)   //类运行器
@ContextConfiguration(classes = SpringConfig.class)   //spring环境 Configuration
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void textFindById(){
        System.out.println(accountService.findById(1));
    }

    @Test
    public void text(){
        System.out.println(accountService.findAll());
    }
}
