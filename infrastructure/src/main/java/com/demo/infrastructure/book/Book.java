package com.demo.infrastructure.book;

import com.demo.domaincore.model.BookStatus;
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
    private BookStatus status;
    private LocalDateTime registeredAt;
}
