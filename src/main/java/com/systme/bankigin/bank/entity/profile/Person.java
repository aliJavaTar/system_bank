package com.systme.bankigin.bank.entity.profile;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public abstract class Person extends BaseEntity<Long> {

    private static final String FIRST_NAME = "firstname";
    private static final String LAST_NAME = "lastname";
    private static final String FATHER_NAME = "father_name";
    private static final String AGE = "age";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    private static final String BIRTHDAY = "birthday";
    private static final String ADDRESS = "address";

    @Column(name = FATHER_NAME, nullable = false)
    private String firstname;
    @Column(name = LAST_NAME, nullable = false)
    private String lastname;
    @Column(name = FATHER_NAME, nullable = false)
    private String fatherName;
    @Column(name = AGE, nullable = false)
    private int age;
    @Column(name = EMAIL, nullable = false, unique = true)
    private String email;
    @Column(name = PASSWORD, nullable = false)
    private String password;
    @Column(name = BIRTHDAY, nullable = false)
    private LocalDate birthday;

    @Embedded
    @Column(name = ADDRESS,nullable = false)
    private Address address;

}
