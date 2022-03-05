package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;
@Entity

public class CreditCard extends BaseEntity<Long> implements Serializable {
    private long numberCard;
    private int cvv2;
    private Date expirationDate;
    private int password;
    private int secondPassword;
}
