import exercise_000.ConvolutionalNeuralNetwork;
import exercise_000.NeuralNetwork;
import exercise_000.RecurrentNeuralNetwork;
import generics.Code;
import generics.GenericClass;

import java.util.*;

/**
 *
 *
 * @author Alex T.H.
 * @version v0.2.3
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Los "Generics" en Java son una característica que permite escribir clases y métodos
         * que pueden ser utilizados con diferentes tipos de datos, sin tener que repetir
         * el código para cada tipo de dato.
         *
         * Existen una serie de convenciones para nombrar a los genéricos:
         *
         * E – Element (usado bastante por Java Collections Framework)
         * K – Key (Llave, usado en mapas)
         * V – Value (representa el valor, también se usa en mapas)
         * N – Number (para números)
         * T – Type (Representa un tipo, es decir, una clase)
         * S,U,V etc. – usado para representar otros tipos.
         */

        GenericClass<Integer> objectOne = new GenericClass<>(99);
        objectOne.getType();

        GenericClass<String> objectTwo = new GenericClass<>("Ether");
        objectTwo.getType();

        Code code = new Code("Java", 1996);
        System.out.println(code);

        GenericClass<Code> objectCode = new GenericClass<>(code);
        objectCode.getType();


        System.out.println("---------------------- Collections with generics ------------------------");

        List<String> simpleList = new ArrayList<>();
        simpleList.add("Comodore");
        simpleList.add("Pentium");
        simpleList.forEach(System.out::println);


        Set<Boolean> simpleSet = new HashSet<>();
        simpleSet.add(false);
        simpleSet.add(true);

        simpleSet.forEach(System.out::println);

        var users = new HashMap<>();
        users.put("id", 12);
        users.put("name", "Alan");
        users.put("lastname", "Turing");
        users.put("isEngineer", true);
        System.out.println(users);


        System.out.println("---------------------- Classes with Generics ------------------------");

        ConvolutionalNeuralNetwork cnn = new ConvolutionalNeuralNetwork();
        NeuralNetwork<ConvolutionalNeuralNetwork> nn = new NeuralNetwork<>(cnn);
        nn.train();

        RecurrentNeuralNetwork rnn = new RecurrentNeuralNetwork();
        NeuralNetwork<RecurrentNeuralNetwork> nn_001 = new NeuralNetwork<>(rnn);
        nn_001.train();

    }
}