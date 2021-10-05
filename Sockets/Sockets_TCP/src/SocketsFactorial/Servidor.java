/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsFactorial;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        
        int port = 5001, Number; 
       
        try {
            
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor");
            
            Socket client;
            PrintStream toClient;       
            client = server.accept(); //conexion
            
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            
            System.out.println("Cliente se conecto");
            
            //Transformamos el String a un numero Entero
            Number = TextToNumber(fromClient.readLine());
            
            toClient = new PrintStream(client.getOutputStream()); 
            
            //Instanciamos el Metodo Estatico Factorial y mostramos el resultado de la del Factorial
            toClient.println("El Factorial es : "+Factorial(Number));
            
            System.out.println("Mandando respuesta al Cliente . . .");
            System.out.println("Fin de la Conexion");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
  
    }
    
    //Metodo que transforma de String a Entero
    public static int TextToNumber (String texto){
        int Number =  Integer.parseInt(texto);
        return Number;
    }
    
     //Metodo que Genera el Factorial
    public static int Factorial(int Number){
        if(Number == 0 || Number == 1){
            return 1;
        }
        return Number * Factorial(Number-1);
    }
    
    
}

