package lesson4.homework.task1;

public class CarRentalService {
    public static void main(String[] args) {
        CarRentalService rental = new CarRentalService();

        double sout = processRentalOrder("Бизнес", 10, "Дальний");

        System.out.println("Итоговая стоимость аренды (с учетом налога и скидки): " + sout);
    }

    static double calculateRentalPrice(String model, int days) {
        double rental;

        switch (model) {
            case "Эконом":
                rental = 10_000;
                return days * rental;
            case "Бизнес":
                rental = 20_000;
                return days * rental;
            case "Премиум":
                rental = 30_000;
                return days * rental;
            default:
                return 0;
        }
    }

    static double calculateDeliveryCost(String region) {
        double deliveryCost;

        switch (region) {
            case "Город":
                deliveryCost = 0;
                return deliveryCost;
            case "Ближний":
                deliveryCost = 5000;
                return deliveryCost;
            case "Дальний":
                deliveryCost = 10_000;
                return deliveryCost;
            default:
                return 0;
        }
    }

    static double calculateTax(String region, double price) {
        double tax;

        switch (region) {
            case "Город":
                tax = 0.12;
                return price * tax;
            case "Ближний":
                tax = 0.1;
                return price * tax;
            case "Дальний":
                tax = 0.08;
                return price * tax;
            default:
                return 0;
        }
    }

    static double processRentalOrder(String model, int days, String region) {
        double rentalPrice = calculateRentalPrice(model, days);
        double deliveryCost = calculateDeliveryCost(region);
        double tax = calculateTax(region, rentalPrice);

        double sum = rentalPrice + deliveryCost + tax;
        double discount = days > 14 ? 0.1 : 0.05;

        double totalPrice = sum * (1 - discount);

        return totalPrice;
    }
}