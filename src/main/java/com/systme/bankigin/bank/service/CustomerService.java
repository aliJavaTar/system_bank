package com.systme.bankigin.bank.service;

import com.systme.bankigin.bank.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer register(Customer customer) throws Exception;
}
