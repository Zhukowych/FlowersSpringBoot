package org.example.springflowerstore.order;

public abstract class ItemDecorator extends Item {

    protected Item decoratedItem;

    public ItemDecorator(Item decoratedItem) {
        super(decoratedItem);
        this.decoratedItem = decoratedItem;
    }

    public abstract String getDescription();
    public abstract double getPrice();

}
