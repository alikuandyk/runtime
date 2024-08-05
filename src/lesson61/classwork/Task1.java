package lesson61.classwork;

public class Task1 {
    public static void main(String[] args) {
        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
        comfortCount(may2022);

        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
        comfortCount(may2023);
    }

    public static void comfortCount(int[] array) {
        int days = 0;

        for (int i : array) {
            if (i >= 20 && i <= 25) {
                days++;
            }
        }

        System.out.println(days);
    }

}
