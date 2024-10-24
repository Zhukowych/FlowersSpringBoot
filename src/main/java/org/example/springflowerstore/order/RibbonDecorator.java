package org.example.springflowerstore.order;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with ribbon";
    }

}
