package com.demo.domaincheckout;

public class CheckoutService {
    private final CheckoutRepository checkoutRepository;

    public CheckoutService(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    public void checkout(Long bookId, Long userId) {
        // TODO: validation here
        checkoutRepository.save(Checkout.create(bookId, userId));
    }

    public void returnCheckout(Long bookId, Long userId) {
        Checkout checkout = checkoutRepository.findByBookIdAndUserId(bookId, userId);
        checkout.returnCheckout();
        checkoutRepository.save(checkout);
    }
}
