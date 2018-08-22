package day5.task4;

public class Circle {
    private double r;

    public double getArea(){
        return Math.PI * (r * r);
    }

    public double getPerimeter(){
        return Math.PI * r * 2;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
