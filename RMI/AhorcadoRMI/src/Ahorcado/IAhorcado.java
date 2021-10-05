package Ejercicio2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAhorcado extends Remote{
    
    //Metodos Abstractos
    String PalabraEscogida() throws RemoteException;
    String PalabraOculta() throws RemoteException;
    String LLenandoPalabra() throws RemoteException;    
    String Sorteo(String Palabras[]) throws RemoteException;
    String Jugando(String Letra) throws RemoteException;
    String MuestraVacios(String Palabras) throws RemoteException;
    String Victoria() throws RemoteException;

    
}
