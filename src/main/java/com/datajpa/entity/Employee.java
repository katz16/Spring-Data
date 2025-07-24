package com.datajpa.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String empName;
    @Embedded //Address class data will be embedded to table
    private Address address;
}
