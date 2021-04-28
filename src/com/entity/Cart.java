package com.entity;

public class Cart {
    int bookId;
    int quality;
    int customerId;

    public Cart(int bookId, int quality, int customerId) {
        this.bookId = bookId;
        this.quality = quality;
        this.customerId = customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


}
