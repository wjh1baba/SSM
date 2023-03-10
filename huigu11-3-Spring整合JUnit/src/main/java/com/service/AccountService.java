package com.service;

import com.damain.Account;

import java.util.List;

public interface AccountService {
    Account findById(Integer id);
    List<Account> findAll();
}
