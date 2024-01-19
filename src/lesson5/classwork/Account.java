package lesson5.classwork;

public class Account {
    String owner;
    double balance;
    String historyName = "";
    double spentMoney;

    void payment(Product product) {
        if (balance >= product.price) {
            balance = balance - product.price;
            historyName += product.name + " ";
            spentMoney += product.price;
        } else {
            System.out.println("у вас недостаточно денег");
        }
    }

    void addition(double num) {
        balance = balance + num;
    }

    void translation(Account account, double num) {
        if (balance >= num) {
            balance = balance - num;
            account.balance = account.balance + num;
        } else {
            System.out.println("у вас недостаточно денег");
        }
    }

    void dispay() {
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance);
        System.out.println("История покупок: " + historyName);
        System.out.println("Сумма потраченных денег: " + spentMoney);
    }
}
