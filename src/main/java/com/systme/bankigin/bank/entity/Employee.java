package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.profile.Person;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
    private double salary;
}
