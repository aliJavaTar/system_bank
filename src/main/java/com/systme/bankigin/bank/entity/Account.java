package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import com.systme.bankigin.bank.entity.enumeration.AccountType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.systme.bankigin.bank.entity.Account.TABLE_NAME;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = TABLE_NAME)
public class Account extends BaseEntity<Long> implements Serializable {

    public static final String TABLE_NAME = "accounts";

    private static final String NUMBER_ACCOUNT = "number_account";

    private static final String MONEY = "money";

    private static final String CREATED_AT = "created_at";

    private static final String DISABLE = "is_disable";

    private static final String ACCOUNT_TYPE = "account_type";


    @Column(name = NUMBER_ACCOUNT, nullable = false, unique = true)
    private long numberAccount;
    @Column(name = MONEY, nullable = false)
    private BigDecimal money;
    @Column(name = CREATED_AT)
    private LocalDate createdAt;
    @Column(name = DISABLE, columnDefinition = ("tinyint(1) default 1"))
    private boolean isDisable;
    @Column(name = ACCOUNT_TYPE)
    private AccountType accountType;

    @OneToOne
    private CreditCard creditCard;

    @ManyToOne
    private BranchBank branchBank;

    @ManyToOne
    private Customer customer;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},mappedBy = "account")
    private List<Transaction> transactionList = new ArrayList<>();

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public BranchBank getBranchBank() {
        return branchBank;
    }

    public void setBranchBank(BranchBank branchBank) {
        this.branchBank = branchBank;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
