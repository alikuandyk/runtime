package lesson4.classwork;

public class Practice3 {
    public static void main(String[] args) {
        int itemPrice = 300;
        int moneyGiven = 500;

        calculateChange(itemPrice, moneyGiven);
    }

    static double calculateChange(double itemPrice, double moneyGiven) {
        if (moneyGiven > itemPrice) {
            double a = moneyGiven - itemPrice;
            System.out.println("сумма сдачи: " + a);
            return a;
        } else if (moneyGiven == itemPrice) {
            return 0;
        } else {
            return 0;
        }
    }
}
