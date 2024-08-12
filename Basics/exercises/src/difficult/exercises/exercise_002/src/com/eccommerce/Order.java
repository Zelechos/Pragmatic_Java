package difficult.exercises.exercise_002.src.com.eccommerce;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 002
 *
 * @author Alex T.H.
 * @version v0.4.2
 * @since 21.0.0 2024-03-18
 */
public class Order {

    private static int orderCounter;
    private static int maxProducts = 10;
    private int id;
    private List<Product> products = new ArrayList<>();

    public Order() {
        if (Order.orderCounter <= 10) {
            this.id = Order.orderCounter++;
        }
    }

    public static int getOrderCounter() {
        return orderCounter;
    }

    public static void setOrderCounter(int orderCounter) {
        Order.orderCounter = orderCounter;
    }

    public static int getMaxProducts() {
        return maxProducts;
    }

    public static void setMaxProducts(int maxProducts) {
        Order.maxProducts = maxProducts;
    }

    public void addProduct(Product product) {
        if (this.products.size() <= maxProducts) {
            this.products.add(product);
        }
    }

    public double calculateTotal() {
        return this.getProducts().stream().mapToDouble(Product::getPrice).sum();
    }

    public void showOrder() {
        System.out.println("N Order : " + this.id);
        System.out.println("Products : ");
        System.out.println("---------------------------------------------");
        StringBuilder space = new StringBuilder().repeat(" ", 20);
        System.out.println("Name" + space + "Price");
        this.getProducts().stream().forEach((product) -> {
            StringBuilder fields = new StringBuilder().repeat(" ", (24 - product.getName().length()));
            System.out.println(product.getName() + fields + product.getPrice());
        });
        StringBuilder totalSpace = new StringBuilder().repeat(" ", 16);
        System.out.println("Total =>"+totalSpace+ this.calculateTotal());
        System.out.println("---------------------------------------------");
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
