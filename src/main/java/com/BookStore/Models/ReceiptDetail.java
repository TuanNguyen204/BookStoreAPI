package com.BookStore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RECEIPTDETAIL")
public class ReceiptDetail {
    @Id
    @Column(name="RECEIPTID")
    private int receiptID;
    @Id
    @Column(name="BOOKID")
    private int bookID;
    @Column(name="QUANTITY")
    private int quantity;

    public ReceiptDetail(int receiptID, int bookID, int quantity) {
        this.quantity = quantity;
        this.receiptID = receiptID;
        this.bookID = bookID;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
