package com.demo.domaincheckout;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface CheckoutRepository {
    Checkout save(Checkout checkout);

    List<Checkout> findAllByUserId(Long userId);
}
