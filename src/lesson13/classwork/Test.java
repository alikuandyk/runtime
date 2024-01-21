package lesson13.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User[] users = {
                new User(78237, "Doe"),
                new User(92039, "Smith"),
                new User(62662, "Johns"),
                new User(90290, "Damon")
        };

        Product[] products = {
                new Product("Marshall IV Major", 179),
                new Product("Iphone XR", 269),
                new Product("MacBook Pro", 1219),
                new Product("Nike Air Mag", 199990),
        };

        Order[] orders = new Order[10];

        while (true) {
            System.out.println("1. Совершить заказ");
            System.out.println("2. Вывести все заказы");
            System.out.println("3. Обновить статус заказа");
            System.out.println("0. Завершить");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    int countUser = 1;
                    for (User user : users) {
                        System.out.println(countUser + ". " + user.getName());
                        countUser++;
                    }
                    System.out.println("Выберите пользователя по номеру: ");
                    int choiceUser = scanner.nextInt();

                    int countProduct = 1;
                    for (Product product : products) {
                        System.out.println(countProduct + ". " + product.getName());
                        countProduct++;
                    }
                    System.out.println("Выберите товар по номеру: ");
                    int choiceProduct = scanner.nextInt();

                    Order newOrder = new Order(users[choiceUser - 1], products[choiceProduct - 1], Status.СОЗДАН);
                    for (int i = 0; i < orders.length; i++) {
                        if (orders[i] == null) {
                            orders[i] = newOrder;
                            break;
                        }
                    }
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Заказы: ");
                    for (Order order : orders) {
                        if (order != null) {
                            System.out.println("- Пользователь: " + order.user.getName());
                            System.out.println("- Товар: " + order.product.getName());
                            System.out.println("- Статус: " + order.status);
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
                case 3 -> {
                    int count = 1;
                    System.out.println("Заказы: ");
                    for (Order order : orders) {
                        if (order != null) {
                            System.out.println(count + ". Пользователь: " + order.user.getName());
                            System.out.println("  Товар: " + order.product.getName());
                            System.out.println("  Статус: " + order.status);
                            System.out.println();
                            count++;
                        }
                    }
                    System.out.println();
                    System.out.println("Введите номер заказа: ");
                    int choiceOrder = scanner.nextInt();

                    int countStatus = 1;
                    for (int i = 0; i < Status.values().length; i++) {
                        System.out.println(countStatus + ". " + Status.values()[i]);
                        countStatus++;
                    }
                    System.out.println("Введите номер статуса: ");
                    int choiceStatus = scanner.nextInt();

                    Order order = orders[choiceOrder - 1];
                    Status status = Status.values()[choiceStatus - 1];

                    System.out.println("Статус заказа был изменен " + "'" + order.status + "' -> '" + status + "'");
                    order.status = status;
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
}
