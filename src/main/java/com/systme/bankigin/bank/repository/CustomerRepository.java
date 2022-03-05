package com.systme.bankigin.bank.repository;

import com.systme.bankigin.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
