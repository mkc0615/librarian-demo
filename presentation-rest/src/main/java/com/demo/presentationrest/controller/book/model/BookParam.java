package com.demo.presentationrest.controller.book.model;

import jakarta.validation.constraints.NotNull;

public class BookParam {
    @NotNull
    private String title;
    @NotNull
    private String author;

    public BookParam(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
