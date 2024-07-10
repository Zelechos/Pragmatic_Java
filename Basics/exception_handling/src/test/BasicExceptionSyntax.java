package test;

import java.util.Arrays;
import java.util.Optional;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 */
public class BasicExceptionSyntax {

    public static void main(String[] args) {

        int result = 0;
        Optional<Integer> number = null;

        // Usualmente el try-catch atrapa la primera excepcion que se genera
        try {
            Integer currenteNumber = number.get();
            result = Arithmetic.division(10, 0);
        } catch (ExceptionOperation e) {
            System.out.println("Ocurrio una excepcion de tipo ExceptionOperation");
            System.out.print("Complete Exception => ");
            e.printStackTrace(System.out);
            System.out.println("Exception Message => " + e.getMessage());
            System.out.println("Exception Cause => " + e.getCause());
            System.out.println("Exception LocalizedMessage => " + e.getLocalizedMessage());
            System.out.println("Exception Class => " + e.getClass());
            System.out.print("Exception StackTrace => ");
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Ocurrio una excepcion de tipo Exception");
            System.out.print("Complete Exception => ");
            e.printStackTrace(System.out);
            System.out.println("Exception Message => " + e.getMessage());
            System.out.println("Exception Cause => " + e.getCause());
            System.out.println("Exception LocalizedMessage => " + e.getLocalizedMessage());
            System.out.println("Exception Class => " + e.getClass());
            System.out.print("Exception StackTrace => ");
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);

        } finally {
            System.out.println("se proceso la division correctamente");
        }
        System.out.println(result);
    }
}
