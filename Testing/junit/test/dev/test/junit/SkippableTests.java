package dev.test.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

/**
 * tambien podemos deshabilitar tests o esquivar algunos test
 * con la anotacion @Disabled
 */
public class SkippableTests {

    @Test
    @Disabled("this test is very basic")
    public void helloWorld() {
        var greeting = "Hello World";
        assertEquals("Hello World", greeting);
    }

    /**
     * tambien podemos usar la etiqueta @Enabled para habilitar los test
     * de manera condicional en base el sistema operativo por ejemplo y tambien
     * otros tipos de condiciones
     */
    @Test
    @EnabledOnOs(OS.LINUX) // si el SO no es linux no se ejecuta el test
    public void sum() {
        assertEquals(4, 2 + 2);
    }

    @Test
    // si JRE es mayor o igual que 16 y menor o igual  20 se ejecuta el test
    @EnabledForJreRange(min = JRE.JAVA_16, max = JRE.JAVA_20)
    public void substraction() {
        assertEquals(0, 0);
    }


    /**
     * Tambien podemos usar los metodos de Assumptions
     */
    @Test
    public void multiple() {
        // si la condicion es true la lambda se ejecuta
        assumingThat(2 == 2, ()->{
            assertEquals(2, 2);
            System.out.println("hola soy el assumingThat");
        });
    }


    @Test
    public void message() {
        var message = "hacker";
        assumeTrue( message == "hacker"); // si es true el test se ejecuta
        assertEquals(2, 2);
    }



    @Test
    public void greeting() {
        var greting = "hello hacker";
        assumeFalse("Hello" == greting); // si es false el test se ejecuta
        assertEquals(2, 2);
    }





}
