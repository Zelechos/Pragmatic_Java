package exercise_01;

public class BasicExceptionSyntax {

    public static void main(String[] args) {

        int result = 0;

        try {
            result = Arithmetic.division(10,0);
        } catch (Exception e) {
            System.out.println("Ocurrio una excepcion");
            e.printStackTrace(System.out);
        }
        System.out.println(result);
    }
}
