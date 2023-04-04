package exercise_01;

public class Arithmetic {

    public static int division(int numerator, int denominator) throws ExceptionOperation {
        if (denominator == 0) throw new ExceptionOperation("The denominator is 0");
        return numerator / denominator;
    }
}
