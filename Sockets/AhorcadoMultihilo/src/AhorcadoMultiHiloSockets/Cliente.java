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
import java.util.Scanner;

public class Cliente{

    public static void main(String[] args) {
        int port = 5002, intentos = 5;
        Scanner Input = new Scanner(System.in);
        String Mensaje , Letra;
        try {
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            //Creamos una instancia del objeto server para usar sus metodos
            Servidor server = new Servidor();
            
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //recibimos mensaje del servidor
            Mensaje = fromServer.readLine();  
            
            //mostramos la frase encritada
            System.out.println(server.PalabraOculta(Mensaje));
            do{
            //pedimos una letra al cliente
            System.out.println("Digite una letra : ");
            Letra = Input.nextLine();
            //Verificamos que mensaje nos manda el metodo Jugando
            String frase = server.Jugando(Letra,Mensaje);
             
            
            if(frase.equals("Menos 1 Oportunidad")){
                System.out.println(frase);
                System.out.println(server.LLenandoPalabra());
                System.out.println("FALLASTE!!!!");
                intentos--;
            }else{
                System.out.println(frase);
                System.out.println(server.LLenandoPalabra());
                System.out.println("CORRECTO!!!!");

            }
            
            //Compara si llegamos a la solucion
            if(server.Victoria().equals("Felicidades Ganaste")){
                toServer.println(Mensaje);
                System.out.println("GANASTE!!!");
                System.out.println("la palabra era : "+Mensaje);
                System.exit(0);
            }
            
            System.out.println("Numero de Oportunidades : "+intentos);
            
            }while(intentos != 0);
            //si no se llego a la solucion y se agoto el numero de intentos 
            System.out.println("PERDISTE");
            System.out.println("la palabra era : "+Mensaje);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
