package com.BookStore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
    @Id
    @Column(name="CUSTOMERID")
    private int customerID;
    @Column(name="CUSTOMERNAME")
    private String customerName;
    @Column(name="USERNAME")
    private String userName;

    public Customer() {
    }

    public Customer(String customerName, String userName) {
        this.customerName = customerName;
        this.userName = userName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
