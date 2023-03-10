package com.service;

import com.damain.Account;
import com.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Component("AccountService")
public class AccountServiceimpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfor(String out, String in, Double money) throws IOException {
        accountDao.inmoney(in,money);
        if(true){throw new IOException();}      //IOException属于编译时异常，也叫checkedException
        accountDao.outmoney(out,money);
        //默认只有运行时异常（NullPointException、算术运算异常）和Error（error通常是虚拟机出错，如内存溢出，StackOverFlow）才会进行事务的回滚
    }
}
