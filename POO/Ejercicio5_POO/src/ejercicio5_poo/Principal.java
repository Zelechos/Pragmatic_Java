package ejercicio5_poo;

import java.util.Scanner;

public class Principal {

    //metodo static usualmente se usan para devolver valores importanes 
    //al metodo principal
    public static double Area_Mayor(Triangulos_Isosceles Triangulo[]) {
        double Area = Triangulo[0].Obtener_Area();

        for (int Posicion_Triangulo = 1; Posicion_Triangulo < Triangulo.length; Posicion_Triangulo++) {
            if (Triangulo[Posicion_Triangulo].Obtener_Area() > Area) {
                Area = Triangulo[Posicion_Triangulo].Obtener_Area();
            }
        }
        return Area;
    }

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Cantidad_de_Triangulos;
        double Base, Lado;

        System.out.print("Digite la Cantdad de Triangulos Isosceles  : ");
        Cantidad_de_Triangulos = Entrada.nextInt();

        Triangulos_Isosceles Triangulo[] = new Triangulos_Isosceles[Cantidad_de_Triangulos];

        for (int Posicion_de_Vector = 0; Posicion_de_Vector < Triangulo.length; Posicion_de_Vector++) {
            System.out.println("Digite el Lado y la Base del Triangulo Isosceles " + (Posicion_de_Vector + 1) + " : ");
            System.out.print("Digite el Lado del Triangulo : ");
            Lado = Entrada.nextDouble();
            System.out.print("Digite la Base del Triangulo : ");
            Base = Entrada.nextDouble();

            Triangulo[Posicion_de_Vector] = new Triangulos_Isosceles(Base, Lado);
            System.out.println("El Perimetro del Triangulo Isosceles es : " + Triangulo[Posicion_de_Vector].Obtener_Perimetro());
            System.out.println("El Area del Traingulo Isosceles es : " + Triangulo[Posicion_de_Vector].Obtener_Area());
        }

        System.out.println("\nEl Area del Triangulo Isoceles con Mayor Superficie es : " + Area_Mayor(Triangulo));

    }
}
