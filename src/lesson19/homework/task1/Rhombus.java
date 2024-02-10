package lesson19.homework.task1;

public class Rhombus extends Parallelogram {
    public Rhombus(double a, double b, double angleInRadians) {
        super(a, b, angleInRadians);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
}
