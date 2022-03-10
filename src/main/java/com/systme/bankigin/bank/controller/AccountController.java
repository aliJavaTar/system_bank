package com.systme.bankigin.bank.controller;

import com.systme.bankigin.bank.entity.Account;
import com.systme.bankigin.bank.entity.Customer;
import com.systme.bankigin.bank.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/{id}/create_account")
    @ResponseBody
    public Account createAccount( @RequestBody Account account, @PathVariable("id") Customer customer) {
        account.setCustomer(customer);
        return accountService.create(account);
    }

}
