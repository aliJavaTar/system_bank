package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import static com.systme.bankigin.bank.entity.BranchBank.TABLE_NAME;

@Entity
@Table(name = TABLE_NAME)
public class BranchBank extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "branch_bank";
}
