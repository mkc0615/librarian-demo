package com.demo.domainbook;

import java.util.List;

public class BookProvider {
    private final BookRepository bookRepository;

    public BookProvider(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public Book findBookByAuthor(String author) {
        return bookRepository.findBookByAuthor(author);
    }

//    public List<Book> findBookByKeyword(String keyword) {
//        return bookRepository.findBooksByKeyword(keyword);
//    }

    public Book findBook(String title, String author) {
        return bookRepository.findBook(title, author);
    }
}
