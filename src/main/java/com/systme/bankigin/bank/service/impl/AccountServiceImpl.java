package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.Account;
import com.systme.bankigin.bank.repository.AccountRepository;
import com.systme.bankigin.bank.service.AccountService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account create(Account account) {
        account.setCreatedAt(LocalDate.now());
        account.setNumberAccount(getNumberAccount());
        return accountRepository.save(account);
    }

    private long getNumberAccount() {
        long leftLimit = 1000_000_000_000L;
        long rightLimit = 9999999999999L;
        long generatedLong;
        do {
            generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        } while (String.valueOf(generatedLong).length() != 13);
        return generatedLong;
    }
}
