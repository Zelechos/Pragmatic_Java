package Arrays_Class;

/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
 */
public class Arrays_0 {

    public static void main(String[] args) {
        
        /* Manera de Declarar un Array en Java
            
        Tipo_de_variable[] Nombre_de_Arreglo = new  Tipo_de_variable[Dimension];
        
       */
        
        //Definimos un Arreglo Manera 1
        
        int [] Numero = new int[3];
        
        Numero[0] = 4;
        Numero[1] = 0;
        Numero[2] = 4;
        
        //Mostrando los valores del Arreglo
        System.out.println("El error mas popular de la Web es el :  ");
        
        //Imprimiendo las posiciones del Arreglo directamente
        System.out.print(Numero[0]);
        System.out.print(Numero[1]);
        System.out.print(Numero[2]+"\n");

        
        //Imprimiendo las posiciones del Arreglo con un Bucle
        System.out.println("Mostrando El error mas Famoso con Bucle For : ");
        for(int Iterador = 0 ; Iterador < Numero.length ; Iterador++){// Numero.lenght = 3
            if(Iterador == (Numero.length - 1)){
                System.out.println(Numero[Iterador]);
            }else{
                System.out.print(Numero[Iterador]);
            }
        }
        
        
        //Definimos un Arreglo Manera 2
        
        int [] Dia = {1,2,3};
        
        System.out.print(Dia[0]);
        System.out.print(Dia[1]);
        System.out.print(Dia[2]+"\n");
        
        
    }
    
}
