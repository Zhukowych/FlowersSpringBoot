package org.example.springflowerstore.flower;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public final class FlowerSpecification {

    private final String name;
    private final FlowerColor color;


    public boolean match(FlowerSpecification flowerSpecification) {
        if (name != null && flowerSpecification.getName() != name) {
            return false;
        }

        if (color != null && flowerSpecification.getColor() != color) {
            return false;
        }

        return true;
    }

}
