package lesson4.homework.task8;

public class orderPrice {
    public static void main(String[] args) {
        System.out.println("Общая стоимость заказа: " + calculateOrderPrice("Суп", 3));
    }

    static double calculateOrderPrice(String dishType, int quantity) {
        switch (dishType) {
            case "Суп":
                return 3000 * quantity;
            case "Главное блюдо":
                return 5000 * quantity;
            case "Десерт":
                return 2000 * quantity;
            default:
                return -1;
        }
    }
}