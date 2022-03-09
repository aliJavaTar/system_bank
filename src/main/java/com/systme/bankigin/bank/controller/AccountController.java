package com.systme.bankigin.bank.controller;

import com.systme.bankigin.bank.entity.Account;
import com.systme.bankigin.bank.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create_account")
    @ResponseBody
    public Account createAccount(@RequestBody Account account)
    {
        return accountService.create(account);
    }

}
