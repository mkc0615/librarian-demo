package com.demo.domaincheckout;

import org.springframework.stereotype.Repository;

public interface CheckoutRepository {
    Checkout save(Checkout checkout);
}
