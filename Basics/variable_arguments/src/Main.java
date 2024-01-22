/**
 * Learn about Variables Arguments
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
public class Main {
    public static void main(String[] args) {
        variousParameters("hello", 3, 4, 5, 6);
    }

    //    private static void variousParameters(int...numbers, String name){ esto no es permitido!!!
    private static void variousParameters(String greeting, int... numbers) {
        System.out.println(greeting);
        printNumbers(numbers);
    }

//    esto no funciona porque el ultimo parametro siempre tiene que ser el argumento variable
//    private static void variousParameters(String... names, int... numbers) {
//        System.out.println(names);
//        printNumbers(numbers);
//    }

    private static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
