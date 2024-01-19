package lesson4.homework.task7;

public class MethodManager {
    static void printPrimeNumber(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
