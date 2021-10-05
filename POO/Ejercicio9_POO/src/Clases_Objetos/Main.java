package Clases_Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Arreglo Estatico
    static ArrayList<Poligonos> poligonos = new ArrayList<Poligonos>();
    static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        LLenarPoligono();
        RecorrerArrayList();
    }

    public static void LLenarPoligono() {
        char Respuesta;
        int Opcion;

        do {
            do {
                System.out.println("Digite que Poligono Desea : ");
                System.out.println("1. Rectangulo.");
                System.out.println("2. Triangulo.");
                System.out.println("3. Pentagono.");
                System.out.println("4. Hexagono.");
                System.out.print("Opcion : ");
                Opcion = Entrada.nextInt();
            } while (Opcion < 1 || Opcion > 4);

            switch (Opcion) {
                case 1:
                    LLenarRectangulo();
                    break;
                case 2:
                    LLenarTriangulo();
                    break;
                case 3:
                    LLenarPentagono();
                    break;
                case 4:
                    LLenarHexagono();
                    break;
            }

            System.out.println("Desea Introducir Otro Poligono Digite (Y/N) : ");
            Respuesta = Entrada.next().charAt(0);
            System.out.println("");
        } while (Respuesta == 'y' || Respuesta == 'Y');

    }

    public static void LLenarRectangulo() {

        double Lado_1, Lado_2;

        System.out.print("Digite el Lado 1 del Rectangulo : ");
        Lado_1 = Entrada.nextDouble();
        System.out.print("Digite el Lado 2 del Rectangulo : ");
        Lado_2 = Entrada.nextDouble();

        Rectangulos Rectangulo_Nuevo = new Rectangulos(Lado_1, Lado_2);
        //Guardamos el Objeto en El ArrayList
        poligonos.add(Rectangulo_Nuevo);
    }

    public static void LLenarTriangulo() {
        double Base, Altura;

        System.out.print("Digite la Base del Triangulo : ");
        Base = Entrada.nextDouble();
        System.out.print("Digite la Altura del Triangulo : ");
        Altura = Entrada.nextDouble();

        Triangulos Triangulo_Nuevo = new Triangulos(Base, Altura);
        poligonos.add(Triangulo_Nuevo);
    }

    public static void LLenarPentagono() {
        double Lado, Apotema;

        System.out.print("Digite el Lado del Pentagono : ");
        Lado = Entrada.nextDouble();
        System.out.print("Digite el Apotema del Pentagono : ");
        Apotema = Entrada.nextDouble();

        Pentagonos Pentagono_Nuevo = new Pentagonos(Lado, Apotema);
        poligonos.add(Pentagono_Nuevo);
    }

    public static void LLenarHexagono() {
        double Lado, Apotema;

        System.out.print("Digite el Lado del Pentagono : ");
        Lado = Entrada.nextDouble();
        System.out.print("Digite el Apotema del Pentagono : ");
        Apotema = Entrada.nextDouble();

        Hexagonos Hexagono_Nuevo = new Hexagonos(Lado, Apotema);
        poligonos.add(Hexagono_Nuevo);
    }

    public static void RecorrerArrayList() {

        for (Poligonos Mostrar : poligonos) {
            System.out.println(Mostrar.MostrarDatos());
        }
    }
}
