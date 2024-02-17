package lesson22.homework.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    void add(Product product) {
        products.add(product);
    }

    void delete(Product product) {
        products.remove(product);
    }

    void mostExpensiveProduct() {
        Product productt = null;
        double max = 0;
        for (Product product : products) {
            double cost = product.getCost();
            if (cost > max) {
                max = cost;
                productt = product;
            }
        }
        System.out.println("Самый дорогой товар: " + productt.getName() + ", цена: " + productt.getCost());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
