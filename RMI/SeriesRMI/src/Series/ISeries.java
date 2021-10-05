/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Series;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISeries extends Remote {

    // Metodos que tenemos que Instanciar en el Servidor
    int Factorial(int Number) throws RemoteException;

    String Fibonacci(int Number) throws RemoteException;

    int Sumatoria(int Numbers) throws RemoteException;

}
