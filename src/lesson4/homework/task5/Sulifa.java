package lesson4.homework.task5;
import java.util.Scanner;
import java.util.Random;

public class Sulifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите ваш выбор (1 - камень, 2 - ножницы, 3 - бумага): ");
        int myChoice = scanner.nextInt();

        int computerChoice = random.nextInt(1, 4);
        switch (computerChoice) {
            case 1:
                System.out.println("Компьютер выбрал: Камень");
                break;
            case 2:
                System.out.println("Компьютер выбрал: Ножницы");
                break;
            case 3:
                System.out.println("Компьютер выбрал: Бумага");
                break;
        }

        if (myChoice == 1 && computerChoice == 2 || myChoice == 2 && computerChoice == 3 || myChoice == 3 && computerChoice == 1) {
            System.out.println("Вы выиграли!");
        } else if (myChoice == 2 && computerChoice == 1 || myChoice == 3 && computerChoice == 2 || myChoice == 1 && computerChoice == 3) {
            System.out.println("Компьютер выиграл!");
        } else {
            System.out.println("Ничья");
        }
    }
}