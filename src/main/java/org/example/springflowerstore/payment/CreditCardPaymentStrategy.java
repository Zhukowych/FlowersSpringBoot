package org.example.springflowerstore.payment;


import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment {

    private String description;

    public CreditCardPaymentStrategy() {
        this.description = "Credit card payment";
    }

    @Override
    public double pay(double price) {
        return price + 10;
    }
}
