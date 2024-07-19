package exercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Practice Collections & Lists, Sets, Maps
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 * @exercise Exercise 002 : Dado 10 numeros en un arreglo,  realizar la media de numeros positivos,
   la media de los negativos y contar el numero de ceros que hay en el arreglo
 */
public class Exercise_002 {

    public static void main(String[] args) {

        double[] numbers = {1, 56, 5, 10, 0, 0, 0, 0, 0, -5, -4, -6, 9, -89};
        getInfoOfResponse(numbers);
    }

    public static void getInfoOfResponse(double[] numbers) {
        Map<String, Double> info = new LinkedHashMap<>();

        Predicate<Double> predicateToNegatives = number -> number < 0.0;
        Predicate<Double> predicateToPositives = number -> number > 0.0;
        Predicate<Double> predicateToZeros = number -> number == 0.0;

        info.put("Media Positivos : ", half(numbers, predicateToPositives));
        info.put("Media Negativos : ", half(numbers, predicateToNegatives));
        info.put("Cantidad de Ceros : ", numberOfZeros(numbers, predicateToZeros));

        info.forEach((key, value) -> {
            System.out.println(key + " => " + value);
        });

    }

    public static Double half(double[] numbers, Predicate<Double> predicate) {
        Double sum = Arrays.stream(numbers)
                .boxed()
                .filter(predicate)
                .mapToDouble(Double::doubleValue)
                .sum();
        Double size = (double) Arrays.stream(numbers)
                .boxed()
                .filter(predicate)
                .toList()
                .size();
        return sum / size;
    }

    public static Double numberOfZeros(double[] numbers, Predicate<Double> predicate) {
        return (double) Arrays.stream(numbers)
                .boxed()
                .filter(predicate)
                .toList()
                .size();
    }

}
