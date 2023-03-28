package Clases_Objetos;

public class Futbolista extends Persona {

    private int Dorsal;
    private String Posicion;

    public Futbolista(String Nombre, String Apellido, int Edad, int Dorsal, String Posicion) {
        super(Nombre, Apellido, Edad);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }

    @Override
    public void Partido_de_Futbol(){
        System.out.println("\nJugando");
    }
    
    @Override
    public void Entrenamiento(){
        System.out.println("\nEntrenando");
    }
    
    public void Entrevista(){
        System.out.println("\nEntrevistandose");
    }
    
    public int getDorsal() {
        return Dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }
    
    
    
}
