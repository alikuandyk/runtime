package lesson3.homework.task3;

class Example {
    static boolean isPrime(int number) {
        if (number > 1) {
            if (number == 2 || number == 3 || number == 5 || number == 7) {
                System.out.println(number + " - простое число");
                return true;
            } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                System.out.println(number + " - не является простым числом");
                return false;
            } else {
                System.out.println(number + " - простое число");
                return true;
            }
        } else {
            System.out.println("Некорректный ввод");
            return false;
        }
    }
}
