package lesson19.homework.task1;

public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b, double angleInRadians) {
        super(a, b, angleInRadians);
    }

    public double getPerimeter() {
        return (getA() + getB()) * 2;
    }

    public double getArea() {
        return getA() * getB();
    }
}
