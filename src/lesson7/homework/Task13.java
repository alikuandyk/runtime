package lesson7.homework;

public class Task13 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : nums) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int j) {
        if (j <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}



























