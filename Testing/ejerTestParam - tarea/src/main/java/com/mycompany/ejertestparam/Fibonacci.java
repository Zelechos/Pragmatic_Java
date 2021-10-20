/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;


public class Fibonacci {
    
    public String fibonacci(int lim) {
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
