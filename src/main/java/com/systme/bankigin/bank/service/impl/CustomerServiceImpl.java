package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.Customer;
import com.systme.bankigin.bank.repository.CustomerRepository;
import com.systme.bankigin.bank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    //
    @Override
    public Customer register(Customer customer) throws Exception {
        System.out.println(customer);
        boolean validate = validateInfo(customer);
        System.out.println(validate);
        if (validate) {
            return customerRepository.save(customer);
        } else throw new Exception("Customer Not Valid");
    }

    private boolean validateInfo(Customer customer) {
        boolean validatePassword = cheekPassword(customer.getPassword());
        boolean validateUsername = cheekUserName(customer.getUsername());
        boolean validateEmail = CheekEmail(customer.getEmail());
        return validateEmail && validateUsername && validatePassword;
    }

    private boolean cheekPassword(String text) {
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
        boolean isTrue = Pattern.matches(regex, text);
        return isTrue;
    }

    private boolean cheekUserName(String text) {
        String regex = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){2,16}[a-zA-Z0-9]$";
        boolean isTrue = Pattern.matches(regex, text);
        return isTrue;
    }

    private boolean CheekEmail(String text) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        boolean isTrue = Pattern.matches(regex, text);
        return isTrue;
    }
}
