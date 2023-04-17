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

public class FibonacciTest {

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {5}, {4}, {3}, {7}
        });
    }

    @Parameterized.Parameter(0)
    public int valor1;
    Fibonacci utils = new Fibonacci();

    @Test
    public void testSomeMethod() {
        System.out.println("Ejecucion: " + valor1);
        String resultado = utils.fibonacci(valor1);
        
        
        assertEquals(fibonacciTest(valor1), resultado);
    }
    
    public static String fibonacciTest(int lim) {
        int n1 = 0;
        int n2 = 1;
        int aux;
        String x = n1 + "," + n2;
        
        while (n2 + n1 <= lim) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            x = x + "," + n2;
        }
        System.out.println("x");
        return x;
    }
}
