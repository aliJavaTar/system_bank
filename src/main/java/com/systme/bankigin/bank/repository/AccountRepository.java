package com.systme.bankigin.bank.repository;

import com.systme.bankigin.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
