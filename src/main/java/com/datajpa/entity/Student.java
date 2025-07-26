package com.datajpa.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;

import java.util.List;
@Entity
public class Student {
    @Id
    private int studId;
    private String studName;
    private String course;
    @ElementCollection
    @JoinTable(name="stud_address") // this annotation is optional.
    // This can give name of the newly formed address table
    private List<Address> address;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
