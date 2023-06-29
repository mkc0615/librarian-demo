package com.demo.domainbook;

import com.demo.domaincore.model.BookStatus;

import java.time.LocalDateTime;

public class Book {
    private Long id;
    private String title;
    private String author;
    private BookStatus status;
    private LocalDateTime registeredAt;

    private Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
        this.registeredAt = LocalDateTime.now();
    }

    public static Book create(String title, String author) {
        return new Book(title, author);
    }

    public Book searched() {
        return new Book(title, author);
    }

    public Book copy(String name, String author) {
        return new Book(title, author);
    }

    public Long getId() {
        return id;
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
