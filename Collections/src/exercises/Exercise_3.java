package exercises;

import java.util.Scanner;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/

/* Exercise 3 : Leer 10 numeros enteros por teclado, guardarlos en un arreglo debemos mostrarlos en el siguiente orden:
   El Primero, El Ultimo, El Segundo, El Penultimo, El Tercero , etc.
*/

public class Exercise_3 {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        int Numeros [] =  new int[10];
        
        //LLenamos nuestro array de numeros
        System.out.println("LLenamos los Numeros.");
        for(int Iterador = 0 ; Iterador < Numeros.length ; Iterador++){
            System.out.print((Iterador+1) + ".- Digite un Numero : ");
            Numeros[Iterador] = Input.nextInt();
        }
        
        //Mostramos nuestro Array
        for(int Iterador = 0 ; Iterador < 5 ; Iterador++){
            
                System.out.print("["+Numeros[Iterador]+"]-");
                System.out.print("["+Numeros[9-Iterador]+"]-");
                
        }
        
        
        
        
        
        
        
    }
    
}
