package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.CreditCard;
import com.systme.bankigin.bank.repository.CreditCardRepository;
import com.systme.bankigin.bank.service.CreditCardService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    private final CreditCardRepository creditCardRepository;

    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

//    @Override
//    public boolean findCreditCardByNumberCardExists() {
//        return creditCardRepository.findCreditCardByNumberCardExists();
//    }

    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public void deleteCreditCard(CreditCard creditCard) {
         creditCardRepository.delete(creditCard);
    }

    @Override
    public void deleteCreditCardById(Long id) {
         creditCardRepository.deleteById(id);
    }

    @Override
    public CreditCard updateCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public Optional<CreditCard> creditCardFindById(Long id) {
        return creditCardRepository.findById(id);
    }


}
