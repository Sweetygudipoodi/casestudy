package com.hp.staffmgmtservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staff")
public class Staff {
    @Id
    private String id;
    private int staffCode;
    private String empName;
    private long empSalary;
    private int empAge;
    private String empOccupation;
    private String empEmail;
    private String street;
    private int zipCode;
    private String city;
    private String country;

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", staffCode=" + staffCode +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                ", empOccupation='" + empOccupation + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", street='" + street + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(int staffCode) {
        this.staffCode = staffCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpOccupation() {
        return empOccupation;
    }

    public void setEmpOccupation(String empOccupation) {
        this.empOccupation = empOccupation;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}