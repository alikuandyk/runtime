package lesson7.homework;

public class Task12 {
    public static void main(String[] args) {
        int[] nums = {3, 7, 4, 8, 5};
        int max = 0;
        int min = 0;
        int a = 0;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : nums) {
            if (i < max) {
                min = i;
            }
        }
    }
}
