package Clases_Objetos;

abstract public class Poligonos {

    protected int Cantidad_de_Lados;

    public abstract double Area();

    public Poligonos(int Cantidad_de_Lados) {
        this.Cantidad_de_Lados = Cantidad_de_Lados;
    }

    public String MostrarDatos() {
        return "\nMostrando Datos del Poligono : "
                + "\n La Cantidad de Lados es  : " + Cantidad_de_Lados;
    }

    public int getCantidad_de_Lados() {
        return Cantidad_de_Lados;
    }

}
