package org.example.springflowerstore.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public double pay(double price) {
        return price - 1;
    }

}
