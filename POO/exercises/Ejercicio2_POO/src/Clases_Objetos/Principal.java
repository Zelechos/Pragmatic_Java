package Clases_Objetos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        tablero Movimiento;

        int x, y, Opcion, Incremento = 0;

        System.out.print("Digite la coordenada Inicial de X : ");
        x = Entrada.nextInt();
        System.out.print("Digite la coordenada incial de Y : ");
        y = Entrada.nextInt();

        Movimiento = new tablero(x, y);

        do {
            System.out.println("\n\t. . :MENU: . . ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir.");
            System.out.print("Digite una Opcion : ");
            Opcion = Entrada.nextInt();

            if (Opcion > 0 && Opcion < 5) {
                System.out.println("Cuantos espacios quiere Mover . ");
                Incremento = Entrada.nextInt();
            }

            switch (Opcion) {
                case 1:
                    Movimiento.Mover_Arriba(Incremento);
                    break;
                case 2:
                    Movimiento.Mover_Abajo(Incremento);
                    break;
                case 3:
                    Movimiento.Mover_Derecha(Incremento);
                    break;
                case 4:
                    Movimiento.Mover_Izquierda(Incremento);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR ,  La opcion que introdujo no existe Revise el Menu. ");
                    break;
            }

            System.out.println("Posicion actual ( X , Y ) son : (" + Movimiento.getX() + ") , (" + Movimiento.getY() + ")");

        } while (Opcion != 5);

        System.out.println("Gracias por Jugar hasta luego ... ");
    }

}
