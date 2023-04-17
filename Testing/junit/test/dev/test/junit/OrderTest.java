package dev.test.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private final int NUMBER_OF_PRODUCTS = 3;
    private final int TOTAL = 2000;

    private Order order;

    @BeforeEach
    public void setupInstances() {
        Product product1 = new Product("p1", 1000);
        Product product2 = new Product("p2", 500);
        Product product3 = new Product("p3", 500);
        order = new Order();
        order.add(product1);
        order.add(product2);
        order.add(product3);
    }

    @Test
    public void testAmount() {
        assertEquals(NUMBER_OF_PRODUCTS, order.amount(), "the amount of products in the order is correct!!");
    }

    @Test
    public void testTotal() {
        assertEquals(TOTAL, order.total(), "the total cost of products in the order is correct!!");
    }

}
