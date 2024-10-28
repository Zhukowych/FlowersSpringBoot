package org.example.springflowerstore.delivery;

import lombok.Getter;

@Getter
public class PostDeliveryStrategy implements Delivery{

    private String description;

    public PostDeliveryStrategy(){
        description = "Post delivery";
    }

    @Override
    public double deliver(double price) {
        if (price > 1000)
            return 0;
        return 100;
    }

}
