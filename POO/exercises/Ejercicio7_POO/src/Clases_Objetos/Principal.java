package Clases_Objetos;

import java.util.Scanner;

public class Principal {

    public static int BuscadorDeCuentas(Cuenta Cuentas[], int Numero_de_Cuenta) {
        int Buscador = 0, Indice = 0;
        boolean Encontrando = false;

        //Busqueda Secuencial
        while ((Buscador < Cuentas.length) && (Encontrando == false)) {
            if (Cuentas[Buscador].getNumero_de_Cuenta() == Numero_de_Cuenta) {
                Encontrando = true;
                Indice = Buscador;
            }
            Buscador++;
        }

        if (Encontrando == false) {
            Indice = -1;
        }
        return Indice;
    }

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String Nombre, Apellido, DNI;
        int Numero_de_Cuenta, Cantidad_de_Cuentas, Opcion, Indice_Cuenta;
        double Saldo, Cantidad;
        Cuenta Cuentas[];
        Cliente Cliente_Actual;

        System.out.print("Digite el Nombre del Cliente : ");
        Nombre = Entrada.nextLine();
        System.out.print("Digite el Apellido del Cliente : ");
        Apellido = Entrada.nextLine();
        System.out.print("Digite el DNI del Cliente : ");
        DNI = Entrada.nextLine();
        System.out.print("Ahora digite la cantidad de Cuentas que posee : ");
        Cantidad_de_Cuentas = Entrada.nextInt();

        Cuentas = new Cuenta[Cantidad_de_Cuentas];

        for (int Cuenta_Actual = 0; Cuenta_Actual < Cuentas.length; Cuenta_Actual++) {
            System.out.println("Digite los Datos para la cuenta " + (Cuenta_Actual + 1) + " : ");
            System.out.print("Digite el Numero de Cuenta : ");
            Numero_de_Cuenta = Entrada.nextInt();
            System.out.print("Digite el Saldo de la Cuenta : ");
            Saldo = Entrada.nextDouble();

            Cuentas[Cuenta_Actual] = new Cuenta(Numero_de_Cuenta, Saldo);
        }

        Cliente_Actual = new Cliente(Nombre, Apellido, DNI, Cuentas);

        do {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println(":::::            1.- Ingresar Dinero a la Cuenta .                                                               :::::");
            System.out.println(":::::            2.- Retirar Dinero de la Cuenta .                                                               :::::");
            System.out.println(":::::            3.- Verificar Saldo de una Cuenta .                                                             :::::");
            System.out.println(":::::            4.- Salir .                                                                                     :::::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Digite una Opcion del Menu : ");
            Opcion = Entrada.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.print("Digite el Numero de Cuenta al que Quieres Ingresar Dinero : ");
                    Numero_de_Cuenta = Entrada.nextInt();
                    Indice_Cuenta = BuscadorDeCuentas(Cuentas, Numero_de_Cuenta);
                    if (Indice_Cuenta == -1) {
                        System.out.println(" El numero de Cuenta no Existe.. ");
                    } else {
                        System.out.print("Digite la cantidad de Dinero que desea Ingresa en a Cuenta :  ");
                        Cantidad = Entrada.nextDouble();
                        Cliente_Actual.IngresandoSaldo(Indice_Cuenta, Cantidad);
                        System.out.println("Ingreso Realizado Exitosamente.");
                        System.out.println("La cantidad de Dinero disponible que tiene en su Cuenta es : " + Cliente_Actual.ConsultarSaldo(Indice_Cuenta));
                    }
                    break;
                case 2:
                    System.out.print("Digite el Numero de Cuenta al que Quieres Retirar Dinero : ");
                    Numero_de_Cuenta = Entrada.nextInt();
                    Indice_Cuenta = BuscadorDeCuentas(Cuentas, Numero_de_Cuenta);
                    if (Indice_Cuenta == -1) {
                        System.out.println(" El numero de Cuenta no Existe.. ");
                    } else {
                        System.out.print("Digite la cantida de dinero que desea Retirar : ");
                        Cantidad = Entrada.nextDouble();

                        if (Cantidad > Cliente_Actual.ConsultarSaldo(Indice_Cuenta)) {
                            System.out.println("Saldo insuficiente..");
                        } else {
                            Cliente_Actual.RetirandoSaldo(Indice_Cuenta, Cantidad);
                            System.out.println("Retiro Realizado Exitosamente.");
                            System.out.println("La cantidad de Dinero disponible que tiene en su Cuenta es : " + Cliente_Actual.ConsultarSaldo(Indice_Cuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite el Numero de Cuenta al que Quieres Retirar Dinero : ");
                    Numero_de_Cuenta = Entrada.nextInt();
                    Indice_Cuenta = BuscadorDeCuentas(Cuentas, Numero_de_Cuenta);
                    if (Indice_Cuenta == -1) {
                        System.out.println(" El numero de Cuenta no Existe.. ");
                    } else {
                        System.out.println("La cantidad de Dinero disponible que tiene en su Cuenta es : " + Cliente_Actual.ConsultarSaldo(Indice_Cuenta));
                    }
                    break;
                case 4:
                    System.out.println(" Hasta Luego .. ");
                    break;
                default:
                    System.out.println("ERROR NO EXISTE LA OPCION QUE INTRODUJO:");
                    break;
            }
        } while (Opcion != 4);

    }

}
