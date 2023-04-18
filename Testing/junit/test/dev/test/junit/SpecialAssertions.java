package dev.test.junit;
/**
 * Ya sabemos que hay diferentes cantidades de Assertions la idea es saber
 * y conocer mas de estos metodos que nos ayuden hacer test mas interesantes
 * en ocasiones mas complejos
 */

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpecialAssertions {

    @Test
    public void testProduct() {
        var product = new Product("Computer", 10000);

        // nos sirve para poder detectar los asserts que fallan y los que no sin detener el flujo de los tests
        assertAll(
                () -> assertEquals(3, 3),
                () -> assertEquals(10000, product.price()),
                () -> assertEquals("Computer", product.name()),
                () -> assertTrue(true)
        );
    }

    @Test
    public void testTimeout() {
        // nos sirve para hacer test del rendimiento de un metodo para saber si cumple con el tiempo establecido
        assertTimeout(
                Duration.ofMillis(200), // tiempo limite que establecemos para termine la ejecucion del metodo
                () -> Thread.sleep(150) // el metodo si tiene tarda mas que el tiempo limite falla el test
        );
    }


    @Test
    public void testArray(){
        var listOne = List.of(2,34,5,67,4);
        var listTwo = List.of(2,34,5,67,4);
        assertArrayEquals(new List[]{listOne}, new List[]{listTwo});
    }
}
