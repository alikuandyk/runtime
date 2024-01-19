package lesson7.homework;

public class Task16 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8, 16, 3};

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] / nums[i - 1] == 2) {
                System.out.println(nums[i]);
            }
        }
    }
}