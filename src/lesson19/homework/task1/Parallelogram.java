package lesson19.homework.task1;

public class Parallelogram implements Shape {
    private final double a;
    private final double b;
    private final double angleInRadians;

    public Parallelogram(double a, double b, double angleInRadians) {
        this.a = a;
        this.b = b;
        this.angleInRadians = Math.toRadians(angleInRadians);
    }

    public double getPerimeter() {
        return (a + b) * 2;
    }

    public double getArea() {
        return a * b * Math.sin(angleInRadians);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getAngleInRadians() {
        return angleInRadians;
    }
}
