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

public class PalindromoTest {
    
   @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"ana"}, {"reconocer"}, {"alla"}, {"maria"}
        });
    }
    
    @Parameterized.Parameter(0)
    public String valor1;
    Palindromo utils = new Palindromo();
    
    @Test
    public void testBuscaPalindromo1() {
        int largoCadena = valor1.length();
        int rango = largoCadena / 2;
        System.out.println("Ejecucion: " + valor1);
        boolean resultado = utils.buscaPalindromo(valor1);
        if(resultado)
            assertEquals(true, resultado);
        else
        for (int i = 0; i < rango; i++) {
            if (valor1.charAt(i) != valor1.charAt(largoCadena - i - 1)) {
                assertEquals(false, resultado);
            }
        }
        
    }
    
}
