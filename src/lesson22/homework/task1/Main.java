package lesson22.homework.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ages = new ArrayList<>();

        while (true) {
            System.out.print("Введите число: ");
            String age = scanner.nextLine();

            if (age.equals("")) {
                System.out.println(ages);
                return;
            }

            boolean exist = false;
            for (String s : ages) {
                if (s.equals(age)) {
                    System.out.printf("Число %s уже существует\n", age);
                    exist = true;
                    break;
                }
            }

            if (!exist) ages.add(age);
        }
    }
}
