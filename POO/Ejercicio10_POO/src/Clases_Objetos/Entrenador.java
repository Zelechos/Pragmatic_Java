package Clases_Objetos;

public class Entrenador extends Persona{

   private String Estrategia;

    public Entrenador(String Estrategia, String Nombre, String Apellido, int Edad) {
        super(Nombre, Apellido, Edad);
        this.Estrategia = Estrategia;
    }

   @Override
    public void Partido_de_Futbol(){
        System.out.println("\nDirigiendo");
    }
   
   @Override
    public void Entrenamiento(){
       System.out.println("\nDirige el Entrenamiento");
    }
    
    public void Planificando_Entrenamiento(){
        System.out.println("\nPlanificando estrategia");
    }
    
    public String getEstrategia() {
        return Estrategia;
    }
   
   
    
}
