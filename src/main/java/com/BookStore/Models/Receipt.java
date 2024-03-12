package com.BookStore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="RECEIPT")
public class Receipt {
    @Id
    @Column(name="RECRIPTID")
    private int receiptID;
    @Column(name="RECRIPTDATE")
    private Date receiptDate;
    @Column(name="TOTAL")
    private int total;
    @Column(name="CUSTOMERID")
    private int customerID;

    public Receipt() {
    }

    public Receipt(Date receiptDate, int customerID) {
        this.receiptDate = receiptDate;
        this.customerID = customerID;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
