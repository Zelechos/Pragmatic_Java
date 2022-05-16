/*
 * @author: Alex Tumiri
 * @repository: https://github.com/Zelechos/Pragmatic_Java
 */
package pkg01_exercise;

import java.util.Scanner;

/**
 * 01.- Pedir los coeficientes de una ecuacion de 2do grado, y muestre sus 
 * soluciones reales. Si no existen, debe indicarlo.
 */
public class Main {

    public static void main(String[] args) {
        
        //  Pedimos los coeficientes
        double a, b, c, positive, negative, discriminating;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite el valor de a : ");
        a = input.nextInt();
        System.out.print("Digite el valor de b : ");
        b = input.nextInt();
        System.out.print("Digite el valor de c : ");
        c = input.nextInt();
        discriminating = Math.pow(b, 2) - 4 * a *c;
        
        if(discriminating <= 0){
            System.err.println("No existe un solucion");
        }else{
            positive = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a *c )))/2 * a;
            negative = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a *c )))/2 * a;
            System.out.println("el resultado positivo es :"+ positive);
            System.out.println("el resultado negativo es :"+ negative);
        }
        
    }
    
}
