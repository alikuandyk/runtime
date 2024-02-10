package lesson18.homework.task1;

public class CreditAccount extends Account {

    public CreditAccount(int bill) {
        super(bill);
    }

    public void pay(int amount) {
        if (this.bill > amount) {
            this.bill -= amount;
        } else {
            System.out.println("У вас недостатчено средств");
        }
    }

    public void transfer(Account account, int amount) {
        if (this.bill > amount) {
            account.addMoney(amount);
            this.bill -= amount;
        } else {
            System.out.println("У вас недостатчено средств");
        }
    }

    public void addMoney(int amount) {
        this.bill += amount;
    }
}
