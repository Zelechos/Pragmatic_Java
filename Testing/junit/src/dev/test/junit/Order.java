package dev.test.junit;

import java.util.ArrayList;
import java.util.List;

public class Order implements  ShoppingCart, Payable{

    private final List<Product> products = new ArrayList<>();


    @Override
    public void add(Product product) {
        this.products.add(product);
    }

    @Override
    public void empty() {
        this.products.clear();
    }

    @Override
    public int amount() {
        return this.products.size();
    }

    @Override
    public double total() {
        return this.products.stream()
                .map(Product::price)
                .reduce((double) 0, Double::sum);
    }

    @Override
    public void show() {
        this.products.forEach(System.out::println);

    }
}
