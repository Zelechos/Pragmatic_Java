package ejercicio5_poo;

public class Triangulos_Isosceles {

    private double Base;
    private double Lado;

    public Triangulos_Isosceles(double Base, double Lado) {
        this.Base = Base;
        this.Lado = Lado;
    }

    public double Obtener_Perimetro() {
        double Perimetro = (2 * Lado) + Base;
        return Perimetro;
    }

    public double Obtener_Area() {
        double Area = (Base * Math.sqrt(Math.pow(Lado, 2) - ((Math.pow(Base, 2)) / 4))) / 2;
        return Area;
    }

    public String Mostrar_Datos() {
        return "Base : " + Base + "\nLado : " + Lado + "\nPerimetro : " + Obtener_Perimetro() + "\nArea : " + Obtener_Area();
    }
 
}
