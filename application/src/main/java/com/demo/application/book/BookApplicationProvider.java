package com.demo.application.book;

import com.demo.application.book.model.BookModel;
import com.demo.domainbook.BookProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class BookApplicationProvider {

    private final BookProvider bookProvider;

    public BookApplicationProvider(BookProvider bookProvider) {
        this.bookProvider = bookProvider;
    }

    public List<BookModel> getAllBooks() {
        return bookProvider.findAllBooks().stream().map(BookModel::from
        ).collect(Collectors.toList());
    }

    public BookModel getBookByTitle(String title) {
        return BookModel.from(bookProvider.findBookByTitle(title));
    }

    public BookModel getBookByAuthor(String author) {
        return BookModel.from(bookProvider.findBookByAuthor(author));
    }

//    public List<BookModel> getBooksByKeyword(String keyword) {
//        return bookProvider.findBookByKeyword(keyword)
//                .stream()
//                .map( BookModel::from)
//                .collect(Collectors.toList());
//    }

    public BookModel getBook(String title, String author){
        return BookModel.from(bookProvider.findBook(title, author));
    }
}
