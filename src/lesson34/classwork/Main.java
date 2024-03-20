package lesson34.classwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> languages = List.of("java", "javascript", "rust", "assembler");
//
//        List<String> transformation = languages.stream()
//                .filter(string -> string.length() >= 5)
//                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase())
//                .toList();
//
//        System.out.println(transformation);

        List<Product> products = new ArrayList<>() {{
            add(new Product("Apple Iphone 12", 289_990));
            add(new Product("Apple Iphone 15 Pro", 789_990));
            add(new Product("Huawei P30", 389_990));
            add(new Product("Google Pixel P9", 589_990));
        }};

//        List<Product> appleProducts = products.stream()
//                .filter(str -> str.getName().startsWith("Apple"))
//                .toList();

        List<Product> appleProducts = new ArrayList<>();
        products.stream()
                .peek(product -> {
                    if (product.getName().startsWith("Apple")) {
                        appleProducts.add(product);
                    }
                })
                .toList();

        long size = appleProducts.stream()
                .filter(price -> price.getPrice() > 500_000)
                .count();

        System.out.println(size);
// Необходимо создать список где будет только продукций Apple.
// Оставить только те товары, у которых стоимость от 500 тыс.
// Вывести кол-во
    }
}

class Product {
    private String name;
    private double price;

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
