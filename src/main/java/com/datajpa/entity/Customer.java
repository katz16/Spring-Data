package com.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //@Entity annotation automatically maps class with table
public class Customer {
    @Id //This marks custId as primary key
    private int custId;
    @Column(name="cname", length = 20) //sets the name of column to cname and set size to 20 characters
    private String custName;
    private String address;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
