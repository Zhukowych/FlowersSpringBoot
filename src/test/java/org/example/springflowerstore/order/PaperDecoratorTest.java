package org.example.springflowerstore.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaperDecoratorTest extends DecoratorTest {

    @Test
    public void testPaperDecoratorPrice() {
        Item decorated = new PaperDecorator(item);
        Assertions.assertEquals(decorated.getPrice(), item.getPrice() + PaperDecorator.PAPER_PRICE);
    }

    @Test
    public void testPaperDecoratorDescription() {
        Item decorated = new PaperDecorator(item);
        Assertions.assertEquals(decorated.getDescription(), item.getDescription() + " with paper");
    }

}
