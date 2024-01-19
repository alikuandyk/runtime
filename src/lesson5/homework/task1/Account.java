package lesson5.homework.task1;

public class Account {
    String owner;
    double balance;

    double USD = 457.14;
    double EUR = 503.51;
    double RUB = 4.95;

    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();

        Product product1 = new Product();
        Product product2 = new Product();

        account1.owner = "Ali";
        account1.balance = 23_000;

        product1.name = "Самса";
        product1.price = 350;

        product2.name = "Кола";
        product2.price = 799;

        account1.pay(product2, "EUR");
        account1.pay(product1, "RUB");

        account1.add(3000, "USD");

        account1.transfer(account2, 5000, "USD");

        account1.display();
    }

    void pay(Product product, String currency) {
        if (currency.equals("USD")) {
            balance = (balance / USD) - (product.price / USD);
            balance = balance * USD;
        } else if (currency.equals("EUR")) {
            balance = (balance / EUR) - (product.price / EUR);
            balance = balance * EUR;
        } else if (currency.equals("RUB")) {
            balance = (balance / RUB) - (product.price / RUB);
            balance = balance * RUB;
        }
    }

    void add(double amount, String currency) {
        if (currency.equals("USD")) {
            balance = (balance / USD) + (amount / USD);
            balance = balance * USD;
        } else if (currency.equals("EUR")) {
            balance = (balance / EUR)  + (amount / EUR);
            balance = balance * EUR;
        } else if (currency.equals("RUB")) {
            balance = (balance / RUB)  + (amount / RUB);
            balance = balance * RUB;
        }
    }

    void transfer(Account account, double amount, String currency) {
        if (currency.equals("USD")) {
            balance = (balance / USD) - (amount / USD);
            account.balance = (account.balance / USD) + (amount / USD);

            balance = balance * USD;
            account.balance = account.balance * USD;
        } else if (currency.equals("EUR")) {
            balance = (balance / EUR) - (amount / EUR);
            account.balance = (account.balance / EUR) + (amount / EUR);

            balance = balance * EUR;
            account.balance = account.balance * EUR;
        } else if (currency.equals("RUB")) {
            balance = (balance / RUB) - (amount / RUB);
            account.balance = (account.balance / RUB) + (amount / RUB);

            balance = balance * RUB;
            account.balance = account.balance * RUB;
        }
    }

    void display() {
        System.out.println("Пользователь: " + owner);
        System.out.println("У вас на балансе: " + balance);
    }
}
