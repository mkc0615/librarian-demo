package com.demo.presentationrest.book;

import com.demo.application.book.BookApplicationProvider;
import com.demo.application.book.BookApplicationService;
import com.demo.application.book.model.BookModel;
import com.demo.presentationrest.book.model.BookParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookApplicationProvider bookApplicationProvider;
    private final BookApplicationService bookApplicationService;

    public BookController(BookApplicationProvider bookApplicationProvider, BookApplicationService bookApplicationService) {
        this.bookApplicationProvider = bookApplicationProvider;
        this.bookApplicationService = bookApplicationService;
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

//    @GetMapping("/keyword/{keyword}")
//    public List<BookModel> getBooksByKeyword(
//        @PathVariable String keyword
//    ){
//        return bookApplicationProvider.getBooksByKeyword(keyword);
//    }

    @PostMapping
    public void register(
        @RequestBody BookParam bookParam
    ) {
        System.out.println("check title -> "+bookParam.getTitle());
        System.out.println("check author -> "+bookParam.getAuthor());
        bookApplicationService.registerBook(bookParam.getTitle(), bookParam.getAuthor());
    }
}
