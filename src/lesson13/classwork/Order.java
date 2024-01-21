package lesson13.classwork;

public class Order {
    User user;
    Product product;
    Status status;

    public Order(User user, Product product, Status status) {
        this.user = user;
        this.product = product;
        this.status = status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
