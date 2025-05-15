import java.util.List;
import java.util.ArrayList;

public class Main{

 private static List<Integer> numbers = new ArrayList<>();

public static void main(String[] args) {
  System.out.println("Hello ALex");
  System.out.println(fibonacci(13));
  numbers.stream().forEach(System.out::print);
}

public static int fibonacci(int value) {
  numbers.add(value);
  if (value <= 1) {
    return 0;
  }

  return fibonacci(value - 1) + fibonacci(value - 2);
}

/*
 * Analized the exercise
 *
 * fib(4)
 * v[] = v[4]
 *
 * fib(3) + fib(2)
 * v[4] = v[4,3,2]
 *
 * fib(2) + fib(1) + fib(1) + fib(0)
 * v[4,3,2] = v[4,3,2,2,1,1,0]
 *
 * fib(1) + fib(0) + 0 + 0 + 0
 * v[4,3,2,2,1,1,0]= v[4,3,2,2,1,1,0,1,0]
*/

}
