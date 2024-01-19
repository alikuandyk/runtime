package lesson5.classwork;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Product product1 = new Product();
        Product product2 = new Product();

        account1.owner = "Alisher";
        account1.addition(24_000);

        account2.owner = "Ali";
        account2.addition(24_000);

        product1.name = "Самса";
        product1.price = 300;

        product2.name = "Кола";
        product2.price = 27000;

        account1.payment(product1);
        account1.payment(product2);
        account1.dispay();
    }
}
