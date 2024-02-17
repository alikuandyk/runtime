package lesson22.homework.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            numbers.add(number);
        }

        int sum = 0;
        int max = 0;
        int min = numbers.get(0);
        for (Integer number : numbers) {
            sum += number;
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Элементы списка: " + numbers);
        System.out.println("Количество элементов: " + numbers.size());
        System.out.printf("Сумма чисел: %d\n", sum);
        System.out.printf("Наибольший элемент: %d\n", max);
        System.out.printf("Наименьший элемент: %d\n", min);
        System.out.printf("Среднее значения: %d", sum / numbers.size());

        Collections.sort(numbers);
        System.out.println("Сортированный список: " + numbers);
    }
}
