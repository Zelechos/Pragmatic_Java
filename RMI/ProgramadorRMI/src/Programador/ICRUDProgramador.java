/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Programador;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICRUDProgramador extends Remote {

    // Metodos que tenemos que Instanciar en el Servidor
    boolean Insert(Programador programador) throws RemoteException;
    String Show(Programador programador)throws RemoteException;
    
}
