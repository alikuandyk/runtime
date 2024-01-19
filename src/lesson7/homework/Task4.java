package lesson7.homework;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1) {
                continue;
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}
