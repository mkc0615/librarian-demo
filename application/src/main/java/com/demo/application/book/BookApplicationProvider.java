package com.demo.application.book;

import com.demo.application.book.model.BookModel;
import com.demo.domainbook.BookProvider;
import com.demo.domainbook.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class BookApplicationProvider {

    private final BookProvider bookProvider;

    BookApplicationProvider(BookRepository bookRepository) {
        this.bookProvider = new BookProvider(bookRepository);
    }

    public BookModel getBookByTitle(String title) {
        return BookModel.from(bookProvider.findBookByTitle(title));
    }

    public BookModel getBookByAuthor(String author) {
        return BookModel.from(bookProvider.findBookByAuthor(author));
    }

    public List<BookModel> getBooksByKeyword(String keyword) {
        return bookProvider.findBookByKeyword(keyword)
                .stream()
                .map( BookModel::from)
                .collect(Collectors.toList());
    }

    public BookModel getBook(String title, String author){
        return BookModel.from(bookProvider.findBook(title, author));
    }
}
