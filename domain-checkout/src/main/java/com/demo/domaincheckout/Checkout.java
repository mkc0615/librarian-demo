package com.demo.domaincheckout;

import java.time.LocalDateTime;

public class Checkout {
    private Long id;
    private Long bookId;
    private Long userId;
    private LocalDateTime checkoutDate;
    private LocalDateTime returnDate;

    public Checkout(Long bookId, Long userId) {
        this.bookId = bookId;
        this.userId = userId;
    }

    public static Checkout create(Long bookId, Long userId) {
        return new Checkout(bookId, userId);
    }

    public Checkout searched() {
        return new Checkout(bookId, userId);
    }

    public Checkout copy(Long bookId, Long userId) {
        return new Checkout(bookId, userId);
    }

    public Long getId() {
        return id;
    }

    public Long getBookId() {
        return bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }
}
