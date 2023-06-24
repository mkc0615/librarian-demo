package com.demo.infrastructure.book;

import com.demo.domainbook.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookJpaRepository extends JpaRepository<BookEntity, String> {
    Book findBook(String title, String author);
    Book findBookByTitle(String title);
    Book findBookByAuthor(String author);
    List<Book> findBooksByKeyword(String keyword);
}
