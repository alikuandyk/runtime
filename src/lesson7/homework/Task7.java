package lesson7.homework;

public class Task7 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i : nums) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительные числа: " + positiveCount);
        System.out.println("Отрицательные числа: " + negativeCount);
    }
}
