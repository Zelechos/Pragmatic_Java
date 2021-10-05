package Teoria_Informatica;

abstract public class Lenguajes {

    protected String Informacion;

    public Lenguajes() {
        this.Informacion = "es un idioma artificial, utilizado por ordenadores, "
                + "cuyo fin es transmitir información de algo a alguien. \n"
                + "Los lenguajes informáticos, pueden clasificarse en: \n"
                + "a) lenguajes de programación (Python, PHP, Pearl, C, etc.); \n"
                + "b) lenguajes de especificación (UML); \n"
                + "c) lenguajes de consulta (SQL); \n"
                + "d) lenguajes de marcas (HTML, XML); \n"
                + "e) lenguajes de transformación (XSLT); \n"
                + "f) protocolos de comunicaciones (HTTP, FTP); \n"
                + "entre otros.";
    }
    
    

    public abstract String Nombre();

    public abstract String Informacion();

    public abstract void SubMenu();

    

}
