package com.niit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document
public class Customer implements Serializable
{   @Id
    private int customerId;
    private String customerName;
    private String phoneNo;
    private String Address;

    public Customer() {}

    public Customer(int customerId, String customerName, String phoneNo, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNo = phoneNo;
        Address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
