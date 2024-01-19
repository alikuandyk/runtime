package lesson7.homework;

public class Task15 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9};
        int different = nums[1] - nums[0];
        String string = "Да";

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] - nums[i - 1] != different) {
                string = "Нет";
                break;
            }
        }

        System.out.println(string);
    }
}