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
public class TrianguloTest {

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {5, 5, 5}, {7, 7, 5}, {5, 6, 9}
        });
    }
    //Uso de anotaciones
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public int valor3;
    Triangulo utils = new Triangulo();

    @Test
    public void testTipoTriangulo() {
        System.out.println("Ejecucion: " + valor1 + " " + valor2 + "" + valor3);
        String resultado = utils.tipoTriangulo(valor1, valor2, valor3);

        // Lo esperado
        //Lo que nos devuelve en tiempo de ejecucion
        if (valor1 == valor2 && valor2 == valor3) {
           assertEquals("Equilatero", resultado);
        } else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
           assertEquals("Isoceles", resultado);
        } else if (valor1 != valor2 || valor1 != valor3 || valor3 != valor2) {
           assertEquals("Escaleno", resultado);
        }
    }
}
