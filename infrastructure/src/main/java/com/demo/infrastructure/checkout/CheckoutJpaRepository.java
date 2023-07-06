package com.demo.infrastructure.checkout;

import com.demo.domaincheckout.Checkout;
import com.demo.domaincheckout.CheckoutRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CheckoutJpaRepository implements CheckoutRepository {
    private final ICheckoutJpaRepository checkoutRepository;
    public CheckoutJpaRepository(ICheckoutJpaRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    public Checkout save(Checkout checkout) {
        return checkoutRepository.save(
                new CheckoutEntity().
                        fromDomainModel(checkout)
        ).toDomainModel();
    }
}
