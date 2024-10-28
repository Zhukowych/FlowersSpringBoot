package org.example.springflowerstore.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
public class FlowerPack {

    private final Flower flower;

    @Setter
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    public double getPrice() {
        return this.flower.getPrice() * this.amount;
    }

    @Override
    public String toString() {
        return String.format("FlowerPack<type=%s, amount=%s>", flower.getName(), amount);
    }

}
