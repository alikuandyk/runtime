package lesson29.homework.months;

public class March extends Month {
    private String itemName;
    private boolean isExpensive;
    private int quantity;
    private int unitPrice;

    @Override
    public void count() {

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
