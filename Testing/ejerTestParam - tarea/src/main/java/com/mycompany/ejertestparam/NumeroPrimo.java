/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;

public class NumeroPrimo {

    public NumeroPrimo() {
    }

    public Boolean validate(int numeroPrimo) {
        for (int i = 2; i < (numeroPrimo / 2); i++) {
            if (numeroPrimo % i == 0) {
                return false;
            }
        }
        return true;
    }

}
