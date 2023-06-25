package com.demo.application.book.support;

import com.demo.domainbook.BookRepository;
import com.demo.domainbook.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookDomainServiceLoader {
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookService(bookRepository);
    }
}
