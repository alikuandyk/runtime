package lesson4.homework.task4;
import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размеры шахматной доски: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            String sout = i % 2 != 0 ? oddNumber(size) : evenNumber(size);

            System.out.println(sout);
        }
    }

    static String oddNumber(int boardSize) {
        for (int j = 1; j <= boardSize; j++) {
            String symbol = j % 2 == 0 ? "O" : "X";
            System.out.print(symbol + " ");
        }
        return "";
    }

    static String evenNumber(int boardSize) {
        for (int j = 1; j <= boardSize; j++) {
            String symbol = j % 2 == 0 ? "X" : "O";
            System.out.print(symbol + " ");
        }
        return "";
    }
}