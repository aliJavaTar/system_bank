package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.Account;
import com.systme.bankigin.bank.repository.AccountRepository;
import com.systme.bankigin.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account create(Account account) {
        return accountRepository.save(account);
    }
}
