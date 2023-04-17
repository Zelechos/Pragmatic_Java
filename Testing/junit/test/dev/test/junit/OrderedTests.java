package dev.test.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.*;

/**
 * esta anotacion sirve para controlar el orden en el que los test se ejecutaran de menos a mayor
 * con la ayuda de la anotacion @Order(numero_de_orden) esto indica el orden en el que se ejecutaran
 * los test de menos a mayor
  */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {



    @Test
    @Order(1)
    public void testTypeOfInstance() {
        var product = new Product("alex", 3243);
        assertEquals("Product", product.getClass().getSimpleName());
        System.out.println("se ejecuto el test type of instance");
    }

    @Test
    @Order(2)
    public void testCase(){
        System.out.println("se ejecuto el test case");
    }


    @Test
    @Order(3)
    public void testExample(){
        System.out.println("se ejecuto el test example");
    }


    @Test
    @Order(4)
    public void testMethod(){
        System.out.println("se ejecuto el test method");
    }
}
