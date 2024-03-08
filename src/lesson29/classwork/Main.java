package lesson29.classwork;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/products");
        BufferedReader bf = new BufferedReader(reader);
        bf.readLine();

        List<Product> products = new ArrayList<>();

        while (bf.ready()) {
            String line = bf.readLine();
            String[] strings = line.split(",");
            products.add(new Product(strings[0], Integer.parseInt(strings[1])));
        }

        Product expensive = products.get(0);
        Product cheapest = products.get(0);
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).compareTo(expensive) > 0) {
                cheapest = products.get(i);
            } else if (products.get(i).compareTo(cheapest) < 0) {
                cheapest = products.get(i);
            }
        }

        System.out.println("Самый дорогой товар: " + expensive.getName() + ", " + expensive.getPrice());
        System.out.println("Самый дешевый товар: " + cheapest.getName() + ", " + cheapest.getPrice());

//        Reader readerOfJanuary = new FileReader("src/lesson29/homework/m.202101.csv");
//        BufferedReader bufferedReaderOfJanuary = new BufferedReader(readerOfJanuary);
//        bufferedReaderOfJanuary.readLine();
//
//        List<January> list = new ArrayList<>();
//
//        while (bufferedReaderOfJanuary.ready()) {
//            String line = bufferedReaderOfJanuary.readLine();
//            String[] arrayOfBf = line.split(",");
//            list.add(new January(arrayOfBf[0],
//                    Boolean.parseBoolean(arrayOfBf[1]),
//                    Integer.parseInt(arrayOfBf[2]),
//                    Integer.parseInt(arrayOfBf[3])));
//        }
    }
}
