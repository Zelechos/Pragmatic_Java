package Exercises;

import java.util.Scanner;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/

// Exercise 0 : Leer 10 numeros , guardarlos en un arreglos y mostrarlos en el mismo orden introducido
public class Exercise_0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creamos el Arreglo
        // tambien puedes crear el arreglo asi  ----> float Numeros[] = new float[10];
        float [] Numeros  = new float[10];
        
        System.out.println("Guardando los datos en un arreglo : ");
        for (int iterador = 0;iterador<10;iterador++){
            System.out.print((iterador+1)+" . Digite un Numero : ");
            Numeros[iterador] = input.nextFloat();
        }
        
        //Mostramos con un Bucle For Each
        for(float mostrador : Numeros){
            System.out.print(mostrador+" - ");
        }
        System.out.println("");

    
        
    }
    
}
