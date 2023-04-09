package arrays_concepts;
/*
  @author Pragmatic Coder
  Github: https://github.com/Zelechos
*/
import java.util.Scanner;

public class Arrays_3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Como Crear varios arreglos de un mismo valor
        
        //Tambien podemos crear muschos Arreglos para introducir diferentes Tipos de Datos
        
        //Creamos arreglos y variables requeridas
        int Edades[] , Meses_Experiencia[],Cantidad_de_Usuarios;
        String Nombres[] , Apellidos[], Profesion[], Ingreso , Cuenta = "ether";
       
        //Bucle Do while
        do{
            System.err.print("Bienvenido Introduzca su NickName para Ingresar : ");
            Ingreso = input.next();
        }while(!Ingreso.equals(Cuenta));//Si es igual Ingreso a la Cuenta entonces Ingresara 
        
        //Introducimos la cantidad de datos de los Arreglos
            System.err.println("Bienvenido ether!!");
            System.err.print("Digite la cantidad de usuarios : ");
            Cantidad_de_Usuarios = input.nextInt();
           
            //Creamos los arreglos con la cantidad de datos que tendran
            Edades = new int[Cantidad_de_Usuarios];
            Meses_Experiencia = new int[Cantidad_de_Usuarios];
            Apellidos = new String[Cantidad_de_Usuarios];
            Nombres = new String[Cantidad_de_Usuarios];
            Profesion = new String[Cantidad_de_Usuarios];
        
            //Insertamos los datos de los usuarios
            System.out.println("Digite los datos personales del usuario :");
            for(int Iterador = 0; Iterador<Cantidad_de_Usuarios; Iterador++){
                System.out.println("Inserte datos del Usuario "+(Iterador+1)+" : ");
                System.out.print("Digite su nombre : ");
                Nombres[Iterador]= input.next();
                System.out.print("Digite su apellido : ");
                Apellidos[Iterador]= input.next();
                System.out.print("Digite su profesion : ");
                Profesion[Iterador]= input.next();
                System.out.print("Digite su edad : ");
                Edades[Iterador]= input.nextInt();
                System.out.print("Digite los meses de experiencia : ");
                Meses_Experiencia[Iterador]= input.nextInt();
            }
            System.out.println("Datos Guardados . . . ");
            
            //Mostramos en pantalla los datos del usuario 
            for(int Iterador = 0; Iterador<Cantidad_de_Usuarios;Iterador++){
                System.out.println("Los Datos del Usuario "+(Iterador+1)+" son:");
                System.out.println("---------------------------------------------------------");
                System.out.println("Nombre : "+Nombres[Iterador]);
                System.out.println("Apellidos : "+Apellidos[Iterador]);
                System.out.println("Profesion : "+Profesion[Iterador]);
                System.out.println("Edad : "+Edades[Iterador]);
                System.out.println("Experiencia en Meses : "+Meses_Experiencia[Iterador]);
                System.out.println("---------------------------------------------------------");
            }
        
    }
    
}
