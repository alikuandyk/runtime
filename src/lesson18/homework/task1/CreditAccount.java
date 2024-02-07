package lesson18.homework.task1;

public class CreditAccount extends Account{
    private int bill;

    @Override
    public int getBill() {
        return bill;
    }

    @Override
    public void setBill(int bill) {
        this.bill = bill;
    }

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
            account.getBill() += amount;
            this.bill -= amount;
        } else {
            System.out.println("У вас недостатчено средств");
        }
    }
    public void addMoney(int amount) {
        this.bill += amount;
    }
}
