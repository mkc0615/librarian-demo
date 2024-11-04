package com.demo.domainbook;

import com.demo.domaincore.model.UUIDGenerator;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void register(String title, String author) {
        Book book = bookRepository.findBook(title, author);
        if (book == null) {
            book = Book.create(title, author);
        } else {
            throw new IllegalArgumentException("이미 존재하는 책입니다");
        }
        bookRepository.save(book);
    }

    public void remove(long bookId) {
        Book book = bookRepository.findById(bookId);
        book.remove();
        bookRepository.save(book);
    }
}
