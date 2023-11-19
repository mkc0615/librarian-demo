package com.demo.presentationrest.controller.checkout;

import com.demo.application.checkout.CheckoutApplicationProvider;
import com.demo.application.checkout.CheckoutApplicationService;
import com.demo.application.checkout.model.CheckoutModel;
import com.demo.domaincheckout.Checkout;
import com.demo.presentationrest.controller.checkout.model.CheckoutForm;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{userId}")
    public List<CheckoutModel> findCheckoutsForUser(
            @PathVariable Long userId
    ) {
        return checkoutApplicationProvider.findCheckoutsForUser(userId);
    }
}
