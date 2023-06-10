package java_20.functions;

import java.util.function.Function;

public class TestFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> sum = getSum(7, 8);
        Function<Integer, String> isOdd = (number) -> number % 2 != 0 ? "is Odd" : "is Pair";
        var finalFunction = sum.andThen(isOdd);
        System.out.println(finalFunction.apply(10));

    }

    public static Function<Integer, Integer> getSum(Integer number, Integer number_1) {
        return (sum) -> number + number_1 + sum;
    }

    public static Integer minusThousand(Integer result) {
        return result - 10000;
    }
}
