/**
 * Main class
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
public class Main {
    public static void main(String[] args) {

        var add = Operations.add(5, 3);
        System.out.println(add);
        var add1 = Operations.add(34.0, 6);
        System.out.println(add1);
        var add2 = Operations.add(3, 5L);
        System.out.println(add2);
    }
}