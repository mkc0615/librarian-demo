package com.demo.application.book;

import com.demo.domainbook.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookApplicationService {

    private final BookService bookService;

    public BookApplicationService(BookService bookService) {
        this.bookService = bookService;
    }

    public void registerBook(String title, String author){
        bookService.register(title, author);
    }
}
