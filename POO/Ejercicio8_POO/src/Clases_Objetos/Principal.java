package Clases_Objetos;

import java.util.Scanner;

public class Principal {

    public static int BuscadorDeSucursal(Sucursal sucursal[], int Numero_de_Sucursal, int Contador_Sucursales) {
        int Posicion_Sucursal = 0;
        boolean Encontrado = false;

        for (int Sucursal_Actual = 0; Sucursal_Actual < Contador_Sucursales; Sucursal_Actual++) {
            if (sucursal[Sucursal_Actual].getNumero_de_Sucursal() == Numero_de_Sucursal) {
                Encontrado = true;
                Posicion_Sucursal = Sucursal_Actual;
            }
        }
        if (Encontrado == false) {
            Posicion_Sucursal = -1;
        }

        return Posicion_Sucursal;
    }

    public static int BuscadorDePaquete(Paquete paquete[], int Numero_de_Paquete, int Contador_Paquetes) {
        int Posicion_Paquete = 0;
        boolean Encontrado = false;

        for (int Paquete_Actual = 0; Paquete_Actual < Contador_Paquetes; Paquete_Actual++) {
            if (paquete[Paquete_Actual].getNumero_de_Paquete() == Numero_de_Paquete) {
                Encontrado = true;
                Posicion_Paquete = Paquete_Actual;
            }
        }
        if (Encontrado == false) {
            Posicion_Paquete = -1;
        }

        return Posicion_Paquete;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Numero_de_Sucursal, Numero_de_Paquete, Prioridad, Opcion, Contador_Paquetes = 0, Contador_Sucursales = 0, Verificacion_de_Sucursal, Verificador_de_Paquete;
        String Direccion, Ciudad, DNI;
        double Peso, Precio;
        Sucursal sucursales[] = new Sucursal[50];
        Paquete paquetes[] = new Paquete[100];

        do {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println(":::::            1.- Crear una nueva Sucursal.                                                                   :::::");
            System.out.println(":::::            2.- Enviar Paquete .                                                                            :::::");
            System.out.println(":::::            3.- Consultar Sucursal .                                                                        :::::");
            System.out.println(":::::            4.- Consultar Paquete .                                                                         :::::");
            System.out.println(":::::            5.- Mostrar todas las Sucursales .                                                              :::::");
            System.out.println(":::::            6.- Mostrar todos los Paquetes .                                                                :::::");
            System.out.println(":::::            7.- Salir .                                                                                     :::::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Digite una Opcion del Menu : ");
            Opcion = Entrada.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.print("Digite el Numero de la Sucursal :");
                    Numero_de_Sucursal = Entrada.nextInt();
                    System.out.print("Digite la Direccion de la Sucursal : ");
                    Direccion = Entrada.nextLine();
                    Direccion = Entrada.nextLine();
                    System.out.print("Digite la Ciudad de la Sucursal : ");
                    Ciudad = Entrada.nextLine();

                    sucursales[Contador_Sucursales] = new Sucursal(Numero_de_Sucursal, Direccion, Ciudad);
                    Contador_Sucursales++;
                    break;
                case 2:
                    System.out.println("Digite el Numero de la Surcursal desde donde se enviara el Paquete : ");
                    Numero_de_Sucursal = Entrada.nextInt();

                    Verificacion_de_Sucursal = BuscadorDeSucursal(sucursales, Numero_de_Sucursal, Contador_Sucursales);

                    if (Verificacion_de_Sucursal == -1) {
                        System.out.println("La Sucursal no EXISTE!!!!!!!");
                    } else {
                        System.out.print("Digite el Numero de Paquete : ");
                        Numero_de_Paquete = Entrada.nextInt();
                        System.out.print("Digite el Peso del Paquete : ");
                        Peso = Entrada.nextDouble();
                        System.out.print("Digite el DNI del Paquete : ");
                        DNI = Entrada.next();
                        System.out.print("Digite la Prioridad que tiene el Paquete ( 0 = NORMAL  , 1 = ALTA , 2 = EXPRESS ) : ");
                        Prioridad = Entrada.nextInt();

                        paquetes[Contador_Paquetes] = new Paquete(Numero_de_Paquete, DNI, Peso, Prioridad);
                        System.out.println("Alistando el Paquete para el Envio ....... ");

                        Precio = sucursales[Verificacion_de_Sucursal].CalcularPaquete(paquetes[Contador_Paquetes]);

                        System.out.println("El Precio para enviar el Paquete es de : " + Precio);
                        System.out.println("Desea enviarlo ??");

                        int Enviarlo;
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println(":::::            1.- SI.                                                                                         :::::");
                        System.out.println(":::::            2.- NO.                                                                                         :::::");
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.print("Digite una Opcion : ");
                        Enviarlo = Entrada.nextInt();

                        if (Enviarlo == 1) {
                            System.out.println("El Paquete ha sido Enviado Exitosamente..");
                        }
                        if (Enviarlo == 2) {
                            System.out.println("El envio ha sido Cancelado....");
                        }
                        Contador_Paquetes++;
                    }
                    break;
                case 3:
                    System.out.print("Digite el Numero de la Sucursal para saber sus Datos : ");
                    Numero_de_Sucursal = Entrada.nextInt();

                    Verificacion_de_Sucursal = BuscadorDeSucursal(sucursales, Numero_de_Sucursal, Contador_Sucursales);

                    if (Verificacion_de_Sucursal == -1) {
                        System.out.println("La Sucursal no Existe .... ");
                    } else {
                        System.out.println("Los datos de la Sucursal son : " + sucursales[Verificacion_de_Sucursal].MostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.print("Digite el Numero de Paquete para saber sus Datos : ");
                    Numero_de_Paquete = Entrada.nextInt();

                    Verificador_de_Paquete = BuscadorDePaquete(paquetes, Numero_de_Paquete, Contador_Paquetes);

                    if (Verificador_de_Paquete == -1) {
                        System.out.println("El Paquete no Existe .......... ");
                    } else {
                        System.out.println("Los datos de el Paquete son : " + paquetes[Verificador_de_Paquete].MostrarDatosPaquete());
                    }
                    break;
                case 5:
                    if (Contador_Sucursales == 0) {
                        System.out.println("No Existen Sucursales actualmente ... ");
                    } else {
                        System.out.println("Las Sucursales Existentes son : ");
                        for (int Sucursal_Actual = 0; Sucursal_Actual < Contador_Sucursales; Sucursal_Actual++) {
                            System.out.println("Sucursal " + (Sucursal_Actual + 1) + " : " + sucursales[Sucursal_Actual].MostrarDatosSucursal());
                        }
                    }
                    break;
                case 6:
                    if (Contador_Paquetes == 0) {
                        System.out.println("No Existen Paquetes actualemente ....");
                    } else {
                        System.out.println("Los Paquetes Existentes son : ");
                        for (int Paquete_Actual = 0; Paquete_Actual < Contador_Paquetes; Paquete_Actual++) {
                            System.out.println("Paquete " + (Paquete_Actual + 1) + " : " + paquetes[Paquete_Actual].MostrarDatosPaquete());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Hasta luego Usuario ... ");
                    break;
                default:
                    System.out.println("ERRRORR LA OPCIONES QUE INTRODUJO NO EXISTE INTENTE DE NUEVO000000.....");
                    break;
            }

        } while (Opcion != 7);

    }

}
