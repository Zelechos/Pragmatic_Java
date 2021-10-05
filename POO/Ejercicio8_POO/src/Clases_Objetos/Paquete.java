package Clases_Objetos;

public class Paquete {

    private int Numero_de_Paquete;
    private String DNI;
    private double Peso;
    private int Prioridad;

    public Paquete(int Numero_de_Paquete, String DNI, double Peso, int Prioridad) {
        this.Numero_de_Paquete = Numero_de_Paquete;
        this.DNI = DNI;
        this.Peso = Peso;
        this.Prioridad = Prioridad;
    }

    public int getNumero_de_Paquete() {
        return Numero_de_Paquete;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return Peso;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public String MostrarDatosPaquete() {
        return "\nEl numero de Paquete es : "+Numero_de_Paquete+"\nEl DNI del Paquete es : "+DNI+"\nEl peso del Paquete es : "+Peso+"\nLa Prioridad del Paquete es : "+Prioridad;
    }
    
   
}
