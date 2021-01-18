package Exercises;

import java.util.Scanner;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/

/* Exercise 2 : Leer 10 numeros por teclado, guardarlos en un arreglo y a continuacion realizar la media de numeros positivos,
   la media de los negativos y contar el numero de ceros que hay en el arreglo
*/
public class Exercise_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        //Creamos mi arrglos
        int Numeros[] = new int[10] , Contador = 0, Media_P = 0, Cont_P = 0,Cont_N = 0,Media_N = 0 ;
        float Resp_P,Resp_N;
        
        System.out.println("Digite los numeros del arreglo : ");
        for(int iterador=0;iterador<10;iterador++){
            System.out.print((iterador+1)+" . Digite un Numero : ");
            Numeros[iterador] = input.nextInt();
            
            if(Numeros[iterador] == 0 ){
                Contador++;
            }else if(Numeros[iterador] > 0){
                Media_P += Numeros[iterador];
                Cont_P++;
            }else if(Numeros[iterador] < 0){
                Media_N += Numeros[iterador];
                Cont_N++;
            }
        }
        
        Resp_N = Media_N/Cont_N;
        Resp_P = Media_P/Cont_P;
        System.out.println("La Media de Positivos es : "+ Resp_P);
        System.out.println("La Media de Negativos es : "+ Resp_N);
        System.out.println("La Cantida de Ceros es : "+Contador);
    }
    
}
