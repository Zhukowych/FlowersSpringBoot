package org.example.springflowerstore.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RibbonDecoratorTest extends DecoratorTest {

    @Test
    public void testRibbonDecoratorPrice() {
        Item decorated = new RibbonDecorator(item);
        Assertions.assertEquals(decorated.getPrice(), item.getPrice() + RibbonDecorator.RIBBON_PRICE);
    }

    @Test
    public void testPaperDecoratorDescription() {
        Item decorated = new RibbonDecorator(item);
        Assertions.assertEquals(decorated.getDescription(), item.getDescription() + " with ribbon");
    }

}
