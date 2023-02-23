public class UnaryOperators {

    public static void main(String[] args) {

//    Operador de negacion
        var isHacker = true;
        var confirmation = !isHacker;

        System.out.println(isHacker); // true
        System.out.println(confirmation); //false

//     Operador de Post-Incremento
        var age = 10;
        var ageNow = age++;
        System.out.println(age);// 11
        System.out.println(ageNow);// 10

//     Operador de Pre-Incremento
        var products = 9;
        var productsNow = ++products;
        System.out.println(products);// 10
        System.out.println(productsNow);// 10

    }


}
