package AhorcadoMultiHiloRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAhorcado extends Remote{
    
    //Metodos Abstractos
    String Palabra() throws RemoteException;
    String PalabraOculta(String Palabra) throws RemoteException;
    String LLenandoPalabra() throws RemoteException;    
    String Jugando(String Letra) throws RemoteException;
    String MuestraVacios(String Palabras) throws RemoteException;
    String Victoria() throws RemoteException;

    
}
