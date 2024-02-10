package lesson19.homework.task1;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
