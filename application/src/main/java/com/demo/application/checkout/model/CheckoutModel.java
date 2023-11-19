package com.demo.application.checkout.model;

import com.demo.application.book.model.BookModel;
import com.demo.domaincheckout.Checkout;

public class CheckoutModel {
    private final Long userId;

    private final Long bookId;

    private final BookModel book;

    public CheckoutModel(Long userId, Long bookId, BookModel book) {
        this.userId = userId;
        this.bookId = bookId;
        this.book = book;
    }

    public static CheckoutModel from(Checkout checkout, BookModel book) {
        return new CheckoutModel(checkout.getUserId(), checkout.getBookId(), book);
    }

    public Long getUserId() {
        return userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public BookModel getBook() {
        return book;
    }
}
