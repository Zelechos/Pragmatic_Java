/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Ejercicio2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteAhorcado {

    public static void main(String[] args) {
        IAhorcado juego;
        Scanner Input = new Scanner(System.in);
        int intentos = 5 ;
        String letra;
        //LLenamos los arrays A & B
        
        try {
            //Respuesta del servidor
            juego = (IAhorcado)Naming.lookup("rmi://localhost/Ahorcado");
            
            //Empezamos con el Juego 
            System.out.println("[---Bienvenido al Juego de el Ahorcado---]\n Tienes 5 Intentos para adivinar la palabra: ");
            System.out.println(juego.PalabraOculta());
            do{
                System.out.print("Escriba una Letra : ");
                letra = Input.nextLine();
                
                if(juego.Jugando(letra).equals("Menos 1 Oportunidad")){
                    System.out.println(juego.Jugando(letra));
                    System.out.println("FALLASTE!!!!");
                    intentos--;
                }else{
                    System.out.println("CORRECTO!!!!");
                }
                
                
                System.out.println(juego.LLenandoPalabra());
                System.out.println("Numero de Oportunidades : "+intentos);
                
                if(juego.Victoria().equals("Felicidades Ganaste")){
                    System.out.println(juego.Victoria());
                    System.out.println("Adivinaste la Palabra era == > "+juego.PalabraEscogida());
                    System.exit(0);
                }

            }while(intentos != 0 );
            
            System.out.println("PERDISTE!!!");
            System.out.println("La Palabra era == > "+juego.PalabraEscogida());
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteAhorcado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteAhorcado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteAhorcado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
    
}
