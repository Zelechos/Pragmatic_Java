package variables_examples;

import java.net.SocketTimeoutException;

/**
 * Learn about inference of local variables in Java
 *
 * @author Alex T.H.
 * @version v0.3.6
 * @since 10.0.0 2024-01-22
 */
public class Variables {

    public static void main(String[] args) {
//       Aqui tenemos diferente ejemplo de variables clasicas con su tipo de dato

//       Primitivas :
//       byte, short, int, long, float, double, char, boolean, String //sometimes

//       No Primitivas o de Tipo objetos:
//       Byte, Short, Integer, Long, Float, Double, Character, Boolean, String

        String greeting = "hello programmer";
        System.out.println(greeting);

//       apatir de JDK 10 ha versiones posteriores var nos brinda la inferencia de datos en Java
        var wifiConnection = "ethernet connection";
        System.out.println(wifiConnection);

        var requestApi = 10;
        System.out.println(requestApi);
    }
}
