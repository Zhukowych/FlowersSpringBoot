package org.example.springflowerstore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private boolean isAvailable;

    public Flower(String name) {
        this.name = name;
    }

    public Flower(String name, FlowerColor color, double sepalLength, double price) {
        this.name = name;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public Flower(Flower flower) {
        this.name = flower.name;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return this.color.getRgb();
    }

    public FlowerSpecification getSpecification() {
        return new FlowerSpecification(this.name, this.color);
    }

}
