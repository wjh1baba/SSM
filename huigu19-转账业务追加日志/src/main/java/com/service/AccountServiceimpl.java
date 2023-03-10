package com.service;

import com.damain.Account;
import com.dao.AccountDao;
import com.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Component("AccountService")
public class AccountServiceimpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService  logService;

    @Override
    public void transfor(String out, String in, Double money){
        try {

            accountDao.inmoney(in,money);
            int i = 1/0;
            accountDao.outmoney(out,money);
        }finally {
            logService.log(out, in, money);
        }


    }
}
