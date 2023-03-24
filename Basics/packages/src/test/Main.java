/**
 * Main class
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
package test;

// sirve para importar metodos y atributos estaticos
import static dev.java.packages.Props.*;

public class Main {
    public static void main(String[] args) {
//        Usualmente para nombra paquetes en java se usa la ruta de nuestro sitio invertido por ejemplo

//  Nombre de sitio : programmers.dev
//  Estrucutara de Paquetes : dev.programmers

//        System.out.println("Hello world!");

        print("Hello");

//  tambien podemos acceder de esta manera a mis metodos estaticos o atributos estaticos
        dev.java.packages.Props.print("ether"); // se conoce como el "nombre completamente calificado"
    }
}