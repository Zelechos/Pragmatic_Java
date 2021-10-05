/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        int port = 5001;
        Scanner Input = new Scanner(System.in) ;
        String Respuesta, Mensaje , exit="adios";
        try {
            
            //TOMAR EN CUENTA PARA QUE LA CONEXION NO DE TERMINE 
            do{
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            //Aqui pedimos al cliente que nos el mensaje
            System.out.print("Me : ");
            Mensaje = Input.nextLine();//El unico Input tener en cuenta
            
            toServer.println(Mensaje);
            
            //Aqui recibimos la respuesta del Servidor
             Respuesta = fromServer.readLine();  
             
            //Aqui mostramos la respueta del Servidor
            System.out.println("Server : "+Respuesta);
            
            }while(!exit.equals(Respuesta));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
