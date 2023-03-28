package Clases_Objetos;

public class Numeros_Complejos {

    private double Numero_1; //Parte real 
    private double Numero_2; //Parte Imaginaria

    //llamamos al constructor dos veces para crear cada vez un numero complejo
    public Numeros_Complejos(double Numero_1, double Numero_2) {
        this.Numero_1 = Numero_1;
        this.Numero_2 = Numero_2;
    }

    public double getNumero_1() {
        return Numero_1;
    }

    public double getNumero_2() {
        return Numero_2;
    }

    /*
           aqui tomamos la clase Numeros_Complejos como un String ,int ,float tal que "Suma " 
           es un variable de Tipo Numeros_Complejos y de esta manera asi como returnamos el tipo de variable 
           tambien en vez de poner void,int,String,float pondremos Numeros_Complejos como las variables
           que retornara de este metodo
     */
    public Numeros_Complejos Sumar(Numeros_Complejos Complejo) {
        Numeros_Complejos Suma = new Numeros_Complejos(Numero_1 + Complejo.getNumero_1(), Numero_2 + Complejo.getNumero_2());
        return Suma;
    }

    public Numeros_Complejos Multiplicar(Numeros_Complejos Complejo) {
        Numeros_Complejos Multiplicacion = new Numeros_Complejos((Numero_1 * Complejo.getNumero_1() - Numero_2 * Complejo.getNumero_2()), (Numero_1 * Complejo.getNumero_2() + Numero_2 * Complejo.getNumero_1()));
        return Multiplicacion;
    }

    public boolean Verificacion_de_Igualdad(Numeros_Complejos Complejo) {
        boolean Igualdad = false;
        if (Numero_1 == Complejo.getNumero_1() && Numero_2 == Complejo.getNumero_2()) {
            Igualdad = true;
        }
        return Igualdad;
    }

    public Numeros_Complejos Multiplicacion_por_Entero(int Entero) {
        Numeros_Complejos Multiplicacion_Entero = new Numeros_Complejos(Numero_1 * Entero, Numero_2 * Entero);
        return Multiplicacion_Entero;
    }

}
