package org.example.springflowerstore;

import org.example.springflowerstore.delivery.EmptyDelivery;
import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.flower.FlowerBucket;
import org.example.springflowerstore.flower.FlowerColor;
import org.example.springflowerstore.flower.FlowerPack;
import org.example.springflowerstore.order.Item;
import org.example.springflowerstore.order.Order;
import org.example.springflowerstore.payment.CreditCardPaymentStrategy;
import org.example.springflowerstore.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    private Order smallOrder;
    private FlowerBucket smallBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Flower("Rose", FlowerColor.RED, 10, 10);
        FlowerPack pack = new FlowerPack(flower, 5);
        smallBucket = new FlowerBucket();
        smallBucket.add(pack);
        Item item = new Item();
        item.setFlowerBucket(smallBucket);
        smallOrder = new Order();
        smallOrder.addItem(item);
        smallOrder.setDelivery(new EmptyDelivery());

   }

    @Test
    public void testPayPalPayment() {
        smallOrder.setPayment(new PayPalPaymentStrategy());
        Assertions.assertEquals(smallOrder.getFinalPrice(), smallBucket.getPrice() - 1);
    }

    @Test
    public void testCreditCardPayment() {
        smallOrder.setPayment(new CreditCardPaymentStrategy());
        Assertions.assertEquals(smallOrder.getFinalPrice(), smallBucket.getPrice() + 10);
    }

}
