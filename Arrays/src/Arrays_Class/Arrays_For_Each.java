package Arrays_Class;

import java.util.Scanner;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/
public class Arrays_For_Each {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        int Cantidad_Elementos;
        
        System.out.print("Digite la Cantidad de Redes Sociales que Tiene : ");
        Cantidad_Elementos = Input.nextInt();
        
        String[] Redes_Sociales = new String[Cantidad_Elementos];
        
        //LLenamos Los nombres de nuestras redes sociales
        System.out.println("Digite sus Redes Sociales Actuales : ");
        for(int Iterador = 0 ; Iterador < Cantidad_Elementos; Iterador++ ){
            System.out.print((Iterador+1)+".- Digite una Red Social que tenga : ");
            Redes_Sociales[Iterador] = Input.next();
        }
        System.out.println("");
        
        
        //Aqui mostramos Nuestras Redes Sociales (APlicando el Bucle For Each como practica)
        System.out.println("Las Redes Sociales que ustede tiene son : ");
        for (String Red:Redes_Sociales){
            System.out.println(Red);
        }
        System.out.println("Fin de Programa");
        
    }
    
}
