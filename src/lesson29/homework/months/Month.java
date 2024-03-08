package lesson29.homework.months;

import java.io.IOException;

public abstract class Month {
    private String itemName;
    private boolean isExpensive;
    private int quantity;
    private int unitPrice;

    public abstract void count() throws IOException;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isExpensive() {
        return isExpensive;
    }

    public void setExpensive(boolean expensive) {
        isExpensive = expensive;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
