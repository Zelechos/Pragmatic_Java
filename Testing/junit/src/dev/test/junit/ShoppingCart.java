package dev.test.junit;

public interface ShoppingCart {
    void add(Product product);

    void empty();

    int amount();

    double total();

    void show();

}
