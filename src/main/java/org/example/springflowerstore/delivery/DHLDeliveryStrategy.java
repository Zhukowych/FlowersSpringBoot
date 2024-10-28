package org.example.springflowerstore.delivery;

import lombok.Getter;

@Getter
public class DHLDeliveryStrategy implements Delivery {

    private String description;

    public DHLDeliveryStrategy() {
        description = "DHL delivery";
    }

    @Override
    public double deliver(double price) {
        return 0;
    }

}
