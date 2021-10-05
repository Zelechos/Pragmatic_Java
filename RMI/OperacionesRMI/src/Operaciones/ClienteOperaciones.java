/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package Operaciones;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteOperaciones {

    public static void main(String[] args) {
        IOperaciones operacion;
        int A[], B[], C[], Longitud, Opcion;

        Scanner Input = new Scanner(System.in);

        //Le damos la longitud a los arrays dado que se realizaran operacion tiene que se la misma longitud
        System.out.print("Introduzca la cantidad de elementos Vector A y el Vector B : ");
        Longitud = Input.nextInt();
        A = new int[Longitud];
        B = new int[Longitud];
        C = new int[Longitud];

        //LLenamos los arrays A & B
        System.out.println("Introduzca los elementos del Vector A  y del Vector B:");
        for (int Iterador = 0; Iterador < Longitud; Iterador++) {
            System.out.print("Elemento " + (Iterador + 1) + " del Vector A : ");
            A[Iterador] = Input.nextInt();
            System.out.print("Elemento " + (Iterador + 1) + " del Vector B : ");
            B[Iterador] = Input.nextInt();
        }

        try {
            //Respuesta del servidor
            //Importamos nuestro RMI para el uso de sus Metodos
            operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones");

            //Menu .. 
            do {
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println(":::::            1.- Sumar .                                                                                     :::::");
                System.out.println(":::::            2.- Restar .                                                                                    :::::");
                System.out.println(":::::            3.- Multiplicar.                                                                                :::::");
                System.out.println(":::::            4.- Salir .                                                                                     :::::");
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Digite una Opcion del Menu : ");
                Opcion = Input.nextInt();

                switch (Opcion) {
                    case 1:

                        C = operacion.Sumar(A, B);

                        Show(A, B);
                        System.out.print("La suma de los Array A + B es : ");
                        for (int Iterador = 0; Iterador < A.length; Iterador++) {
                            System.out.print("[" + C[Iterador] + "] , ");
                        }
                        System.out.println("");

                        break;
                    case 2:

                        C = operacion.Restar(A, B);
                        Show(A, B);

                        System.out.print("La resta de los Array A - B es : ");
                        for (int Iterador = 0; Iterador < A.length; Iterador++) {
                            System.out.print("[" + C[Iterador] + "] , ");
                        }
                        System.out.println("");

                        break;
                    case 3:

                        int resp = operacion.Multiplicar(A, B);
                        Show(A, B);
                        System.out.println("La Multiplicacion de los Array A * B es : " + resp);
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
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Metodo para mostrar los arrays
    public static void Show(int A[], int B[]) {
        System.out.print("El array A[] es : ");
        for (int Iterador = 0; Iterador < A.length; Iterador++) {
            System.out.print("[" + A[Iterador] + "] , ");
        }

        System.out.println("");
        System.out.print("El array B[] es : ");
        for (int Iterador = 0; Iterador < A.length; Iterador++) {
            System.out.print("[" + B[Iterador] + "] , ");
        }
        System.out.println("");

    }
}

