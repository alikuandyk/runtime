package lesson18.homework.task1;

public abstract class Account {
    private int bill;

    public Account(int bill) {
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
