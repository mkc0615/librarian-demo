package com.demo.domainbook;

import com.demo.domaincore.model.UUIDGenerator;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void register(String title, String author) {
        Book book = bookRepository.findBook(title, author);
        if(book == null) {
            String id = UUIDGenerator.generate();
            book = Book.create(id, title, author);
        }
        bookRepository.save(book);
    }

    public void checkout(){

    }

    public void returned(){

    }
}
