package dev.test.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private final int NUMBER_OF_PRODUCTS = 3;

    @Test
    public void testAmount() {
        var product1 = new Product("p1", 1000);
        var product2 = new Product("p2", 500);
        var product3 = new Product("p3", 500);

        Order order = new Order();
        order.add(product1);
        order.add(product2);
        order.add(product3);

        assertEquals(NUMBER_OF_PRODUCTS, order.amount(), "the amount of products in the order is correct!!");
    }


}
