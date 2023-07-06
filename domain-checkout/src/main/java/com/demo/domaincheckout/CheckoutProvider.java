package com.demo.domaincheckout;

public class CheckoutProvider {
    private final CheckoutRepository checkoutRepository;

    public CheckoutProvider(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }
}
