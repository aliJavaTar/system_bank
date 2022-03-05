package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.profile.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = Customer.TABLE_NAME)
public class Customer extends Person {
    public static final String TABLE_NAME = "customers";
    private static final String JOP = "jop";

    @Column(name = JOP)
    private String jop;

    public String getJop() {
        return jop;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }
}
