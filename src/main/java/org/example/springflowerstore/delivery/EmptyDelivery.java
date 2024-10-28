package org.example.springflowerstore.delivery;

public class EmptyDelivery implements Delivery {

    @Override
    public double deliver(double price) {
        return 0;
    }

}
