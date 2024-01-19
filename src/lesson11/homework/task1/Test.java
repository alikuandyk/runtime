package lesson11.homework.task1;

import lesson11.homework.task1.Player;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        do {
            System.out.print("Введите номер слота: ");
            slot = scanner.nextInt();

            // Проверяем, что введенный номер слота не является -1
            if (slot != -1) {
                player.shotWithWeapon(slot);
            }
        } while (slot != -1);

        System.out.println("Игра завершена");
    }
}
