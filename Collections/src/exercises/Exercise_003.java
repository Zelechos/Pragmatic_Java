package exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Practice Collections & Lists, Sets, Maps
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 * @exercise Exercise 003 :  Sumar un Array de 10 numeros ignorando los numeros duplicados
 */
public class Exercise_003 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 0, 0, 5, 4, 6, 9};
        System.out.println(sumNoDuplicates(numbers));

    }

    public static Integer sumNoDuplicates(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .mapToInt(map -> map.getValue() == 1 ? map.getKey() : 0)
                .sum();
    }

}
