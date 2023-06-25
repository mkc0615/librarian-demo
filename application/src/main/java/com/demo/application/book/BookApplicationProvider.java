package com.demo.application.book;

import com.demo.domainbook.Book;
import com.demo.domainbook.BookProvider;

import java.util.List;

public class BookApplicationProvider {

    private final BookProvider bookProvider;

    public BookApplicationProvider(BookProvider bookProvider) {
        this.bookProvider = bookProvider;
    }

    public Book getBookByTitle(String title) {
        return bookProvider.findBookByTitle(title);
    }

    public Book getBookByAuthor(String author) {
        return bookProvider.findBookByAuthor(author);
    }

    public List<Book> getBooksByKeyword(String keyword) {
        return bookProvider.findBookByKeyword(keyword);
    }

    public Book getBook(String title, String author){
        return bookProvider.findBook(title, author);
    }
}
