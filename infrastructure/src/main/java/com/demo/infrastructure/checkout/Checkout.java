package com.demo.infrastructure.checkout;

import com.demo.domaincheckout.Checkout;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "checkout")
class CheckoutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long bookId;
    @Column
    private Long userId;
    @Column
    private LocalDateTime checkoutDate;
    @Column
    private LocalDateTime returnDate;

    public CheckoutEntity(Checkout checkout) {
        this.bookId = checkout.getBookId();
        this.userId = checkout.getUserId();
        this.checkoutDate = LocalDateTime.now();
        this.returnDate = null;
    }

    public CheckoutEntity() { }

    public Long getId() {
        return id;
    }

    public Long getBookId() {
        return bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public Checkout toDomainModel() {
        return Checkout.create(bookId, userId);
    }

    public CheckoutEntity fromDomainModel(Checkout checkout) {
        return new CheckoutEntity(checkout);
    }
}
