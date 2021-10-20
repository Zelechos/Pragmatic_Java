/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

import com.mycompany.ejertestparam.Utilidades;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UtilidadesParamUnoTest {

    @Parameters
    //devolvera un array de objetos --> coleccion
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 2}, {3, 5}, {0, 4}, {3, 3}
        });
    }
    private final int v1;
    private final int v2;
    private final Utilidades utils = new Utilidades();

    public UtilidadesParamUnoTest(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    
    @Test
    public void testSumaNumeros() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = utils.sumaNumeros(v1, v2);
        
        // Lo esperado
        //Lo que nos devuelve en tiempo de ejecucion
        assertEquals(v1 + v2, resultado);
    }
}