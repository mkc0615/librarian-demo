package com.demo.application.checkout.support;

import com.demo.domaincheckout.CheckoutProvider;
import com.demo.domaincheckout.CheckoutRepository;
import com.demo.domaincheckout.CheckoutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CheckoutDomainServiceLoader {
    @Bean
    public CheckoutService checkoutService(CheckoutRepository checkoutRepository) {
        return new CheckoutService(checkoutRepository);
    }
    @Bean
    public CheckoutProvider checkoutProvider(CheckoutRepository checkoutRepository) {
        return new CheckoutProvider(checkoutRepository);
    }
}
