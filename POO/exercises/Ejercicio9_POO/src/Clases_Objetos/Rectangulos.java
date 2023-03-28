package Clases_Objetos;

public class Rectangulos extends Poligonos {

    private double Lado_1;
    private double Lado_2;

    public Rectangulos(double Lado_1, double Lado_2) {
        super(2);
        this.Lado_1 = Lado_1;
        this.Lado_2 = Lado_2;
    }

    @Override
    public double Area() {
        double Area = Lado_1 * Lado_2;
        return Area;
    }

    @Override
    public String MostrarDatos() {
        return "\nMostrando datos del Poligono : "
                + "\n La cantida de Lados es : " + Cantidad_de_Lados
                + "\n El lado 1 es  : " + Lado_1
                + "\n El lado 2 es  :" + Lado_2
                + "\n El Area del Rectangulo es : " + Area();
    }

    public double getLado_1() {
        return Lado_1;
    }

    public double getLado_2() {
        return Lado_2;
    }

}
