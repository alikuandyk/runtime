package lesson9.classwork;

public class Series extends Film {
    int count;

    public Series(String name, int year, double rating, double duration, int count) {
        super(name, year, rating, duration);
        this.count = count;
    }

    public void display() {
        super.display();
    }
}
