package lesson30.classwork.code;

import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    private List<Transaction> expenses;
    private List<Transaction> incomes;

    public MonthlyReport(){
        expenses = new ArrayList<>();
        incomes = new ArrayList<>();
    }

    public int getSumExpense() {
        int sum = 0;
        for (Transaction expense : expenses) {
            sum += expense.getQuantity() * expense.getUnit();
        }
        return sum;
    }

    public int getSumIncome() {
        int sum = 0;
        for (Transaction income : incomes) {
            sum += income.getQuantity() * income.getUnit();
        }
        return sum;
    }

    public void addExpense(Transaction transaction) {
        expenses.add(transaction);
    }

    public void addIncome(Transaction transaction) {
        incomes.add(transaction);
    }

    public List<Transaction> getExpenses() {
        return expenses;
    }

    public List<Transaction> getIncomes() {
        return incomes;
    }
}
