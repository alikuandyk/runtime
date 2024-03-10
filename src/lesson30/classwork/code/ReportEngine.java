package lesson30.classwork.code;

import java.util.ArrayList;
import java.util.List;

public class ReportEngine {
    List<MonthlyReport> monthlyReports = new ArrayList<>();
    private YearlyReport yearlyReport = new YearlyReport();

    public void readMonthFiles() {
        FileToData fileToData = new FileToData();
        for (int i = 1; i <= 3; i++) {
            MonthlyReport monthlyReport = new MonthlyReport();
            List<Transaction> transactions = fileToData.fromFile(i);
            for (Transaction transaction : transactions) {
                if (transaction.isExpense()) {
                    monthlyReport.addExpense(transaction);
                } else {
                    monthlyReport.addIncome(transaction);
                }
            }
            monthlyReports.add(monthlyReport);
        }
    }

    public void readYearFiles() {
        FileToData fileToData = new FileToData();
        List<YearTransaction> yearTransactions = fileToData.fromYearFile();
        for (YearTransaction yearTransaction : yearTransactions) {
            if (yearTransaction.isExpense()) {
                yearlyReport.addExpense(yearTransaction.getAmount());
            } else {
                yearlyReport.addIncome(yearTransaction.getAmount());
            }
        }
        yearlyReport.setProfit();
    }

    public void check() {
        boolean success = false;

        int incomesMonth = getAllMonthIncomesSum();
        int expensesMonth = getAllMonthExpensesSum();

        int incomesYear = yearlyReport.getIncomes();
        int expensesYear = yearlyReport.getExpenses();

//        int allMonthExpensesSum = 0;
//        int allMonthIncomesSum = 0;
//        for (MonthlyReport monthlyReport : monthlyReports) {
//            allMonthExpensesSum += monthlyReport.getSumExpense();
//            allMonthIncomesSum += monthlyReport.getSumIncome();
//        }

//        int incomesYear = 0;
//        int expensesYear = 0;
//        FileToData fileToData = new FileToData();
//        List<YearTransaction> yearTransactions = fileToData.fromYearFile();
//        for (YearTransaction yearTransaction : yearTransactions) {
//            if (yearTransaction.isExpense()) {
//                expensesYear += yearTransaction.getAmount();
//            } else {
//                incomesYear += yearTransaction.getAmount();
//            }
//        }

        if (incomesMonth == incomesYear && expensesMonth == expensesYear) {
            success = true;
        }

        if (success) {
            System.out.println("Сверка прошла успешно");
        } else {
            System.out.println("Сверка не прошла");
        }
        
    }

    public int getAllMonthExpensesSum() {
        int allMonthExpensesSum = 0;
        for (MonthlyReport monthlyReport : monthlyReports) {
            allMonthExpensesSum += monthlyReport.getSumExpense();
        }
        return allMonthExpensesSum;
    }

    public int getAllMonthIncomesSum() {
        int allMonthIncomesSum = 0;
        for (MonthlyReport monthlyReport : monthlyReports) {
            allMonthIncomesSum += monthlyReport.getSumIncome();
        }
        return allMonthIncomesSum;
    }

    public void displayInformationAboutAllMonthlyReports() {
        Transaction income = new Transaction("", true, 0, 0);
        Transaction expense = new Transaction("", true, 0, 0);

        for (int i = 0; i < monthlyReports.size(); i++) {
            if (monthlyReports.get(i).getSumIncome() > income.getSum()) {
//                income = monthlyReports.get(i);
            }
            if (monthlyReports.get(i).getSumExpense() > expense.getSum()) {
//                expense = monthlyReports.get(i);
            }
            System.out.println("Код не завершен");
        }
    }

    public int getYearlyReportProfit() {
        return yearlyReport.getProfit();
    }

    public void display() {
        for (MonthlyReport monthlyReport : monthlyReports) {
            System.out.println("{" + monthlyReport.getExpenses() + " and " + monthlyReport.getIncomes() + "}");
        }
    }
}
