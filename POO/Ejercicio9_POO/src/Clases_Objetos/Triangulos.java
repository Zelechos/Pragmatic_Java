package Clases_Objetos;

public class Triangulos extends Poligonos {

    private double Base;
    private double Altura;

    public Triangulos(double Base, double Altura) {
        super(3);
        this.Base = Base;
        this.Altura = Altura;
    }

    @Override
    public double Area() {
        double Area = (Base * Altura) / 2;
        return Area;
    }

    @Override
    public String MostrarDatos() {
        return "\nMostrando Datos del Poligono : "
                + "\n La Cantidad de Lados es  : " + Cantidad_de_Lados
                + "\n La base es  : " + Base
                + "\n La altura es  : " + Altura
                + "\n el Area de el triangulo es  : " + Area();
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

}
