package com.demo.infrastructure.book;

import com.demo.domainbook.Book;
import com.demo.domaincore.model.BookStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "book"
)
class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String author;
    @Convert(converter = BookStatusConverter.class)
    @Column
    private BookStatus status;
    @Column
    private LocalDateTime registeredAt;

    public BookEntity(){ }

    public BookEntity(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.status = BookStatus.AVAILABLE;
        this.registeredAt = book.getRegisteredAt();
    }

    public Book toDomainModel() {
        return Book.create(title, author);
    }

    public BookEntity fromDomainModel(Book book) {
        return new BookEntity(book);
    }
}
