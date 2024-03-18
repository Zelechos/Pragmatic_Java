package difficult.exercises.exercise_002.src.com.eccommerce;

/**
 * Exercise 002
 *
 * @author Alex T.H.
 * @version v0.4.2
 * @since 21.0.0 2024-03-18
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private static int productsCounter;

    private Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getProductsCounter() {
        return productsCounter;
    }

    public static void setProductsCounter(int productsCounter) {
        Product.productsCounter = productsCounter;
    }
}
