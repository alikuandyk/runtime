package lesson7.homework;

public class Task9 {
    public static void main(String[] args) {
//        int y = 7;
//        for (int x = 1; x < 8; x++) {
//            y++;
//            if (x > 4) {
//                System.out.print(++y + " "); }
//            if (y > 14) {
//                System.out.println("x = " + x);
//                break; }
//        }

//        int x = 0;
//        int y = 30;
//        for (int outer = 0; outer < 3; outer++) {
//            for (int inner = 4; inner > 1; inner--) {
//                x = x + 0;
//                y = y - 2;
//                if (x == 6) {
//                    break; }
//                x = x + 3; }
//            y = y - 2; }
//        System.out.println(x + " " + y);

        int[] nums = {3, 5, 6, 9, 12, 17};
        int sum = 0;

        for (int i : nums) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
