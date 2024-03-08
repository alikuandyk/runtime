package lesson29.homework3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Item implements Comparable<Item> {
    String itemName;
    boolean isExpensive;
    int quantity;
    double unitPrice;
    double sum = this.quantity * this.unitPrice;

    public Item(String itemName, boolean isExpensive, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.isExpensive = isExpensive;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Item o) {
        double thisSum = this.quantity * this.unitPrice;
        double oSum = o.quantity * o.unitPrice;
        return (int) ((int) thisSum - oSum);
    }
}
