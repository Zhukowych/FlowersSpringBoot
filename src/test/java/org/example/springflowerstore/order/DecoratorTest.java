package org.example.springflowerstore.order;

import org.example.springflowerstore.delivery.EmptyDelivery;
import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.flower.FlowerBucket;
import org.example.springflowerstore.flower.FlowerColor;
import org.example.springflowerstore.flower.FlowerPack;
import org.junit.jupiter.api.BeforeEach;

public class DecoratorTest {

    protected Item item;

    @BeforeEach
    public void init() {
        Flower flower = new Flower("Rose", FlowerColor.RED, 10, 10);
        FlowerPack pack = new FlowerPack(flower, 5);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(pack);
        item = new Item();
        item.setFlowerBucket(bucket);
    }


}
