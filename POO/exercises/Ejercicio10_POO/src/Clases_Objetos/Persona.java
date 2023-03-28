package Clases_Objetos;

abstract public class Persona {

    protected String Nombre;
    protected String Apellido;
    protected int Edad;

    public Persona(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public void Viajar() {
        System.out.println("\nViaja");
    }

    //Metodos Abstractos
    abstract public void Partido_de_Futbol();

    abstract public void Entrenamiento();

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

}
