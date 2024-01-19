package lesson2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 100) {
//            if (num % 3 == 0) {
//                System.out.println(num);
//            }
//            num++;
//        }

//        for (int i = 70; i >= 0; i -= 7) {
//            System.out.println("До старта SapceY осталось " + i);
//        }
//        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");

//        int money = 2000;

//        for (int num = 1; num <= 5; num++) {
//            System.out.println("День " + num + ". Уже " + money + " тенге");
//            money += 200;
//        }

//        int day = 0;
//        for (int i = 3; i <= 15; i+=3) {
//            System.out.println("На " + i + "-й день останется " + money + "тенге");
//            money -= 500;
//            day = i;
//        }
//        System.out.println("Денег хватит на " + day + " дней.");

//        for (int i = 1; i < 31; i++) {
//            System.out.println("День " + i);
//            for (int j = 1; j < 4; j++) {
//                System.out.println("Серия " + j);
//            }
//            System.out.println();
//        }

//        int a  = 0;
//        for (int floor = 1; floor < 11; floor++) {
//            for (int flat = 1; flat < 6; flat++) {
//                a++;
//                System.out.println("Этаж " + floor + " куартира " + a);
//            }
//        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Сколько денег у вас сейчас: ");
        double balance = scan.nextDouble();
        int years = 0;

        while (balance < 1_000_000) {
            balance += (balance * 0.05);
            years++;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");
    }
}
