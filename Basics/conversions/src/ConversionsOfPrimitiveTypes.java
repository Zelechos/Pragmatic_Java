public class ConversionsOfPrimitiveTypes {

    public static void main(String[] args) {

//        Convertir un String a int
        var age = Integer.parseInt("20");
        System.out.println(age);

//        Convertir un String a double
        var pi = Double.parseDouble("3.1416");

//        Convertir un int a String
        var ageText = String.valueOf(10);

//        Traer un char de un String
        var character = "hello".charAt(0);
    }
}
