package com.demo.application.book.model;

import com.demo.domainbook.Book;
import com.demo.domaincore.model.BookStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BookModel implements Serializable {

    private final String title;
    private final String author;
    private final BookStatus status;
    private final LocalDateTime registeredAt;

    public BookModel(String title, String author, BookStatus status, LocalDateTime registeredAt) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.registeredAt = registeredAt;
    }

    public static BookModel from(Book book) {
        return new BookModel(book.getTitle(), book.getAuthor(), book.getStatus(), book.getRegisteredAt());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }
}
