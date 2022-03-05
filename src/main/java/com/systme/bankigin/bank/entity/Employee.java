package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.profile.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static com.systme.bankigin.bank.entity.Employee.TABLE_NAME;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name =TABLE_NAME )
public class Employee extends Person {
    public static final String TABLE_NAME = "Employees";
    private static final String SALARY = "salary";

    @Column(name = SALARY)
    private double salary;
}
