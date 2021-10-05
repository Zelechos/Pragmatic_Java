/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsSuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {
        int port = 5001;
        Scanner Input ;
        String Mensaje;
        try {
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //Aqui pedimos al cliente que nos introduzca una Suma
            Mensaje = JOptionPane.showInputDialog("Digite una Suma : ");
            //Aqui mandamos la Suma al Servidor
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
