package lesson39.classwork;

public class DiscountCalculator {
    public double calculateSum(double price) {
        if (price <= 100_000 && price > 0) {
            return price * 0.98;
        } else if (price > 100_000 && price <= 200_000) {
            return price * 0.97;
        } else if (price == 0 || price == -1) {
            throw new IllegalArgumentException("че то там");
        }

        return price;
    }
}
