package lesson7.homework;

public class Task14 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int arifm = 0;

        for (int i : nums) {
            arifm += i;
        }

        arifm = arifm / nums.length;

        for (int i : nums) {
            if (i < arifm) {
                System.out.print(i + " ");
            }
        }
    }
}
