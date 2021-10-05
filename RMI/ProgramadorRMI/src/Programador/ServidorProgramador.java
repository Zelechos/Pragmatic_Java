/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Programador;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorProgramador extends UnicastRemoteObject implements ICRUDProgramador {

    //Atributos
    //Metodos de la Clase
    public ServidorProgramador() throws RemoteException {
        super();
    }

    @Override
    public boolean Insert(Programador programador) throws RemoteException {
        return true;
    }

    @Override
    public String Show(Programador programador) throws RemoteException {
        String response = "-----------Datos del Programador---------\n"+
        "Nombre : " + programador.getNombre()+"\n"+
        "Apellido : " + programador.getApellidos()+"\n"+
        "Edad : " + programador.getEdad()+"\n"+
        "Codigo de especialidad : " + programador.getEspecialidad().getCodigo()+"\n"+
        "Nombre de especialidad : " + programador.getEspecialidad().getStack()+"\n";
        return response;
    }

    public static void main(String[] args) {
        ServidorProgramador servidor;
        try {
            LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
            servidor = new ServidorProgramador();
            Naming.bind("CRUD", servidor);
            System.out.println("El servidor esta listo\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
