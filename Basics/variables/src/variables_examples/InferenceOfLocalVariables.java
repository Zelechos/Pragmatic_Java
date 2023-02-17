package variables_examples;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

public class InferenceOfLocalVariables {

    public static void main(String[] args) {
        /**
         *  a partir de JDK10 tenemos el identificador var para que el compilador pueda inferir el tipo de
         *  variable a utilizar de manera mas facil y sencilla asi evitando el codigo repetitivo mejorando
         *  la legibilidad del mismo ADVERTENCIA abusar de este recurso tambien puede hacer menos legible
         *  el codigo.
         */

//      tenemos el siguiente troso de codigo que es muy redundante
        URL url = new URL("http://www.oracle.com/");
        URLConnection conn = url.openConnection();
        Reader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

//      usando la inferencia de variables se veria asi
        var url = new URL("http://www.oracle.com/");
        var conn = url.openConnection();
        var reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        /**
         * ahora como mencionabamos anteriormente el codigo se ve mejor pero.. si abusamos de la inferencia
         * llegaremos a un punto en donde no sabremos de que Clase son las instancias que estamos creando
         * por esto no se debe abusar de la inferencia de varibles.
         */

//      en indices de un bucle for each
        List<String> myList = Arrays.asList("a", "b", "c");
        for (var element : myList) {
            System.out.println(element);
        }  // se infiere String

//      en variables para indices de bucles for tradicionales
        for (var counter = 0; counter < 10; counter++) {
            System.out.println(counter);
        }   // se infiere int

//      en try con recursos de variables
        try (var input = new FileInputStream("validation.txt")) {
            System.out.println("some code");
        }   // se infiere FileInputStream
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      en try con recursos de variables



        /**
         * a continuacion
         */

    }
}
