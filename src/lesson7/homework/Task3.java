package lesson7.homework;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = nums.length; i > nums.length / 2; i--) {
            System.out.println(nums[i - 1]);
        }
    }
}
