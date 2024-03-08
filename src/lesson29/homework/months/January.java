package lesson29.homework.months;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class January extends Month {
    private String itemName;
    private boolean isExpensive;
    private int quantity;
    private int unitPrice;

    @Override
    public void count() throws IOException {
        Reader readerOfJanuary = new FileReader("src/lesson29/homework/m.202101.csv");
        BufferedReader bufferedReaderOfJanuary = new BufferedReader(readerOfJanuary);
        bufferedReaderOfJanuary.readLine();

        List<January> list = new ArrayList<>();

        while (bufferedReaderOfJanuary.ready()) {
            String line = bufferedReaderOfJanuary.readLine();
            String[] arrayOfBf = line.split(",");

            January january = new January();
            january.itemName = arrayOfBf[0];
            january.isExpensive = Boolean.parseBoolean(arrayOfBf[1]);
            january.quantity = Integer.parseInt(arrayOfBf[2]);
            january.unitPrice = Integer.parseInt(arrayOfBf[3]);

            list.add(january);
        }
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean isExpensive() {
        return isExpensive;
    }

    @Override
    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
