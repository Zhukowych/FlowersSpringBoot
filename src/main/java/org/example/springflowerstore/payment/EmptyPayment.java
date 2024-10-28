package org.example.springflowerstore.payment;

public class EmptyPayment implements Payment {

    @Override
    public double pay(double price) {
        return price;
    }
}
