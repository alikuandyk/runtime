package lesson29.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {

                }
                case 2 -> {}
                case 3 -> {}
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
}
