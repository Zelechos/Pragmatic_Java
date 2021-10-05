/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package SocketsUDP_Suma;


import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientUDP {

  // Los argumentos proporcionan el mensaje y el nombre del servidor
  public static void main(String args[]) {
    int puerto = 6789;
    String dato;
    Scanner input = new Scanner(System.in);
    try {
        
        System.out.print("Digite una Suma : ");
        dato = input.nextLine();
        dato += "+0";
        
        String ip="localhost";
        
      DatagramSocket socketUDP = new DatagramSocket();
      
      //esto te obliga a mandar en transformar en Bytes toda la 
      byte[] mensaje = dato.getBytes();
      
      InetAddress hostServidor = InetAddress.getByName(ip);
      
      // Construimos un datagrama para enviar el mensaje al servidor
      DatagramPacket peticion = new DatagramPacket(mensaje, dato.length(), hostServidor, puerto);

      // Enviamos el datagrama
      socketUDP.send(peticion);

      // Construimos el DatagramPacket que contendrá la respuesta
      byte[] bufer = new byte[1000];
      DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
      
      socketUDP.receive(respuesta);

      // Enviamos la respuesta del servidor a la salida estandar
      System.out.println("Respuesta: " + new String(respuesta.getData()));

      // Cerramos el socket
      socketUDP.close();

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }
}

