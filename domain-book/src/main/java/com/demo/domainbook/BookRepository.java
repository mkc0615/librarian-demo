package com.demo.domainbook;

import java.util.List;

public interface BookRepository {
    Book findBook(String title, String author);
    Book findBookByTitle(String title);
    Book findBookByAuthor(String author);
    Book save(Book book);
}
