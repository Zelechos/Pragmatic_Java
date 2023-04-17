/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

import junitparams.JUnitParamsRunner;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class UtilidadesLibreriaJunitParamsTest {
    Utilidades utils = new Utilidades();
    
    @Test
    @junitparams.Parameters({"1,3,4","5,5,10","6,8,14","98,1,99"})
    public void testSumaNumeros( int x,int y, int z) {
        assertThat(utils.sumaNumeros(x, y),Matchers.is(z));
    }
    
}
