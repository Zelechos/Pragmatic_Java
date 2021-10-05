/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Operaciones;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorOperaciones extends UnicastRemoteObject implements IOperaciones {

    //Atributos
    private int C[];

    //Metodos de la Clase
    public ServidorOperaciones() throws RemoteException {
        super();
    }

    //Metodo para Sumar A[] & B[]
    @Override
    public int[] Sumar(int[] A, int[] B) throws RemoteException {
        C = new int[A.length];
        for (int Iterador = 0; Iterador < C.length; Iterador++) {
            C[Iterador] = A[Iterador] + B[Iterador];
        }
        return C;
    }

    //Metodo para Restar A[] & B[]
    @Override
    public int[] Restar(int[] A, int[] B) throws RemoteException {
        C = new int[A.length];
        for (int Iterador = 0; Iterador < C.length; Iterador++) {
            C[Iterador] = A[Iterador] - B[Iterador];
        }
        return C;
    }

    //Metodo para Multiplicar A[] & B[]
    @Override
    public int Multiplicar(int[] A, int[] B) throws RemoteException {
        int Respuesta = 0;
        for (int Iterador = 0; Iterador < C.length; Iterador++) {
            Respuesta += A[Iterador] * B[Iterador];
        }
        return Respuesta;
    }

    public static void main(String[] args) {
        ServidorOperaciones servidor;
        try {
            LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
            servidor = new ServidorOperaciones();
            Naming.bind("Operaciones", servidor);
            System.out.println("El servidor esta listo\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
