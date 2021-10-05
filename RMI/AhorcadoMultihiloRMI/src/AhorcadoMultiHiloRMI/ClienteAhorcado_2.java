/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package AhorcadoMultiHiloRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteAhorcado_2 {

    public static void main(String[] args) {
        IAhorcado juego;
        Scanner Input = new Scanner(System.in);
        String Palabra;
        
        try {
            //Respuesta del servidor
            juego = (IAhorcado)Naming.lookup("rmi://localhost/Ahorcado");
            
            //Empezamos con el Juego 
            System.out.println("[---Bienvenido al Juego de el Ahorcado---]\n Introduzca una palabra para adivinar: ");
            Palabra = Input.nextLine();
            juego.PalabraOculta(Palabra);

            
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteAhorcado_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteAhorcado_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteAhorcado_2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
    
}
