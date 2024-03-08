package lesson29.homework2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Item {
    String itemName;
    boolean isExpensive;
    int quantity;
    double unitPrice;

    public Item(String itemName, boolean isExpensive, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.isExpensive = isExpensive;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}
