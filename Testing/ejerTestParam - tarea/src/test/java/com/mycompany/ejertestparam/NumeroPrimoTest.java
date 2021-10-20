/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumeroPrimoTest {

    @Parameterized.Parameters

    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {6}, {4}, {3}, {7}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    NumeroPrimo utils = new NumeroPrimo();

    @Test
    public void testSomeMethod() {
        System.out.println("Ejecucion: " + valor1);
        boolean resultado = utils.validate(valor1);

        for (int i = 2; i < (valor1 / 2); i++) {
            if (valor1 % i == 0) {
                assertEquals(false, resultado);
            }
        }
        assertEquals(true, resultado);

    }

}
