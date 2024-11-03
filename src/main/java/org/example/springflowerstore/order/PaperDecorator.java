package org.example.springflowerstore.order;

public class PaperDecorator extends ItemDecorator {

    public static final int PAPER_PRICE = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + PAPER_PRICE;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " with paper";
    }

}
