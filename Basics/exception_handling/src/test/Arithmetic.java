package test;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.5.4
 * @since 20.0.0 2026-01-04
 */
public class Arithmetic {

    public static int division(int numerator, int denominator) throws ExceptionOperation {
        if (denominator == 0) throw new ExceptionOperation("The denominator is 0");
        if (denominator < 0) throw new NegativeDenominatorException("The denominator is negative");
        return numerator / denominator;
    }
}
