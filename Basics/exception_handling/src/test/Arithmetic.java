package test;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 */
public class Arithmetic {

    public static int division(int numerator, int denominator) throws ExceptionOperation {
        if (denominator == 0) throw new ExceptionOperation("The denominator is 0");
        return numerator / denominator;
    }
}
