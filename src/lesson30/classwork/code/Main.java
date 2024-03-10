package lesson30.classwork.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReportEngine reportEngine = new ReportEngine();

        reportEngine.readMonthFiles();

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    reportEngine.readMonthFiles();
                    System.out.println("Все месяцы успешно были считаны");
                    reportEngine.display();
                }
                case 2 -> {
                    reportEngine.readYearFiles();
                    System.out.println("Год был успешно считан");
                }
                case 3 -> {
                    if (reportEngine.getYearlyReportProfit() == 0) {
                        System.out.println("Для начало необходимо прочитать файл");
                        break;
                    }
                    reportEngine.check();
                }
                case 4 -> {
                    FileToData fileToData = new FileToData();
                    fileToData.displayInformationAboutAllMonthlyReports();
                }
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
