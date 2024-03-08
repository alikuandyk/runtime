package lesson29.homework3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> monthlyReports = new HashMap<>();

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    monthlyReports.put("Январь", count("src/lesson29/homework3/csv_files/m.202101.csv"));
                    monthlyReports.put("Февраль", count("src/lesson29/homework3/csv_files/m.202102.csv"));
                    monthlyReports.put("Март", count("src/lesson29/homework3/csv_files/m.202103.csv"));

                    System.out.println("Все месяцы успешно были считаны");
                }
                case 2 -> {}
                case 3 -> {
                        if (monthlyReports == null) {
                            System.out.println("Для начало необходимо прочитать файл");
                            break;
                        }
                        if (check(monthlyReports)) {
                            System.out.println("Сверка прошла успешно");
                        } else {
                            System.out.println("Сверка не прошла");
                        }
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

    static void displayAllMonthlyReports() throws IOException {
        Reader readerJan = new FileReader("src/lesson29/homework3/csv_files/m.202101.csv");
        BufferedReader bufferedReaderJan = new BufferedReader(readerJan);
        bufferedReaderJan.readLine();

        List<Item> listJan = new ArrayList<>();

        while (bufferedReaderJan.ready()) {
            String line = bufferedReaderJan.readLine();
            String[] arrayOfBf = line.split(",");

            listJan.add(new Item(arrayOfBf[0],
                    Boolean.parseBoolean(arrayOfBf[1]),
                    Integer.parseInt(arrayOfBf[2]),
                    Integer.parseInt(arrayOfBf[3])));
        }

        Item income = new Item("", true, 0, 0);
        Item expenses = new Item("", true, 0, 0);
        for (int i = 0; i < listJan.size(); i++) {
            Item item = listJan.get(i);
            if (item.isExpensive) {
                if (item.compareTo(expenses) > 0) {
                    expenses = item;
                }
            } else {
                if (item.compareTo(income) > 0) {
                    income = item;
                }
            }
        }

        System.out.println("Январь");
        System.out.println("Самый прибыльный товар: " + income.itemName + "(" + income.sum + ")");
        System.out.println("Самая большая трата: " + expenses.itemName + "(" + expenses.sum + ")");
    }

    public static Integer count(String source) throws IOException {
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

        int income = 0;
        int expenses = 0;
        int calculation;

        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(0);
            if (item.isExpensive) {
                double sum = item.quantity * item.unitPrice;
                expenses += sum;
            } else {
                double sum = item.quantity * item.unitPrice;
                income += sum;
            }
        }

        calculation = income - expenses;

        return calculation;
    }

    public static Boolean check(Map<String, Integer> map) throws IOException {
        boolean checkAllMonth = true;

//        Проверка счета января

        Reader readerJan = new FileReader("src/lesson29/homework3/csv_files/m.202101.csv");
        BufferedReader bufferedReaderJan = new BufferedReader(readerJan);
        bufferedReaderJan.readLine();

        int income = 0;
        int expenses = 0;
        int calculation;

        while (bufferedReaderJan.ready()) {
            String line = bufferedReaderJan.readLine();
            String[] arrayOfBf = line.split(",");

            Item item = new Item(arrayOfBf[0],
                    Boolean.parseBoolean(arrayOfBf[1]),
                    Integer.parseInt(arrayOfBf[2]),
                    Integer.parseInt(arrayOfBf[3]));

            if (item.isExpensive) {
                double sum = item.quantity * item.unitPrice;
                expenses += sum;
            } else {
                double sum = item.quantity * item.unitPrice;
                income += sum;
            }
        }

        calculation = income - expenses;
        if (map.get(0) == calculation) {
            checkAllMonth = true;
        } else {
            checkAllMonth = false;
        }

//        Проверка счета февраля

        Reader readerFeb = new FileReader("src/lesson29/homework3/csv_files/m.202102.csv");
        BufferedReader bufferedReaderFeb = new BufferedReader(readerFeb);
        bufferedReaderFeb.readLine();

        income = 0;
        expenses = 0;
        calculation = 0;

        while (bufferedReaderFeb.ready()) {
            String line = bufferedReaderFeb.readLine();
            String[] arrayOfBf = line.split(",");

            Item item = new Item(arrayOfBf[0],
                    Boolean.parseBoolean(arrayOfBf[1]),
                    Integer.parseInt(arrayOfBf[2]),
                    Integer.parseInt(arrayOfBf[3]));

            if (item.isExpensive) {
                double sum = item.quantity * item.unitPrice;
                expenses += sum;
            } else {
                double sum = item.quantity * item.unitPrice;
                income += sum;
            }
        }

        calculation = income - expenses;
        if (map.get(1) == calculation) {
            checkAllMonth = true;
        } else {
            checkAllMonth = false;
        }

//        Проверка счета марта

        Reader readerMar = new FileReader("src/lesson29/homework3/csv_files/m.202103.csv");
        BufferedReader bufferedReaderMar = new BufferedReader(readerMar);
        bufferedReaderMar.readLine();

        income = 0;
        expenses = 0;
        calculation = 0;

        while (bufferedReaderMar.ready()) {
            String line = bufferedReaderMar.readLine();
            String[] arrayOfBf = line.split(",");

            Item item = new Item(arrayOfBf[0],
                    Boolean.parseBoolean(arrayOfBf[1]),
                    Integer.parseInt(arrayOfBf[2]),
                    Integer.parseInt(arrayOfBf[3]));

            if (item.isExpensive) {
                double sum = item.quantity * item.unitPrice;
                expenses += sum;
            } else {
                double sum = item.quantity * item.unitPrice;
                income += sum;
            }
        }

        calculation = income - expenses;
        if (map.get(2) == calculation) {
            checkAllMonth = true;
        } else {
            checkAllMonth = false;
        }

        return checkAllMonth;
    }
}
