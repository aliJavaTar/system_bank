package com.systme.bankigin.bank.service;

import com.systme.bankigin.bank.entity.CreditCard;

import java.util.Optional;

public interface CreditCardService {
//    boolean findCreditCardByNumberCardExists();

    CreditCard createCreditCard(CreditCard creditCard);

    void deleteCreditCard(CreditCard creditCard);

    void deleteCreditCardById(Long id);

    CreditCard updateCreditCard(CreditCard creditCard);

    Optional<CreditCard> creditCardFindById(Long id);
}
