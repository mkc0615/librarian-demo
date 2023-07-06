package com.demo.domaincheckout;

public class CheckoutService {
    private final CheckoutRepository checkoutRepository;

    public CheckoutService(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    public void checkoutBook(Long bookId,Long userId) {
        checkoutRepository.save(Checkout.create(bookId, userId));
    }
}
