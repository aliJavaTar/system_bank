package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import static com.systme.bankigin.bank.entity.BranchBank.TABLE_NAME;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name = TABLE_NAME)
public class BranchBank extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "branch_bank";
    private static final String NAME = "name";
    private static final String NUMBER_BRANCH = "number_branch";
    private static final String PHONE_NUMBER = "phone_number";
    private static final String ADDRESS = "address";
    @Column(name = NAME,nullable = false)
    private String name;
    @Column(name = NUMBER_BRANCH)
    private Integer numberBranch;
    @Column(name = PHONE_NUMBER)
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberBranch(Integer numberBranch) {
        this.numberBranch = numberBranch;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberBranch() {
        return numberBranch;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
