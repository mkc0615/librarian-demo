package com.demo.infrastructure.book;

import com.demo.domainbook.Book;
import com.demo.domainbook.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookJpaRepository implements BookRepository {

    private final IBookJpaRepository bookRepository;

    public BookJpaRepository(IBookJpaRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll().stream().map(BookEntity::toDomainModel).collect(Collectors.toList());
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

    @Override
    public Book findById(Long userId) {
        return bookRepository.findById(userId);
    }

    @Override
    public List<Book> findAllBooksByIds(List<Long> bookIds) {
        return bookRepository.findBooksByIdIn(bookIds);
    }
}
