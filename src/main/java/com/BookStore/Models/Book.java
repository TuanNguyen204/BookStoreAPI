package com.BookStore.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="BOOK")
public class Book {
    @Id
    @Column(name="BOOKID")
    private int bookID;
    @Column(name="BOOKNAME")
    private String bookName;
    @Column(name="BOOKDECRIPTION")
    private String bookDescription;
    @Column(name="BOOKPRICE")
    private int bookPrice;
    @Column(name="CATEGORYID")
    private int categoryID;

    public Book() {
    }

    public Book(String bookName, String bookDescription, int bookPrice, int categoryID) {
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.categoryID = categoryID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
