package com.demo.presentationrest.book;

import com.demo.application.book.BookApplicationProvider;
import com.demo.application.book.model.BookModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookApplicationProvider bookApplicationProvider;
    public BookController(BookApplicationProvider bookApplicationProvider) {
        this.bookApplicationProvider = bookApplicationProvider;
    }
    @GetMapping("{title}")
    public BookModel getBookByTitle(
        @PathVariable String title
    ) {
        return bookApplicationProvider.getBookByTitle(title);
    }

    @GetMapping("{author}")
    public BookModel getBookByAuthor(
        @PathVariable String author
    ) {
        return bookApplicationProvider.getBookByAuthor(author);
    }

    @GetMapping("{keyword}")
    public List<BookModel> getBooksByKeyword(
        @PathVariable String keyword
    ){
        return bookApplicationProvider.getBooksByKeyword(keyword);
    }
}
