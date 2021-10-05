package Programador;

import java.io.Serializable;

public class Stack implements Serializable{
    
    private int Codigo;
    private String Especialidad;

    public Stack(int Codigo, String Especialidad) {
        this.Codigo = Codigo;
        this.Especialidad = Especialidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getStack() {
        return Especialidad;
    }

    public void setStack(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
}
