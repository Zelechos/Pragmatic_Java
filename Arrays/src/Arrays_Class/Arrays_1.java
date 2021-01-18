package Arrays_Class;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/
public class Arrays_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creamos una Variable para Introducir la cantidad de elementos que tendra nuestro arreglo
        int Cantidad_de_Elementos;
        Cantidad_de_Elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Elementos que Tendra el Arreglo : "));
        
        //Creamos un arreglo de tipo char
        char[] Letras = new char[Cantidad_de_Elementos];
        
        //Como llenar un Arreglo con un Bucle For haciendo uso de ls clase Scanner
        System.out.println("Digite los elementos del arreglo : ");
        for(int Iterador = 0 ; Iterador<Cantidad_de_Elementos; Iterador++){
            System.out.print((Iterador+1)+" . Digite un Caracter : ");
            Letras[Iterador] = input.next().charAt(0);
        }
        
        //Mostrando los caracteres de mi Arreglo
        System.out.println("Los Caracteres son : ");
        for(int Iterador = 0; Iterador<Cantidad_de_Elementos;Iterador++){
        
            if(Iterador == Cantidad_de_Elementos-1){
                System.out.print(Letras[Iterador]+"\n");
            }else{
                System.out.print(Letras[Iterador]+"-");
            }
            
        }
        
        
        
    }
    
}
