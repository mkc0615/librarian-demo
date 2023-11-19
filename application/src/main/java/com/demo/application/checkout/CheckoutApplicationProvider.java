package com.demo.application.checkout;

import com.demo.application.book.BookApplicationProvider;
import com.demo.application.book.model.BookModel;
import com.demo.application.checkout.model.CheckoutModel;
import com.demo.domainbook.Book;
import com.demo.domainbook.BookRepository;
import com.demo.domaincheckout.Checkout;
import com.demo.domaincheckout.CheckoutProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class CheckoutApplicationProvider {
    private final CheckoutProvider checkoutProvider;
    private final BookRepository bookRepository;

    public CheckoutApplicationProvider(
            CheckoutProvider checkoutProvider,
            BookRepository bookRepository
    ) {
        this.checkoutProvider = checkoutProvider;
        this.bookRepository = bookRepository;
    }



    public List<CheckoutModel> findCheckoutsForUser(Long userId) {
        List<Checkout> checkouts = checkoutProvider.findCheckoutsForUser(userId);

        List<Long> bookIds = checkouts.stream().map(Checkout::getBookId).toList();

        List<Book> books = bookRepository.findAllBooksByIds(bookIds);

        Map<Long, Book> bookMap = books.stream().collect(Collectors.toMap(Book::getId, Function.identity()));

        return checkouts.stream()
                .map(checkout -> {
                    Book book = bookMap.get(checkout.getBookId());
                    if (book != null) {
                        BookModel bookModel = BookModel.from(book);
                        return CheckoutModel.from(checkout, bookModel);
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toList();
    }
}
