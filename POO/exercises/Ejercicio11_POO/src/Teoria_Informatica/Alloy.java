package Teoria_Informatica;

public class Alloy extends Lenguajes_de_Especificacion {

    protected String Nombre;
    protected String Info;

    public Alloy(String Info) {
        super(Info);
        this.Nombre = "Alloy";
        this.Info = "En ciencia de los computadores e ingeniería informática,\n"
                + " Alloy es un lenguaje de especificación declarativo para expresar complejas estructuras de control y comportamiento \n"
                + "en un sistema software. Alloy aporta una herramienta de modelaje estructural sencilla basada en lógica de primer orden.\n"
                + " Los soportes matemáticos del lenguaje fueron fuertemente influenciados por la notación Z, \n"
                + "aunque la sintaxis de Alloy debe más a lenguajes tales como el lenguaje de control de objetos.\n"
                + "1​ Alloy está orientado a la creación de micro-modelos que pueden ser automáticamente comprobados para su correctitud. \n"
                + "Las especificaciones de Alloy pueden ser comprobadas empleando el Analizador de Alloy.\n"
                + "La primera version del lenguaje Alloy apareció en 1997. Era más bien un limitado lenguaje de modelado de objetos. \n"
                + "Las sucesivas iteraciones del lenguaje añadieron cuantificadores, mayores relaciones de aridad, polimorfismo, composición y firmas\n"
                + ".2​ Aunque Alloy está diseñado con un análisis automático en mente, Alloy difiere de muchos lenguajes de especificación \n"
                + "por la comprobación de modelo en la que permite la definición de modelos infinitos. \n"
                + "El analizador de Alloy está diseñado para realizar comprobaciones de alcance finito incluso en modelos infinitos.";

    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return Info;
    }

}
