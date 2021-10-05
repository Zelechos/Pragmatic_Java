package Teoria_Informatica;

public class RedPetri extends Lenguajes_de_Especificacion {

    protected String Nombre;
    protected String Info;

    public RedPetri(String Info) {
        super(Info);
        this.Nombre = "Red de Petri ";
        this.Info = "Una Red de Petri es una representación matemática o gráfica de un sistema a eventos discretos en el cual se puede \n"
                + "describir la topología de un sistema distribuido, paralelo o concurrente. \n"
                + "La red de Petri esencial fue definida en la década de los años 1960 por Carl Adam Petri. \n"
                + "Son una generalización de la teoría de autómatas que permite expresar un sistema a eventos concurrentes.\n"
                + "Una red de Petri está formada por lugares, transiciones, arcos dirigidos y marcas o fichas que ocupan posiciones dentro de los lugares. \n"
                + "Las reglas son:\n"
                + " Los arcos conectan un lugar a una transición así como una transición a un lugar. \n"
                + "No puede haber arcos entre lugares ni entre transiciones. \n"
                + "Los lugares contienen un número finito o infinito contable de marcas. \n"
                + "Las transiciones se disparan, es decir consumen marcas de una posición de inicio y producen marcas en una posición de llegada. \n"
                + "Una transición está habilitada si tiene marcas en todas sus posiciones de entrada.\n"
                + "En su forma más básica, las marcas que circulan en una red de Petri son todas idénticas. \n"
                + "Se puede definir una variante de las redes de Petri en las cuales las marcas pueden tener un color (una información que las distingue),\n"
                + " un tiempo de activación y una jerarquía en la red.\n"
                + "La mayoría de los problemas sobre redes de Petri son decidibles, tales como el carácter acotado y la cobertura. \n"
                + "Para resolverlos se utiliza un árbol de Karp-Miller. Se sabe que el problema de alcance es decidible, \n"
                + "al menos en un tiempo exponencial.";
    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return Info;
    }

}
