package day5.task6;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        PassObject p = new PassObject(c);
        p.printAreas(c,5);
    }
}
