package Clases_Objetos;

public class Doctor extends Persona {

    private String Titulacion;
    private int Años_de_Experiencia;

    public Doctor(String Titulacion, String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);
        this.Titulacion = Titulacion;
        this.Años_de_Experiencia = Años_de_Experiencia;
    }

    @Override
    public void Partido_de_Futbol() {
        System.out.println("\nAuxiliando a los Jugadores");
    }

    @Override
    public void Entrenamiento() {
        System.out.println("\nDa Asistencia en el Entrenamiento");
    }

    public void Curar_Lesion() {
        System.out.println("\nCurando Lesion");
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public int getAños_de_Experiencia() {
        return Años_de_Experiencia;
    }

}
