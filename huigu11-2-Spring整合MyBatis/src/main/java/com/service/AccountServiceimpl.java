package com.service;

import com.damain.Account;
import com.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component("AccountService")
public class AccountServiceimpl implements AccountService{
    @Autowired
    private AccountDao accountDao;

    private void save(Account account){
        accountDao.save(account);
    }

    private void update(Account account){
        accountDao.update(account);
    }

    private void delect(Integer id){
        accountDao.delete(id);
    }

    public Account findById(Integer id){
        return accountDao.findById(id);
    }

    private List<Account> findAll(){
        return accountDao.findAll();
    }


}
