package org.example.springflowerstore.order;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with paper";
    }

}
