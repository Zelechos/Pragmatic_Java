/*
 */
package Programador;

import java.io.Serializable;

/**
 *
 * @author Zelec
 */
public class Programador implements Serializable{
    
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private Stack Especialidad;
    
    public Programador(String Nombre, String Apellidos, int Edad, Stack Especialidad){
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Especialidad = Especialidad;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Stack getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Stack Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
    
    
}
