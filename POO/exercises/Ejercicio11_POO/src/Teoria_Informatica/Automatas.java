package Teoria_Informatica;

public class Automatas extends Lenguajes_de_Especificacion {

    protected String Nombre;
    protected String Info;

    public Automatas(String Info) {
        super(Info);
        this.Nombre = "Automata Finito";
        this.Info = "Un autómata finito (AF) o máquina de estado finito es un modelo computacional\n"
                + " que realiza cómputos en forma automática sobre una entrada para producir una salida.\n"
                + "Este modelo está conformado por un alfabeto, un conjunto de estados finito, una función de transición, \n"
                + "un estado inicial y un conjunto de estados finales. Su funcionamiento se basa en una función de transición, \n"
                + "que recibe a partir de un estado inicial una cadena de caracteres pertenecientes al alfabeto (la entrada),\n"
                + " y que va leyendo dicha cadena a medida que el autómata se desplaza de un estado a otro, \n"
                + "para finalmente detenerse en un estado final o de aceptación, que representa la salida.\n"
                + "La finalidad de los autómatas finitos es la de reconocer lenguajes regulares,\n"
                + " que corresponden a los lenguajes formales más simples según la Jerarquía de Chomsky.";
    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return Info;
    }
    
    

}
