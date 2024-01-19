package lesson7.homework;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i : nums) {
            if (i % 2 == 0) {
                System.out.println(i + " - четное число");
            }
        }
    }
}
