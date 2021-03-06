package com.systme.bankigin.bank.entity.profile;

import com.systme.bankigin.bank.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private static final String STREET = "street";
    private static final String ZIP_CODE = "zip_code";
    private static final String CITY = "city";
    private static final String STATE = "state";
    @Column(name = STREET, nullable = false)
    private String street;
    @Column(name = ZIP_CODE, nullable = false)
    private String zipCode;
    @Column(name = CITY, nullable = false)
    private String city;
    @Column(name = STATE, nullable = false)
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
