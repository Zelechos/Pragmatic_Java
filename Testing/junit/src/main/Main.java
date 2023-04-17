package main;

import dev.test.junit.Order;
import dev.test.junit.Product;

public class Main {
    public static void main(String[] args) {

/**
 * Es ta es la manera tipica que tenemos los devs de hacer tests esto no significa
 * que este mal pero se puede hacer mejor con Junit y otros framworks.
 */

        var product1 = new Product("p1", 1000);
        var product2 = new Product("p2", 500);
        var product3 = new Product("p3", 500);

        Order order = new Order();
        order.add(product1);
        order.add(product2);
        order.add(product3);

        System.out.println(order.amount());
        System.out.println(order.total());
        order.show();
        order.empty();
        order.show();


    }
}
