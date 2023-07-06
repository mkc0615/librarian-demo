package com.demo.presentationrest.controller.checkout;

import com.demo.application.checkout.CheckoutApplicationProvider;
import com.demo.application.checkout.CheckoutApplicationService;
import com.demo.presentationrest.controller.checkout.model.CheckoutForm;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/checkout")
public class CheckoutController {
    private final CheckoutApplicationProvider checkoutApplicationProvider;
    private final CheckoutApplicationService checkoutApplicationService;

    public CheckoutController(CheckoutApplicationProvider checkoutApplicationProvider, CheckoutApplicationService checkoutApplicationService) {
        this.checkoutApplicationProvider = checkoutApplicationProvider;
        this.checkoutApplicationService = checkoutApplicationService;
    }

    @PostMapping
    public void checkout(@RequestBody CheckoutForm form) {
        checkoutApplicationService.checkoutBook(form.getBookId(), form.getUserId());
    }
}
