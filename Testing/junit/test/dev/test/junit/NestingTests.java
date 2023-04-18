package dev.test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tambien podemos anidar test lo cual no es muy util para anidar test
 * que pueden resultar muy similares
 */
public class NestingTests {

    /**
     * La anotación @Nested en Java se utiliza para anidar clases
     * dentro de otras clases de prueba en el marco de pruebas JUnit 5.
     */
    @Nested
    class ArrayListIsEmpty{
        ArrayList<String> list = new ArrayList<>();

        @Test
        public void isEmpty (){
            assertTrue(list.isEmpty());
        }

        @Test
        public void size(){
            assertEquals(0 , list.size());
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ArrayListNotEmpty{
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "javaee"));

        @Test
        @Order(2)
        public void isEmpty(){
            assertFalse(list.isEmpty());
        }

        @Test
        @Order(1)
        public void size(){
            assertEquals(2 , list.size());
        }


    }
}
