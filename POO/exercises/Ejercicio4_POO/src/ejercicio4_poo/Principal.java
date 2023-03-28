package ejercicio4_poo;

import java.util.Scanner;

public class Principal {

    public static int Tiempo_LLegada(Atleta Corredor[]) {

        float Tiempo = Corredor[0].getTiempo_de_Carrera();
        int Posicion_Del_Objeto_Corredor = 0;

        for (int Verificacion_de_Tiempos = 1; Verificacion_de_Tiempos < Corredor.length; Verificacion_de_Tiempos++) {
            if (Corredor[Verificacion_de_Tiempos].getTiempo_de_Carrera() < Tiempo) {
                Tiempo = Corredor[Verificacion_de_Tiempos].getTiempo_de_Carrera();
                Posicion_Del_Objeto_Corredor = Verificacion_de_Tiempos;
            }
        }

        return Posicion_Del_Objeto_Corredor;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        String Nombre;
        float Tiempo_de_Carrera;
        int Cantidad_de_Atletas, Numero_Atleta, Posicion;

        System.out.print("Digite la Cantidad de Atletas que estan participando en la competicion : ");
        Cantidad_de_Atletas = Entrada.nextInt();

//                int        vector[]    =   new    int                    [10]              ;
        Atleta Corredor[] = new Atleta[Cantidad_de_Atletas];

        for (int Corredores = 0; Corredores < Corredor.length; Corredores++) {
            System.out.println("Digite las Caracteristicas del Atleta " + (Corredores + 1));
            System.out.print("Digite el Numero del Atleta : ");
            Numero_Atleta = Entrada.nextInt();
            Entrada.nextLine();
            System.out.print("Digite el Nombre del Atleta : ");
            Nombre = Entrada.nextLine();
            System.out.print("Digite el Tiempo de Carrera del Atleta : ");
            Tiempo_de_Carrera = Entrada.nextFloat();

            Corredor[Corredores] = new Atleta(Numero_Atleta, Nombre, Tiempo_de_Carrera);
        }

        Posicion = Tiempo_LLegada(Corredor);

        System.out.println("Las Caracteristicas del Atleta Ganador es : ");
        System.out.println(Corredor[Posicion].Mostrar_Datos());
        System.out.println(Corredor[Posicion].Felicidades());
    }

}
