package com.demo.infrastructure.checkout;

import com.demo.domaincheckout.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public interface ICheckoutJpaRepository extends JpaRepository<CheckoutEntity, Long> {

    List<Checkout> findAllByUserId(Long userId);
}
