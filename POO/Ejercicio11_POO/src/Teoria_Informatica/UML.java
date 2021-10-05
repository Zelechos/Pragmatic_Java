package Teoria_Informatica;

public class UML extends Lenguajes_de_Especificacion {

    protected String Nombre;
    protected String Info;

    public UML(String Info) {
        super(Info);
        this.Nombre = "UML(Lenguaje Unificado de Modelado)";
        this.Info = "Qué es UML?\n\n"
                + "El Lenguaje Unificado de Modelado (Unifield Modeling Lenguaje UML), es un lenguaje estándar para escribir planos de software, \n\n"
                + "UML se puede utilizar para visualizar, especificar, construir y documentar los artefactos de un sistema que involucra una gran cantidad de software. \n\n"
                + "UML prescribe un conjunto de notaciones y diagramas estándar para modelar sistemas orientados a objetos, \n\n"
                + "y describe la semántica esencial de lo que estos diagramas y símbolos significan.\n\n"
                + "\n\n"
                + "UML se puede usar para modelar distintos tipos de sistemas como por ejemplo: sistemas de software, sistemas de hardware, y organizaciones del mundo real. \n\n"
                + "UML ofrece nueve diagramas en los cuales modelar sistemas. Es un lenguaje muy expresivo,  \n\n"
                + "que  cubre  todas  las  vistas  necesarias  para  desarrollar  y  luego desplegar tales sistemas.\n\n"
                + "\n\n"
                + "UML es sólo un lenguaje y por tanto es tan solo una parte de un método de desarrollo  de  software,  además, \n\n"
                + "es  independiente  del  proceso,  aunque  para utilizar óptimamente se debería usar en procesos que fuesen dirigidos por los casos de uso, \n\n"
                + "centrados en la arquitectura, lo interactivo e incremental.\n\n"
                + "\n\n"
                + "UML es una consolidación de muchas de las notaciones y conceptos más usados orientados a objetos.  \n\n"
                + "Empezó  como  una  consolidación  del  trabajo  de  Grade Booch, James Rumbaugh, e Ivar Jacobson, \n\n"
                + "creadores de tres de las metodologías orientadas  a  objetos  más  populares,  en  1996,  el  Object  Management  Group (OMG), \n\n"
                + "publicó una petición con propósito de un metamodelo orientado a objetos de semántica y notación estándares. UML, en su versión 1.0, \n\n"
                + "fue propuesto como una respuesta a esta petición en enero de 1997. Hubo otras cinco propuestas rivales.\n\n"
                + "\n\n"
                + "Durante el transcurso de 1997, los seis promotores de las propuestas, unieron su trabajo y presentaron al OMG un documento revisado de UML, llamado UML versión 1.1. \n\n"
                + "Este documento fue aprobado por el OMG en Noviembre de 1997. \n\n"
                + "El OMG llama a este documento OMG UML versión 1.1. \n\n"
                + "El OMG estaba actualmente en proceso de mejorar una edición técnica de esta especificación, prevista su finalización para el 1 de abril de 1999.";
    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return Info;
    }

}
