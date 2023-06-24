package com.demo.domainbook;

import com.demo.domaincore.model.BookStatus;

import java.time.LocalDateTime;

public class Book {
    private String id;
    private String title;
    private String author;
    private BookStatus status;
    private LocalDateTime registeredAt;

    private Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
        this.registeredAt = LocalDateTime.now();
    }

    public static Book create(String id, String title, String author) {
        return new Book(id, title, author);
    }

    public Book searched() {
        return new Book(id, title, author);
    }

    public Book copy(String id, String name, String author) {
        return new Book(id, title, author);
    }

    public String getId() {
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
