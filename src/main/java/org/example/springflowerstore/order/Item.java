package org.example.springflowerstore.order;

import lombok.Getter;
import lombok.Setter;
import org.example.springflowerstore.flower.FlowerBucket;

@Getter
@Setter
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
