package lesson22.homework.task3;

public class Product {
    private String name;
    private double cost;
    private Category category;

    public Product(String name, double cost, Category category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
