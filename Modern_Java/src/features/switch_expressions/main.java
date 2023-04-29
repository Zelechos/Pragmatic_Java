package features.switch_expressions;

public class main {

    public static void main(String[] args) {

//       el switch al usar expresiones lambda espera devolver algo como un returnn implicito

//        Example 1
        String languageProgramming = "";
        String language;

        switch (languageProgramming) {
            case "Java" -> language = "System.out.println(\"hello\");";
            case "Python" -> language = "print('Hello')";
            default -> language = "error";
        }

        System.out.println(language);

//      Example 2
        int number = 2;
        System.out.println(switch (number) {
            case 0 -> 0;
            case 1 -> 9;
            case 2 -> "the number is 2";
            case 3 -> true;
            default -> 1;
        });

//      Example 3

    }

}
