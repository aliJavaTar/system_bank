package com.systme.bankigin.bank.entity;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

import static com.systme.bankigin.bank.entity.CreditCard.TABLE_NAME;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = TABLE_NAME)
public class CreditCard extends BaseEntity<Long> implements Serializable {
    public static final String TABLE_NAME = "credit_cards";
    private static final String NUMBER_CARD = "number_card";
    private static final String CVV2 = "cvv2";
    private static final String EXPIRATION_DATE = "expiration_date";
    private static final String PASSWORD = "password";
    private static final String SECOND_PASSWORD = "second_password";

    @Column(name = NUMBER_CARD, nullable = false, unique = true)
    private long numberCard;

    @Column(name = CVV2, nullable = false, unique = true)
    private int cvv2;
    @Column(name = EXPIRATION_DATE, nullable = false, unique = true)
    private Date expirationDate;
    @Column(name = PASSWORD, nullable = false)
    private int password;
    @Column(name = SECOND_PASSWORD, nullable = false)
    private int secondPassword;

}
