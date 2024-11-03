package org.example.springflowerstore.order;

public class RibbonDecorator extends ItemDecorator {

    public static final int RIBBON_PRICE = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + RIBBON_PRICE;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with ribbon";
    }

}
