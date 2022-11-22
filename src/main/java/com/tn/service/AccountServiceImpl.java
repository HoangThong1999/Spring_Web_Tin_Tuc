package com.tn.service;

import com.tn.entity.Account;
import com.tn.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepository accountRepo;

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepo.save(account);
    }


    @Override
    public void delete(Integer id) {
        accountRepo.deleteById(id);
    }

    @Override
    public Account update(Account account,String userName,Integer id) {
        return accountRepo.save(account);
    }
}
