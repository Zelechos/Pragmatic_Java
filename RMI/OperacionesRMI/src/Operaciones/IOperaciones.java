/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Operaciones;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOperaciones extends Remote {

    // Metodos que tenemos que Instanciar en el Servidor
    int[] Sumar(int A[], int B[]) throws RemoteException;

    int[] Restar(int A[], int B[]) throws RemoteException;

    int Multiplicar(int A[], int B[]) throws RemoteException;

}
