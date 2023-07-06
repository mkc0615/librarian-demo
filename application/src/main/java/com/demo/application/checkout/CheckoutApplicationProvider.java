package com.demo.application.checkout;

import com.demo.domaincheckout.CheckoutProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CheckoutApplicationProvider {
    private final CheckoutProvider checkoutProvider;

    public CheckoutApplicationProvider(CheckoutProvider checkoutProvider) {
        this.checkoutProvider = checkoutProvider;
    }
}
