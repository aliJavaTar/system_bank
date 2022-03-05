package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import static com.systme.bankigin.bank.entity.Account.TABLE_NAME;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = TABLE_NAME)
public class Account extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "accounts";
    private static final String NUMBER_ACCOUNT = "number_account";
    private static final String MONEY = "money";
    private static final String CREATED_AT = "created_at";
    private static final String DISABLE = "is_disable";
    @Column(name = NUMBER_ACCOUNT, nullable = false, unique = true)
    private long numberAccount;
    @Column(name = MONEY, nullable = false)
    private BigDecimal money;
    @Column(name = CREATED_AT)
    private LocalDate createdAt;
    @Column(name = DISABLE, columnDefinition = ("tinyint(1) default 1"))
    private boolean isDisable;
}
