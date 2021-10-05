/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package AhorcadoMultiHiloSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Servidor {
    
    String Palabra , PalabraHallada[], PalabraEscogida[],PalabraFinal[];
    
    public static void main(String[] args) {
        //Creamos dos diferentes puertos en los cuales trabajaremos varios clientes
        int port1 = 5001 , port2 = 5002; 
        String Texto,Texto1;

        try {
            //Creamos los servidores para ambos clientes
            
            //Servidor 1
            ServerSocket server = new ServerSocket(port1);
            System.out.println("Se inicio el servidor 1");
            
            //Servidor 2
            ServerSocket server1 = new ServerSocket(port2);
            System.out.println("Se inicio el servidor 2");
            
            //Instanciamos un objeto de la clase 
            Servidor servidor = new Servidor();
            
            do{
            //creamos clientes y los mensajes hacie los cliente4s
            Socket client ,client1;
            PrintStream toClient, toClient1;       
            
            client = server.accept(); //conexion port5001
            client1 = server1.accept(); //conexion port5002
            
            //Recibimos la palabra del cliente 1
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            
            //Pasamos el mensaje del Cliente 1 a la Variable Texto
            Texto = fromClient.readLine();
            

            //Instanciamos a ambos clientes
            toClient = new PrintStream(client1.getOutputStream()); 
            toClient1 = new PrintStream(client.getOutputStream()); 


            //Mensaje que enviamos al cliente 0 que es la palabra para trabajar con ella
            toClient.println(Texto);
            
            //Mensaje que enviamos al cliente 1
            toClient1.println("Palabra enviada al cliente 1 ..");
            
            BufferedReader fromClient1 = new BufferedReader(new InputStreamReader(client1.getInputStream())); // el lector
            Texto1 = fromClient1.readLine();
            }while(Texto1.equals("Felicidades Ganaste"));

            System.out.println("Fin de la Conexion");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
  
    }
    
    //Metodo para encriptar la Palabra
    public String PalabraOculta(String texto){
        this.Palabra = texto;
        return MuestraVacios(this.Palabra);   
    }
    
     //Crear las letras de la palabra oculta 
    public String MuestraVacios(String Palabras){
        int longitud = Palabras.length();
        this.PalabraHallada = new String[longitud];

        
        String Texto = "";
            for(int Iterador = 0 ; Iterador < longitud ; Iterador++){
                if(Iterador == longitud-1){
                    this.PalabraHallada[Iterador] = "?";
                    Texto += "[?]";
                }else{
                    this.PalabraHallada[Iterador] = "?";
                    Texto += "[?]-";
                }
            }
        return Texto;
    }
    
    //Para ver si la letra que introdujo es aparte de la palabra o no 
    public String Jugando(String Letra, String palabra){
        this.PalabraEscogida = palabra.split(""); 
        boolean intento = false;
        
        String men1,men2, let=Letra.trim();

        //Bucle for para saber en que posicion esta la letra introducida
        for (int Interador = 0; Interador < this.PalabraEscogida.length; Interador++) {
            
            //if para llenar el array con las letras
            if(let.equals(this.PalabraEscogida[Interador])){
                if(this.PalabraHallada[Interador].equals("?")){
                    this.PalabraHallada[Interador] =  this.PalabraEscogida[Interador];
                    intento = true;
                }
            }
            
        }
        
        //Mensaje a retornar
        if(intento){
            men2 = "Se encontro concidencias";
            return men2;
        }else{
            men1  = "Menos 1 Oportunidad";
            return men1;
        }
        
        
    }

    //Para enviar un mensaje al cliente como se esta llenando la palabra
    public String LLenandoPalabra() {
        //para crear un array con la letras introducida
        String Texto = "";
            for(int Iterador = 0 ; Iterador < this.PalabraHallada.length ; Iterador++){
                if(Iterador == this.PalabraHallada.length-1){
                    Texto += "["+this.PalabraHallada[Iterador]+"]";
                }else{
                    Texto += "["+this.PalabraHallada[Iterador]+"]-";
                }
            }
        return Texto;
    }
    
    //Para verficar si se llego a la palabra que estamos buscando
    public String Victoria(){
        if(Arrays.equals(this.PalabraEscogida, this.PalabraHallada)){
            return "Felicidades Ganaste";
        }else{
            return "Apunto de Morir";
        }
    }
    
}
