package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import com.systme.bankigin.bank.entity.enumeration.TransactionType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.systme.bankigin.bank.entity.Transaction.TABLE_NAME;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = TABLE_NAME)
public class Transaction extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "transactions";
    private static final String DATE = "date";
    private static final String MONEY_AMOUNT = "money_amount";
    private static final String TRANSACTION_TYPE = "transaction_type";

    @Column(name = DATE, nullable = false)
    private LocalDateTime date;
    @Column(name = MONEY_AMOUNT, nullable = false)
    private BigDecimal moneyAmount;

    @Column(name = TRANSACTION_TYPE)
    private TransactionType transactionType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(BigDecimal moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
