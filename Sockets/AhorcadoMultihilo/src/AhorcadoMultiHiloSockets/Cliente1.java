/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package AhorcadoMultiHiloSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Cliente1{

    public static void main(String[] args) {
        int port = 5001;
        String Mensaje;
        try {
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            //Aqui pedimos al cliente que nos introduzca palabra para adivinar
            Mensaje = JOptionPane.showInputDialog("Digite una palabra para que el adivinar: ");
            
            //Aqui mandamos la palabra al Servidor
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
