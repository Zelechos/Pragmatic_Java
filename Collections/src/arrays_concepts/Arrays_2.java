package arrays_concepts;
/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/
public class Arrays_2 {

    public static void main(String[] args) {
        
        // A continuacion Aprenderemos el Bucle For Each
        
        //Creamos un arreglo de tipo de String
        String[] Tecnologias = {"Java","JavaScript","C++","C","C#","Python"};
        
        //Bucle For Normal
        System.out.println("Bucle For Normal : ");
        for (int Iterador = 0 ; Iterador < Tecnologias.length; Iterador++ ){
            System.out.print(Tecnologias[Iterador]+"-");
        }
        System.out.println("");

        //Bucle For Each
        System.out.println("Bucle For Each : ");
        for(String Iterador:Tecnologias){
            System.out.print(Iterador+"-");
        }
        System.out.println("");
    
        
    }
    
}
