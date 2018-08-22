package Phase3.Part1.Test2;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public void show(){
        System.out.println("圆的半径：" + radius);
        System.out.println("圆的周长：" + getPerimeter());
        System.out.println("圆的面积：" + getArea());
    }
}
