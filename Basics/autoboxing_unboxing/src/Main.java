/**
 * Main class
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
public class Main {
    public static void main(String[] args) {

//        Clase envolvente o Wrapper
/**
 * Clases envolventes para tipos promitivos
 *
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 * byte -> Byte
 * char -> Character
 * short -> Short
 *
 */

//      Autoboxing - dado que envolvemos un tipo primitivo en un tipo object
        Integer number = 10;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number.doubleValue());

//      Unboxing - dado que envolvemos un tipo object en un tipo primitivo
        int numberInt = number;
        System.out.println(numberInt);

    }
}