package com.demo.application.checkout;

import com.demo.domainbook.BookRepository;
import com.demo.domaincheckout.CheckoutService;
import com.demo.domainuser.User;
import com.demo.domainuser.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CheckoutApplicationService {
    private final CheckoutService checkoutService;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;
    public CheckoutApplicationService(CheckoutService checkoutService, UserRepository userRepository, BookRepository bookRepository) {
        this.checkoutService = checkoutService;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    public void checkoutBook(Long bookId, Long userId) {



        checkoutService.checkoutBook(bookId, userId);
    }

    public void validateUser(Long userId) {
        User user = userRepository.findById(userId);
        if(user == null) {

        }
    }
}
