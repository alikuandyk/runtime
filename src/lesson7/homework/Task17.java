package lesson7.homework;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int count = 0;
        int a = 0;
        int b = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            a = nums[i];
            b = nums[count];
            nums[count] = a;
            nums[i] = a;
            count++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
