package easy.exercises;

import java.util.Arrays;

public class Exercise_002 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Integer[] numbersIntegers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        Transformacion de Streams Primitivos a Stream de Objetos para posteriormente utilizarlo para realizar el formateo
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", numbersIntegers);
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new));
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", Arrays.stream(numbers).mapToObj(Integer::valueOf).toArray(Integer[]::new));
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", Arrays.stream(numbers).mapToObj(Double::valueOf).toArray(Double[]::new));
        System.out.printf("(%s%s%s) %s%s%s-%s%s%s%s%n", Arrays.stream(numbers).mapToObj(Long::valueOf).toArray(Long[]::new));

    }
}
