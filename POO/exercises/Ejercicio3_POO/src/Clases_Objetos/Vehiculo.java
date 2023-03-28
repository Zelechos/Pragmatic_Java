package Clases_Objetos;

public class Vehiculo {

    private String Marca;
    private String Modelo;
    private float Precio;

    public Vehiculo(String Marca, String Modelo, float Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public float getPrecio() {
        return Precio;
    }

    public String Mostrar_Datos() {
        return "Marca : " + Marca + "\nModelo : " + Modelo + "\nPrecio : " + Precio + "$\n";
    }
    

}
