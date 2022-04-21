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
    
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
        
    
//    Decoradores
    public static final String ANSI_NEGRITA = "\u001b[1m";
    public static final String ANSI_SUBRALLADO = "\u001b[4m";
    public static final String ANSI_REVERSE = "\u001b[7m";

    


    public static void main(String[] args) {
        
        //  Creamos nuestra Array de que contendra nuestros numeros        
        ArrayList<Integer> numbers = new ArrayList(); 
        ethernet();
        numbersMaxMin(numbers, 3);
        
    }
    
    /**
     * Funcion para crear un pausa de 1 segundo para la simulacion de conexion a internet
     * @param time 
     */
    private static void conexion(long time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException error){
            error.printStackTrace();
        }
    }
    
    public static void ethernet(){
        
        int seconds = 5;
        for (int i = 0; i < seconds; i++) {
            conexion(1000);
            System.out.println(ANSI_YELLOW+"Conectando a internet en "+(seconds-i)+" segundos"+ANSI_RESET);
        }            
        System.out.println(ANSI_GREEN+"Conexion successfully"+ANSI_RESET);

    }
    
    public static void numbersMaxMin(ArrayList<Integer> numbers, int amount){
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < amount; i++) {
            System.out.print(ANSI_BLUE+"["+(i+1)+"] => Type a number : "+ANSI_RESET);
            numbers.add(i, input.nextInt());
        }
            
        //  Varibales que usaremos        
        int elder = 0, minor = 0, aux = 0;

        // Mi solucion no solo encuentra el mayor y menor numero de 3 si no de una cantidad X de numeros       
        for (int i = 0; i < amount; i++) {
            aux = numbers.get(i);

            if(i == 0){
                minor = numbers.get(i+1);
            }

            if(aux > elder){
                elder = aux;
            }

            if(aux < minor){
                minor = aux;
            }
        }

        System.out.println("The maximum number is : "+ elder);
        System.out.println("The minimum number is : "+ minor);
    }
    
}
