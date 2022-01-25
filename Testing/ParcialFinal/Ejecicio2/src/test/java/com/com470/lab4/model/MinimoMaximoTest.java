/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.com470.lab4.model;

import com.com470.lab4.service.BuscarMinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class MinimoMaximoTest {

    private BuscarMinimoMaximo utils = new BuscarMinimoMaximo();

    @Test
    public void testBuscarMinimoMaximoUno() {
        
        List<Integer> lista = Arrays.asList(3, 2, 7, -100, 2, 9, -8, 200);

        MinimoMaximo esperado = new MinimoMaximo(-100, 200);

//        Primero se pone lo que se espera y luego lo que tenemos
            test(esperado, lista);

//        Primero se pone en tiempo de ejecucion y luego el matcher
//            assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(esperado));

    }

    @Test
    public void testBuscarMinimoMaximoDos() {

        List<Integer> lista = Arrays.asList(45, 8, 6, 55, 9, -4, -8, 200);
        MinimoMaximo esperado = new MinimoMaximo(-8, 200);

        test(esperado, lista);
    }

    @Test
    public void testBuscarMinimoMaximoTres() {

        List<Integer> lista = Arrays.asList(3, 2, 1, -55, 2, 4, -8, 200);
        MinimoMaximo esperado = new MinimoMaximo(-55, 200);

        test(esperado, lista);
    }
    

//    Rutina de Testing
    private void test(MinimoMaximo esperado, List<Integer> lista) {
        assertThat(utils.buscaMinimoMaximo(lista), Matchers.is(esperado));
    }

}
