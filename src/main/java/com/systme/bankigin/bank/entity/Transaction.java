package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import static com.systme.bankigin.bank.entity.Transaction.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class Transaction extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "transactions";
    private static final String DATE = "date";
    private static final String MONEY_AMOUNT = "money_amount";
    @Column(name = DATE, nullable = false)
    private LocalDate date;
    @Column(name = MONEY_AMOUNT, nullable = false)
    private BigDecimal moneyAmount;
}
