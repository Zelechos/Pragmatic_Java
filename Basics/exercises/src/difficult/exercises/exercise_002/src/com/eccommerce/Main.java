package difficult.exercises.exercise_002.src.com.eccommerce;

/**
 * Exercise 002
 *
 * @author Alex T.H.
 * @version v0.4.2
 * @since 21.0.0 2024-03-18
 */
public class Main {
    public static void main(String[] args) {
        
        Product product001 = new Product("KeyBoard", 34.4561);
        Product product002 = new Product("Screen", 456.99);
        Product product003 = new Product("Mouse", 7.99);
        Product product004= new Product("Programming Language", 457.99);
        Order order = new Order();
        order.addProduct(product001);
        order.addProduct(product002);
        order.addProduct(product003);
        order.addProduct(product004);
        order.showOrder();
    }
}
