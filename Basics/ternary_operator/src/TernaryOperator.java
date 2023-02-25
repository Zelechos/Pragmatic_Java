public class TernaryOperator {

    public static void main(String[] args) {

//        Condicional con operador ternario
        var number = 9;
        var result = (number % 2 == 0) ? "es Par" : "Es Impar";
        System.out.println(result);

        var password = "code";
        var check = password.equals("java") ? "access granted" : "access denied";
        System.err.println(check);
    }
}
