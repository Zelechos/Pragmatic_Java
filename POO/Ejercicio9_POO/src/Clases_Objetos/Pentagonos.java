package Clases_Objetos;

public class Pentagonos extends Poligonos {

    private double Lado;
    private double Apotema;

    public Pentagonos(double Lado, double Apotema) {
        super(5);
        this.Lado = Lado;
        this.Apotema = Apotema;
    }

    @Override
    public double Area() {
        double Area = ((Lado * 5) * Apotema) / 2;
        return Area;
    }

    @Override
    public String MostrarDatos() {
        return "\nMostrando Datos del Poligono : "
                + "\n La Cantidad de Lados es  : " + Cantidad_de_Lados
                + "\n El lado es : " + Lado
                + "\n El apotema es : " + Apotema
                + "\n El area del Pentagono es  : " + Area();
    }

}
