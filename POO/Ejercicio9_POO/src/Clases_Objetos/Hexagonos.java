package Clases_Objetos;

public class Hexagonos extends Poligonos {

    private double Lado;
    private double Apotema;

    public Hexagonos(double Lado, double Apotema) {
        super(6);
        this.Lado = Lado;
        this.Apotema = Apotema;
    }

    @Override
    public double Area() {
        double Area = ((Lado * 6) * Apotema) / 2;
        return Area;
    }

    @Override
    public String MostrarDatos() {
        return "\nMostrando Datos del Poligono : "
                + "\n La Cantidad de Lados es  : " + Cantidad_de_Lados
                + "\n El lado es : " + Lado
                + "\n El Apotema es : " + Apotema
                + "\n El Area del Hexagono es : " + Area();
    }

}
