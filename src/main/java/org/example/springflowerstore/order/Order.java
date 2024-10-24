package org.example.springflowerstore.order;

import lombok.Getter;
import lombok.Setter;
import org.example.springflowerstore.delivery.Delivery;
import org.example.springflowerstore.payment.Payment;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {

    private List<Item> items;

    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getFinalPrice() {
        double finalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        finalPrice += delivery.deliver(finalPrice);
        return payment.pay(finalPrice);
    }

}
