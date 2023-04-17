package dev.test.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testName(){
        var name = "Alex";
        Product product = new Product("Alex", 900);
        assertEquals(name, product.name());
    }
}
