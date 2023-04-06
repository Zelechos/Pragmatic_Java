package exercise_01;

public class BasicExceptionSyntax {

    public static void main(String[] args) {

        int result = 0;

        try {
            result = Arithmetic.division(10, 0);
        } catch(ExceptionOperation e){
            System.out.println("Ocurrio una excepcion de tipo ExceptionOperation");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio una excepcion de tipo Exception");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("se proceso la division correctamente");
        }
        System.out.println(result);
    }
}
