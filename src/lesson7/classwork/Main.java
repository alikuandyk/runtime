package lesson7.classwork;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
//
//        expenses[2] += 450;
//        System.out.println("Новое значение расходов за среду: " + expenses[2] + " тенге.");
//
//        double sum = expenses[1] + expenses[4] + expenses[5];
//        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
//        System.out.println("Всего вы потратили в эти дни: " + sum + " тенге.");

//        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Расходы за неделю хранятся под индексами от 1 (пн) до 7 (вс).");
//        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");
//
//        // Объявите переменную, которая будет хранить индекс выбранного элемента
//        int index = scanner.nextInt();
//
//        System.out.println("Введите новую сумму трат за этот день:");
//        // Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
//        double newCost = scanner.nextDouble();
//
//        // Замените значение элемента с нужным индексом на новое
//        expenses[index - 1] += newCost;
//        System.out.println("За день с индексом " + index + " размер трат теперь " + newCost);
//        System.out.println(Arrays.toString(expenses));

//        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
//        System.out.println("Вы продегустировали пять блюд.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите индекс блюда, которое хотите переместить:");
//        System.out.println("0-Ризотто");
//        System.out.println("1-Тартар");
//        System.out.println("2-Шурпа");
//        System.out.println("3-Панна-котта");
//        System.out.println("4-Сашими");
//
//        // Считайте из консоли индекс блюда, которое нужно переместить
//        int firstIndex = scanner.nextInt();
//
//        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
//        // Объявите переменную secondIndex для нового положения (индекса) блюда, считайте его из консоли
//        int secondIndex = scanner.nextInt();
//
//        // Сохраните значение блюда под индексом firstIndex в переменную swap
//        String swap = dishes[firstIndex];
//
//        // Присвойте блюду с индексом firstIndex значение блюда под индексом secondIndex
//        dishes[firstIndex] = dishes[secondIndex];
//
//        // Присвойте блюду с индексом secondIndex значение переменной swap
//        dishes[secondIndex] = swap;
//
//        System.out.println("Ваш рейтинг блюд:");
//        System.out.println(dishes[0]);
//        System.out.println(dishes[1]);
//        System.out.println(dishes[2]);
//        System.out.println(dishes[3]);
//        System.out.println(dishes[4]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }
//        for (int i = numbers.length / 2; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        for (int i = numbers.length - 3; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        int sum = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//        System.out.println(sum);

//        int[] nums = new int[10];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = random.nextInt(1, 50);
//        }
//        System.out.println(Arrays.toString(nums));

//        int[] nums = new int[7];
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = random.nextInt(1, 10_000);
//            sum += nums[i];
//            System.out.println("День " + (i + 1) + ". " + "Потрачено тенге: " + nums[i]);
//        }
//        System.out.println("сумма: " + sum);

        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

//        for (int i : nums) {
//            if (i < 2) {
//                System.out.println(i + " - нечетное");
//            } else {
//                for (int j = 2; j < Math.sqrt(i); j++) {
//                    if (j % 2 != 0) {
//                        System.out.println(i + " - нечетное");
//                    } else {
//                        System.out.println(i + " - четное");
//                    }
//                }
//            }
//        }
        int even = 0;
        int odd = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                System.out.println(i + " - четное число");
                even += 1;
            } else {
                System.out.println(i + " - нечетное число");
                odd += 1;
            }
        }
        System.out.println("четные числа " + even);
        System.out.println("нечетные числа " + odd);
    }
}

