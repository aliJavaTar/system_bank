package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.Customer;
import com.systme.bankigin.bank.repository.CustomerRepository;
import com.systme.bankigin.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer register(Customer customer) {
        return customerRepository.save(customer);
    }
}
