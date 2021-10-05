/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsSuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        int port = 5001; 
        String Texto;
       
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor");
            Socket client;
            PrintStream toClient;       
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            
            //Pasamos el mensaje del Cliente a la Variable Texto
            Texto = fromClient.readLine();
            

            //Instanciamos el Metodo Estatico Suma y mostramos el resultado de la suma            
            toClient = new PrintStream(client.getOutputStream()); 
            //Mensaje que enviamos al cliente
            toClient.println("La Suma es : "+Suma(Texto));
            System.out.println("Mandando respuesta al Cliente . . .");
            System.out.println("Fin de la Conexion");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
  
    }
    
    //Metodo que realiza la suma 
    public static int Suma (String texto){
        int Respuesta = 0;
        String sym = "\\+";
        // 23 + 32 + 23 --> [23,32,23]
        String[] Letras = texto.split(sym);
        
        for(int Iterador = 0 ; Iterador < Letras.length ; Iterador ++){
              Respuesta += Integer.parseInt(Letras[Iterador]);
        }
        return Respuesta;
    }

    
}
