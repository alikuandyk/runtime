package lesson29.homework2;

import lesson29.homework.months.January;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<List<Item>> monthlyReports = new ArrayList<>();

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    List<Item> listJanuary = count("src/lesson29/homework2/csv_files/m.202101.csv");
                    monthlyReports.add(listJanuary);

                    List<Item> listFebruary = count("src/lesson29/homework2/csv_files/m.202102.csv");
                    monthlyReports.add(listFebruary);

                    List<Item> listMarch = count("src/lesson29/homework2/csv_files/m.202103.csv");
                    monthlyReports.add(listMarch);

                    System.out.println("Все месяцы успешно были считаны");
                }
                case 2 -> {}
                case 3 -> {

                }
                case 4 -> {}
                case 5 -> {}
                case 0 -> {
                    return;
                }
            }

            System.out.println();
        }
    }

    static void displayMenu() {
        System.out.println("1. Считать все месячные отчёты");
        System.out.println("2. Считать годовой отчёт");
        System.out.println("3. Сверить отчёты");
        System.out.println("4. Вывести информацию обо всех месячных отчётах");
        System.out.println("5. Вывести информацию о годовом отчёте");
        System.out.println("0. Выход");
    }

    public static List<Item> count(String source) throws IOException {
        Reader reader = new FileReader(source);
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();

        List<Item> list = new ArrayList<>();

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] arrayOfBf = line.split(",");

            list.add(new Item(arrayOfBf[0],
                    Boolean.parseBoolean(arrayOfBf[1]),
                    Integer.parseInt(arrayOfBf[2]),
                    Integer.parseInt(arrayOfBf[3])));
        }

        return list;
    }

    public static Boolean check(List<List<Item>> list) throws IOException {
        Reader readerJan = new FileReader("src/lesson29/homework2/csv_files/m.202101.csv");
        BufferedReader bufferedReaderJan = new BufferedReader(readerJan);
        bufferedReaderJan.readLine();

        int i = 0;

//        List<Item> list = new ArrayList<>();

        while (bufferedReaderJan.ready()) {
            String line = bufferedReaderJan.readLine();
            String[] arrayOfBf = line.split(",");



//            list.add(new Item(arrayOfBf[0],
//                    Boolean.parseBoolean(arrayOfBf[1]),
//                    Integer.parseInt(arrayOfBf[2]),
//                    Integer.parseInt(arrayOfBf[3])));
        }

        return false;
    }
}
