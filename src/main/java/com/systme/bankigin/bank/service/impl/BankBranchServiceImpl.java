package com.systme.bankigin.bank.service.impl;

import com.systme.bankigin.bank.entity.BranchBank;
import com.systme.bankigin.bank.repository.BranchBankRepository;
import com.systme.bankigin.bank.service.BankBranchService;
import org.springframework.stereotype.Service;

@Service
public class BankBranchServiceImpl implements BankBranchService {
    private BranchBankRepository branchBankRepository;

    BankBranchServiceImpl(BranchBankRepository branchBankRepository) {
        this.branchBankRepository = branchBankRepository;
    }

    @Override
    public BranchBank create(BranchBank branchBank) {
        branchBank.setNumberBranch(getNumberOfBankBranch());
        return branchBankRepository.save(branchBank);
    }

    private long getNumberOfBankBranch() {
        long leftLimit = 1000;
        long rightLimit = 9999L;
        long generatedLong;
        do {
            generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        } while (String.valueOf(generatedLong).length() != 4);
        return generatedLong;
    }
}
