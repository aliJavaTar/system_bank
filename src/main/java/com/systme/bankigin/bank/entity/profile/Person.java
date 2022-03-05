package com.systme.bankigin.bank.entity.profile;

import com.systme.bankigin.bank.entity.base.BaseEntity;

import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
public abstract class Person extends BaseEntity<Long> {
    private String firstname;
    private String lastname;
    private String fatherName;
    private int age;
    private String email;
    private String password;
    private Date birthday;
    private Address address;

}
