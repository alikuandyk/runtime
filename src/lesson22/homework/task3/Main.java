package lesson22.homework.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("smartphones", new ArrayList<>());
        Product product1 = new Product("iphone 15", 500.000, category1);
        Product product2 = new Product("iphone 14", 400.000, category1);

        category1.add(product1);
        category1.add(product2);
        category1.mostExpensiveProduct();
    }
}
