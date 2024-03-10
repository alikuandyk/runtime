package lesson30.classwork.code;

import java.util.ArrayList;
import java.util.List;

public class FileToData {
    private List<List<Transaction>> lists;
    public List<Transaction> fromFile(int number) {
        List<Transaction> transactions = new ArrayList<>();
//        List<String> lines = CsvReader.readFile("m.20210" + number + ".csv");
//        for (String line : lines) {
//            String[] items = line.split(",");
//            transactions.add(new Transaction(items[0],
//                    Boolean.parseBoolean(items[1]),
//                    Integer.parseInt(items[2]),
//                    Integer.parseInt(items[3])));
//        }
//        Мой код
        for (int i = 0; i < 3; i++) {
            List<Transaction> list = new ArrayList<>();
            List<Transaction> transactionss = new ArrayList<>();
            List<String> lines = CsvReader.readFile("m.20210" + number + ".csv");
            for (String line : lines) {
                String[] items = line.split(",");
                transactions.add(new Transaction(items[0],
                        Boolean.parseBoolean(items[1]),
                        Integer.parseInt(items[2]),
                        Integer.parseInt(items[3])));
                list.add(new Transaction(items[0],
                        Boolean.parseBoolean(items[1]),
                        Integer.parseInt(items[2]),
                        Integer.parseInt(items[3])));
            }
            lists.add(list);
        }

        return transactions;
    }

    public List<YearTransaction> fromYearFile() {
        List<YearTransaction> transactions = new ArrayList<>();
        List<String> lines = CsvReader.readYearFile();
        for (String line : lines) {
            String[] items = line.split(",");
            transactions.add(new YearTransaction(Integer.parseInt(items[0]),
                    Integer.parseInt(items[1]),
                    Boolean.parseBoolean(items[2])));
        }
        return transactions;
    }

    public void displayInformationAboutAllMonthlyReports() {
        for (List<Transaction> month : lists) {
            Transaction income = new Transaction("", true, 0, 0);
            Transaction expense = new Transaction("", true, 0, 0);
            for (int i = 0; i < month.size(); i++) {
                displayMonth(i + 1);
                if (month.get(i).isExpense() && month.get(i).getSum() > expense.getSum()) {
                    expense = month.get(i);
                } else if (month.get(i).getSum() > income.getSum()) {
                    income = month.get(i);
                }
            }
            System.out.println("Самый прибыльный товар: " + income.getItemName() + "(" + income.getSum() + ")");
            System.out.println("Самая большая трата: " + expense.getItemName() + "(" + expense.getSum() + ")");
        }
    }

    public void displayMonth(int number) {
        switch (number) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
        }
    }
}
