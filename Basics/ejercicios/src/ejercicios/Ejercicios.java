/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Armar un programa que permita cargar tres numeros y mostrar cual es el mayor y cual es el menor
 */
public class Ejercicios {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        //  Creamos nuestra Array de que contendra nuestros numeros        
        ArrayList<Integer> numbers = new ArrayList(); 
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" Digite un numero : ");
            numbers.add(i, input.nextInt());
        }
        
        //  Varibales que usaremos        
        int elder = 0, minor = 0, aux = 0;
        
        // Mi solucion no solo encuentra el mayor y menor numero de 3 si no de una cantidad X de numeros       
        for (int i = 0; i < 10; i++) {
            aux = numbers.get(i);
            
            if(aux > elder){
                elder = aux;
            }
            
            
            if(i == 0){
                minor = numbers.get(i+1);
            }
            
            
            if(aux < minor){
                minor = aux;
            }
        }
        
        System.out.println("The maximum number is : "+ elder);
        System.out.println("The minimum number is : "+ minor);

        
                
                
    }
    
}
