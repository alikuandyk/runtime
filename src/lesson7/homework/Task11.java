package lesson7.homework;

public class Task11 {
    public static void main(String[] args) {
        int[] nums = {4, 7, 9, 12, 15, 16};
        int even = 0;
        int odd = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Кол-во четных чисел: " + even);
        System.out.println("Кол-во не-четных чисел: " + odd);
    }
}