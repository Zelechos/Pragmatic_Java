package com.mycompany.ejertestparam;

/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculadoraTest {

@Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {8, 5}, {10, 7}, {8, 2}, {1, -11}
        });
    }

    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    Calculadora utils = new Calculadora();

    @Test
    public void testCalculadora() {
        System.out.println("los parametros son v1=" + valor1 + " v2=" + valor2);
        int resultado1 = utils.suma(valor1, valor2);
        int resultado2 = utils.resta(valor1, valor2);
        int resultado3 = utils.multimplicacion(valor1, valor2);
        int resultado4 = utils.division(valor1, valor2);

        assertEquals(valor1 + valor2, resultado1);
        assertEquals((valor1) - (valor2), resultado2);
        assertEquals(valor1 * valor2, resultado3);
        assertEquals(valor1 / valor2, resultado4);

    }

}
