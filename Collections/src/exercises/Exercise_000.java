package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Practice Collections & Lists, Sets, Maps
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 * @exercise Exercise 000 : Leer 10 numeros , guardarlos en un arreglos y ordenarlos de menor a mayor
 */
public class Exercise_000 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("Guardando los datos en un arreglo : ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " . Digite un Numero : ");
            numbers[i] = input.nextInt();
        }
        System.out.println(showOrderNumber(numbers));
    }

    public static List<Integer> showOrderNumber(int[] numbers){
        return Arrays.stream(numbers)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    }
    
}
