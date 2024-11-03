package org.example.springflowerstore.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketDecoratorTest extends DecoratorTest {

    @Test
    public void testBasketDecoratorPrice() {
        Item decorated = new BasketDecorator(item);
        Assertions.assertEquals(decorated.getPrice(), item.getPrice() + BasketDecorator.BASKET_PRICE);
    }

    @Test
    public void testBasketDecoratorDescription() {
        Item decorated = new BasketDecorator(item);
        Assertions.assertEquals(decorated.getDescription(), item.getDescription() + " with basket");
    }

}
