package variables_examples;

import java.net.SocketTimeoutException;

public class Variables {

    public static void main(String[] args) {
//       aqui tenemos una variable clasica con su tipo de dato


//       Primitivas :
//       byte, short, int, long , float, double char, boolean, String //sometimes

//       No Primitivas o de Tipo objetos:
//       Byte , Short, Integer , Long ,Float ,Double , Character, Boolean , String

        String greeting = "hello programmer";
        System.out.println(greeting);

//       apatir de JDK 10 ha versiones posteriores var nos brinda la inferencia de datos en Java
        var wifiConnection = "ethernet connection";
        System.out.println(wifiConnection);

        var requestApi = 10;
        System.out.println(wifiConnection);
    }
}
