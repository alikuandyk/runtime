package lesson2;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        task 1
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите кол-во фильмов: ");
//        int films = scan.nextInt();
//
//        double minutes = 0;
//
//        for (int film = 1; film <= films; film++) {
//            System.out.print("Введите продолжительность фильма в минутах: ");
//            int minute = scan.nextInt();
//            minutes += minute;
//        }
//
//        System.out.print("Общая продолжительность всех фильмов в часах: " + (minutes/60));

//        task 2
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите кол-во ступенек: ");
//        int step = scan.nextInt();

//        for (int i = 1; i <= step; i++) {
//          for (int j = 1; j <= i; j++) {
//              System.out.print("#");
//          }
//          System.out.println();
//        }

//        for (int i = 1; i <= step; i ++) {
//            for (int j = step; j > i; j --) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k ++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= step; i ++) {
//            for (int j = step; j > i; j --) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k ++) {
//                System.out.print("#");
//            }
//            System.out.print(" ");
//            for (int l = 0; l < i; l ++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= step; i++) {
//            for (int j = step; j > i; j --) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k ++) {
//                System.out.print("#");
//            }
//            System.out.print(" ");
//            for (int l = 0; l < i; l ++) {
//                System.out.print("#");
//            }
//            for (int q = i; q < step; q++) {
//                System.out.print(" ");
//            }
//
//            System.out.print(" ");
//
//            for (int j = step; j > i; j --) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k ++) {
//                System.out.print("#");
//            }
//            for (int l = 0; l < i; l ++) {
//                System.out.print("#");
//            }
//
//            System.out.println();
//        }

//        task 3
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int number = scan.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }

//        task 4
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите число для проверки: ");
//        int number = scanner.nextInt();
//
//        if (number == 2 || number == 3 || number == 5 || number == 7) {
//            System.out.println(number + " - " + "простое число");
//        } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
//            System.out.println(number + " - " + "не является простым числом");
//        } else {
//            System.out.println(number + " - " + "простое число");
//        }

//        task 5
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int number = scan.nextInt();
//
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Факториал числа " + number + " равен " + factorial);

//        task 4
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите три целых числа");

////        способ 1
//        Integer min = null;
//
//        for (int i = 0; i < 3; i++) {
//            int num = scanner.nextInt();
//
//            if (min == null || min > num) {
//                min = num;
//            }
//        }

//        способ 2
//        int min = 0;
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//
//        if (num1 < num2 && num1 < num3) {
//            min = num1;
//        } else if (num2 < num1 && num2 < num3) {
//            min = num2;
//        } else if (num3 < num1 && num3 < num2) {
//            min = num3;
//        }
//
//        System.out.println("Наименьшее число: " + min);
    }
}
