package vanilla;

public class Vanilla {

    public static void main(String[] args) {
// ------------------- Primer Clase de Introduccion a Java -------------------
        
//  System.out.println("Hello Java");
        
// String , char, int, byte , short, long, float , double
//    short numeroshort = 100;
//    byte numerobyte = 10;
//    String texto = "soy un string";
//    char letra = 's';
//    double numeroDecimal = 3.14;
///   boolean dato = true; || false;
    
//    LenguajeProgramacion objeto = new LenguajeProgramacion();

// Operadores Logicos 
// || , && , >= , <= , > , < , == , !=

// Operadores Matemicos
// +, =, -, /, *, %, ++, -- , 
// *= , +=, -=, /=, %=
   int numero = 900;
   int aux = 10; 
   
//   numero = numero + aux;
   numero += aux;
   System.out.println(numero);
   System.err.println("----------------(Condicionales)-------------------");
        
    // if-else (Condicionales)
//    900 / 2 
        if(numero % 2 == 0){
            System.out.println("es par ");
            if(numero == 10 || numero== 100){
                System.out.println("el numero es "+10+" o es 100");
            }else{
                System.out.println("el numero no es : "+100+"y tampoco es 10");
            }
        }else{
            System.out.println("es impar");
        }
        
    System.err.println("-----------------(Bucles)------------------");

    //(Bucles) for , while , do while
    
    System.err.println("-----------------(For)------------------");
        
        for (int iterador = 0 ; iterador < 10 ; iterador++) {
            System.out.println(iterador);
        }
    
    System.err.println("-----------------(While)------------------");

        int number = 10;
        while(number > 0){
            number--; // 9,8,7....0
            System.out.println(number);
        }
        
    System.err.println("-----------------(Do While)------------------");
        
        int numberDo = 10;
        do{
            numberDo--;
        }while(numberDo > 1);
        
    }
    
}
