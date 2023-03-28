package Clases_Objetos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        Numeros_Complejos Complejo_1, Complejo_2, Suma, Multiplicacion;
        double Numero_1, Numero_2, Numero_3, Numero_4;
        int Opcion, Numero_Entero;

        do {
            System.out.println("\t . . . : Operaciones con Numeros Complejos : . . .");
            System.out.println("1. Sumar dos Numeros Complejos . ");
            System.out.println("2. Multiplicar dos Numeros Complejos . ");
            System.out.println("3. Comparar dos Numeros Complejos (Iguales o no ) . ");
            System.out.println("4. Multiplicar un Numero Complejo por un Entero . ");
            System.out.println("5. Salir . ");
            System.out.print("Digite una Opcion del Menu :");
            Opcion = Entrada.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println("\nDigite el primer Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_1 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_2 = Entrada.nextDouble();
                    System.out.println("\nDigite el segundo Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_3 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_4 = Entrada.nextDouble();
//aqui llamamos al metodo constructor
                    Complejo_1 = new Numeros_Complejos(Numero_1, Numero_2);
                    Complejo_2 = new Numeros_Complejos(Numero_3, Numero_4);

                    Suma = Complejo_1.Sumar(Complejo_2);
                    System.out.println("La Suma es : " + Suma.getNumero_1() + " + " + Suma.getNumero_2() + "i ");

                    break;
                case 2:
                    System.out.println("\nDigite el primer Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_1 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_2 = Entrada.nextDouble();
                    System.out.println("\nDigite el segundo Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_3 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_4 = Entrada.nextDouble();
//aqui llamamos al metodo constructor
                    Complejo_1 = new Numeros_Complejos(Numero_1, Numero_2);
                    Complejo_2 = new Numeros_Complejos(Numero_3, Numero_4);

                    Multiplicacion = Complejo_1.Multiplicar(Complejo_2);
                    System.out.println("La Multiplicacion es : " + Multiplicacion.getNumero_1() + " + " + Multiplicacion.getNumero_2() + "i");
                    break;
                case 3:
                    System.out.println("\nDigite el primer Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_1 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_2 = Entrada.nextDouble();
                    System.out.println("\nDigite el segundo Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_3 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_4 = Entrada.nextDouble();
//aqui llamamos al metodo constructor
                    Complejo_1 = new Numeros_Complejos(Numero_1, Numero_2);
                    Complejo_2 = new Numeros_Complejos(Numero_3, Numero_4);

                    if (Complejo_1.Verificacion_de_Igualdad(Complejo_2)) {
                        System.out.println("Los Numeros Complejos son Iguales  ");
                    } else {
                        System.out.println("Los Numeros Complejos NO son Iguales ");
                    }
                    break;
                case 4:
                    System.out.println("\nDigite el primer Numero Complejo : ");
                    System.out.print("Digite la Parte Real del Numero : ");
                    Numero_1 = Entrada.nextDouble();
                    System.out.print("Digite la Parte Imaginaria : ");
                    Numero_2 = Entrada.nextDouble();
                    System.out.print("Digite el Numero Entero : ");
                    Numero_Entero = Entrada.nextInt();
//aqui llamamos al metodo constructor
                    Complejo_1 = new Numeros_Complejos(Numero_1, Numero_2);
                    Multiplicacion = Complejo_1.Multiplicacion_por_Entero(Numero_Entero);
                    System.out.println("La Multiplicacion es : " + Multiplicacion.getNumero_1() + " + " + Multiplicacion.getNumero_2() + "i");
                    break;
                case 5:
                    System.out.println("Hasta luego ; )");
                    break;
                default:
                    System.out.println("ERROR DIGITE UNA OPCION DEL MENU ");
                    break;
            }
            System.out.println(" ");
        } while (Opcion != 5);

    }
}
