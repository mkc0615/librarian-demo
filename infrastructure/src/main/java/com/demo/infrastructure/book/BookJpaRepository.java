package com.demo.infrastructure.book;

import com.demo.domainbook.Book;
import com.demo.domainbook.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookJpaRepository implements BookRepository {

    private final IBookJpaRepository bookRepository;

    public BookJpaRepository(IBookJpaRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findBook(String title, String author) {
        return bookRepository.findBookByTitleAndAuthor(title, author);
    }

    @Override
    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    @Override
    public Book findBookByAuthor(String author) {
        return bookRepository.findBookByAuthor(author);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(
            new BookEntity()
                    .fromDomainModel(book)
        ).toDomainModel();
    }
}
