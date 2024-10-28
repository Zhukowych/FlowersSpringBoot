package org.example.springflowerstore.payment;

import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment {

    private String description;

    public PayPalPaymentStrategy() {
        this.description = "Paypal payment";
    }

    @Override
    public double pay(double price) {
        return price - 1;
    }

}
