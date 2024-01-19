package lesson7.homework;

public class Task10 {
    public static void main(String[] args) {
        int[] nums = {2, 9, 4, 5, 7};
        int max = 0;
        int min = 0;
        int different;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Разница: " + (max - min));
    }
}