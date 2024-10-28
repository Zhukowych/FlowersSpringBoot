package org.example.springflowerstore.controller;

import org.example.springflowerstore.payment.CreditCardPaymentStrategy;
import org.example.springflowerstore.payment.PayPalPaymentStrategy;
import org.example.springflowerstore.payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @GetMapping("/payments")
    public List<Payment> getAvailablePayments() {
        List<Payment> availablePayments = new ArrayList<>();
        availablePayments.add(new CreditCardPaymentStrategy());
        availablePayments.add(new PayPalPaymentStrategy());
        return availablePayments;
    }

}
