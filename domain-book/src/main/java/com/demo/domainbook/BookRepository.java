package com.demo.domainbook;

import java.util.List;

public interface BookRepository {
    Book findBook(String title, String author);
    Book findBookByTitle(String Title);
    Book findBookByAuthor(String author);
    List<Book> findBooksByKeyword(String keyword);
    Book save(Book book);
}
