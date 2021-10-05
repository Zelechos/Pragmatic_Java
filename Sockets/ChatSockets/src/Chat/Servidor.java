/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        int port = 5001; 
        Scanner Input = new Scanner(System.in) ;

        String Respuesta="" , Mensaje, exit="adios";
       
        try {
            ServerSocket server = new ServerSocket(port);
            Socket client;
            PrintStream toClient;       
            
            //TOMAR EN CUENTA PARA QUE LA CONEXION NO DE TERMINE 
            do{
                
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            
            //Pasamos el mensaje del Cliente a la Variable Texto
            Mensaje = fromClient.readLine();
            System.out.println("Client : "+ Mensaje);

            System.out.print("Server : ");
            Respuesta = Input.nextLine();//Unico Input del codigo

            //Instanciamos el Metodo Estatico Suma y mostramos el resultado de la suma            
            toClient = new PrintStream(client.getOutputStream()); 
            toClient.println(Respuesta);
            
            
            }while(!exit.equals(Mensaje));
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
  
    }
    

    
}
