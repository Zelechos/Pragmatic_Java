/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.mycompany.ejertestparam;


public class Palindromo {
    
    public boolean buscaPalindromo(String cadena) {
        cadena = cadena.toLowerCase();
        int largoCadena = cadena.length();
        System.out.println("el largo de la cadena es::" + cadena.length());
        boolean esPalindromo = true;
        int rango = largoCadena / 2;
        System.out.println("el rango es::" + largoCadena / 2);
        System.out.println("el modulo es::" + largoCadena % 2);
        if (largoCadena % 2 == 0) {
            rango--;
        }
        for (int i = 0; i < rango; i++) {
            if (cadena.charAt(i) != cadena.charAt(largoCadena - i - 1)) {
                esPalindromo = false;
            }
        }
        return esPalindromo;
    }
    
}
