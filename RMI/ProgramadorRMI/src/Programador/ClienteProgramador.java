/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Programador;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteProgramador {

    static Programador programador;

    public static void main(String[] args) {
        ICRUDProgramador CRUD;
        String Nombre, Apellido, Especialidad;
        int Opcion, Edad, Codigo;

        Scanner Input = new Scanner(System.in);

        try {
            //Respuesta del servidor
            //Importamos nuestro RMI para el uso de sus Metodos
            CRUD = (ICRUDProgramador) Naming.lookup("rmi://localhost/CRUD");

            //Menu .. 
            do {
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println(":::::            1.- Crear Programador .                                                                                     :::::");
                System.out.println(":::::            2.- Insertar .                                                                                    :::::");
                System.out.println(":::::            3.- Mostrar.                                                                                :::::");
                System.out.println(":::::            4.- Salir .                                                                                     :::::");
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Digite una Opcion del Menu : ");
                Opcion = Input.nextInt();

                switch (Opcion) {
                    case 1:
                        System.out.println("LLenando sus datos personales ... ");
                        System.out.print("Digite su Stack : ");
                        Especialidad = Input.next();
                        System.out.print("Digite el codigo de su Stack : ");
                        Codigo = Input.nextInt();

                        Stack stack = new Stack(Codigo, Especialidad);

                        System.out.print("Digite su Nombre : ");
                        Nombre = Input.next();
                        System.out.print("Digite su Apellido: ");
                        Apellido = Input.next();
                        System.out.print("Digite su Edad : ");
                        Edad = Input.nextInt();
                        programador = new Programador(Nombre, Apellido, Edad, stack);
                        break;
                    case 2:
                        //Empezamos a llenar la data del programador

                        System.out.println("se Inserto Correctamente : " + CRUD.Insert(programador));
                        break;
                    case 3:
                        System.out.println(CRUD.Show(programador));
                        break;
                    case 4:
                        System.out.println(" Hasta Luego .. ");
                        break;
                    default:
                        System.out.println("ERROR NO EXISTE LA OPCION QUE INTRODUJO:");
                        break;
                }
            } while (Opcion != 4);

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteProgramador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteProgramador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteProgramador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
