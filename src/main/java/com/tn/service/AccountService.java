package com.tn.service;

import com.tn.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();

    Account save(Account account);

    void delete(Integer id);

    Account update(Account account,String userName,Integer id);
}
