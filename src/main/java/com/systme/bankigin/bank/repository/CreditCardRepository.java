package com.systme.bankigin.bank.repository;

import com.systme.bankigin.bank.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard,Long> {
//    boolean findCreditCardByNumberCardExists();

}
