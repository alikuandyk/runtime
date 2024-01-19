package lesson12;

public class TransactionValidator {
    // объявите константы
    static final int minValue = 100;
    static final int maxValue = 100_000;

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    static boolean isValidAmount(double amount) {
        if (amount > maxValue) {
            System.out.println("Максимальная сумма перевода: " + maxValue + " тг. Попробуйте ещё раз!");
            return false;
        } else if (amount < minValue) {
            System.out.println("Минимальная сумма перевода: " + minValue + " тг. Попробуйте ещё раз!");
            return false;
        }

        return true;
    }
}
