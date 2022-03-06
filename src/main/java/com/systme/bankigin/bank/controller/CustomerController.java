package com.systme.bankigin.bank.controller;

import com.systme.bankigin.bank.entity.Customer;
import com.systme.bankigin.bank.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    @ResponseBody
    public Customer register(@RequestBody Customer customer) throws Exception {
        return customerService.register(customer);
    }
}

//        try {
//            customer = ;
//        } catch (Exception e) {
//            try {
//                throw new Exception("Customer Can Not Register");
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }