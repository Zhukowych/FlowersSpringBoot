package org.example.springflowerstore;

import org.example.springflowerstore.delivery.DHLDeliveryStrategy;
import org.example.springflowerstore.delivery.EmptyDelivery;
import org.example.springflowerstore.delivery.PostDeliveryStrategy;
import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.flower.FlowerBucket;
import org.example.springflowerstore.flower.FlowerColor;
import org.example.springflowerstore.flower.FlowerPack;
import org.example.springflowerstore.order.Item;
import org.example.springflowerstore.order.Order;
import org.example.springflowerstore.payment.EmptyPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeliveryTest {

    private Order order;
    private FlowerBucket bucket;

    private Order bigOrder;
    private FlowerBucket bigBucket;

    @BeforeEach
    public void init(){
        Flower flower = new Flower("Rose", FlowerColor.RED, 10, 10);
        FlowerPack pack = new FlowerPack(flower, 5);
        bucket = new FlowerBucket();
        bucket.add(pack);
        Item item = new Item();
        item.setFlowerBucket(bucket);
        order = new Order();
        order.addItem(item);
        order.setPayment(new EmptyPayment());

        FlowerPack bigPack = new FlowerPack(flower, 10000);
        bigBucket = new FlowerBucket();
        bigBucket.add(bigPack);
        Item bigItem = new Item();
        bigItem.setFlowerBucket(bigBucket);
        bigOrder = new Order();
        bigOrder.addItem(bigItem);
        bigOrder.setPayment(new EmptyPayment());
    }

    @Test
    public void testPostDelivery() {
        order.setDelivery(new PostDeliveryStrategy());
        Assertions.assertEquals(order.getFinalPrice(), bucket.getPrice() + 100);
    }

    @Test
    public void testPostDeliveryHighPrice() {
        bigOrder.setDelivery(new PostDeliveryStrategy());
        Assertions.assertEquals(bigOrder.getFinalPrice(), bigBucket.getPrice());
    }

    @Test
    public void testDHLDeliveryStrategy() {
        bigOrder.setDelivery(new DHLDeliveryStrategy());
        Assertions.assertEquals(bigOrder.getFinalPrice(), bigBucket.getPrice());
    }

}
