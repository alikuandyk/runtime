package lesson10.homework.task2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber > 12) { // Инвертируйте условие
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            } else {
                break;
            }
        }
        String season = getSeasonByNumber(monthNumber);

        if (season.equals("Лето")) {
            System.out.println("Летом лучше остаться в Астане.");
            return;
            /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Астане.");
              и завершать выполнение программы */
        }


        System.out.println("Укажите стоимость прямых билетов из Астаны в Париж:");
        int ticketAstanaParis = scanner.nextInt();

        System.out.println("Укажите стоимость билетов из Астаны в Париж с пересадкой в Лондоне:");
        int ticketAstanaLondonParis = scanner.nextInt();

        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();


        // В этом ветвлении что-то напутано с условиями - исправьте это
        // Перенесите проверку на "Лето" в ветвление выше
        if (ticketAstanaLondonParis <= ticketAstanaParis) {
            if (britainVisa == 1) { // Упростите это условие
                System.out.println("Летим через Лондон!");
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
        } else {
            System.out.println("Летим напрямую в Париж!");
        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        // Допишите условия ветвления в виде утверждений
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "Зима";
        } else if (monthNumber > 2 && monthNumber < 6) {
            return "Весна";
        } else if (monthNumber > 5 && monthNumber < 9) {
            return "Лето";
        } else if (monthNumber > 8 && monthNumber < 12) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}
