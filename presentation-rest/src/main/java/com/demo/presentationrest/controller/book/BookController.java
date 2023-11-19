package com.demo.presentationrest.controller.book;

import com.demo.application.book.BookApplicationProvider;
import com.demo.application.book.BookApplicationService;
import com.demo.application.book.model.BookModel;
import com.demo.presentationrest.controller.book.model.BookParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookApplicationProvider bookApplicationProvider;
    private final BookApplicationService bookApplicationService;

    public BookController(BookApplicationProvider bookApplicationProvider, BookApplicationService bookApplicationService) {
        this.bookApplicationProvider = bookApplicationProvider;
        this.bookApplicationService = bookApplicationService;
    }

    @GetMapping
    public List<BookModel> findAllBooks() {
        return bookApplicationProvider.getAllBooks();
    }

    @GetMapping("/title/{title}")
    public BookModel getBookByTitle(
            @PathVariable String title
    ) {
        return bookApplicationProvider.getBookByTitle(title);
    }

    @GetMapping("/author/{author}")
    public BookModel getBookByAuthor(
            @PathVariable String author
    ) {
        return bookApplicationProvider.getBookByAuthor(author);
    }

    @PostMapping
    public void register(
            @RequestBody BookParam bookParam
    ) {
        bookApplicationService.registerBook(bookParam.getTitle(), bookParam.getAuthor());
    }
}
