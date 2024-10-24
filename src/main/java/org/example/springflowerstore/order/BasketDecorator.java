package org.example.springflowerstore.order;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with basket";
    }

}
