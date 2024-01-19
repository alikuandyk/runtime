package lesson4.homework.task6;
import java.util.Random;

public class MethodManager {
    public static void printRandomNumbers(int count, int min, int max) {
        Random random = new Random();

        for (int i = 1; i <= count; i++) {
            int number = random.nextInt(min, (max + 1));
            System.out.println(number);
        }
    }
}