package org.example.springflowerstore.delivery;

public class PostDeliveryStrategy implements Delivery{

    @Override
    public double deliver(double price) {
        if (price > 1000)
            return 0;
        return 100;
    }

}
