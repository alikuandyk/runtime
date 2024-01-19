package lesson3.homework.task2;

class Example {
    static void month(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("В этом месяце 31 дней");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("В этом месяце 30 дней");
        } else if (month == 2) {
            System.out.println("В этом месяце 28/29 дней");
        } else {
            System.out.println("Некорректный ввод");
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("В этом месяце 31 дней");
        }

    }
}
