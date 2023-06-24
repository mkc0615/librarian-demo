package com.demo.infrastructure.book;

import com.demo.domainbook.Book;
import com.demo.domaincore.model.BookStatus;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "book"
)
class BookEntity {
    private String id;
    private String title;
    private String author;
    @Convert(converter = BookStatusConverter.class)
    private BookStatus status;
    private LocalDateTime registeredAt;

    public BookEntity(){ }

    public BookEntity(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.status = BookStatus.AVAILABLE;
        this.registeredAt = book.getRegisteredAt();
    }

    public Book toDomainModel() {
        return Book.create(id, title, author);
    }

    public BookEntity fromDomainModel(Book book) {
        return new BookEntity(book);
    }
}
