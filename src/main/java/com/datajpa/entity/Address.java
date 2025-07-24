package com.datajpa.entity;

import jakarta.persistence.Embeddable;

@Embeddable// this makes the address class to be embeddable
public class Address {
    private String doorNo;
    private String placeName;
    private int pinCode;

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
