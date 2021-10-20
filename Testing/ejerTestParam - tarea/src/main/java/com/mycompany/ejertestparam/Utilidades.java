/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

public class Utilidades {

    public String concatenar(String uno, String dos, String tres) {
        if (uno != null && dos != null && tres != null) {
            return uno.concat(" ").concat(dos).concat(" ").concat(tres);
        }
        return null;
    }

    public int sumaNumeros(int a, int b) {
        return a + b;
    }
}
