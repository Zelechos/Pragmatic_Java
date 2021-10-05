/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsUDP_Suma;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class ServerUDP {

  public static void main (String args[]) { 
    int port=6789, suma;  
    String Entrada[];
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
        System.out.println("datos : "+peticion.getData());
          
        //Convertimos de Bytes a String 
        String texto = new String(peticion.getData(), StandardCharsets.UTF_8);
        
        //esto te obliga a mandar en transformar en Bytes toda la 
        Entrada = Tratamiento(texto);
        
        suma = Suma(Entrada);
        
          
        String RespuestaSuma= String.valueOf(suma);
        System.out.println("resp : "+RespuestaSuma);
        byte[] mensaje = RespuestaSuma.getBytes();
        
        
        // Construimos el DatagramPacket para enviar la respuesta
        DatagramPacket respuesta = new DatagramPacket(mensaje, RespuestaSuma.length() ,peticion.getAddress(), peticion.getPort());

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

  
  //Metodo para Tratamiento de String
  public static String[] Tratamiento(String texto){
      String sym = "\\+";
      // 23 + 32 + 23 --> [23,32,23]
      String[] Letras = texto.split(sym);
      
      return Letras;
  }
  
   //Metodo que realiza la suma 
    public static int Suma (String[] Letras){
        int Respuesta = 0;
        int num = Letras.length-1;
        for(int Iterador = 0 ; Iterador < num ; Iterador ++){
            Respuesta += Integer.parseInt(Letras[Iterador]);
        }
        
        return Respuesta;
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

    

