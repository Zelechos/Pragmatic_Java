/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NumeroComplejoTest {

    NumeroComplejo Complejo;

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {5, 5}, {7, 5}, {6, 9}, {21, 34}, {9, 2}, {5, 6}, {7, 8}, {11, 3}, {15, 6}, {8, 10}
        });
    }

    //Uso de anotaciones
    @Parameterized.Parameter(0)
    public int parteReal;
    @Parameterized.Parameter(1)
    public int parteImaginaria;

    NumeroComplejo utils;

    @Test
    public void testSomeMethod() {
        utils = new NumeroComplejo(parteReal, parteImaginaria);
        
        System.out.println("Ejecucion Valor1 :" + utils.getParteReal() + " Valor2:" + utils.getParteImaginaria());

//        Suma
        NumeroComplejo response = utils.sumar(utils);
        NumeroComplejo response1 = new NumeroComplejo(parteReal, parteImaginaria);
        NumeroComplejo response2 = response1.sumar(response1);
        
        assertEquals(response2.getParteReal(), response.getParteReal());
        assertEquals(response2.getParteImaginaria(), response.getParteImaginaria());

//        Resta

        NumeroComplejo responseResta = utils.restar(utils);
        NumeroComplejo responseResta1 = new NumeroComplejo(parteReal, parteImaginaria);
        NumeroComplejo responseResta2 = responseResta1.restar(responseResta1);

        
//        Asserts
        assertEquals(responseResta2.getParteReal(), responseResta.getParteReal());
        assertEquals(responseResta2.getParteImaginaria(), responseResta.getParteImaginaria());
        

    }

}
