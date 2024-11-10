package org.example.springflowerstore.order;

import lombok.Getter;
import lombok.Setter;
import org.example.springflowerstore.delivery.Delivery;
import org.example.springflowerstore.payment.Payment;
import org.example.springflowerstore.user.User;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {

    private List<Item> items;
    private List<User> users;

    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getFinalPrice() {
        double finalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        finalPrice += delivery.deliver(finalPrice);
        return payment.pay(finalPrice);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void notifyUsers(String message) {
        for (User user : users)
            user.update(message);
    }

}
