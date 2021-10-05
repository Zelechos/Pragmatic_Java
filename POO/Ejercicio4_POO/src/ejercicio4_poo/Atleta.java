package ejercicio4_poo;

public class Atleta {

    private int Numero_Atleta;
    private String Nombre;
    private float Tiempo_de_Carrera;

    public Atleta(int Numero_Atleta, String Nombre, float Tiempo_de_Carrera) {
        this.Numero_Atleta = Numero_Atleta;
        this.Nombre = Nombre;
        this.Tiempo_de_Carrera = Tiempo_de_Carrera;
    }

    public float getTiempo_de_Carrera() {
        return Tiempo_de_Carrera;
    }

    public String Mostrar_Datos() {
        return "Numero de Atleta : " + Numero_Atleta + "\nNombre : " + Nombre + "\nTiempo de Carrera : " + Tiempo_de_Carrera;
    }

    public String Felicidades() {
        return "Felicidades " + Nombre + " Ganaste eres un Crack. ";
    }

}
