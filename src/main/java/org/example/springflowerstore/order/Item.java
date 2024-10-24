package org.example.springflowerstore.order;

import org.example.springflowerstore.flower.FlowerBucket;

public class Item {

    private FlowerBucket flowerBucket;

    public Item() {}

    public Item(Item item) {
        this.flowerBucket = item.flowerBucket;
    }

    public double getPrice() {
        return flowerBucket.getPrice();
    }

    public String getDescription() {
        return String.format("Item: %s", flowerBucket.toString());
    }

}
