/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsFactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        
        int port = 5001;
        String Mensaje;
        
        try {
        
            //Creamos un Objeto de la clase Socket
            Socket client = new Socket("localhost", port); 
            
            
            //Creamos un Objet de la clase PrintStream
            PrintStream toServer = new PrintStream(client.getOutputStream());
            
            //Creamos un Objeto de la clase BufferedReader
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            //Aqui pedimos al cliente que nos introduzca un Numero para Realizar el Factorial
            Mensaje = JOptionPane.showInputDialog("Digite un Numero para Hallar el Factorial : ");
            
            //Aqui mandamos el Numero al Servidor
            toServer.println(Mensaje);
            
            
            //Aqui recibimos la respuesta del Servidor
            String result = fromServer.readLine();  
            
            //Aqui mostramos la respueta del Servidor
            System.out.println("Mensaje del Servidor --> " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
