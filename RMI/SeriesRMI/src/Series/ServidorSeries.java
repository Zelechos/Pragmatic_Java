/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Series;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorSeries extends UnicastRemoteObject implements ISeries {

    //Atributos
    private int Sumatoria;

    //Metodos de la Clase
    public ServidorSeries() throws RemoteException {
        super();
    }
    
    //Metodo que Genera el Factorial
    @Override
    public int Factorial(int Number){
        if(Number == 0 || Number == 1){
            return 1;
        }
        return Number * Factorial(Number-1);
    }

    //Metodo para Sumar A[] & B[]
    @Override
    public int Sumatoria(int Number) throws RemoteException {
        Sumatoria = 0;
        for (int Iterador = 0; Iterador < Number; Iterador++) {
            Sumatoria += Number - Iterador;
        }
        return Sumatoria;
    }
    
    //Metodo que Genera la serie Fibonacci
    @Override
    public String Fibonacci(int Number){
        int f = 0 , t1 = 1, t2;
        String Sucesion =" ";
        for (int i = 0; i < Number; i++) {
            t2 = f;
            f = t1 + f;
            t1=t2;
            Sucesion += NumberToText(t1) + " , ";
        }
        return Sucesion;
    }

    public static void main(String[] args) {
        ServidorSeries servidor;
        try {
            LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
            servidor = new ServidorSeries();
            Naming.bind("Operaciones", servidor);
            System.out.println("El servidor esta listo\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    //Metodo que transforma de String a Entero
    public static String NumberToText (int numero){
        String Texto =  String.valueOf(numero);
        return Texto;
    }
}
