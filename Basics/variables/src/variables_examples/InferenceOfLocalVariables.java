package variables_examples;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.*;

public class InferenceOfLocalVariables {

    public static void main(String[] args) {
        /**---------------------------------------------------------------------------------
         * NOTA IMPORTANTE DEL AUTOR: Los ejemplos de codigo que examinaremos no son ejecutables
         * se usaron explicitamente con propositos explicativos "Alex T.H".
         ---------------------------------------------------------------------------------*/

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

//      en declaraciones de parametros formales de expresiones lambda
//        (int a, int b) -> a + b;

//      a partir de JDK 11 se pueden declarar parametros formales de una expresion lambda con var
        (var a, var b) -> a + b;// se infiere int

//      no se puede mezclar la inferencia con la especificacion de tipo de variable en los parametros de una lambda
        (var x, y) -> x.process(y) (var x, int y) -> x.process(y)


        /**
         * a continuacion examinaremos el articulo de Stuart W. Marks de las diferentes
         * directrices y pautas de estilo a la hora de usar la inferencia de tipo de variable local
         */

//      1 .- Elija nombres de variable que proporcionen informacion util

//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        List<Customer> x = dbconn.executeQuery(query);
//      CODIGO LIMPIO
        var custList = dbconn.executeQuery(query);
//---------------------------------------------------------------------------------

//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        try (Stream<Customer> result = dbconn.executeQuery(query)) {
            return result.map().filter().findAny();
        }
//      CODIGO LIMPIO
        try (var customers = dbconn.executeQuery(query)) {
            return customers.map().filter().findAny();
        }
//---------------------------------------------------------------------------------

//      2 .- Minimizar el alcance de las variables locales

//---------------------------------------------------------------------------------
        /**
         * En el siguiente ejemplo, el add() método agrega claramente el elemento
         * especial como el último elemento de la lista, por lo que se procesa
         * en último lugar, como se esperaba.
         */

//      EXAMPLE
        var items = new ArrayList<item>();
        items.add(MUST_BE_PROCESSED_LAST);
        for (var item : items) {
            ...
        }
        /**
         * Ahora suponga que para eliminar elementos duplicados, un programador
         * modificara este código para usar un HashSet en lugar de un ArrayList:
         */
//      MODIFIED CODE
        var items = new HashSet<item>();
        items.add(MUST_BE_PROCESSED_LAST);
        for (var item : items) {
            ...
        }
        /**
         * Este código ahora tiene un error, ya que los conjuntos no tienen un orden
         * de iteración definido. Sin embargo, es probable que el programador corrija
         * este error de inmediato, ya que los usos de la var items son adyacentes
         * a su declaración.
         */

        /**
         * Ahora suponga que este código es parte de un método grande, con un
         * alcance correspondientemente grande para la itemsvariable
         */
        var items = new HashSet<item>();
        // 100 lines of code
        items.add(MUST_BE_PROCESSED_LAST);
        for (var item : items) {...}

        /**
         * El ejemplo inicial que usa var está perfectamente bien.
         * El problema solo ocurre cuando el alcance de la variable es grande.
         * En lugar de simplemente evitar var estos casos, se debe cambiar el código
         * para reducir el alcance de las variables locales y solo luego declararlas con var.
         */
//---------------------------------------------------------------------------------


//      3 .- Considere aplicar var cuando el inicializador proporciona suficiente informacion al lector
//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

//      CODIGO LIMPIO
        var outputStream = new ByteArrayOutputStream(); // crea consicion
//---------------------------------------------------------------------------------

//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        BufferedReader reader = Files.newBufferedReader();
        List<String> stringList = List.of("a", "b", "c");

//      CODIGO LIMPIO
        var reader = Files.newBufferedReader();
        var stringList = List.of("a", "b", "c");
//---------------------------------------------------------------------------------


//      4 .- Use var para dividir expresiones encadenadas o anidadas con variables locales
//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        return strings.stream().collect(groupingBy(s -> s, counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);


//      CODIGO ORIGINAL REFACTORIZADO
        Map<String, Long> freqMap = strings.stream().collect(groupingBy(s -> s, counting()));
        Optional<Map.Entry<String, Long>> maxEntryOpt = freqMap.entrySet().stream().max(Map.Entry.comparingByValue());
        return maxEntryOpt.map(Map.Entry::getKey);


//      CODIGO LIMPIO CON INFERENCIA DE VARIABLE LOCAL
        var freqMap = strings.stream().collect(groupingBy(s -> s, counting()));
        var maxEntryOpt = freqMap.entrySet().stream().max(Map.Entry.comparingByValue());
        return maxEntryOpt.map(Map.Entry::getKey);
//---------------------------------------------------------------------------------


//      5 .- No se preocupe demasiado por la "programacion en la interfaz" con variables locales
//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        List<String> list = new ArrayList<>();

//      CODIGO LIMPIO (el compilador infiere que list es de tipo Arraylist<String> y no de tipo List<String>)
        var list = new Arraylist<>();
//---------------------------------------------------------------------------------


//      6 .- Tenga cuidado al usar var con diamantes o metodos genericos
//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        // OK: pero declare las variables de tipo PriorityQueue<Item>
        PriorityQueue<Item> itemQueue = new PriorityQueue<>(Item);
        PriorityQueue<Item> itemQueue = new PriorityQueue<>();
        var itemQueue = new PriorityQueue<Item>();

//      Es legal usar ambos var y el diamante, pero el tipo inferido cambiará:
//      CODIGO LIMPIO
        // DANGEROUS: el tipo inferido es PriorityQueue<Object> no new PriorityQueue<>(Item) !!!
        var itemQueue = new PriorityQueue<>();

//---------------------------------------------------------------------------------


//      7 .- Tenga cuidado al usar var con literales
//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        boolean ready = true;
        char ch = '\ufffd';
        long sum = 0L;
        String label = "wombat";

//      CODIGO LIMPIO
        var ready = true;
        var ch    = '\ufffd';
        var sum   = 0L;
        var label = "wombat";
//---------------------------------------------------------------------------------

//---------------------------------------------------------------------------------
//      CODIGO ORIGINAL
        byte flags = 0;
        short mask = 0x7fff;
        long base = 17;

//      CODIGO LIMPIO (todas las variables son inferidas con int y esto no es correcto)
        var flags = 0;
        var mask = 0x7fff;
        var base = 17;
//---------------------------------------------------------------------------------
    }
}
