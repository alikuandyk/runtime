package lesson18.classwork.task2;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < transports.length; i++) {
//            System.out.println((i + 1) + ". " + transports[i].getName());
//        }
//
//        System.out.print("Какой транспорт хотите переставить? ");
//        int choice1 = scanner.nextInt();
//
//        System.out.print("На какое место? ");
//        int choice2 = scanner.nextInt();
//
//        while (true) {
//            System.out.println("1. Добавить транспорт в гараж");
//            System.out.println("2. Вывести все транспорты");
//            System.out.println("3. Переставить транспорт местами");
//            System.out.println("4. Вывести все транспорты определенного типа");
//            System.out.println("5. Вывести все транспорты которые имеет определнное кол-во колес");
//            System.out.println("Введите: ");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 -> {
//                    for (int i = 0; i < Types.values().length; i++) {
//                        System.out.println((i + 1) + ". " + Types.values()[i]);
//                    }
//                    System.out.println("Введите вид транспорта: ");
//                    int choiceOfTypes = scanner.nextInt();
//
//                    System.out.println("Введите название транспорта: ");
//                    String name = scanner.nextLine();
//
//                    System.out.println("Введите сколько колес у транспорта: ");
//                    int wheels = scanner.nextInt();
//
//                    Transport transport = new Transport(Types.values()[choiceOfTypes - 1], wheels, name);
//
//                }
//            }
//        }
//    }
//}
//
//class Sedan extends Transport {
//    public Sedan(Types type, int numberOfWheels, String name) {
//        super(Types.CAR, 4, "Седан");
//    }
//
//    public void energy() {
//        System.out.printf("Заполняем топливо для седана 92\n");
//    }
//
//    public void signal() {
//        System.out.println("Бип-бип");
//    }
//}
//
//class Garage {
//    private Transport[] transports;
//
//    public void addTransport(Transport transport) {
//        for (int i = 0; i < this.transports.length; i++) {
//            if (this.transports[i] == null) {
//                this.transports[i] = transport;
//            }
//        }
//    }
//
//    public void displayAllTransports() {
//        for (Transport transport : transports) {
//            if (transport != null) {
//                System.out.println("Тип транспорта: " + transport.getType());
//                System.out.printf("Кол-во колес: %d\n", transport.getNumberOfWheels());
//            }
//        }
//    }
//
//    public void rearrangeThePlaces(int choice1, int choice2) {
//
//        Transport transport1 = transports[choice1 - 1];
//        Transport transport2 = transports[choice2 - 1];
//
//        transports[choice2 - 1] = transport1;
//        transports[choice1 - 1] = transport2;
//    }
//}
