package day9.Task3;

public class Triangle implements Shape{
    private double height;
    private double length;

    @Override
    public double area() {
        return (height * length)/2;
    }

    public Triangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public Triangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
