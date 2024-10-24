package org.example.springflowerstore.flower;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Flower {

    private FlowerType flowerType;
    private FlowerColor color;
    private double price;
    private double sepalLength;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return this.color.getRgb();
    }

    public FlowerSpecification getSpecification() {
        return new FlowerSpecification(this.flowerType, this.color);
    }

}
