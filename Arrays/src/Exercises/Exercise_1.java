package Exercises;

import java.util.Scanner;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/

// Exercise 1 : Leer 10 numeros , guardarlos en un arreglos y mostrarlos en el orden inverso introducido
public class Exercise_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Cramos Nuestros Arreglo
        float Numeros[] = new float[10];
        
        System.out.println("Introducimos los Numeros : ");
        for (int iterador = 0; iterador<10;iterador++){
            System.out.print((iterador+1)+" . Digite un Numero : ");
            Numeros[iterador] = input.nextFloat();
        }
        
        System.out.println("Los numeros introducidos son : ");
        for(int iterador = 9; iterador>=0;iterador--){
            System.out.println("["+Numeros[iterador]+"]");
        }
        
        
    }
    
}
