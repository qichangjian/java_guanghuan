package day9.Task3;

public class Circle implements Shape {
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
