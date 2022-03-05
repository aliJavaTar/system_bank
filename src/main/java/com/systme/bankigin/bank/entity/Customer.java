package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.profile.Person;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Customer.TABLE_NAME)
public class Customer extends Person {
    public static final String TABLE_NAME = "customers";
}
