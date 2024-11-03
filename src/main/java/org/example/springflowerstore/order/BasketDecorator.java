package org.example.springflowerstore.order;

public class BasketDecorator extends ItemDecorator{

    public static final int BASKET_PRICE = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + BASKET_PRICE;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with basket";
    }

}
