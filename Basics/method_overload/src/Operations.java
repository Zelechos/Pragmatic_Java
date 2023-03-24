/**
 * Operations class
 * Example to method overload
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
public class Operations {

    public static int add(int a, int b) {
        System.out.println("add(int a, int b)");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("add(double a, double b)");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

}
