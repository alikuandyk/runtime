package lesson4.classwork;

public class Practice2 {
    public static void main(String[] args) {
        int price = 120_000;
        double vatRate = 0.2;
        calculatePriceWithVAT(price, vatRate);
    }

    static void calculatePriceWithVAT(double price, double vatRate) {
        double a = price * (1 - vatRate);
        System.out.println("цена товара с учетом НДС: " + a);
    }
}
