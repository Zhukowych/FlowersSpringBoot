package org.example.springflowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public double pay(double price) {
        return price + 10;
    }
}
