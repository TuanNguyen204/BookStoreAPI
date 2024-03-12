package com.BookStore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOKCATEGORY")
public class BookCategory {
    @Id
    @Column(name="CATEGORYID")
    private int categoryID;
    @Column(name="CATEGORYNAME")
    private String categoryName;

    public BookCategory() {
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
