/*
Ejercicio_1 : Contruir un programa que calcule el area y el perimetro de un Cuadrilatero dada la longitud de sus dos lados .
Los valores de la longitud deberan introducirse por linea de ordenes . Si es un Cuadrado , solo se proporcionara la longitud
de uno de los lados al constructor
 */
package Ejercicio1;

public class Cuadrilatero {

    //Atributos 
    private float Lado_1;
    private float Lado_2;

    //Metodos
//Metodo Constructor_1(PARA UN CUADRILATERO)
    public Cuadrilatero(float Lado_1, float Lado_2) {
        this.Lado_1 = Lado_1;
        this.Lado_2 = Lado_2;
    }

//Metodo Constructor_2 (PARA UN CUADRADO)
    public Cuadrilatero(float Lado_1) {
        this.Lado_1 = this.Lado_2 = Lado_1;
    }

    public float getPerimetro() {
        float Perimetro = 2 * (Lado_1 + Lado_2);
        return Perimetro;
    }

    public float getArea() {
        float Area = Lado_1 * Lado_2;
        return Area;
    }

}
