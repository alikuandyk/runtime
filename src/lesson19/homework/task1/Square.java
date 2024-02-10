package lesson19.homework.task1;

public class Square extends Rectangle {
    public Square(double a, double b, double angleInRadians) {
        super(a, b, angleInRadians);
    }

    public double getPerimeter() {
        return getA() * 4;
    }

    public double getArea() {
        return getA() * getA();
    }
}
