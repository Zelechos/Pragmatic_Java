package dev.test.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifecycleTest {

    @BeforeAll
    public static void startBeforeAll() {
        System.out.println("BeforeAll = se ejecuta antes de todo, y se ejecuta una vez y son estaticos");
    }

    @AfterAll
    public static void startAfterAll() {
        System.out.println("AfterAll = se ejecuta despues de todo, y se ejecuta una vez y son estaticos");
    }

    @BeforeEach
    public void startBeforeTests() {
        System.out.println("BeforeEach = se ejecuta antes de cada test");
    }

    @AfterEach
    public void startAfterTests() {
        System.out.println("AfterEach = se ejecuta despues de cada test");
    }


    @Test
    public void testTypeOfInstance() {
        var product = new Product("alex", 3243);
        assertEquals("Product", product.getClass().getSimpleName());
    }

}
