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

    public void save(Account account){
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delect(Integer id){
        accountDao.delete(id);
    }

    public Account findById(Integer id){
        return accountDao.findById(id);
    }

    public List<Account> findAll(){
        return accountDao.findAll();
    }


}
