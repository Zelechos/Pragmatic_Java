/**
 * Class to Learn about UnaryOperators in Java
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 20.0.0 2023-03-22
 */
public class UnaryOperators {

    public static void main(String[] args) {

//      Operator of Denial
        var isHacker = true;
        var confirmation = !isHacker;

        System.out.println(isHacker); // true
        System.out.println(confirmation); //false

//     Operator of Post-Increment
        var age = 10;
        var ageNow = age++;
        System.out.println(age);// 11
        System.out.println(ageNow);// 10

//     Operator of Pre-Increment
        var products = 9;
        var productsNow = ++products;
        System.out.println(products);// 10
        System.out.println(productsNow);// 10

    }

}
