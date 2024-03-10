package lesson30.classwork.code;

public class YearlyReport {
    private int incomes;
    private int expenses;
    private int profit;

    public YearlyReport() {
        this.incomes = 0;
        this.expenses = 0;
    }

    public void addIncome(int income) {
        incomes += income;
    }

    public void addExpense(int expense) {
        expenses += expense;
    }

    public void setProfit() {
        this.profit = incomes - expenses;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getExpenses() {
        return expenses;
    }

    public int getProfit() {
        return profit;
    }
}
