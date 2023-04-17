/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.com470.lab4.service;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {

    private Palindromo utils;

    public PalindromoTest() {
    }

    @Before
    public void setUp() {
        utils = new Palindromo();
    }

    @Test
    public void testSomeMethod() {
        String cadena = "REconocer";

        boolean esperado = true;
        boolean resultado = utils.buscaPalindromo(cadena);

        assertEquals(esperado, resultado);
        assertThat(utils.buscaPalindromo("reconocer"), Matchers.is(true));
        assertThat(utils.buscaPalindromo("somos"), Matchers.equalTo(true));
        assertThat(utils.buscaPalindromo("pablo"), Matchers.is(false));
    }

}
