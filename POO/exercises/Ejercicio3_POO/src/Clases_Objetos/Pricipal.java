package Clases_Objetos;

import java.util.Scanner;

public class Pricipal {

    //Aqui creamos otro metodo stactico para hallar el menor precio 
    public static int Vehiculo_Barato(Vehiculo Vehiculos[]) { //el dato es de tipo Vehiculo como decir tipo string y el vehiculo[] es el vector de objetos 
        float precio;
        int indice = 0;
        precio = Vehiculos[0].getPrecio();

        //aqui hallamos el MENOOOOR PRECIOOOO 
        for (int Coche = 1; Coche < Vehiculos.length; Coche++) {
            if (Vehiculos[Coche].getPrecio() < precio) {
                precio = Vehiculos[Coche].getPrecio();
                indice = Coche;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        String Marca, Modelo;
        float Precio;
        int Cantidad_De_Vehiculos, Indice_Obtenido;

        System.out.print("Digite la Cantidad de Vehiculos : ");
        Cantidad_De_Vehiculos = Entrada.nextInt();

        //Al igual que en los vectores aqui creamos un objeto vector con la cantidad de vehiculo que queramos en resumen muchos objetos
        Vehiculo Vehiculos[] = new Vehiculo[Cantidad_De_Vehiculos];

        //con el Vehiculos.length determinamos el tamaño del Objeto igual funcionaria con la variable "Cantidad_De_Vehiculos"
        for (int Posicion = 0; Posicion < Cantidad_De_Vehiculos; Posicion++) {
            System.out.println("Digite las caracteristicas del Vehiculo " + (Posicion + 1) + " : ");
            System.out.print("Introduzca la Marca : ");
            Marca = Entrada.next();
            System.out.print("Introduzca el Modelo : ");
            Modelo = Entrada.next();
            System.out.print("Introduzca el Precio : ");
            Precio = Entrada.nextFloat();
            //Aqui llamamos al constructor porque asi los datos se guardaran y creamos otro objeto 
            Vehiculos[Posicion] = new Vehiculo(Marca, Modelo, Precio);
        }

        /*
                Aqui hemos guardado el metodo statico "Vehiculo_Barato" en una variable este metodo 
                retorna el valor del vector de objetos ese valor representa la posicion del vector donde esta
                el auto con el precio mas barato
         */
        Indice_Obtenido = Vehiculo_Barato(Vehiculos);

        //aqui simplemento mostramos el el vector con el indice y con el metodo Mostrar_Datos
        System.out.println("\nEl Vehiculo con el precio mas Barato es  : ");
        System.out.println(Vehiculos[Indice_Obtenido].Mostrar_Datos());
    }
}
