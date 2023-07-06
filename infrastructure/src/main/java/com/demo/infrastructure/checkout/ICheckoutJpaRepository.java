package com.demo.infrastructure.checkout;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICheckoutJpaRepository extends JpaRepository<CheckoutEntity, Long> {

}
