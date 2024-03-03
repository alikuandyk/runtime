package lesson27.classwork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите дату: ");
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();
//
//        LocalDate date = LocalDate.of(year, month, day);
//        LocalDate now = LocalDate.now();
//
//        if (date.isBefore(now)) {
//            System.out.println("Это дата в прошлом");
//        } else if (date.isAfter(now)){
//            System.out.println("Это дата в будущем");
//        } else {
//            System.out.println("Это текущая дата");
//        }

//        LocalDateTime start = LocalDateTime.of(2025, 6, 1, 8, 30);
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " смена. Начало: " + start + ", конец: " + start.plusHours(5));
//            start = start.plusHours(5);
//        }

        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy.");

        LocalDateTime dateTimeFromString = LocalDateTime.parse(input, formatter);
        LocalDate localDate = LocalDate.from(dateTimeFromString);
        LocalTime localTime = LocalTime.from(dateTimeFromString);

        Period period = Period.between(LocalDate.now(), localDate);
        Duration duration = Duration.between(LocalTime.now(), localTime);

        System.out.println("Прошло " + (0 - period.getYears()));
        System.out.println(period.getMonths() + " месяцев");
        System.out.println((0 - period.getDays()) + " дней");
        System.out.println(0 - duration.toHours() + " часов");
        System.out.println(0 - duration.toMinutesPart() + " минут");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm");
        System.out.println(dateTimeFromString.format(formatter1));
    }
}
