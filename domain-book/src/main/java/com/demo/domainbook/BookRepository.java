package com.demo.domainbook;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    List<Book> findAllBooksByIds(List<Long> bookIds);
    Book findById(Long id);
    Book findBook(String title, String author);
    Book findBookByTitle(String title);
    Book findBookByAuthor(String author);
    Book save(Book book);
}
