package exercises;

import java.util.Arrays;
import java.util.List;

/**
 * Practice Collections & Lists, Sets, Maps
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 * @exercise Exercise 001 : Invertir un array de 10 numeros y mostrarlo
 */
public class Exercise_001 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 1, 7, 6, 5, 4, 9, 0};
        System.out.println("original array => " + Arrays.stream(numbers).boxed().toList());
        System.out.println("result array => " + invertNumbers(numbers));
    }

    public static List<Integer> invertNumbers(int[] numbers){
       return Arrays.stream(numbers)
               .boxed()
               .toList()
               .reversed();
    }
}
