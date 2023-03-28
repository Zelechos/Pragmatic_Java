package Clases_Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner Entrada = new Scanner(System.in);
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    static Persona Futbolista_1 = new Futbolista("Gonzalo(hijoputa)", "Higuain(Perro de mierda cagaste el mundial)", 29, 9, "Delantero");
    static Persona Futbolista_2 = new Futbolista("Paulo", "Divala", 21, 23, "Delantero");
    static Persona Entrenador = new Entrenador("ganar la chmapions haha ", "Massimiliano", "Allegri", 49);
    static Persona Doctor = new Doctor("Licenciado en Fisioterapia", "Benito", "Castro", 12);

    //Class Main
    public static void main(String[] args) {
        persona.add(Doctor);
        persona.add(Futbolista_1);
        persona.add(Futbolista_2);
        persona.add(Entrenador);
        Menu();
    }

    public static void Menu() {

        int Opcion;

        do {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println(":::::            1.- Viaje de Equipo.                                                                            :::::");
            System.out.println(":::::            2.- Entrenamiento.                                                                              :::::");
            System.out.println(":::::            3.- Partido de Futbol.                                                                          :::::");
            System.out.println(":::::            4.- Planificar Entrenamieto.                                                                    :::::");
            System.out.println(":::::            5.- Entrevista.                                                                                 :::::");
            System.out.println(":::::            6.- Curar Lesion.                                                                               :::::");
            System.out.println(":::::            7.- Salir .                                                                                     :::::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Digite una Opcion del Menu : ");
            Opcion = Entrada.nextInt();

            switch (Opcion) {
                case 1:
                    ViajeEquipo();
                    break;
                case 2:
                    Entrenar();
                    break;
                case 3:
                    Partido();
                    break;
                case 4:
                    Planifcar_Entrenamiento();
                    break;
                case 5:
                    DarEntrevista();
                    break;
                case 6:
                    CurarLesion();
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("La opcion que introdujo no existe introduzca otra opcion ... ");

            }
        } while (Opcion != 7);

    }

    public static void ViajeEquipo() {

        for (Persona Mostrar : persona) {
            System.out.print("\nNombre : " + Mostrar.getNombre() + "\nApellido : " + Mostrar.getApellido());
            Mostrar.Viajar();
        }
    }

    public static void Entrenar() {

        for (Persona Mostrar : persona) {
            System.out.print("\nNombre : " + Mostrar.getNombre() + "\nApellido : " + Mostrar.getApellido());
            Mostrar.Entrenamiento();
        }
    }

    public static void Partido() {

        for (Persona Mostrar : persona) {
            System.out.print("\nNombre : " + Mostrar.getNombre() + "\nApellido : " + Mostrar.getApellido());
            Mostrar.Partido_de_Futbol();
        }
    }

    public static void Planifcar_Entrenamiento() {
        System.out.print(Entrenador.getNombre() + " " + Entrenador.getApellido());
        //(downcasting)Entrenador Entrenador_nuevo = (Entrenador) Entrenador;
        ((Entrenador) Entrenador).Planificando_Entrenamiento();
    }

    public static void DarEntrevista() {
        System.out.print("\nNombre : " + Futbolista_1.getNombre() + "\nApellido : " + Futbolista_1.getApellido() + "\nEdad : " + Futbolista_1.getEdad());
        ((Futbolista) Futbolista_1).Entrevista();
        System.out.print("\nNombre : " + Futbolista_2.getNombre() + "\nApellido : " + Futbolista_2.getApellido() + "\nEdad : " + Futbolista_2.getEdad());
        ((Futbolista) Futbolista_2).Entrevista();
    }

    public static void CurarLesion() {
        System.out.print("\nNombre : " + Doctor.getNombre() + "\nApellido : " + Doctor.getApellido() + "\nAños de Experiencia : " + Doctor.getEdad());
        ((Doctor) Doctor).Curar_Lesion();

    }
}
