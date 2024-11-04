package com.demo.infrastructure.checkout;

import com.demo.domaincheckout.Checkout;
import com.demo.domaincheckout.CheckoutRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Checkout> findAllByUserId(Long userId) {
        return checkoutRepository.findAllByUserId(userId);
    }

    @Override
    public Checkout findByBookIdAndUserId(Long bookId, Long userId) {
        return null;
    }
}
