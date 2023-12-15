package com.demo.domaincheckout;

import java.util.List;

public class CheckoutProvider {
    private final CheckoutRepository checkoutRepository;

    public CheckoutProvider(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    public List<Checkout> findCheckoutsForUser(Long userId) {
        return checkoutRepository.findAllByUserId(userId);
    }
}
