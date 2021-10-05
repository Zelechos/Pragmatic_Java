/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsUDP_Factorial;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class ServerUDP {

  public static void main (String args[]) { 
    int port=6789, Numero, Respuesta;  
    
    try {
      
      DatagramSocket socketUDP = new DatagramSocket(port);
      byte[] bufer = new byte[1000];

      while (true) {
        // Construimos el DatagramPacket para recibir peticiones
        DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);

        // Leemos una petición del DatagramSocket
        socketUDP.receive(peticion);

        System.out.print("Datagrama recibido del host: " + peticion.getAddress());
        System.out.println(" desde el puerto remoto: " + peticion.getPort());
          
        //Convertimos de Bytes a String 
        String texto = new String(peticion.getData(), StandardCharsets.UTF_8);
        
        //Convertimos de String a entero limpiando los espacios que pueda tener 
        Numero = Integer.parseInt(texto.trim());
        
        //Realizamos el Factorial con el metodo recursivo
        Respuesta = Factorial(Numero);
          
        //Convertimos de Entero A String
        String RespuestaFactorial= String.valueOf(Respuesta);
        System.out.println("resp : "+RespuestaFactorial);
        
        //Convertimos de String a Bytes 
        byte[] mensaje = RespuestaFactorial.getBytes();
        
        
        // Construimos el DatagramPacket para enviar la respuesta
        DatagramPacket respuesta = new DatagramPacket(mensaje, RespuestaFactorial.length() ,peticion.getAddress(), peticion.getPort());

        // Enviamos la respuesta, que es un eco
        socketUDP.send(respuesta);
        socketUDP.close();
      }

    } catch (SocketException e) {
        System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("IO: " + e.getMessage());
    }
  }

  
     //Metodo que Genera el Factorial
    public static int Factorial(int Number){
        if(Number == 0 || Number == 1){
            return 1;
        }
        return Number * Factorial(Number-1);
    }
}

    

