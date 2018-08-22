package day9.Task3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3);
        System.out.println("三角形的面积：" + triangle.area());
        Circle circle = new Circle(3);
        System.out.println("圆的面积：" + circle.area());
    }
}
